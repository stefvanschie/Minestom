package net.minestom.code_generation.statistics;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterSpec;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import net.minestom.code_generation.MinestomCodeGenerator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.lang.model.element.Modifier;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class StatisticGenerator extends MinestomCodeGenerator {
    private static final Logger LOGGER = LoggerFactory.getLogger(StatisticGenerator.class);
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    private static final File DEFAULT_INPUT_FILE = new File(DEFAULT_SOURCE_FOLDER_ROOT, "custom_statistics.json");
    private final File statisticsFile;
    private final File outputFolder;

    public StatisticGenerator() {
        this(null, null);
    }

    public StatisticGenerator(@Nullable File statisticsFile) {
        this(statisticsFile, null);
    }

    public StatisticGenerator(@Nullable File statisticsFile, @Nullable File outputFolder) {
        this.statisticsFile = Objects.requireNonNullElse(statisticsFile, DEFAULT_INPUT_FILE);
        this.outputFolder = Objects.requireNonNullElse(outputFolder, DEFAULT_OUTPUT_FOLDER);
    }

    @Override
    public void generate() {
        if (!statisticsFile.exists()) {
            LOGGER.error("Failed to find statistics.json.");
            LOGGER.error("Stopped code generation for statistics.");
            return;
        }
        if (!outputFolder.exists() && !outputFolder.mkdirs()) {
            LOGGER.error("Output folder for code generation does not exist and could not be created.");
            return;
        }
        // Important classes we use alot
        ClassName namespaceIDClassName = ClassName.get("net.minestom.server.utils", "NamespaceID");
        ClassName registryClassName = ClassName.get("net.minestom.server.registry", "Registry");

        JsonArray statistics;
        try {
            statistics = GSON.fromJson(new JsonReader(new FileReader(statisticsFile)), JsonArray.class);
        } catch (FileNotFoundException e) {
            LOGGER.error("Failed to find statistics.json.");
            LOGGER.error("Stopped code generation for statistics.");
            return;
        }
        ClassName statisticClassName = ClassName.get("net.minestom.server.statistic", "StatisticType");

        // Particle
        TypeSpec.Builder statisticClass = TypeSpec.classBuilder(statisticClassName)
                .addSuperinterface(ClassName.get("net.kyori.adventure.key", "Keyed"))
                .addModifiers(Modifier.PUBLIC).addJavadoc("AUTOGENERATED");
        statisticClass.addField(
                FieldSpec.builder(namespaceIDClassName, "id")
                        .addModifiers(Modifier.PRIVATE, Modifier.FINAL).addAnnotation(NotNull.class).build()
        );
        statisticClass.addMethod(
                MethodSpec.constructorBuilder()
                        .addParameter(ParameterSpec.builder(namespaceIDClassName, "id").addAnnotation(NotNull.class).build())
                        .addStatement("this.id = id")
                        .addModifiers(Modifier.PROTECTED)
                        .build()
        );
        // Override key method (adventure)
        statisticClass.addMethod(
                MethodSpec.methodBuilder("key")
                        .returns(ClassName.get("net.kyori.adventure.key", "Key"))
                        .addAnnotation(Override.class)
                        .addAnnotation(NotNull.class)
                        .addStatement("return this.id")
                        .addModifiers(Modifier.PUBLIC)
                        .build()
        );
        // getId method
        statisticClass.addMethod(
                MethodSpec.methodBuilder("getId")
                        .returns(namespaceIDClassName)
                        .addAnnotation(NotNull.class)
                        .addStatement("return this.id")
                        .addModifiers(Modifier.PUBLIC)
                        .build()
        );
        // getNumericalId
        statisticClass.addMethod(
                MethodSpec.methodBuilder("getNumericalId")
                        .returns(TypeName.INT)
                        .addStatement("return $T.STATISTIC_TYPE_REGISTRY.getId(this)", registryClassName)
                        .addModifiers(Modifier.PUBLIC)
                        .build()
        );
        // fromId Method
        statisticClass.addMethod(
                MethodSpec.methodBuilder("fromId")
                        .returns(statisticClassName)
                        .addAnnotation(Nullable.class)
                        .addParameter(TypeName.INT, "id")
                        .addStatement("return $T.STATISTIC_TYPE_REGISTRY.get((short) id)", registryClassName)
                        .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                        .build()
        );
        // fromId Method
        statisticClass.addMethod(
                MethodSpec.methodBuilder("fromId")
                        .returns(statisticClassName)
                        .addAnnotation(NotNull.class)
                        .addParameter(ClassName.get("net.kyori.adventure.key", "Key"), "id")
                        .addStatement("return $T.STATISTIC_TYPE_REGISTRY.get(id)", registryClassName)
                        .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                        .build()
        );
        // toString method
        statisticClass.addMethod(
                MethodSpec.methodBuilder("toString")
                        .addAnnotation(NotNull.class)
                        .addAnnotation(Override.class)
                        .returns(String.class)
                        // this resolves to [Namespace]
                        .addStatement("return \"[\" + this.id + \"]\"")
                        .addModifiers(Modifier.PUBLIC)
                        .build()
        );
        // values method
        statisticClass.addMethod(
                MethodSpec.methodBuilder("values")
                        .addAnnotation(NotNull.class)
                        .returns(ParameterizedTypeName.get(ClassName.get(List.class), statisticClassName))
                        .addStatement("return $T.STATISTIC_TYPE_REGISTRY.values()", registryClassName)
                        .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                        .build()
        );

        CodeBlock.Builder staticBlock = CodeBlock.builder();
        // Use data
        for (JsonElement s : statistics) {
            JsonObject statistic = s.getAsJsonObject();

            String statisticName = statistic.get("name").getAsString();

            statisticClass.addField(
                    FieldSpec.builder(
                            statisticClassName,
                            statisticName
                    ).initializer(
                            "new $T($T.from($S))",
                            statisticClassName,
                            namespaceIDClassName,
                            statistic.get("id").getAsString()
                    ).addModifiers(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL).build()
            );
            // Add to static init.
            staticBlock.addStatement("$T.STATISTIC_TYPE_REGISTRY.register($N)", registryClassName, statisticName);
        }

        statisticClass.addStaticBlock(staticBlock.build());

        // Write files to outputFolder
        writeFiles(
                Collections.singletonList(
                        JavaFile.builder("net.minestom.server.statistic", statisticClass.build()).build()
                ),
                outputFolder
        );
    }
}
