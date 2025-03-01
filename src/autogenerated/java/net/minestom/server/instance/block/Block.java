package net.minestom.server.instance.block;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.Keyed;
import net.minestom.server.instance.block.states.AcaciaButton;
import net.minestom.server.instance.block.states.AcaciaDoor;
import net.minestom.server.instance.block.states.AcaciaFence;
import net.minestom.server.instance.block.states.AcaciaFenceGate;
import net.minestom.server.instance.block.states.AcaciaLeaves;
import net.minestom.server.instance.block.states.AcaciaLog;
import net.minestom.server.instance.block.states.AcaciaPressurePlate;
import net.minestom.server.instance.block.states.AcaciaSapling;
import net.minestom.server.instance.block.states.AcaciaSign;
import net.minestom.server.instance.block.states.AcaciaSlab;
import net.minestom.server.instance.block.states.AcaciaStairs;
import net.minestom.server.instance.block.states.AcaciaTrapdoor;
import net.minestom.server.instance.block.states.AcaciaWallSign;
import net.minestom.server.instance.block.states.AcaciaWood;
import net.minestom.server.instance.block.states.ActivatorRail;
import net.minestom.server.instance.block.states.AndesiteSlab;
import net.minestom.server.instance.block.states.AndesiteStairs;
import net.minestom.server.instance.block.states.AndesiteWall;
import net.minestom.server.instance.block.states.Anvil;
import net.minestom.server.instance.block.states.AttachedMelonStem;
import net.minestom.server.instance.block.states.AttachedPumpkinStem;
import net.minestom.server.instance.block.states.Bamboo;
import net.minestom.server.instance.block.states.Barrel;
import net.minestom.server.instance.block.states.Basalt;
import net.minestom.server.instance.block.states.BeeNest;
import net.minestom.server.instance.block.states.Beehive;
import net.minestom.server.instance.block.states.Beetroots;
import net.minestom.server.instance.block.states.Bell;
import net.minestom.server.instance.block.states.BirchButton;
import net.minestom.server.instance.block.states.BirchDoor;
import net.minestom.server.instance.block.states.BirchFence;
import net.minestom.server.instance.block.states.BirchFenceGate;
import net.minestom.server.instance.block.states.BirchLeaves;
import net.minestom.server.instance.block.states.BirchLog;
import net.minestom.server.instance.block.states.BirchPressurePlate;
import net.minestom.server.instance.block.states.BirchSapling;
import net.minestom.server.instance.block.states.BirchSign;
import net.minestom.server.instance.block.states.BirchSlab;
import net.minestom.server.instance.block.states.BirchStairs;
import net.minestom.server.instance.block.states.BirchTrapdoor;
import net.minestom.server.instance.block.states.BirchWallSign;
import net.minestom.server.instance.block.states.BirchWood;
import net.minestom.server.instance.block.states.BlackBanner;
import net.minestom.server.instance.block.states.BlackBed;
import net.minestom.server.instance.block.states.BlackGlazedTerracotta;
import net.minestom.server.instance.block.states.BlackShulkerBox;
import net.minestom.server.instance.block.states.BlackStainedGlassPane;
import net.minestom.server.instance.block.states.BlackWallBanner;
import net.minestom.server.instance.block.states.BlackstoneSlab;
import net.minestom.server.instance.block.states.BlackstoneStairs;
import net.minestom.server.instance.block.states.BlackstoneWall;
import net.minestom.server.instance.block.states.BlastFurnace;
import net.minestom.server.instance.block.states.BlueBanner;
import net.minestom.server.instance.block.states.BlueBed;
import net.minestom.server.instance.block.states.BlueGlazedTerracotta;
import net.minestom.server.instance.block.states.BlueShulkerBox;
import net.minestom.server.instance.block.states.BlueStainedGlassPane;
import net.minestom.server.instance.block.states.BlueWallBanner;
import net.minestom.server.instance.block.states.BoneBlock;
import net.minestom.server.instance.block.states.BrainCoral;
import net.minestom.server.instance.block.states.BrainCoralFan;
import net.minestom.server.instance.block.states.BrainCoralWallFan;
import net.minestom.server.instance.block.states.BrewingStand;
import net.minestom.server.instance.block.states.BrickSlab;
import net.minestom.server.instance.block.states.BrickStairs;
import net.minestom.server.instance.block.states.BrickWall;
import net.minestom.server.instance.block.states.BrownBanner;
import net.minestom.server.instance.block.states.BrownBed;
import net.minestom.server.instance.block.states.BrownGlazedTerracotta;
import net.minestom.server.instance.block.states.BrownMushroomBlock;
import net.minestom.server.instance.block.states.BrownShulkerBox;
import net.minestom.server.instance.block.states.BrownStainedGlassPane;
import net.minestom.server.instance.block.states.BrownWallBanner;
import net.minestom.server.instance.block.states.BubbleColumn;
import net.minestom.server.instance.block.states.BubbleCoral;
import net.minestom.server.instance.block.states.BubbleCoralFan;
import net.minestom.server.instance.block.states.BubbleCoralWallFan;
import net.minestom.server.instance.block.states.Cactus;
import net.minestom.server.instance.block.states.Cake;
import net.minestom.server.instance.block.states.Campfire;
import net.minestom.server.instance.block.states.Carrots;
import net.minestom.server.instance.block.states.CarvedPumpkin;
import net.minestom.server.instance.block.states.Cauldron;
import net.minestom.server.instance.block.states.Chain;
import net.minestom.server.instance.block.states.ChainCommandBlock;
import net.minestom.server.instance.block.states.Chest;
import net.minestom.server.instance.block.states.ChippedAnvil;
import net.minestom.server.instance.block.states.ChorusFlower;
import net.minestom.server.instance.block.states.ChorusPlant;
import net.minestom.server.instance.block.states.CobblestoneSlab;
import net.minestom.server.instance.block.states.CobblestoneStairs;
import net.minestom.server.instance.block.states.CobblestoneWall;
import net.minestom.server.instance.block.states.Cocoa;
import net.minestom.server.instance.block.states.CommandBlock;
import net.minestom.server.instance.block.states.Comparator;
import net.minestom.server.instance.block.states.Composter;
import net.minestom.server.instance.block.states.Conduit;
import net.minestom.server.instance.block.states.CreeperHead;
import net.minestom.server.instance.block.states.CreeperWallHead;
import net.minestom.server.instance.block.states.CrimsonButton;
import net.minestom.server.instance.block.states.CrimsonDoor;
import net.minestom.server.instance.block.states.CrimsonFence;
import net.minestom.server.instance.block.states.CrimsonFenceGate;
import net.minestom.server.instance.block.states.CrimsonHyphae;
import net.minestom.server.instance.block.states.CrimsonPressurePlate;
import net.minestom.server.instance.block.states.CrimsonSign;
import net.minestom.server.instance.block.states.CrimsonSlab;
import net.minestom.server.instance.block.states.CrimsonStairs;
import net.minestom.server.instance.block.states.CrimsonStem;
import net.minestom.server.instance.block.states.CrimsonTrapdoor;
import net.minestom.server.instance.block.states.CrimsonWallSign;
import net.minestom.server.instance.block.states.CutRedSandstoneSlab;
import net.minestom.server.instance.block.states.CutSandstoneSlab;
import net.minestom.server.instance.block.states.CyanBanner;
import net.minestom.server.instance.block.states.CyanBed;
import net.minestom.server.instance.block.states.CyanGlazedTerracotta;
import net.minestom.server.instance.block.states.CyanShulkerBox;
import net.minestom.server.instance.block.states.CyanStainedGlassPane;
import net.minestom.server.instance.block.states.CyanWallBanner;
import net.minestom.server.instance.block.states.DamagedAnvil;
import net.minestom.server.instance.block.states.DarkOakButton;
import net.minestom.server.instance.block.states.DarkOakDoor;
import net.minestom.server.instance.block.states.DarkOakFence;
import net.minestom.server.instance.block.states.DarkOakFenceGate;
import net.minestom.server.instance.block.states.DarkOakLeaves;
import net.minestom.server.instance.block.states.DarkOakLog;
import net.minestom.server.instance.block.states.DarkOakPressurePlate;
import net.minestom.server.instance.block.states.DarkOakSapling;
import net.minestom.server.instance.block.states.DarkOakSign;
import net.minestom.server.instance.block.states.DarkOakSlab;
import net.minestom.server.instance.block.states.DarkOakStairs;
import net.minestom.server.instance.block.states.DarkOakTrapdoor;
import net.minestom.server.instance.block.states.DarkOakWallSign;
import net.minestom.server.instance.block.states.DarkOakWood;
import net.minestom.server.instance.block.states.DarkPrismarineSlab;
import net.minestom.server.instance.block.states.DarkPrismarineStairs;
import net.minestom.server.instance.block.states.DaylightDetector;
import net.minestom.server.instance.block.states.DeadBrainCoral;
import net.minestom.server.instance.block.states.DeadBrainCoralFan;
import net.minestom.server.instance.block.states.DeadBrainCoralWallFan;
import net.minestom.server.instance.block.states.DeadBubbleCoral;
import net.minestom.server.instance.block.states.DeadBubbleCoralFan;
import net.minestom.server.instance.block.states.DeadBubbleCoralWallFan;
import net.minestom.server.instance.block.states.DeadFireCoral;
import net.minestom.server.instance.block.states.DeadFireCoralFan;
import net.minestom.server.instance.block.states.DeadFireCoralWallFan;
import net.minestom.server.instance.block.states.DeadHornCoral;
import net.minestom.server.instance.block.states.DeadHornCoralFan;
import net.minestom.server.instance.block.states.DeadHornCoralWallFan;
import net.minestom.server.instance.block.states.DeadTubeCoral;
import net.minestom.server.instance.block.states.DeadTubeCoralFan;
import net.minestom.server.instance.block.states.DeadTubeCoralWallFan;
import net.minestom.server.instance.block.states.DetectorRail;
import net.minestom.server.instance.block.states.DioriteSlab;
import net.minestom.server.instance.block.states.DioriteStairs;
import net.minestom.server.instance.block.states.DioriteWall;
import net.minestom.server.instance.block.states.Dispenser;
import net.minestom.server.instance.block.states.DragonHead;
import net.minestom.server.instance.block.states.DragonWallHead;
import net.minestom.server.instance.block.states.Dropper;
import net.minestom.server.instance.block.states.EndPortalFrame;
import net.minestom.server.instance.block.states.EndRod;
import net.minestom.server.instance.block.states.EndStoneBrickSlab;
import net.minestom.server.instance.block.states.EndStoneBrickStairs;
import net.minestom.server.instance.block.states.EndStoneBrickWall;
import net.minestom.server.instance.block.states.EnderChest;
import net.minestom.server.instance.block.states.Farmland;
import net.minestom.server.instance.block.states.Fire;
import net.minestom.server.instance.block.states.FireCoral;
import net.minestom.server.instance.block.states.FireCoralFan;
import net.minestom.server.instance.block.states.FireCoralWallFan;
import net.minestom.server.instance.block.states.FrostedIce;
import net.minestom.server.instance.block.states.Furnace;
import net.minestom.server.instance.block.states.GlassPane;
import net.minestom.server.instance.block.states.GraniteSlab;
import net.minestom.server.instance.block.states.GraniteStairs;
import net.minestom.server.instance.block.states.GraniteWall;
import net.minestom.server.instance.block.states.GrassBlock;
import net.minestom.server.instance.block.states.GrayBanner;
import net.minestom.server.instance.block.states.GrayBed;
import net.minestom.server.instance.block.states.GrayGlazedTerracotta;
import net.minestom.server.instance.block.states.GrayShulkerBox;
import net.minestom.server.instance.block.states.GrayStainedGlassPane;
import net.minestom.server.instance.block.states.GrayWallBanner;
import net.minestom.server.instance.block.states.GreenBanner;
import net.minestom.server.instance.block.states.GreenBed;
import net.minestom.server.instance.block.states.GreenGlazedTerracotta;
import net.minestom.server.instance.block.states.GreenShulkerBox;
import net.minestom.server.instance.block.states.GreenStainedGlassPane;
import net.minestom.server.instance.block.states.GreenWallBanner;
import net.minestom.server.instance.block.states.Grindstone;
import net.minestom.server.instance.block.states.HayBlock;
import net.minestom.server.instance.block.states.HeavyWeightedPressurePlate;
import net.minestom.server.instance.block.states.Hopper;
import net.minestom.server.instance.block.states.HornCoral;
import net.minestom.server.instance.block.states.HornCoralFan;
import net.minestom.server.instance.block.states.HornCoralWallFan;
import net.minestom.server.instance.block.states.IronBars;
import net.minestom.server.instance.block.states.IronDoor;
import net.minestom.server.instance.block.states.IronTrapdoor;
import net.minestom.server.instance.block.states.JackOLantern;
import net.minestom.server.instance.block.states.Jigsaw;
import net.minestom.server.instance.block.states.Jukebox;
import net.minestom.server.instance.block.states.JungleButton;
import net.minestom.server.instance.block.states.JungleDoor;
import net.minestom.server.instance.block.states.JungleFence;
import net.minestom.server.instance.block.states.JungleFenceGate;
import net.minestom.server.instance.block.states.JungleLeaves;
import net.minestom.server.instance.block.states.JungleLog;
import net.minestom.server.instance.block.states.JunglePressurePlate;
import net.minestom.server.instance.block.states.JungleSapling;
import net.minestom.server.instance.block.states.JungleSign;
import net.minestom.server.instance.block.states.JungleSlab;
import net.minestom.server.instance.block.states.JungleStairs;
import net.minestom.server.instance.block.states.JungleTrapdoor;
import net.minestom.server.instance.block.states.JungleWallSign;
import net.minestom.server.instance.block.states.JungleWood;
import net.minestom.server.instance.block.states.Kelp;
import net.minestom.server.instance.block.states.Ladder;
import net.minestom.server.instance.block.states.Lantern;
import net.minestom.server.instance.block.states.LargeFern;
import net.minestom.server.instance.block.states.Lava;
import net.minestom.server.instance.block.states.Lectern;
import net.minestom.server.instance.block.states.Lever;
import net.minestom.server.instance.block.states.LightBlueBanner;
import net.minestom.server.instance.block.states.LightBlueBed;
import net.minestom.server.instance.block.states.LightBlueGlazedTerracotta;
import net.minestom.server.instance.block.states.LightBlueShulkerBox;
import net.minestom.server.instance.block.states.LightBlueStainedGlassPane;
import net.minestom.server.instance.block.states.LightBlueWallBanner;
import net.minestom.server.instance.block.states.LightGrayBanner;
import net.minestom.server.instance.block.states.LightGrayBed;
import net.minestom.server.instance.block.states.LightGrayGlazedTerracotta;
import net.minestom.server.instance.block.states.LightGrayShulkerBox;
import net.minestom.server.instance.block.states.LightGrayStainedGlassPane;
import net.minestom.server.instance.block.states.LightGrayWallBanner;
import net.minestom.server.instance.block.states.LightWeightedPressurePlate;
import net.minestom.server.instance.block.states.Lilac;
import net.minestom.server.instance.block.states.LimeBanner;
import net.minestom.server.instance.block.states.LimeBed;
import net.minestom.server.instance.block.states.LimeGlazedTerracotta;
import net.minestom.server.instance.block.states.LimeShulkerBox;
import net.minestom.server.instance.block.states.LimeStainedGlassPane;
import net.minestom.server.instance.block.states.LimeWallBanner;
import net.minestom.server.instance.block.states.Loom;
import net.minestom.server.instance.block.states.MagentaBanner;
import net.minestom.server.instance.block.states.MagentaBed;
import net.minestom.server.instance.block.states.MagentaGlazedTerracotta;
import net.minestom.server.instance.block.states.MagentaShulkerBox;
import net.minestom.server.instance.block.states.MagentaStainedGlassPane;
import net.minestom.server.instance.block.states.MagentaWallBanner;
import net.minestom.server.instance.block.states.MelonStem;
import net.minestom.server.instance.block.states.MossyCobblestoneSlab;
import net.minestom.server.instance.block.states.MossyCobblestoneStairs;
import net.minestom.server.instance.block.states.MossyCobblestoneWall;
import net.minestom.server.instance.block.states.MossyStoneBrickSlab;
import net.minestom.server.instance.block.states.MossyStoneBrickStairs;
import net.minestom.server.instance.block.states.MossyStoneBrickWall;
import net.minestom.server.instance.block.states.MovingPiston;
import net.minestom.server.instance.block.states.MushroomStem;
import net.minestom.server.instance.block.states.Mycelium;
import net.minestom.server.instance.block.states.NetherBrickFence;
import net.minestom.server.instance.block.states.NetherBrickSlab;
import net.minestom.server.instance.block.states.NetherBrickStairs;
import net.minestom.server.instance.block.states.NetherBrickWall;
import net.minestom.server.instance.block.states.NetherPortal;
import net.minestom.server.instance.block.states.NetherWart;
import net.minestom.server.instance.block.states.NoteBlock;
import net.minestom.server.instance.block.states.OakButton;
import net.minestom.server.instance.block.states.OakDoor;
import net.minestom.server.instance.block.states.OakFence;
import net.minestom.server.instance.block.states.OakFenceGate;
import net.minestom.server.instance.block.states.OakLeaves;
import net.minestom.server.instance.block.states.OakLog;
import net.minestom.server.instance.block.states.OakPressurePlate;
import net.minestom.server.instance.block.states.OakSapling;
import net.minestom.server.instance.block.states.OakSign;
import net.minestom.server.instance.block.states.OakSlab;
import net.minestom.server.instance.block.states.OakStairs;
import net.minestom.server.instance.block.states.OakTrapdoor;
import net.minestom.server.instance.block.states.OakWallSign;
import net.minestom.server.instance.block.states.OakWood;
import net.minestom.server.instance.block.states.Observer;
import net.minestom.server.instance.block.states.OrangeBanner;
import net.minestom.server.instance.block.states.OrangeBed;
import net.minestom.server.instance.block.states.OrangeGlazedTerracotta;
import net.minestom.server.instance.block.states.OrangeShulkerBox;
import net.minestom.server.instance.block.states.OrangeStainedGlassPane;
import net.minestom.server.instance.block.states.OrangeWallBanner;
import net.minestom.server.instance.block.states.Peony;
import net.minestom.server.instance.block.states.PetrifiedOakSlab;
import net.minestom.server.instance.block.states.PinkBanner;
import net.minestom.server.instance.block.states.PinkBed;
import net.minestom.server.instance.block.states.PinkGlazedTerracotta;
import net.minestom.server.instance.block.states.PinkShulkerBox;
import net.minestom.server.instance.block.states.PinkStainedGlassPane;
import net.minestom.server.instance.block.states.PinkWallBanner;
import net.minestom.server.instance.block.states.Piston;
import net.minestom.server.instance.block.states.PistonHead;
import net.minestom.server.instance.block.states.PlayerHead;
import net.minestom.server.instance.block.states.PlayerWallHead;
import net.minestom.server.instance.block.states.Podzol;
import net.minestom.server.instance.block.states.PolishedAndesiteSlab;
import net.minestom.server.instance.block.states.PolishedAndesiteStairs;
import net.minestom.server.instance.block.states.PolishedBasalt;
import net.minestom.server.instance.block.states.PolishedBlackstoneBrickSlab;
import net.minestom.server.instance.block.states.PolishedBlackstoneBrickStairs;
import net.minestom.server.instance.block.states.PolishedBlackstoneBrickWall;
import net.minestom.server.instance.block.states.PolishedBlackstoneButton;
import net.minestom.server.instance.block.states.PolishedBlackstonePressurePlate;
import net.minestom.server.instance.block.states.PolishedBlackstoneSlab;
import net.minestom.server.instance.block.states.PolishedBlackstoneStairs;
import net.minestom.server.instance.block.states.PolishedBlackstoneWall;
import net.minestom.server.instance.block.states.PolishedDioriteSlab;
import net.minestom.server.instance.block.states.PolishedDioriteStairs;
import net.minestom.server.instance.block.states.PolishedGraniteSlab;
import net.minestom.server.instance.block.states.PolishedGraniteStairs;
import net.minestom.server.instance.block.states.Potatoes;
import net.minestom.server.instance.block.states.PoweredRail;
import net.minestom.server.instance.block.states.PrismarineBrickSlab;
import net.minestom.server.instance.block.states.PrismarineBrickStairs;
import net.minestom.server.instance.block.states.PrismarineSlab;
import net.minestom.server.instance.block.states.PrismarineStairs;
import net.minestom.server.instance.block.states.PrismarineWall;
import net.minestom.server.instance.block.states.PumpkinStem;
import net.minestom.server.instance.block.states.PurpleBanner;
import net.minestom.server.instance.block.states.PurpleBed;
import net.minestom.server.instance.block.states.PurpleGlazedTerracotta;
import net.minestom.server.instance.block.states.PurpleShulkerBox;
import net.minestom.server.instance.block.states.PurpleStainedGlassPane;
import net.minestom.server.instance.block.states.PurpleWallBanner;
import net.minestom.server.instance.block.states.PurpurPillar;
import net.minestom.server.instance.block.states.PurpurSlab;
import net.minestom.server.instance.block.states.PurpurStairs;
import net.minestom.server.instance.block.states.QuartzPillar;
import net.minestom.server.instance.block.states.QuartzSlab;
import net.minestom.server.instance.block.states.QuartzStairs;
import net.minestom.server.instance.block.states.Rail;
import net.minestom.server.instance.block.states.RedBanner;
import net.minestom.server.instance.block.states.RedBed;
import net.minestom.server.instance.block.states.RedGlazedTerracotta;
import net.minestom.server.instance.block.states.RedMushroomBlock;
import net.minestom.server.instance.block.states.RedNetherBrickSlab;
import net.minestom.server.instance.block.states.RedNetherBrickStairs;
import net.minestom.server.instance.block.states.RedNetherBrickWall;
import net.minestom.server.instance.block.states.RedSandstoneSlab;
import net.minestom.server.instance.block.states.RedSandstoneStairs;
import net.minestom.server.instance.block.states.RedSandstoneWall;
import net.minestom.server.instance.block.states.RedShulkerBox;
import net.minestom.server.instance.block.states.RedStainedGlassPane;
import net.minestom.server.instance.block.states.RedWallBanner;
import net.minestom.server.instance.block.states.RedstoneLamp;
import net.minestom.server.instance.block.states.RedstoneOre;
import net.minestom.server.instance.block.states.RedstoneTorch;
import net.minestom.server.instance.block.states.RedstoneWallTorch;
import net.minestom.server.instance.block.states.RedstoneWire;
import net.minestom.server.instance.block.states.Repeater;
import net.minestom.server.instance.block.states.RepeatingCommandBlock;
import net.minestom.server.instance.block.states.RespawnAnchor;
import net.minestom.server.instance.block.states.RoseBush;
import net.minestom.server.instance.block.states.SandstoneSlab;
import net.minestom.server.instance.block.states.SandstoneStairs;
import net.minestom.server.instance.block.states.SandstoneWall;
import net.minestom.server.instance.block.states.Scaffolding;
import net.minestom.server.instance.block.states.SeaPickle;
import net.minestom.server.instance.block.states.ShulkerBox;
import net.minestom.server.instance.block.states.SkeletonSkull;
import net.minestom.server.instance.block.states.SkeletonWallSkull;
import net.minestom.server.instance.block.states.Smoker;
import net.minestom.server.instance.block.states.SmoothQuartzSlab;
import net.minestom.server.instance.block.states.SmoothQuartzStairs;
import net.minestom.server.instance.block.states.SmoothRedSandstoneSlab;
import net.minestom.server.instance.block.states.SmoothRedSandstoneStairs;
import net.minestom.server.instance.block.states.SmoothSandstoneSlab;
import net.minestom.server.instance.block.states.SmoothSandstoneStairs;
import net.minestom.server.instance.block.states.SmoothStoneSlab;
import net.minestom.server.instance.block.states.Snow;
import net.minestom.server.instance.block.states.SoulCampfire;
import net.minestom.server.instance.block.states.SoulLantern;
import net.minestom.server.instance.block.states.SoulWallTorch;
import net.minestom.server.instance.block.states.SpruceButton;
import net.minestom.server.instance.block.states.SpruceDoor;
import net.minestom.server.instance.block.states.SpruceFence;
import net.minestom.server.instance.block.states.SpruceFenceGate;
import net.minestom.server.instance.block.states.SpruceLeaves;
import net.minestom.server.instance.block.states.SpruceLog;
import net.minestom.server.instance.block.states.SprucePressurePlate;
import net.minestom.server.instance.block.states.SpruceSapling;
import net.minestom.server.instance.block.states.SpruceSign;
import net.minestom.server.instance.block.states.SpruceSlab;
import net.minestom.server.instance.block.states.SpruceStairs;
import net.minestom.server.instance.block.states.SpruceTrapdoor;
import net.minestom.server.instance.block.states.SpruceWallSign;
import net.minestom.server.instance.block.states.SpruceWood;
import net.minestom.server.instance.block.states.StickyPiston;
import net.minestom.server.instance.block.states.StoneBrickSlab;
import net.minestom.server.instance.block.states.StoneBrickStairs;
import net.minestom.server.instance.block.states.StoneBrickWall;
import net.minestom.server.instance.block.states.StoneButton;
import net.minestom.server.instance.block.states.StonePressurePlate;
import net.minestom.server.instance.block.states.StoneSlab;
import net.minestom.server.instance.block.states.StoneStairs;
import net.minestom.server.instance.block.states.Stonecutter;
import net.minestom.server.instance.block.states.StrippedAcaciaLog;
import net.minestom.server.instance.block.states.StrippedAcaciaWood;
import net.minestom.server.instance.block.states.StrippedBirchLog;
import net.minestom.server.instance.block.states.StrippedBirchWood;
import net.minestom.server.instance.block.states.StrippedCrimsonHyphae;
import net.minestom.server.instance.block.states.StrippedCrimsonStem;
import net.minestom.server.instance.block.states.StrippedDarkOakLog;
import net.minestom.server.instance.block.states.StrippedDarkOakWood;
import net.minestom.server.instance.block.states.StrippedJungleLog;
import net.minestom.server.instance.block.states.StrippedJungleWood;
import net.minestom.server.instance.block.states.StrippedOakLog;
import net.minestom.server.instance.block.states.StrippedOakWood;
import net.minestom.server.instance.block.states.StrippedSpruceLog;
import net.minestom.server.instance.block.states.StrippedSpruceWood;
import net.minestom.server.instance.block.states.StrippedWarpedHyphae;
import net.minestom.server.instance.block.states.StrippedWarpedStem;
import net.minestom.server.instance.block.states.StructureBlock;
import net.minestom.server.instance.block.states.SugarCane;
import net.minestom.server.instance.block.states.Sunflower;
import net.minestom.server.instance.block.states.SweetBerryBush;
import net.minestom.server.instance.block.states.TallGrass;
import net.minestom.server.instance.block.states.TallSeagrass;
import net.minestom.server.instance.block.states.Target;
import net.minestom.server.instance.block.states.Tnt;
import net.minestom.server.instance.block.states.TrappedChest;
import net.minestom.server.instance.block.states.Tripwire;
import net.minestom.server.instance.block.states.TripwireHook;
import net.minestom.server.instance.block.states.TubeCoral;
import net.minestom.server.instance.block.states.TubeCoralFan;
import net.minestom.server.instance.block.states.TubeCoralWallFan;
import net.minestom.server.instance.block.states.TurtleEgg;
import net.minestom.server.instance.block.states.TwistingVines;
import net.minestom.server.instance.block.states.Vine;
import net.minestom.server.instance.block.states.WallTorch;
import net.minestom.server.instance.block.states.WarpedButton;
import net.minestom.server.instance.block.states.WarpedDoor;
import net.minestom.server.instance.block.states.WarpedFence;
import net.minestom.server.instance.block.states.WarpedFenceGate;
import net.minestom.server.instance.block.states.WarpedHyphae;
import net.minestom.server.instance.block.states.WarpedPressurePlate;
import net.minestom.server.instance.block.states.WarpedSign;
import net.minestom.server.instance.block.states.WarpedSlab;
import net.minestom.server.instance.block.states.WarpedStairs;
import net.minestom.server.instance.block.states.WarpedStem;
import net.minestom.server.instance.block.states.WarpedTrapdoor;
import net.minestom.server.instance.block.states.WarpedWallSign;
import net.minestom.server.instance.block.states.Water;
import net.minestom.server.instance.block.states.WeepingVines;
import net.minestom.server.instance.block.states.Wheat;
import net.minestom.server.instance.block.states.WhiteBanner;
import net.minestom.server.instance.block.states.WhiteBed;
import net.minestom.server.instance.block.states.WhiteGlazedTerracotta;
import net.minestom.server.instance.block.states.WhiteShulkerBox;
import net.minestom.server.instance.block.states.WhiteStainedGlassPane;
import net.minestom.server.instance.block.states.WhiteWallBanner;
import net.minestom.server.instance.block.states.WitherSkeletonSkull;
import net.minestom.server.instance.block.states.WitherSkeletonWallSkull;
import net.minestom.server.instance.block.states.YellowBanner;
import net.minestom.server.instance.block.states.YellowBed;
import net.minestom.server.instance.block.states.YellowGlazedTerracotta;
import net.minestom.server.instance.block.states.YellowShulkerBox;
import net.minestom.server.instance.block.states.YellowStainedGlassPane;
import net.minestom.server.instance.block.states.YellowWallBanner;
import net.minestom.server.instance.block.states.ZombieHead;
import net.minestom.server.instance.block.states.ZombieWallHead;
import net.minestom.server.registry.Registries;
import net.minestom.server.utils.NamespaceID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AUTOGENERATED by BlockGenerator
 */
@SuppressWarnings("deprecation")
public enum Block implements Keyed {
    AIR(NamespaceID.from("minecraft:air"), (short) 0, 0.0, 0.0, true, false, false, true),

    STONE(NamespaceID.from("minecraft:stone"), (short) 1, 1.5, 6.0, false, true, false, true),

    GRANITE(NamespaceID.from("minecraft:granite"), (short) 2, 1.5, 6.0, false, true, false, true),

    POLISHED_GRANITE(NamespaceID.from("minecraft:polished_granite"), (short) 3, 1.5, 6.0, false, true, false, true),

    DIORITE(NamespaceID.from("minecraft:diorite"), (short) 4, 1.5, 6.0, false, true, false, true),

    POLISHED_DIORITE(NamespaceID.from("minecraft:polished_diorite"), (short) 5, 1.5, 6.0, false, true, false, true),

    ANDESITE(NamespaceID.from("minecraft:andesite"), (short) 6, 1.5, 6.0, false, true, false, true),

    POLISHED_ANDESITE(NamespaceID.from("minecraft:polished_andesite"), (short) 7, 1.5, 6.0, false, true, false, true),

    GRASS_BLOCK(NamespaceID.from("minecraft:grass_block"), (short) 9, 0.6, 0.6, false, true, false, false),

    DIRT(NamespaceID.from("minecraft:dirt"), (short) 10, 0.5, 0.5, false, true, false, true),

    COARSE_DIRT(NamespaceID.from("minecraft:coarse_dirt"), (short) 11, 0.5, 0.5, false, true, false, true),

    PODZOL(NamespaceID.from("minecraft:podzol"), (short) 13, 0.5, 0.5, false, true, false, false),

    COBBLESTONE(NamespaceID.from("minecraft:cobblestone"), (short) 14, 2.0, 6.0, false, true, false, true),

    OAK_PLANKS(NamespaceID.from("minecraft:oak_planks"), (short) 15, 2.0, 3.0, false, true, false, true),

    SPRUCE_PLANKS(NamespaceID.from("minecraft:spruce_planks"), (short) 16, 2.0, 3.0, false, true, false, true),

    BIRCH_PLANKS(NamespaceID.from("minecraft:birch_planks"), (short) 17, 2.0, 3.0, false, true, false, true),

    JUNGLE_PLANKS(NamespaceID.from("minecraft:jungle_planks"), (short) 18, 2.0, 3.0, false, true, false, true),

    ACACIA_PLANKS(NamespaceID.from("minecraft:acacia_planks"), (short) 19, 2.0, 3.0, false, true, false, true),

    DARK_OAK_PLANKS(NamespaceID.from("minecraft:dark_oak_planks"), (short) 20, 2.0, 3.0, false, true, false, true),

    OAK_SAPLING(NamespaceID.from("minecraft:oak_sapling"), (short) 21, 0.0, 0.0, false, false, false, false),

    SPRUCE_SAPLING(NamespaceID.from("minecraft:spruce_sapling"), (short) 23, 0.0, 0.0, false, false, false, false),

    BIRCH_SAPLING(NamespaceID.from("minecraft:birch_sapling"), (short) 25, 0.0, 0.0, false, false, false, false),

    JUNGLE_SAPLING(NamespaceID.from("minecraft:jungle_sapling"), (short) 27, 0.0, 0.0, false, false, false, false),

    ACACIA_SAPLING(NamespaceID.from("minecraft:acacia_sapling"), (short) 29, 0.0, 0.0, false, false, false, false),

    DARK_OAK_SAPLING(NamespaceID.from("minecraft:dark_oak_sapling"), (short) 31, 0.0, 0.0, false, false, false, false),

    BEDROCK(NamespaceID.from("minecraft:bedrock"), (short) 33, -1.0, 3600000.0, false, true, false, true),

    WATER(NamespaceID.from("minecraft:water"), (short) 34, 100.0, 100.0, false, false, false, false),

    LAVA(NamespaceID.from("minecraft:lava"), (short) 50, 100.0, 100.0, false, false, false, false),

    SAND(NamespaceID.from("minecraft:sand"), (short) 66, 0.5, 0.5, false, true, false, true),

    RED_SAND(NamespaceID.from("minecraft:red_sand"), (short) 67, 0.5, 0.5, false, true, false, true),

    GRAVEL(NamespaceID.from("minecraft:gravel"), (short) 68, 0.6, 0.6, false, true, false, true),

    GOLD_ORE(NamespaceID.from("minecraft:gold_ore"), (short) 69, 3.0, 3.0, false, true, false, true),

    IRON_ORE(NamespaceID.from("minecraft:iron_ore"), (short) 70, 3.0, 3.0, false, true, false, true),

    COAL_ORE(NamespaceID.from("minecraft:coal_ore"), (short) 71, 3.0, 3.0, false, true, false, true),

    NETHER_GOLD_ORE(NamespaceID.from("minecraft:nether_gold_ore"), (short) 72, 3.0, 3.0, false, true, false, true),

    OAK_LOG(NamespaceID.from("minecraft:oak_log"), (short) 74, 2.0, 2.0, false, true, false, false),

    SPRUCE_LOG(NamespaceID.from("minecraft:spruce_log"), (short) 77, 2.0, 2.0, false, true, false, false),

    BIRCH_LOG(NamespaceID.from("minecraft:birch_log"), (short) 80, 2.0, 2.0, false, true, false, false),

    JUNGLE_LOG(NamespaceID.from("minecraft:jungle_log"), (short) 83, 2.0, 2.0, false, true, false, false),

    ACACIA_LOG(NamespaceID.from("minecraft:acacia_log"), (short) 86, 2.0, 2.0, false, true, false, false),

    DARK_OAK_LOG(NamespaceID.from("minecraft:dark_oak_log"), (short) 89, 2.0, 2.0, false, true, false, false),

    STRIPPED_SPRUCE_LOG(NamespaceID.from("minecraft:stripped_spruce_log"), (short) 92, 2.0, 2.0, false, true, false, false),

    STRIPPED_BIRCH_LOG(NamespaceID.from("minecraft:stripped_birch_log"), (short) 95, 2.0, 2.0, false, true, false, false),

    STRIPPED_JUNGLE_LOG(NamespaceID.from("minecraft:stripped_jungle_log"), (short) 98, 2.0, 2.0, false, true, false, false),

    STRIPPED_ACACIA_LOG(NamespaceID.from("minecraft:stripped_acacia_log"), (short) 101, 2.0, 2.0, false, true, false, false),

    STRIPPED_DARK_OAK_LOG(NamespaceID.from("minecraft:stripped_dark_oak_log"), (short) 104, 2.0, 2.0, false, true, false, false),

    STRIPPED_OAK_LOG(NamespaceID.from("minecraft:stripped_oak_log"), (short) 107, 2.0, 2.0, false, true, false, false),

    OAK_WOOD(NamespaceID.from("minecraft:oak_wood"), (short) 110, 2.0, 2.0, false, true, false, false),

    SPRUCE_WOOD(NamespaceID.from("minecraft:spruce_wood"), (short) 113, 2.0, 2.0, false, true, false, false),

    BIRCH_WOOD(NamespaceID.from("minecraft:birch_wood"), (short) 116, 2.0, 2.0, false, true, false, false),

    JUNGLE_WOOD(NamespaceID.from("minecraft:jungle_wood"), (short) 119, 2.0, 2.0, false, true, false, false),

    ACACIA_WOOD(NamespaceID.from("minecraft:acacia_wood"), (short) 122, 2.0, 2.0, false, true, false, false),

    DARK_OAK_WOOD(NamespaceID.from("minecraft:dark_oak_wood"), (short) 125, 2.0, 2.0, false, true, false, false),

    STRIPPED_OAK_WOOD(NamespaceID.from("minecraft:stripped_oak_wood"), (short) 128, 2.0, 2.0, false, true, false, false),

    STRIPPED_SPRUCE_WOOD(NamespaceID.from("minecraft:stripped_spruce_wood"), (short) 131, 2.0, 2.0, false, true, false, false),

    STRIPPED_BIRCH_WOOD(NamespaceID.from("minecraft:stripped_birch_wood"), (short) 134, 2.0, 2.0, false, true, false, false),

    STRIPPED_JUNGLE_WOOD(NamespaceID.from("minecraft:stripped_jungle_wood"), (short) 137, 2.0, 2.0, false, true, false, false),

    STRIPPED_ACACIA_WOOD(NamespaceID.from("minecraft:stripped_acacia_wood"), (short) 140, 2.0, 2.0, false, true, false, false),

    STRIPPED_DARK_OAK_WOOD(NamespaceID.from("minecraft:stripped_dark_oak_wood"), (short) 143, 2.0, 2.0, false, true, false, false),

    OAK_LEAVES(NamespaceID.from("minecraft:oak_leaves"), (short) 158, 0.2, 0.2, false, true, false, false),

    SPRUCE_LEAVES(NamespaceID.from("minecraft:spruce_leaves"), (short) 172, 0.2, 0.2, false, true, false, false),

    BIRCH_LEAVES(NamespaceID.from("minecraft:birch_leaves"), (short) 186, 0.2, 0.2, false, true, false, false),

    JUNGLE_LEAVES(NamespaceID.from("minecraft:jungle_leaves"), (short) 200, 0.2, 0.2, false, true, false, false),

    ACACIA_LEAVES(NamespaceID.from("minecraft:acacia_leaves"), (short) 214, 0.2, 0.2, false, true, false, false),

    DARK_OAK_LEAVES(NamespaceID.from("minecraft:dark_oak_leaves"), (short) 228, 0.2, 0.2, false, true, false, false),

    SPONGE(NamespaceID.from("minecraft:sponge"), (short) 229, 0.6, 0.6, false, true, false, true),

    WET_SPONGE(NamespaceID.from("minecraft:wet_sponge"), (short) 230, 0.6, 0.6, false, true, false, true),

    GLASS(NamespaceID.from("minecraft:glass"), (short) 231, 0.3, 0.3, false, true, false, true),

    LAPIS_ORE(NamespaceID.from("minecraft:lapis_ore"), (short) 232, 3.0, 3.0, false, true, false, true),

    LAPIS_BLOCK(NamespaceID.from("minecraft:lapis_block"), (short) 233, 3.0, 3.0, false, true, false, true),

    DISPENSER(NamespaceID.from("minecraft:dispenser"), (short) 235, 3.5, 3.5, false, true, true, false),

    SANDSTONE(NamespaceID.from("minecraft:sandstone"), (short) 246, 0.8, 0.8, false, true, false, true),

    CHISELED_SANDSTONE(NamespaceID.from("minecraft:chiseled_sandstone"), (short) 247, 0.8, 0.8, false, true, false, true),

    CUT_SANDSTONE(NamespaceID.from("minecraft:cut_sandstone"), (short) 248, 0.8, 0.8, false, true, false, true),

    NOTE_BLOCK(NamespaceID.from("minecraft:note_block"), (short) 250, 0.8, 0.8, false, true, false, false),

    WHITE_BED(NamespaceID.from("minecraft:white_bed"), (short) 1052, 0.2, 0.2, false, true, true, false),

    ORANGE_BED(NamespaceID.from("minecraft:orange_bed"), (short) 1068, 0.2, 0.2, false, true, true, false),

    MAGENTA_BED(NamespaceID.from("minecraft:magenta_bed"), (short) 1084, 0.2, 0.2, false, true, true, false),

    LIGHT_BLUE_BED(NamespaceID.from("minecraft:light_blue_bed"), (short) 1100, 0.2, 0.2, false, true, true, false),

    YELLOW_BED(NamespaceID.from("minecraft:yellow_bed"), (short) 1116, 0.2, 0.2, false, true, true, false),

    LIME_BED(NamespaceID.from("minecraft:lime_bed"), (short) 1132, 0.2, 0.2, false, true, true, false),

    PINK_BED(NamespaceID.from("minecraft:pink_bed"), (short) 1148, 0.2, 0.2, false, true, true, false),

    GRAY_BED(NamespaceID.from("minecraft:gray_bed"), (short) 1164, 0.2, 0.2, false, true, true, false),

    LIGHT_GRAY_BED(NamespaceID.from("minecraft:light_gray_bed"), (short) 1180, 0.2, 0.2, false, true, true, false),

    CYAN_BED(NamespaceID.from("minecraft:cyan_bed"), (short) 1196, 0.2, 0.2, false, true, true, false),

    PURPLE_BED(NamespaceID.from("minecraft:purple_bed"), (short) 1212, 0.2, 0.2, false, true, true, false),

    BLUE_BED(NamespaceID.from("minecraft:blue_bed"), (short) 1228, 0.2, 0.2, false, true, true, false),

    BROWN_BED(NamespaceID.from("minecraft:brown_bed"), (short) 1244, 0.2, 0.2, false, true, true, false),

    GREEN_BED(NamespaceID.from("minecraft:green_bed"), (short) 1260, 0.2, 0.2, false, true, true, false),

    RED_BED(NamespaceID.from("minecraft:red_bed"), (short) 1276, 0.2, 0.2, false, true, true, false),

    BLACK_BED(NamespaceID.from("minecraft:black_bed"), (short) 1292, 0.2, 0.2, false, true, true, false),

    POWERED_RAIL(NamespaceID.from("minecraft:powered_rail"), (short) 1311, 0.7, 0.7, false, false, false, false),

    DETECTOR_RAIL(NamespaceID.from("minecraft:detector_rail"), (short) 1323, 0.7, 0.7, false, false, false, false),

    STICKY_PISTON(NamespaceID.from("minecraft:sticky_piston"), (short) 1335, 1.5, 1.5, false, true, false, false),

    COBWEB(NamespaceID.from("minecraft:cobweb"), (short) 1341, 4.0, 4.0, false, true, false, true),

    GRASS(NamespaceID.from("minecraft:grass"), (short) 1342, 0.0, 0.0, false, false, false, true),

    FERN(NamespaceID.from("minecraft:fern"), (short) 1343, 0.0, 0.0, false, false, false, true),

    DEAD_BUSH(NamespaceID.from("minecraft:dead_bush"), (short) 1344, 0.0, 0.0, false, false, false, true),

    SEAGRASS(NamespaceID.from("minecraft:seagrass"), (short) 1345, 0.0, 0.0, false, false, false, true),

    TALL_SEAGRASS(NamespaceID.from("minecraft:tall_seagrass"), (short) 1347, 0.0, 0.0, false, false, false, false),

    PISTON(NamespaceID.from("minecraft:piston"), (short) 1354, 1.5, 1.5, false, true, false, false),

    PISTON_HEAD(NamespaceID.from("minecraft:piston_head"), (short) 1362, 1.5, 1.5, false, true, false, false),

    WHITE_WOOL(NamespaceID.from("minecraft:white_wool"), (short) 1384, 0.8, 0.8, false, true, false, true),

    ORANGE_WOOL(NamespaceID.from("minecraft:orange_wool"), (short) 1385, 0.8, 0.8, false, true, false, true),

    MAGENTA_WOOL(NamespaceID.from("minecraft:magenta_wool"), (short) 1386, 0.8, 0.8, false, true, false, true),

    LIGHT_BLUE_WOOL(NamespaceID.from("minecraft:light_blue_wool"), (short) 1387, 0.8, 0.8, false, true, false, true),

    YELLOW_WOOL(NamespaceID.from("minecraft:yellow_wool"), (short) 1388, 0.8, 0.8, false, true, false, true),

    LIME_WOOL(NamespaceID.from("minecraft:lime_wool"), (short) 1389, 0.8, 0.8, false, true, false, true),

    PINK_WOOL(NamespaceID.from("minecraft:pink_wool"), (short) 1390, 0.8, 0.8, false, true, false, true),

    GRAY_WOOL(NamespaceID.from("minecraft:gray_wool"), (short) 1391, 0.8, 0.8, false, true, false, true),

    LIGHT_GRAY_WOOL(NamespaceID.from("minecraft:light_gray_wool"), (short) 1392, 0.8, 0.8, false, true, false, true),

    CYAN_WOOL(NamespaceID.from("minecraft:cyan_wool"), (short) 1393, 0.8, 0.8, false, true, false, true),

    PURPLE_WOOL(NamespaceID.from("minecraft:purple_wool"), (short) 1394, 0.8, 0.8, false, true, false, true),

    BLUE_WOOL(NamespaceID.from("minecraft:blue_wool"), (short) 1395, 0.8, 0.8, false, true, false, true),

    BROWN_WOOL(NamespaceID.from("minecraft:brown_wool"), (short) 1396, 0.8, 0.8, false, true, false, true),

    GREEN_WOOL(NamespaceID.from("minecraft:green_wool"), (short) 1397, 0.8, 0.8, false, true, false, true),

    RED_WOOL(NamespaceID.from("minecraft:red_wool"), (short) 1398, 0.8, 0.8, false, true, false, true),

    BLACK_WOOL(NamespaceID.from("minecraft:black_wool"), (short) 1399, 0.8, 0.8, false, true, false, true),

    MOVING_PISTON(NamespaceID.from("minecraft:moving_piston"), (short) 1400, -1.0, 0.0, false, true, true, false),

    DANDELION(NamespaceID.from("minecraft:dandelion"), (short) 1412, 0.0, 0.0, false, false, false, true),

    POPPY(NamespaceID.from("minecraft:poppy"), (short) 1413, 0.0, 0.0, false, false, false, true),

    BLUE_ORCHID(NamespaceID.from("minecraft:blue_orchid"), (short) 1414, 0.0, 0.0, false, false, false, true),

    ALLIUM(NamespaceID.from("minecraft:allium"), (short) 1415, 0.0, 0.0, false, false, false, true),

    AZURE_BLUET(NamespaceID.from("minecraft:azure_bluet"), (short) 1416, 0.0, 0.0, false, false, false, true),

    RED_TULIP(NamespaceID.from("minecraft:red_tulip"), (short) 1417, 0.0, 0.0, false, false, false, true),

    ORANGE_TULIP(NamespaceID.from("minecraft:orange_tulip"), (short) 1418, 0.0, 0.0, false, false, false, true),

    WHITE_TULIP(NamespaceID.from("minecraft:white_tulip"), (short) 1419, 0.0, 0.0, false, false, false, true),

    PINK_TULIP(NamespaceID.from("minecraft:pink_tulip"), (short) 1420, 0.0, 0.0, false, false, false, true),

    OXEYE_DAISY(NamespaceID.from("minecraft:oxeye_daisy"), (short) 1421, 0.0, 0.0, false, false, false, true),

    CORNFLOWER(NamespaceID.from("minecraft:cornflower"), (short) 1422, 0.0, 0.0, false, false, false, true),

    WITHER_ROSE(NamespaceID.from("minecraft:wither_rose"), (short) 1423, 0.0, 0.0, false, false, false, true),

    LILY_OF_THE_VALLEY(NamespaceID.from("minecraft:lily_of_the_valley"), (short) 1424, 0.0, 0.0, false, false, false, true),

    BROWN_MUSHROOM(NamespaceID.from("minecraft:brown_mushroom"), (short) 1425, 0.0, 0.0, false, false, false, true),

    RED_MUSHROOM(NamespaceID.from("minecraft:red_mushroom"), (short) 1426, 0.0, 0.0, false, false, false, true),

    GOLD_BLOCK(NamespaceID.from("minecraft:gold_block"), (short) 1427, 3.0, 6.0, false, true, false, true),

    IRON_BLOCK(NamespaceID.from("minecraft:iron_block"), (short) 1428, 5.0, 6.0, false, true, false, true),

    BRICKS(NamespaceID.from("minecraft:bricks"), (short) 1429, 2.0, 6.0, false, true, false, true),

    TNT(NamespaceID.from("minecraft:tnt"), (short) 1431, 0.0, 0.0, false, true, false, false),

    BOOKSHELF(NamespaceID.from("minecraft:bookshelf"), (short) 1432, 1.5, 1.5, false, true, false, true),

    MOSSY_COBBLESTONE(NamespaceID.from("minecraft:mossy_cobblestone"), (short) 1433, 2.0, 6.0, false, true, false, true),

    OBSIDIAN(NamespaceID.from("minecraft:obsidian"), (short) 1434, 50.0, 1200.0, false, true, false, true),

    TORCH(NamespaceID.from("minecraft:torch"), (short) 1435, 0.0, 0.0, false, false, false, true),

    WALL_TORCH(NamespaceID.from("minecraft:wall_torch"), (short) 1436, 0.0, 0.0, false, false, false, false),

    FIRE(NamespaceID.from("minecraft:fire"), (short) 1471, 0.0, 0.0, false, false, false, false),

    SOUL_FIRE(NamespaceID.from("minecraft:soul_fire"), (short) 1952, 0.0, 0.0, false, false, false, true),

    SPAWNER(NamespaceID.from("minecraft:spawner"), (short) 1953, 5.0, 5.0, false, true, true, true),

    OAK_STAIRS(NamespaceID.from("minecraft:oak_stairs"), (short) 1965, 2.0, 3.0, false, true, false, false),

    CHEST(NamespaceID.from("minecraft:chest"), (short) 2035, 2.5, 2.5, false, true, true, false),

    REDSTONE_WIRE(NamespaceID.from("minecraft:redstone_wire"), (short) 3218, 0.0, 0.0, false, false, false, false),

    DIAMOND_ORE(NamespaceID.from("minecraft:diamond_ore"), (short) 3354, 3.0, 3.0, false, true, false, true),

    DIAMOND_BLOCK(NamespaceID.from("minecraft:diamond_block"), (short) 3355, 5.0, 6.0, false, true, false, true),

    CRAFTING_TABLE(NamespaceID.from("minecraft:crafting_table"), (short) 3356, 2.5, 2.5, false, true, false, true),

    WHEAT(NamespaceID.from("minecraft:wheat"), (short) 3357, 0.0, 0.0, false, false, false, false),

    FARMLAND(NamespaceID.from("minecraft:farmland"), (short) 3365, 0.6, 0.6, false, true, false, false),

    FURNACE(NamespaceID.from("minecraft:furnace"), (short) 3374, 3.5, 3.5, false, true, true, false),

    OAK_SIGN(NamespaceID.from("minecraft:oak_sign"), (short) 3382, 1.0, 1.0, false, true, true, false),

    SPRUCE_SIGN(NamespaceID.from("minecraft:spruce_sign"), (short) 3414, 1.0, 1.0, false, true, true, false),

    BIRCH_SIGN(NamespaceID.from("minecraft:birch_sign"), (short) 3446, 1.0, 1.0, false, true, true, false),

    ACACIA_SIGN(NamespaceID.from("minecraft:acacia_sign"), (short) 3478, 1.0, 1.0, false, true, true, false),

    JUNGLE_SIGN(NamespaceID.from("minecraft:jungle_sign"), (short) 3510, 1.0, 1.0, false, true, true, false),

    DARK_OAK_SIGN(NamespaceID.from("minecraft:dark_oak_sign"), (short) 3542, 1.0, 1.0, false, true, true, false),

    OAK_DOOR(NamespaceID.from("minecraft:oak_door"), (short) 3584, 3.0, 3.0, false, true, false, false),

    LADDER(NamespaceID.from("minecraft:ladder"), (short) 3638, 0.4, 0.4, false, false, false, false),

    RAIL(NamespaceID.from("minecraft:rail"), (short) 3645, 0.7, 0.7, false, false, false, false),

    COBBLESTONE_STAIRS(NamespaceID.from("minecraft:cobblestone_stairs"), (short) 3666, 2.0, 6.0, false, true, false, false),

    OAK_WALL_SIGN(NamespaceID.from("minecraft:oak_wall_sign"), (short) 3736, 1.0, 1.0, false, true, true, false),

    SPRUCE_WALL_SIGN(NamespaceID.from("minecraft:spruce_wall_sign"), (short) 3744, 1.0, 1.0, false, true, true, false),

    BIRCH_WALL_SIGN(NamespaceID.from("minecraft:birch_wall_sign"), (short) 3752, 1.0, 1.0, false, true, true, false),

    ACACIA_WALL_SIGN(NamespaceID.from("minecraft:acacia_wall_sign"), (short) 3760, 1.0, 1.0, false, true, true, false),

    JUNGLE_WALL_SIGN(NamespaceID.from("minecraft:jungle_wall_sign"), (short) 3768, 1.0, 1.0, false, true, true, false),

    DARK_OAK_WALL_SIGN(NamespaceID.from("minecraft:dark_oak_wall_sign"), (short) 3776, 1.0, 1.0, false, true, true, false),

    LEVER(NamespaceID.from("minecraft:lever"), (short) 3792, 0.5, 0.5, false, false, false, false),

    STONE_PRESSURE_PLATE(NamespaceID.from("minecraft:stone_pressure_plate"), (short) 3808, 0.5, 0.5, false, true, false, false),

    IRON_DOOR(NamespaceID.from("minecraft:iron_door"), (short) 3820, 5.0, 5.0, false, true, false, false),

    OAK_PRESSURE_PLATE(NamespaceID.from("minecraft:oak_pressure_plate"), (short) 3874, 0.5, 0.5, false, true, false, false),

    SPRUCE_PRESSURE_PLATE(NamespaceID.from("minecraft:spruce_pressure_plate"), (short) 3876, 0.5, 0.5, false, true, false, false),

    BIRCH_PRESSURE_PLATE(NamespaceID.from("minecraft:birch_pressure_plate"), (short) 3878, 0.5, 0.5, false, true, false, false),

    JUNGLE_PRESSURE_PLATE(NamespaceID.from("minecraft:jungle_pressure_plate"), (short) 3880, 0.5, 0.5, false, true, false, false),

    ACACIA_PRESSURE_PLATE(NamespaceID.from("minecraft:acacia_pressure_plate"), (short) 3882, 0.5, 0.5, false, true, false, false),

    DARK_OAK_PRESSURE_PLATE(NamespaceID.from("minecraft:dark_oak_pressure_plate"), (short) 3884, 0.5, 0.5, false, true, false, false),

    REDSTONE_ORE(NamespaceID.from("minecraft:redstone_ore"), (short) 3886, 3.0, 3.0, false, true, false, false),

    REDSTONE_TORCH(NamespaceID.from("minecraft:redstone_torch"), (short) 3887, 0.0, 0.0, false, false, false, false),

    REDSTONE_WALL_TORCH(NamespaceID.from("minecraft:redstone_wall_torch"), (short) 3889, 0.0, 0.0, false, false, false, false),

    STONE_BUTTON(NamespaceID.from("minecraft:stone_button"), (short) 3906, 0.5, 0.5, false, false, false, false),

    SNOW(NamespaceID.from("minecraft:snow"), (short) 3921, 0.1, 0.1, false, false, false, false),

    ICE(NamespaceID.from("minecraft:ice"), (short) 3929, 0.5, 0.5, false, true, false, true),

    SNOW_BLOCK(NamespaceID.from("minecraft:snow_block"), (short) 3930, 0.2, 0.2, false, true, false, true),

    CACTUS(NamespaceID.from("minecraft:cactus"), (short) 3931, 0.4, 0.4, false, true, false, false),

    CLAY(NamespaceID.from("minecraft:clay"), (short) 3947, 0.6, 0.6, false, true, false, true),

    SUGAR_CANE(NamespaceID.from("minecraft:sugar_cane"), (short) 3948, 0.0, 0.0, false, false, false, false),

    JUKEBOX(NamespaceID.from("minecraft:jukebox"), (short) 3965, 2.0, 6.0, false, true, true, false),

    OAK_FENCE(NamespaceID.from("minecraft:oak_fence"), (short) 3997, 2.0, 3.0, false, true, false, false),

    PUMPKIN(NamespaceID.from("minecraft:pumpkin"), (short) 3998, 1.0, 1.0, false, true, false, true),

    NETHERRACK(NamespaceID.from("minecraft:netherrack"), (short) 3999, 0.4, 0.4, false, true, false, true),

    SOUL_SAND(NamespaceID.from("minecraft:soul_sand"), (short) 4000, 0.5, 0.5, false, true, false, true),

    SOUL_SOIL(NamespaceID.from("minecraft:soul_soil"), (short) 4001, 0.5, 0.5, false, true, false, true),

    BASALT(NamespaceID.from("minecraft:basalt"), (short) 4003, 1.25, 4.2, false, true, false, false),

    POLISHED_BASALT(NamespaceID.from("minecraft:polished_basalt"), (short) 4006, 1.25, 4.2, false, true, false, false),

    SOUL_TORCH(NamespaceID.from("minecraft:soul_torch"), (short) 4008, 0.0, 0.0, false, false, false, true),

    SOUL_WALL_TORCH(NamespaceID.from("minecraft:soul_wall_torch"), (short) 4009, 0.0, 0.0, false, false, false, false),

    GLOWSTONE(NamespaceID.from("minecraft:glowstone"), (short) 4013, 0.3, 0.3, false, true, false, true),

    NETHER_PORTAL(NamespaceID.from("minecraft:nether_portal"), (short) 4014, -1.0, 0.0, false, false, false, false),

    CARVED_PUMPKIN(NamespaceID.from("minecraft:carved_pumpkin"), (short) 4016, 1.0, 1.0, false, true, false, false),

    JACK_O_LANTERN(NamespaceID.from("minecraft:jack_o_lantern"), (short) 4020, 1.0, 1.0, false, true, false, false),

    CAKE(NamespaceID.from("minecraft:cake"), (short) 4024, 0.5, 0.5, false, true, false, false),

    REPEATER(NamespaceID.from("minecraft:repeater"), (short) 4034, 0.0, 0.0, false, false, false, false),

    WHITE_STAINED_GLASS(NamespaceID.from("minecraft:white_stained_glass"), (short) 4095, 0.3, 0.3, false, true, false, true),

    ORANGE_STAINED_GLASS(NamespaceID.from("minecraft:orange_stained_glass"), (short) 4096, 0.3, 0.3, false, true, false, true),

    MAGENTA_STAINED_GLASS(NamespaceID.from("minecraft:magenta_stained_glass"), (short) 4097, 0.3, 0.3, false, true, false, true),

    LIGHT_BLUE_STAINED_GLASS(NamespaceID.from("minecraft:light_blue_stained_glass"), (short) 4098, 0.3, 0.3, false, true, false, true),

    YELLOW_STAINED_GLASS(NamespaceID.from("minecraft:yellow_stained_glass"), (short) 4099, 0.3, 0.3, false, true, false, true),

    LIME_STAINED_GLASS(NamespaceID.from("minecraft:lime_stained_glass"), (short) 4100, 0.3, 0.3, false, true, false, true),

    PINK_STAINED_GLASS(NamespaceID.from("minecraft:pink_stained_glass"), (short) 4101, 0.3, 0.3, false, true, false, true),

    GRAY_STAINED_GLASS(NamespaceID.from("minecraft:gray_stained_glass"), (short) 4102, 0.3, 0.3, false, true, false, true),

    LIGHT_GRAY_STAINED_GLASS(NamespaceID.from("minecraft:light_gray_stained_glass"), (short) 4103, 0.3, 0.3, false, true, false, true),

    CYAN_STAINED_GLASS(NamespaceID.from("minecraft:cyan_stained_glass"), (short) 4104, 0.3, 0.3, false, true, false, true),

    PURPLE_STAINED_GLASS(NamespaceID.from("minecraft:purple_stained_glass"), (short) 4105, 0.3, 0.3, false, true, false, true),

    BLUE_STAINED_GLASS(NamespaceID.from("minecraft:blue_stained_glass"), (short) 4106, 0.3, 0.3, false, true, false, true),

    BROWN_STAINED_GLASS(NamespaceID.from("minecraft:brown_stained_glass"), (short) 4107, 0.3, 0.3, false, true, false, true),

    GREEN_STAINED_GLASS(NamespaceID.from("minecraft:green_stained_glass"), (short) 4108, 0.3, 0.3, false, true, false, true),

    RED_STAINED_GLASS(NamespaceID.from("minecraft:red_stained_glass"), (short) 4109, 0.3, 0.3, false, true, false, true),

    BLACK_STAINED_GLASS(NamespaceID.from("minecraft:black_stained_glass"), (short) 4110, 0.3, 0.3, false, true, false, true),

    OAK_TRAPDOOR(NamespaceID.from("minecraft:oak_trapdoor"), (short) 4126, 3.0, 3.0, false, true, false, false),

    SPRUCE_TRAPDOOR(NamespaceID.from("minecraft:spruce_trapdoor"), (short) 4190, 3.0, 3.0, false, true, false, false),

    BIRCH_TRAPDOOR(NamespaceID.from("minecraft:birch_trapdoor"), (short) 4254, 3.0, 3.0, false, true, false, false),

    JUNGLE_TRAPDOOR(NamespaceID.from("minecraft:jungle_trapdoor"), (short) 4318, 3.0, 3.0, false, true, false, false),

    ACACIA_TRAPDOOR(NamespaceID.from("minecraft:acacia_trapdoor"), (short) 4382, 3.0, 3.0, false, true, false, false),

    DARK_OAK_TRAPDOOR(NamespaceID.from("minecraft:dark_oak_trapdoor"), (short) 4446, 3.0, 3.0, false, true, false, false),

    STONE_BRICKS(NamespaceID.from("minecraft:stone_bricks"), (short) 4495, 1.5, 6.0, false, true, false, true),

    MOSSY_STONE_BRICKS(NamespaceID.from("minecraft:mossy_stone_bricks"), (short) 4496, 1.5, 6.0, false, true, false, true),

    CRACKED_STONE_BRICKS(NamespaceID.from("minecraft:cracked_stone_bricks"), (short) 4497, 1.5, 6.0, false, true, false, true),

    CHISELED_STONE_BRICKS(NamespaceID.from("minecraft:chiseled_stone_bricks"), (short) 4498, 1.5, 6.0, false, true, false, true),

    INFESTED_STONE(NamespaceID.from("minecraft:infested_stone"), (short) 4499, 0.0, 0.75, false, true, false, true),

    INFESTED_COBBLESTONE(NamespaceID.from("minecraft:infested_cobblestone"), (short) 4500, 0.0, 0.75, false, true, false, true),

    INFESTED_STONE_BRICKS(NamespaceID.from("minecraft:infested_stone_bricks"), (short) 4501, 0.0, 0.75, false, true, false, true),

    INFESTED_MOSSY_STONE_BRICKS(NamespaceID.from("minecraft:infested_mossy_stone_bricks"), (short) 4502, 0.0, 0.75, false, true, false, true),

    INFESTED_CRACKED_STONE_BRICKS(NamespaceID.from("minecraft:infested_cracked_stone_bricks"), (short) 4503, 0.0, 0.75, false, true, false, true),

    INFESTED_CHISELED_STONE_BRICKS(NamespaceID.from("minecraft:infested_chiseled_stone_bricks"), (short) 4504, 0.0, 0.75, false, true, false, true),

    BROWN_MUSHROOM_BLOCK(NamespaceID.from("minecraft:brown_mushroom_block"), (short) 4505, 0.2, 0.2, false, true, false, false),

    RED_MUSHROOM_BLOCK(NamespaceID.from("minecraft:red_mushroom_block"), (short) 4569, 0.2, 0.2, false, true, false, false),

    MUSHROOM_STEM(NamespaceID.from("minecraft:mushroom_stem"), (short) 4633, 0.2, 0.2, false, true, false, false),

    IRON_BARS(NamespaceID.from("minecraft:iron_bars"), (short) 4728, 5.0, 6.0, false, true, false, false),

    CHAIN(NamespaceID.from("minecraft:chain"), (short) 4732, 5.0, 6.0, false, true, false, false),

    GLASS_PANE(NamespaceID.from("minecraft:glass_pane"), (short) 4766, 0.3, 0.3, false, true, false, false),

    MELON(NamespaceID.from("minecraft:melon"), (short) 4767, 1.0, 1.0, false, true, false, true),

    ATTACHED_PUMPKIN_STEM(NamespaceID.from("minecraft:attached_pumpkin_stem"), (short) 4768, 0.0, 0.0, false, false, false, false),

    ATTACHED_MELON_STEM(NamespaceID.from("minecraft:attached_melon_stem"), (short) 4772, 0.0, 0.0, false, false, false, false),

    PUMPKIN_STEM(NamespaceID.from("minecraft:pumpkin_stem"), (short) 4776, 0.0, 0.0, false, false, false, false),

    MELON_STEM(NamespaceID.from("minecraft:melon_stem"), (short) 4784, 0.0, 0.0, false, false, false, false),

    VINE(NamespaceID.from("minecraft:vine"), (short) 4823, 0.2, 0.2, false, false, false, false),

    OAK_FENCE_GATE(NamespaceID.from("minecraft:oak_fence_gate"), (short) 4831, 2.0, 3.0, false, true, false, false),

    BRICK_STAIRS(NamespaceID.from("minecraft:brick_stairs"), (short) 4867, 2.0, 6.0, false, true, false, false),

    STONE_BRICK_STAIRS(NamespaceID.from("minecraft:stone_brick_stairs"), (short) 4947, 1.5, 6.0, false, true, false, false),

    MYCELIUM(NamespaceID.from("minecraft:mycelium"), (short) 5017, 0.6, 0.6, false, true, false, false),

    LILY_PAD(NamespaceID.from("minecraft:lily_pad"), (short) 5018, 0.0, 0.0, false, false, false, true),

    NETHER_BRICKS(NamespaceID.from("minecraft:nether_bricks"), (short) 5019, 2.0, 6.0, false, true, false, true),

    NETHER_BRICK_FENCE(NamespaceID.from("minecraft:nether_brick_fence"), (short) 5051, 2.0, 6.0, false, true, false, false),

    NETHER_BRICK_STAIRS(NamespaceID.from("minecraft:nether_brick_stairs"), (short) 5063, 2.0, 6.0, false, true, false, false),

    NETHER_WART(NamespaceID.from("minecraft:nether_wart"), (short) 5132, 0.0, 0.0, false, false, false, false),

    ENCHANTING_TABLE(NamespaceID.from("minecraft:enchanting_table"), (short) 5136, 5.0, 1200.0, false, true, true, true),

    BREWING_STAND(NamespaceID.from("minecraft:brewing_stand"), (short) 5144, 0.5, 0.5, false, true, true, false),

    CAULDRON(NamespaceID.from("minecraft:cauldron"), (short) 5145, 2.0, 2.0, false, true, false, false),

    END_PORTAL(NamespaceID.from("minecraft:end_portal"), (short) 5149, -1.0, 3600000.0, false, false, true, true),

    END_PORTAL_FRAME(NamespaceID.from("minecraft:end_portal_frame"), (short) 5154, -1.0, 3600000.0, false, true, false, false),

    END_STONE(NamespaceID.from("minecraft:end_stone"), (short) 5158, 3.0, 9.0, false, true, false, true),

    DRAGON_EGG(NamespaceID.from("minecraft:dragon_egg"), (short) 5159, 3.0, 9.0, false, true, false, true),

    REDSTONE_LAMP(NamespaceID.from("minecraft:redstone_lamp"), (short) 5161, 0.3, 0.3, false, true, false, false),

    COCOA(NamespaceID.from("minecraft:cocoa"), (short) 5162, 0.2, 3.0, false, false, false, false),

    SANDSTONE_STAIRS(NamespaceID.from("minecraft:sandstone_stairs"), (short) 5185, 0.8, 0.8, false, true, false, false),

    EMERALD_ORE(NamespaceID.from("minecraft:emerald_ore"), (short) 5254, 3.0, 3.0, false, true, false, true),

    ENDER_CHEST(NamespaceID.from("minecraft:ender_chest"), (short) 5256, 22.5, 600.0, false, true, true, false),

    TRIPWIRE_HOOK(NamespaceID.from("minecraft:tripwire_hook"), (short) 5272, 0.0, 0.0, false, false, false, false),

    TRIPWIRE(NamespaceID.from("minecraft:tripwire"), (short) 5406, 0.0, 0.0, false, false, false, false),

    EMERALD_BLOCK(NamespaceID.from("minecraft:emerald_block"), (short) 5407, 5.0, 6.0, false, true, false, true),

    SPRUCE_STAIRS(NamespaceID.from("minecraft:spruce_stairs"), (short) 5419, 2.0, 3.0, false, true, false, false),

    BIRCH_STAIRS(NamespaceID.from("minecraft:birch_stairs"), (short) 5499, 2.0, 3.0, false, true, false, false),

    JUNGLE_STAIRS(NamespaceID.from("minecraft:jungle_stairs"), (short) 5579, 2.0, 3.0, false, true, false, false),

    COMMAND_BLOCK(NamespaceID.from("minecraft:command_block"), (short) 5654, -1.0, 3600000.0, false, true, true, false),

    BEACON(NamespaceID.from("minecraft:beacon"), (short) 5660, 3.0, 3.0, false, true, true, true),

    COBBLESTONE_WALL(NamespaceID.from("minecraft:cobblestone_wall"), (short) 5664, 2.0, 6.0, false, true, false, false),

    MOSSY_COBBLESTONE_WALL(NamespaceID.from("minecraft:mossy_cobblestone_wall"), (short) 5988, 2.0, 6.0, false, true, false, false),

    FLOWER_POT(NamespaceID.from("minecraft:flower_pot"), (short) 6309, 0.0, 0.0, false, false, false, true),

    POTTED_OAK_SAPLING(NamespaceID.from("minecraft:potted_oak_sapling"), (short) 6310, 0.0, 0.0, false, false, false, true),

    POTTED_SPRUCE_SAPLING(NamespaceID.from("minecraft:potted_spruce_sapling"), (short) 6311, 0.0, 0.0, false, false, false, true),

    POTTED_BIRCH_SAPLING(NamespaceID.from("minecraft:potted_birch_sapling"), (short) 6312, 0.0, 0.0, false, false, false, true),

    POTTED_JUNGLE_SAPLING(NamespaceID.from("minecraft:potted_jungle_sapling"), (short) 6313, 0.0, 0.0, false, false, false, true),

    POTTED_ACACIA_SAPLING(NamespaceID.from("minecraft:potted_acacia_sapling"), (short) 6314, 0.0, 0.0, false, false, false, true),

    POTTED_DARK_OAK_SAPLING(NamespaceID.from("minecraft:potted_dark_oak_sapling"), (short) 6315, 0.0, 0.0, false, false, false, true),

    POTTED_FERN(NamespaceID.from("minecraft:potted_fern"), (short) 6316, 0.0, 0.0, false, false, false, true),

    POTTED_DANDELION(NamespaceID.from("minecraft:potted_dandelion"), (short) 6317, 0.0, 0.0, false, false, false, true),

    POTTED_POPPY(NamespaceID.from("minecraft:potted_poppy"), (short) 6318, 0.0, 0.0, false, false, false, true),

    POTTED_BLUE_ORCHID(NamespaceID.from("minecraft:potted_blue_orchid"), (short) 6319, 0.0, 0.0, false, false, false, true),

    POTTED_ALLIUM(NamespaceID.from("minecraft:potted_allium"), (short) 6320, 0.0, 0.0, false, false, false, true),

    POTTED_AZURE_BLUET(NamespaceID.from("minecraft:potted_azure_bluet"), (short) 6321, 0.0, 0.0, false, false, false, true),

    POTTED_RED_TULIP(NamespaceID.from("minecraft:potted_red_tulip"), (short) 6322, 0.0, 0.0, false, false, false, true),

    POTTED_ORANGE_TULIP(NamespaceID.from("minecraft:potted_orange_tulip"), (short) 6323, 0.0, 0.0, false, false, false, true),

    POTTED_WHITE_TULIP(NamespaceID.from("minecraft:potted_white_tulip"), (short) 6324, 0.0, 0.0, false, false, false, true),

    POTTED_PINK_TULIP(NamespaceID.from("minecraft:potted_pink_tulip"), (short) 6325, 0.0, 0.0, false, false, false, true),

    POTTED_OXEYE_DAISY(NamespaceID.from("minecraft:potted_oxeye_daisy"), (short) 6326, 0.0, 0.0, false, false, false, true),

    POTTED_CORNFLOWER(NamespaceID.from("minecraft:potted_cornflower"), (short) 6327, 0.0, 0.0, false, false, false, true),

    POTTED_LILY_OF_THE_VALLEY(NamespaceID.from("minecraft:potted_lily_of_the_valley"), (short) 6328, 0.0, 0.0, false, false, false, true),

    POTTED_WITHER_ROSE(NamespaceID.from("minecraft:potted_wither_rose"), (short) 6329, 0.0, 0.0, false, false, false, true),

    POTTED_RED_MUSHROOM(NamespaceID.from("minecraft:potted_red_mushroom"), (short) 6330, 0.0, 0.0, false, false, false, true),

    POTTED_BROWN_MUSHROOM(NamespaceID.from("minecraft:potted_brown_mushroom"), (short) 6331, 0.0, 0.0, false, false, false, true),

    POTTED_DEAD_BUSH(NamespaceID.from("minecraft:potted_dead_bush"), (short) 6332, 0.0, 0.0, false, false, false, true),

    POTTED_CACTUS(NamespaceID.from("minecraft:potted_cactus"), (short) 6333, 0.0, 0.0, false, false, false, true),

    CARROTS(NamespaceID.from("minecraft:carrots"), (short) 6334, 0.0, 0.0, false, false, false, false),

    POTATOES(NamespaceID.from("minecraft:potatoes"), (short) 6342, 0.0, 0.0, false, false, false, false),

    OAK_BUTTON(NamespaceID.from("minecraft:oak_button"), (short) 6359, 0.5, 0.5, false, false, false, false),

    SPRUCE_BUTTON(NamespaceID.from("minecraft:spruce_button"), (short) 6383, 0.5, 0.5, false, false, false, false),

    BIRCH_BUTTON(NamespaceID.from("minecraft:birch_button"), (short) 6407, 0.5, 0.5, false, false, false, false),

    JUNGLE_BUTTON(NamespaceID.from("minecraft:jungle_button"), (short) 6431, 0.5, 0.5, false, false, false, false),

    ACACIA_BUTTON(NamespaceID.from("minecraft:acacia_button"), (short) 6455, 0.5, 0.5, false, false, false, false),

    DARK_OAK_BUTTON(NamespaceID.from("minecraft:dark_oak_button"), (short) 6479, 0.5, 0.5, false, false, false, false),

    SKELETON_SKULL(NamespaceID.from("minecraft:skeleton_skull"), (short) 6494, 1.0, 1.0, false, false, true, false),

    SKELETON_WALL_SKULL(NamespaceID.from("minecraft:skeleton_wall_skull"), (short) 6510, 1.0, 1.0, false, false, true, false),

    WITHER_SKELETON_SKULL(NamespaceID.from("minecraft:wither_skeleton_skull"), (short) 6514, 1.0, 1.0, false, false, true, false),

    WITHER_SKELETON_WALL_SKULL(NamespaceID.from("minecraft:wither_skeleton_wall_skull"), (short) 6530, 1.0, 1.0, false, false, true, false),

    ZOMBIE_HEAD(NamespaceID.from("minecraft:zombie_head"), (short) 6534, 1.0, 1.0, false, false, true, false),

    ZOMBIE_WALL_HEAD(NamespaceID.from("minecraft:zombie_wall_head"), (short) 6550, 1.0, 1.0, false, false, true, false),

    PLAYER_HEAD(NamespaceID.from("minecraft:player_head"), (short) 6554, 1.0, 1.0, false, false, true, false),

    PLAYER_WALL_HEAD(NamespaceID.from("minecraft:player_wall_head"), (short) 6570, 1.0, 1.0, false, false, true, false),

    CREEPER_HEAD(NamespaceID.from("minecraft:creeper_head"), (short) 6574, 1.0, 1.0, false, false, true, false),

    CREEPER_WALL_HEAD(NamespaceID.from("minecraft:creeper_wall_head"), (short) 6590, 1.0, 1.0, false, false, true, false),

    DRAGON_HEAD(NamespaceID.from("minecraft:dragon_head"), (short) 6594, 1.0, 1.0, false, false, true, false),

    DRAGON_WALL_HEAD(NamespaceID.from("minecraft:dragon_wall_head"), (short) 6610, 1.0, 1.0, false, false, true, false),

    ANVIL(NamespaceID.from("minecraft:anvil"), (short) 6614, 5.0, 1200.0, false, true, false, false),

    CHIPPED_ANVIL(NamespaceID.from("minecraft:chipped_anvil"), (short) 6618, 5.0, 1200.0, false, true, false, false),

    DAMAGED_ANVIL(NamespaceID.from("minecraft:damaged_anvil"), (short) 6622, 5.0, 1200.0, false, true, false, false),

    TRAPPED_CHEST(NamespaceID.from("minecraft:trapped_chest"), (short) 6627, 2.5, 2.5, false, true, true, false),

    LIGHT_WEIGHTED_PRESSURE_PLATE(NamespaceID.from("minecraft:light_weighted_pressure_plate"), (short) 6650, 0.5, 0.5, false, true, false, false),

    HEAVY_WEIGHTED_PRESSURE_PLATE(NamespaceID.from("minecraft:heavy_weighted_pressure_plate"), (short) 6666, 0.5, 0.5, false, true, false, false),

    COMPARATOR(NamespaceID.from("minecraft:comparator"), (short) 6683, 0.0, 0.0, false, false, true, false),

    DAYLIGHT_DETECTOR(NamespaceID.from("minecraft:daylight_detector"), (short) 6714, 0.2, 0.2, false, true, true, false),

    REDSTONE_BLOCK(NamespaceID.from("minecraft:redstone_block"), (short) 6730, 5.0, 6.0, false, true, false, true),

    NETHER_QUARTZ_ORE(NamespaceID.from("minecraft:nether_quartz_ore"), (short) 6731, 3.0, 3.0, false, true, false, true),

    HOPPER(NamespaceID.from("minecraft:hopper"), (short) 6732, 3.0, 4.8, false, true, true, false),

    QUARTZ_BLOCK(NamespaceID.from("minecraft:quartz_block"), (short) 6742, 0.8, 0.8, false, true, false, true),

    CHISELED_QUARTZ_BLOCK(NamespaceID.from("minecraft:chiseled_quartz_block"), (short) 6743, 0.8, 0.8, false, true, false, true),

    QUARTZ_PILLAR(NamespaceID.from("minecraft:quartz_pillar"), (short) 6745, 0.8, 0.8, false, true, false, false),

    QUARTZ_STAIRS(NamespaceID.from("minecraft:quartz_stairs"), (short) 6758, 0.8, 0.8, false, true, false, false),

    ACTIVATOR_RAIL(NamespaceID.from("minecraft:activator_rail"), (short) 6833, 0.7, 0.7, false, false, false, false),

    DROPPER(NamespaceID.from("minecraft:dropper"), (short) 6840, 3.5, 3.5, false, true, true, false),

    WHITE_TERRACOTTA(NamespaceID.from("minecraft:white_terracotta"), (short) 6851, 1.25, 4.2, false, true, false, true),

    ORANGE_TERRACOTTA(NamespaceID.from("minecraft:orange_terracotta"), (short) 6852, 1.25, 4.2, false, true, false, true),

    MAGENTA_TERRACOTTA(NamespaceID.from("minecraft:magenta_terracotta"), (short) 6853, 1.25, 4.2, false, true, false, true),

    LIGHT_BLUE_TERRACOTTA(NamespaceID.from("minecraft:light_blue_terracotta"), (short) 6854, 1.25, 4.2, false, true, false, true),

    YELLOW_TERRACOTTA(NamespaceID.from("minecraft:yellow_terracotta"), (short) 6855, 1.25, 4.2, false, true, false, true),

    LIME_TERRACOTTA(NamespaceID.from("minecraft:lime_terracotta"), (short) 6856, 1.25, 4.2, false, true, false, true),

    PINK_TERRACOTTA(NamespaceID.from("minecraft:pink_terracotta"), (short) 6857, 1.25, 4.2, false, true, false, true),

    GRAY_TERRACOTTA(NamespaceID.from("minecraft:gray_terracotta"), (short) 6858, 1.25, 4.2, false, true, false, true),

    LIGHT_GRAY_TERRACOTTA(NamespaceID.from("minecraft:light_gray_terracotta"), (short) 6859, 1.25, 4.2, false, true, false, true),

    CYAN_TERRACOTTA(NamespaceID.from("minecraft:cyan_terracotta"), (short) 6860, 1.25, 4.2, false, true, false, true),

    PURPLE_TERRACOTTA(NamespaceID.from("minecraft:purple_terracotta"), (short) 6861, 1.25, 4.2, false, true, false, true),

    BLUE_TERRACOTTA(NamespaceID.from("minecraft:blue_terracotta"), (short) 6862, 1.25, 4.2, false, true, false, true),

    BROWN_TERRACOTTA(NamespaceID.from("minecraft:brown_terracotta"), (short) 6863, 1.25, 4.2, false, true, false, true),

    GREEN_TERRACOTTA(NamespaceID.from("minecraft:green_terracotta"), (short) 6864, 1.25, 4.2, false, true, false, true),

    RED_TERRACOTTA(NamespaceID.from("minecraft:red_terracotta"), (short) 6865, 1.25, 4.2, false, true, false, true),

    BLACK_TERRACOTTA(NamespaceID.from("minecraft:black_terracotta"), (short) 6866, 1.25, 4.2, false, true, false, true),

    WHITE_STAINED_GLASS_PANE(NamespaceID.from("minecraft:white_stained_glass_pane"), (short) 6898, 0.3, 0.3, false, true, false, false),

    ORANGE_STAINED_GLASS_PANE(NamespaceID.from("minecraft:orange_stained_glass_pane"), (short) 6930, 0.3, 0.3, false, true, false, false),

    MAGENTA_STAINED_GLASS_PANE(NamespaceID.from("minecraft:magenta_stained_glass_pane"), (short) 6962, 0.3, 0.3, false, true, false, false),

    LIGHT_BLUE_STAINED_GLASS_PANE(NamespaceID.from("minecraft:light_blue_stained_glass_pane"), (short) 6994, 0.3, 0.3, false, true, false, false),

    YELLOW_STAINED_GLASS_PANE(NamespaceID.from("minecraft:yellow_stained_glass_pane"), (short) 7026, 0.3, 0.3, false, true, false, false),

    LIME_STAINED_GLASS_PANE(NamespaceID.from("minecraft:lime_stained_glass_pane"), (short) 7058, 0.3, 0.3, false, true, false, false),

    PINK_STAINED_GLASS_PANE(NamespaceID.from("minecraft:pink_stained_glass_pane"), (short) 7090, 0.3, 0.3, false, true, false, false),

    GRAY_STAINED_GLASS_PANE(NamespaceID.from("minecraft:gray_stained_glass_pane"), (short) 7122, 0.3, 0.3, false, true, false, false),

    LIGHT_GRAY_STAINED_GLASS_PANE(NamespaceID.from("minecraft:light_gray_stained_glass_pane"), (short) 7154, 0.3, 0.3, false, true, false, false),

    CYAN_STAINED_GLASS_PANE(NamespaceID.from("minecraft:cyan_stained_glass_pane"), (short) 7186, 0.3, 0.3, false, true, false, false),

    PURPLE_STAINED_GLASS_PANE(NamespaceID.from("minecraft:purple_stained_glass_pane"), (short) 7218, 0.3, 0.3, false, true, false, false),

    BLUE_STAINED_GLASS_PANE(NamespaceID.from("minecraft:blue_stained_glass_pane"), (short) 7250, 0.3, 0.3, false, true, false, false),

    BROWN_STAINED_GLASS_PANE(NamespaceID.from("minecraft:brown_stained_glass_pane"), (short) 7282, 0.3, 0.3, false, true, false, false),

    GREEN_STAINED_GLASS_PANE(NamespaceID.from("minecraft:green_stained_glass_pane"), (short) 7314, 0.3, 0.3, false, true, false, false),

    RED_STAINED_GLASS_PANE(NamespaceID.from("minecraft:red_stained_glass_pane"), (short) 7346, 0.3, 0.3, false, true, false, false),

    BLACK_STAINED_GLASS_PANE(NamespaceID.from("minecraft:black_stained_glass_pane"), (short) 7378, 0.3, 0.3, false, true, false, false),

    ACACIA_STAIRS(NamespaceID.from("minecraft:acacia_stairs"), (short) 7390, 2.0, 3.0, false, true, false, false),

    DARK_OAK_STAIRS(NamespaceID.from("minecraft:dark_oak_stairs"), (short) 7470, 2.0, 3.0, false, true, false, false),

    SLIME_BLOCK(NamespaceID.from("minecraft:slime_block"), (short) 7539, 0.0, 0.0, false, true, false, true),

    BARRIER(NamespaceID.from("minecraft:barrier"), (short) 7540, -1.0, 3600000.8, false, true, false, true),

    IRON_TRAPDOOR(NamespaceID.from("minecraft:iron_trapdoor"), (short) 7556, 5.0, 5.0, false, true, false, false),

    PRISMARINE(NamespaceID.from("minecraft:prismarine"), (short) 7605, 1.5, 6.0, false, true, false, true),

    PRISMARINE_BRICKS(NamespaceID.from("minecraft:prismarine_bricks"), (short) 7606, 1.5, 6.0, false, true, false, true),

    DARK_PRISMARINE(NamespaceID.from("minecraft:dark_prismarine"), (short) 7607, 1.5, 6.0, false, true, false, true),

    PRISMARINE_STAIRS(NamespaceID.from("minecraft:prismarine_stairs"), (short) 7619, 1.5, 6.0, false, true, false, false),

    PRISMARINE_BRICK_STAIRS(NamespaceID.from("minecraft:prismarine_brick_stairs"), (short) 7699, 1.5, 6.0, false, true, false, false),

    DARK_PRISMARINE_STAIRS(NamespaceID.from("minecraft:dark_prismarine_stairs"), (short) 7779, 1.5, 6.0, false, true, false, false),

    PRISMARINE_SLAB(NamespaceID.from("minecraft:prismarine_slab"), (short) 7851, 1.5, 6.0, false, true, false, false),

    PRISMARINE_BRICK_SLAB(NamespaceID.from("minecraft:prismarine_brick_slab"), (short) 7857, 1.5, 6.0, false, true, false, false),

    DARK_PRISMARINE_SLAB(NamespaceID.from("minecraft:dark_prismarine_slab"), (short) 7863, 1.5, 6.0, false, true, false, false),

    SEA_LANTERN(NamespaceID.from("minecraft:sea_lantern"), (short) 7866, 0.3, 0.3, false, true, false, true),

    HAY_BLOCK(NamespaceID.from("minecraft:hay_block"), (short) 7868, 0.5, 0.5, false, true, false, false),

    WHITE_CARPET(NamespaceID.from("minecraft:white_carpet"), (short) 7870, 0.1, 0.1, false, false, false, true),

    ORANGE_CARPET(NamespaceID.from("minecraft:orange_carpet"), (short) 7871, 0.1, 0.1, false, false, false, true),

    MAGENTA_CARPET(NamespaceID.from("minecraft:magenta_carpet"), (short) 7872, 0.1, 0.1, false, false, false, true),

    LIGHT_BLUE_CARPET(NamespaceID.from("minecraft:light_blue_carpet"), (short) 7873, 0.1, 0.1, false, false, false, true),

    YELLOW_CARPET(NamespaceID.from("minecraft:yellow_carpet"), (short) 7874, 0.1, 0.1, false, false, false, true),

    LIME_CARPET(NamespaceID.from("minecraft:lime_carpet"), (short) 7875, 0.1, 0.1, false, false, false, true),

    PINK_CARPET(NamespaceID.from("minecraft:pink_carpet"), (short) 7876, 0.1, 0.1, false, false, false, true),

    GRAY_CARPET(NamespaceID.from("minecraft:gray_carpet"), (short) 7877, 0.1, 0.1, false, false, false, true),

    LIGHT_GRAY_CARPET(NamespaceID.from("minecraft:light_gray_carpet"), (short) 7878, 0.1, 0.1, false, false, false, true),

    CYAN_CARPET(NamespaceID.from("minecraft:cyan_carpet"), (short) 7879, 0.1, 0.1, false, false, false, true),

    PURPLE_CARPET(NamespaceID.from("minecraft:purple_carpet"), (short) 7880, 0.1, 0.1, false, false, false, true),

    BLUE_CARPET(NamespaceID.from("minecraft:blue_carpet"), (short) 7881, 0.1, 0.1, false, false, false, true),

    BROWN_CARPET(NamespaceID.from("minecraft:brown_carpet"), (short) 7882, 0.1, 0.1, false, false, false, true),

    GREEN_CARPET(NamespaceID.from("minecraft:green_carpet"), (short) 7883, 0.1, 0.1, false, false, false, true),

    RED_CARPET(NamespaceID.from("minecraft:red_carpet"), (short) 7884, 0.1, 0.1, false, false, false, true),

    BLACK_CARPET(NamespaceID.from("minecraft:black_carpet"), (short) 7885, 0.1, 0.1, false, false, false, true),

    TERRACOTTA(NamespaceID.from("minecraft:terracotta"), (short) 7886, 1.25, 4.2, false, true, false, true),

    COAL_BLOCK(NamespaceID.from("minecraft:coal_block"), (short) 7887, 5.0, 6.0, false, true, false, true),

    PACKED_ICE(NamespaceID.from("minecraft:packed_ice"), (short) 7888, 0.5, 0.5, false, true, false, true),

    SUNFLOWER(NamespaceID.from("minecraft:sunflower"), (short) 7890, 0.0, 0.0, false, false, false, false),

    LILAC(NamespaceID.from("minecraft:lilac"), (short) 7892, 0.0, 0.0, false, false, false, false),

    ROSE_BUSH(NamespaceID.from("minecraft:rose_bush"), (short) 7894, 0.0, 0.0, false, false, false, false),

    PEONY(NamespaceID.from("minecraft:peony"), (short) 7896, 0.0, 0.0, false, false, false, false),

    TALL_GRASS(NamespaceID.from("minecraft:tall_grass"), (short) 7898, 0.0, 0.0, false, false, false, false),

    LARGE_FERN(NamespaceID.from("minecraft:large_fern"), (short) 7900, 0.0, 0.0, false, false, false, false),

    WHITE_BANNER(NamespaceID.from("minecraft:white_banner"), (short) 7901, 1.0, 1.0, false, true, true, false),

    ORANGE_BANNER(NamespaceID.from("minecraft:orange_banner"), (short) 7917, 1.0, 1.0, false, true, true, false),

    MAGENTA_BANNER(NamespaceID.from("minecraft:magenta_banner"), (short) 7933, 1.0, 1.0, false, true, true, false),

    LIGHT_BLUE_BANNER(NamespaceID.from("minecraft:light_blue_banner"), (short) 7949, 1.0, 1.0, false, true, true, false),

    YELLOW_BANNER(NamespaceID.from("minecraft:yellow_banner"), (short) 7965, 1.0, 1.0, false, true, true, false),

    LIME_BANNER(NamespaceID.from("minecraft:lime_banner"), (short) 7981, 1.0, 1.0, false, true, true, false),

    PINK_BANNER(NamespaceID.from("minecraft:pink_banner"), (short) 7997, 1.0, 1.0, false, true, true, false),

    GRAY_BANNER(NamespaceID.from("minecraft:gray_banner"), (short) 8013, 1.0, 1.0, false, true, true, false),

    LIGHT_GRAY_BANNER(NamespaceID.from("minecraft:light_gray_banner"), (short) 8029, 1.0, 1.0, false, true, true, false),

    CYAN_BANNER(NamespaceID.from("minecraft:cyan_banner"), (short) 8045, 1.0, 1.0, false, true, true, false),

    PURPLE_BANNER(NamespaceID.from("minecraft:purple_banner"), (short) 8061, 1.0, 1.0, false, true, true, false),

    BLUE_BANNER(NamespaceID.from("minecraft:blue_banner"), (short) 8077, 1.0, 1.0, false, true, true, false),

    BROWN_BANNER(NamespaceID.from("minecraft:brown_banner"), (short) 8093, 1.0, 1.0, false, true, true, false),

    GREEN_BANNER(NamespaceID.from("minecraft:green_banner"), (short) 8109, 1.0, 1.0, false, true, true, false),

    RED_BANNER(NamespaceID.from("minecraft:red_banner"), (short) 8125, 1.0, 1.0, false, true, true, false),

    BLACK_BANNER(NamespaceID.from("minecraft:black_banner"), (short) 8141, 1.0, 1.0, false, true, true, false),

    WHITE_WALL_BANNER(NamespaceID.from("minecraft:white_wall_banner"), (short) 8157, 1.0, 1.0, false, true, true, false),

    ORANGE_WALL_BANNER(NamespaceID.from("minecraft:orange_wall_banner"), (short) 8161, 1.0, 1.0, false, true, true, false),

    MAGENTA_WALL_BANNER(NamespaceID.from("minecraft:magenta_wall_banner"), (short) 8165, 1.0, 1.0, false, true, true, false),

    LIGHT_BLUE_WALL_BANNER(NamespaceID.from("minecraft:light_blue_wall_banner"), (short) 8169, 1.0, 1.0, false, true, true, false),

    YELLOW_WALL_BANNER(NamespaceID.from("minecraft:yellow_wall_banner"), (short) 8173, 1.0, 1.0, false, true, true, false),

    LIME_WALL_BANNER(NamespaceID.from("minecraft:lime_wall_banner"), (short) 8177, 1.0, 1.0, false, true, true, false),

    PINK_WALL_BANNER(NamespaceID.from("minecraft:pink_wall_banner"), (short) 8181, 1.0, 1.0, false, true, true, false),

    GRAY_WALL_BANNER(NamespaceID.from("minecraft:gray_wall_banner"), (short) 8185, 1.0, 1.0, false, true, true, false),

    LIGHT_GRAY_WALL_BANNER(NamespaceID.from("minecraft:light_gray_wall_banner"), (short) 8189, 1.0, 1.0, false, true, true, false),

    CYAN_WALL_BANNER(NamespaceID.from("minecraft:cyan_wall_banner"), (short) 8193, 1.0, 1.0, false, true, true, false),

    PURPLE_WALL_BANNER(NamespaceID.from("minecraft:purple_wall_banner"), (short) 8197, 1.0, 1.0, false, true, true, false),

    BLUE_WALL_BANNER(NamespaceID.from("minecraft:blue_wall_banner"), (short) 8201, 1.0, 1.0, false, true, true, false),

    BROWN_WALL_BANNER(NamespaceID.from("minecraft:brown_wall_banner"), (short) 8205, 1.0, 1.0, false, true, true, false),

    GREEN_WALL_BANNER(NamespaceID.from("minecraft:green_wall_banner"), (short) 8209, 1.0, 1.0, false, true, true, false),

    RED_WALL_BANNER(NamespaceID.from("minecraft:red_wall_banner"), (short) 8213, 1.0, 1.0, false, true, true, false),

    BLACK_WALL_BANNER(NamespaceID.from("minecraft:black_wall_banner"), (short) 8217, 1.0, 1.0, false, true, true, false),

    RED_SANDSTONE(NamespaceID.from("minecraft:red_sandstone"), (short) 8221, 0.8, 0.8, false, true, false, true),

    CHISELED_RED_SANDSTONE(NamespaceID.from("minecraft:chiseled_red_sandstone"), (short) 8222, 0.8, 0.8, false, true, false, true),

    CUT_RED_SANDSTONE(NamespaceID.from("minecraft:cut_red_sandstone"), (short) 8223, 0.8, 0.8, false, true, false, true),

    RED_SANDSTONE_STAIRS(NamespaceID.from("minecraft:red_sandstone_stairs"), (short) 8235, 0.8, 0.8, false, true, false, false),

    OAK_SLAB(NamespaceID.from("minecraft:oak_slab"), (short) 8307, 2.0, 3.0, false, true, false, false),

    SPRUCE_SLAB(NamespaceID.from("minecraft:spruce_slab"), (short) 8313, 2.0, 3.0, false, true, false, false),

    BIRCH_SLAB(NamespaceID.from("minecraft:birch_slab"), (short) 8319, 2.0, 3.0, false, true, false, false),

    JUNGLE_SLAB(NamespaceID.from("minecraft:jungle_slab"), (short) 8325, 2.0, 3.0, false, true, false, false),

    ACACIA_SLAB(NamespaceID.from("minecraft:acacia_slab"), (short) 8331, 2.0, 3.0, false, true, false, false),

    DARK_OAK_SLAB(NamespaceID.from("minecraft:dark_oak_slab"), (short) 8337, 2.0, 3.0, false, true, false, false),

    STONE_SLAB(NamespaceID.from("minecraft:stone_slab"), (short) 8343, 2.0, 6.0, false, true, false, false),

    SMOOTH_STONE_SLAB(NamespaceID.from("minecraft:smooth_stone_slab"), (short) 8349, 2.0, 6.0, false, true, false, false),

    SANDSTONE_SLAB(NamespaceID.from("minecraft:sandstone_slab"), (short) 8355, 2.0, 6.0, false, true, false, false),

    CUT_SANDSTONE_SLAB(NamespaceID.from("minecraft:cut_sandstone_slab"), (short) 8361, 2.0, 6.0, false, true, false, false),

    PETRIFIED_OAK_SLAB(NamespaceID.from("minecraft:petrified_oak_slab"), (short) 8367, 2.0, 6.0, false, true, false, false),

    COBBLESTONE_SLAB(NamespaceID.from("minecraft:cobblestone_slab"), (short) 8373, 2.0, 6.0, false, true, false, false),

    BRICK_SLAB(NamespaceID.from("minecraft:brick_slab"), (short) 8379, 2.0, 6.0, false, true, false, false),

    STONE_BRICK_SLAB(NamespaceID.from("minecraft:stone_brick_slab"), (short) 8385, 2.0, 6.0, false, true, false, false),

    NETHER_BRICK_SLAB(NamespaceID.from("minecraft:nether_brick_slab"), (short) 8391, 2.0, 6.0, false, true, false, false),

    QUARTZ_SLAB(NamespaceID.from("minecraft:quartz_slab"), (short) 8397, 2.0, 6.0, false, true, false, false),

    RED_SANDSTONE_SLAB(NamespaceID.from("minecraft:red_sandstone_slab"), (short) 8403, 2.0, 6.0, false, true, false, false),

    CUT_RED_SANDSTONE_SLAB(NamespaceID.from("minecraft:cut_red_sandstone_slab"), (short) 8409, 2.0, 6.0, false, true, false, false),

    PURPUR_SLAB(NamespaceID.from("minecraft:purpur_slab"), (short) 8415, 2.0, 6.0, false, true, false, false),

    SMOOTH_STONE(NamespaceID.from("minecraft:smooth_stone"), (short) 8418, 2.0, 6.0, false, true, false, true),

    SMOOTH_SANDSTONE(NamespaceID.from("minecraft:smooth_sandstone"), (short) 8419, 2.0, 6.0, false, true, false, true),

    SMOOTH_QUARTZ(NamespaceID.from("minecraft:smooth_quartz"), (short) 8420, 2.0, 6.0, false, true, false, true),

    SMOOTH_RED_SANDSTONE(NamespaceID.from("minecraft:smooth_red_sandstone"), (short) 8421, 2.0, 6.0, false, true, false, true),

    SPRUCE_FENCE_GATE(NamespaceID.from("minecraft:spruce_fence_gate"), (short) 8429, 2.0, 3.0, false, true, false, false),

    BIRCH_FENCE_GATE(NamespaceID.from("minecraft:birch_fence_gate"), (short) 8461, 2.0, 3.0, false, true, false, false),

    JUNGLE_FENCE_GATE(NamespaceID.from("minecraft:jungle_fence_gate"), (short) 8493, 2.0, 3.0, false, true, false, false),

    ACACIA_FENCE_GATE(NamespaceID.from("minecraft:acacia_fence_gate"), (short) 8525, 2.0, 3.0, false, true, false, false),

    DARK_OAK_FENCE_GATE(NamespaceID.from("minecraft:dark_oak_fence_gate"), (short) 8557, 2.0, 3.0, false, true, false, false),

    SPRUCE_FENCE(NamespaceID.from("minecraft:spruce_fence"), (short) 8613, 2.0, 3.0, false, true, false, false),

    BIRCH_FENCE(NamespaceID.from("minecraft:birch_fence"), (short) 8645, 2.0, 3.0, false, true, false, false),

    JUNGLE_FENCE(NamespaceID.from("minecraft:jungle_fence"), (short) 8677, 2.0, 3.0, false, true, false, false),

    ACACIA_FENCE(NamespaceID.from("minecraft:acacia_fence"), (short) 8709, 2.0, 3.0, false, true, false, false),

    DARK_OAK_FENCE(NamespaceID.from("minecraft:dark_oak_fence"), (short) 8741, 2.0, 3.0, false, true, false, false),

    SPRUCE_DOOR(NamespaceID.from("minecraft:spruce_door"), (short) 8753, 3.0, 3.0, false, true, false, false),

    BIRCH_DOOR(NamespaceID.from("minecraft:birch_door"), (short) 8817, 3.0, 3.0, false, true, false, false),

    JUNGLE_DOOR(NamespaceID.from("minecraft:jungle_door"), (short) 8881, 3.0, 3.0, false, true, false, false),

    ACACIA_DOOR(NamespaceID.from("minecraft:acacia_door"), (short) 8945, 3.0, 3.0, false, true, false, false),

    DARK_OAK_DOOR(NamespaceID.from("minecraft:dark_oak_door"), (short) 9009, 3.0, 3.0, false, true, false, false),

    END_ROD(NamespaceID.from("minecraft:end_rod"), (short) 9066, 0.0, 0.0, false, false, false, false),

    CHORUS_PLANT(NamespaceID.from("minecraft:chorus_plant"), (short) 9131, 0.4, 0.4, false, false, false, false),

    CHORUS_FLOWER(NamespaceID.from("minecraft:chorus_flower"), (short) 9132, 0.4, 0.4, false, false, false, false),

    PURPUR_BLOCK(NamespaceID.from("minecraft:purpur_block"), (short) 9138, 1.5, 6.0, false, true, false, true),

    PURPUR_PILLAR(NamespaceID.from("minecraft:purpur_pillar"), (short) 9140, 1.5, 6.0, false, true, false, false),

    PURPUR_STAIRS(NamespaceID.from("minecraft:purpur_stairs"), (short) 9153, 1.5, 6.0, false, true, false, false),

    END_STONE_BRICKS(NamespaceID.from("minecraft:end_stone_bricks"), (short) 9222, 3.0, 9.0, false, true, false, true),

    BEETROOTS(NamespaceID.from("minecraft:beetroots"), (short) 9223, 0.0, 0.0, false, false, false, false),

    GRASS_PATH(NamespaceID.from("minecraft:grass_path"), (short) 9227, 0.65, 0.65, false, true, false, true),

    END_GATEWAY(NamespaceID.from("minecraft:end_gateway"), (short) 9228, -1.0, 3600000.0, false, false, true, true),

    REPEATING_COMMAND_BLOCK(NamespaceID.from("minecraft:repeating_command_block"), (short) 9235, -1.0, 3600000.0, false, true, true, false),

    CHAIN_COMMAND_BLOCK(NamespaceID.from("minecraft:chain_command_block"), (short) 9247, -1.0, 3600000.0, false, true, true, false),

    FROSTED_ICE(NamespaceID.from("minecraft:frosted_ice"), (short) 9253, 0.5, 0.5, false, true, false, false),

    MAGMA_BLOCK(NamespaceID.from("minecraft:magma_block"), (short) 9257, 0.5, 0.5, false, true, false, true),

    NETHER_WART_BLOCK(NamespaceID.from("minecraft:nether_wart_block"), (short) 9258, 1.0, 1.0, false, true, false, true),

    RED_NETHER_BRICKS(NamespaceID.from("minecraft:red_nether_bricks"), (short) 9259, 2.0, 6.0, false, true, false, true),

    BONE_BLOCK(NamespaceID.from("minecraft:bone_block"), (short) 9261, 2.0, 2.0, false, true, false, false),

    STRUCTURE_VOID(NamespaceID.from("minecraft:structure_void"), (short) 9263, 0.0, 0.0, false, false, false, true),

    OBSERVER(NamespaceID.from("minecraft:observer"), (short) 9269, 3.0, 3.0, false, true, false, false),

    SHULKER_BOX(NamespaceID.from("minecraft:shulker_box"), (short) 9280, 2.0, 2.0, false, true, true, false),

    WHITE_SHULKER_BOX(NamespaceID.from("minecraft:white_shulker_box"), (short) 9286, 2.0, 2.0, false, true, true, false),

    ORANGE_SHULKER_BOX(NamespaceID.from("minecraft:orange_shulker_box"), (short) 9292, 2.0, 2.0, false, true, true, false),

    MAGENTA_SHULKER_BOX(NamespaceID.from("minecraft:magenta_shulker_box"), (short) 9298, 2.0, 2.0, false, true, true, false),

    LIGHT_BLUE_SHULKER_BOX(NamespaceID.from("minecraft:light_blue_shulker_box"), (short) 9304, 2.0, 2.0, false, true, true, false),

    YELLOW_SHULKER_BOX(NamespaceID.from("minecraft:yellow_shulker_box"), (short) 9310, 2.0, 2.0, false, true, true, false),

    LIME_SHULKER_BOX(NamespaceID.from("minecraft:lime_shulker_box"), (short) 9316, 2.0, 2.0, false, true, true, false),

    PINK_SHULKER_BOX(NamespaceID.from("minecraft:pink_shulker_box"), (short) 9322, 2.0, 2.0, false, true, true, false),

    GRAY_SHULKER_BOX(NamespaceID.from("minecraft:gray_shulker_box"), (short) 9328, 2.0, 2.0, false, true, true, false),

    LIGHT_GRAY_SHULKER_BOX(NamespaceID.from("minecraft:light_gray_shulker_box"), (short) 9334, 2.0, 2.0, false, true, true, false),

    CYAN_SHULKER_BOX(NamespaceID.from("minecraft:cyan_shulker_box"), (short) 9340, 2.0, 2.0, false, true, true, false),

    PURPLE_SHULKER_BOX(NamespaceID.from("minecraft:purple_shulker_box"), (short) 9346, 2.0, 2.0, false, true, true, false),

    BLUE_SHULKER_BOX(NamespaceID.from("minecraft:blue_shulker_box"), (short) 9352, 2.0, 2.0, false, true, true, false),

    BROWN_SHULKER_BOX(NamespaceID.from("minecraft:brown_shulker_box"), (short) 9358, 2.0, 2.0, false, true, true, false),

    GREEN_SHULKER_BOX(NamespaceID.from("minecraft:green_shulker_box"), (short) 9364, 2.0, 2.0, false, true, true, false),

    RED_SHULKER_BOX(NamespaceID.from("minecraft:red_shulker_box"), (short) 9370, 2.0, 2.0, false, true, true, false),

    BLACK_SHULKER_BOX(NamespaceID.from("minecraft:black_shulker_box"), (short) 9376, 2.0, 2.0, false, true, true, false),

    WHITE_GLAZED_TERRACOTTA(NamespaceID.from("minecraft:white_glazed_terracotta"), (short) 9378, 1.4, 1.4, false, true, false, false),

    ORANGE_GLAZED_TERRACOTTA(NamespaceID.from("minecraft:orange_glazed_terracotta"), (short) 9382, 1.4, 1.4, false, true, false, false),

    MAGENTA_GLAZED_TERRACOTTA(NamespaceID.from("minecraft:magenta_glazed_terracotta"), (short) 9386, 1.4, 1.4, false, true, false, false),

    LIGHT_BLUE_GLAZED_TERRACOTTA(NamespaceID.from("minecraft:light_blue_glazed_terracotta"), (short) 9390, 1.4, 1.4, false, true, false, false),

    YELLOW_GLAZED_TERRACOTTA(NamespaceID.from("minecraft:yellow_glazed_terracotta"), (short) 9394, 1.4, 1.4, false, true, false, false),

    LIME_GLAZED_TERRACOTTA(NamespaceID.from("minecraft:lime_glazed_terracotta"), (short) 9398, 1.4, 1.4, false, true, false, false),

    PINK_GLAZED_TERRACOTTA(NamespaceID.from("minecraft:pink_glazed_terracotta"), (short) 9402, 1.4, 1.4, false, true, false, false),

    GRAY_GLAZED_TERRACOTTA(NamespaceID.from("minecraft:gray_glazed_terracotta"), (short) 9406, 1.4, 1.4, false, true, false, false),

    LIGHT_GRAY_GLAZED_TERRACOTTA(NamespaceID.from("minecraft:light_gray_glazed_terracotta"), (short) 9410, 1.4, 1.4, false, true, false, false),

    CYAN_GLAZED_TERRACOTTA(NamespaceID.from("minecraft:cyan_glazed_terracotta"), (short) 9414, 1.4, 1.4, false, true, false, false),

    PURPLE_GLAZED_TERRACOTTA(NamespaceID.from("minecraft:purple_glazed_terracotta"), (short) 9418, 1.4, 1.4, false, true, false, false),

    BLUE_GLAZED_TERRACOTTA(NamespaceID.from("minecraft:blue_glazed_terracotta"), (short) 9422, 1.4, 1.4, false, true, false, false),

    BROWN_GLAZED_TERRACOTTA(NamespaceID.from("minecraft:brown_glazed_terracotta"), (short) 9426, 1.4, 1.4, false, true, false, false),

    GREEN_GLAZED_TERRACOTTA(NamespaceID.from("minecraft:green_glazed_terracotta"), (short) 9430, 1.4, 1.4, false, true, false, false),

    RED_GLAZED_TERRACOTTA(NamespaceID.from("minecraft:red_glazed_terracotta"), (short) 9434, 1.4, 1.4, false, true, false, false),

    BLACK_GLAZED_TERRACOTTA(NamespaceID.from("minecraft:black_glazed_terracotta"), (short) 9438, 1.4, 1.4, false, true, false, false),

    WHITE_CONCRETE(NamespaceID.from("minecraft:white_concrete"), (short) 9442, 1.8, 1.8, false, true, false, true),

    ORANGE_CONCRETE(NamespaceID.from("minecraft:orange_concrete"), (short) 9443, 1.8, 1.8, false, true, false, true),

    MAGENTA_CONCRETE(NamespaceID.from("minecraft:magenta_concrete"), (short) 9444, 1.8, 1.8, false, true, false, true),

    LIGHT_BLUE_CONCRETE(NamespaceID.from("minecraft:light_blue_concrete"), (short) 9445, 1.8, 1.8, false, true, false, true),

    YELLOW_CONCRETE(NamespaceID.from("minecraft:yellow_concrete"), (short) 9446, 1.8, 1.8, false, true, false, true),

    LIME_CONCRETE(NamespaceID.from("minecraft:lime_concrete"), (short) 9447, 1.8, 1.8, false, true, false, true),

    PINK_CONCRETE(NamespaceID.from("minecraft:pink_concrete"), (short) 9448, 1.8, 1.8, false, true, false, true),

    GRAY_CONCRETE(NamespaceID.from("minecraft:gray_concrete"), (short) 9449, 1.8, 1.8, false, true, false, true),

    LIGHT_GRAY_CONCRETE(NamespaceID.from("minecraft:light_gray_concrete"), (short) 9450, 1.8, 1.8, false, true, false, true),

    CYAN_CONCRETE(NamespaceID.from("minecraft:cyan_concrete"), (short) 9451, 1.8, 1.8, false, true, false, true),

    PURPLE_CONCRETE(NamespaceID.from("minecraft:purple_concrete"), (short) 9452, 1.8, 1.8, false, true, false, true),

    BLUE_CONCRETE(NamespaceID.from("minecraft:blue_concrete"), (short) 9453, 1.8, 1.8, false, true, false, true),

    BROWN_CONCRETE(NamespaceID.from("minecraft:brown_concrete"), (short) 9454, 1.8, 1.8, false, true, false, true),

    GREEN_CONCRETE(NamespaceID.from("minecraft:green_concrete"), (short) 9455, 1.8, 1.8, false, true, false, true),

    RED_CONCRETE(NamespaceID.from("minecraft:red_concrete"), (short) 9456, 1.8, 1.8, false, true, false, true),

    BLACK_CONCRETE(NamespaceID.from("minecraft:black_concrete"), (short) 9457, 1.8, 1.8, false, true, false, true),

    WHITE_CONCRETE_POWDER(NamespaceID.from("minecraft:white_concrete_powder"), (short) 9458, 0.5, 0.5, false, true, false, true),

    ORANGE_CONCRETE_POWDER(NamespaceID.from("minecraft:orange_concrete_powder"), (short) 9459, 0.5, 0.5, false, true, false, true),

    MAGENTA_CONCRETE_POWDER(NamespaceID.from("minecraft:magenta_concrete_powder"), (short) 9460, 0.5, 0.5, false, true, false, true),

    LIGHT_BLUE_CONCRETE_POWDER(NamespaceID.from("minecraft:light_blue_concrete_powder"), (short) 9461, 0.5, 0.5, false, true, false, true),

    YELLOW_CONCRETE_POWDER(NamespaceID.from("minecraft:yellow_concrete_powder"), (short) 9462, 0.5, 0.5, false, true, false, true),

    LIME_CONCRETE_POWDER(NamespaceID.from("minecraft:lime_concrete_powder"), (short) 9463, 0.5, 0.5, false, true, false, true),

    PINK_CONCRETE_POWDER(NamespaceID.from("minecraft:pink_concrete_powder"), (short) 9464, 0.5, 0.5, false, true, false, true),

    GRAY_CONCRETE_POWDER(NamespaceID.from("minecraft:gray_concrete_powder"), (short) 9465, 0.5, 0.5, false, true, false, true),

    LIGHT_GRAY_CONCRETE_POWDER(NamespaceID.from("minecraft:light_gray_concrete_powder"), (short) 9466, 0.5, 0.5, false, true, false, true),

    CYAN_CONCRETE_POWDER(NamespaceID.from("minecraft:cyan_concrete_powder"), (short) 9467, 0.5, 0.5, false, true, false, true),

    PURPLE_CONCRETE_POWDER(NamespaceID.from("minecraft:purple_concrete_powder"), (short) 9468, 0.5, 0.5, false, true, false, true),

    BLUE_CONCRETE_POWDER(NamespaceID.from("minecraft:blue_concrete_powder"), (short) 9469, 0.5, 0.5, false, true, false, true),

    BROWN_CONCRETE_POWDER(NamespaceID.from("minecraft:brown_concrete_powder"), (short) 9470, 0.5, 0.5, false, true, false, true),

    GREEN_CONCRETE_POWDER(NamespaceID.from("minecraft:green_concrete_powder"), (short) 9471, 0.5, 0.5, false, true, false, true),

    RED_CONCRETE_POWDER(NamespaceID.from("minecraft:red_concrete_powder"), (short) 9472, 0.5, 0.5, false, true, false, true),

    BLACK_CONCRETE_POWDER(NamespaceID.from("minecraft:black_concrete_powder"), (short) 9473, 0.5, 0.5, false, true, false, true),

    KELP(NamespaceID.from("minecraft:kelp"), (short) 9474, 0.0, 0.0, false, false, false, false),

    KELP_PLANT(NamespaceID.from("minecraft:kelp_plant"), (short) 9500, 0.0, 0.0, false, false, false, true),

    DRIED_KELP_BLOCK(NamespaceID.from("minecraft:dried_kelp_block"), (short) 9501, 0.5, 2.5, false, true, false, true),

    TURTLE_EGG(NamespaceID.from("minecraft:turtle_egg"), (short) 9502, 0.5, 0.5, false, true, false, false),

    DEAD_TUBE_CORAL_BLOCK(NamespaceID.from("minecraft:dead_tube_coral_block"), (short) 9514, 1.5, 6.0, false, true, false, true),

    DEAD_BRAIN_CORAL_BLOCK(NamespaceID.from("minecraft:dead_brain_coral_block"), (short) 9515, 1.5, 6.0, false, true, false, true),

    DEAD_BUBBLE_CORAL_BLOCK(NamespaceID.from("minecraft:dead_bubble_coral_block"), (short) 9516, 1.5, 6.0, false, true, false, true),

    DEAD_FIRE_CORAL_BLOCK(NamespaceID.from("minecraft:dead_fire_coral_block"), (short) 9517, 1.5, 6.0, false, true, false, true),

    DEAD_HORN_CORAL_BLOCK(NamespaceID.from("minecraft:dead_horn_coral_block"), (short) 9518, 1.5, 6.0, false, true, false, true),

    TUBE_CORAL_BLOCK(NamespaceID.from("minecraft:tube_coral_block"), (short) 9519, 1.5, 6.0, false, true, false, true),

    BRAIN_CORAL_BLOCK(NamespaceID.from("minecraft:brain_coral_block"), (short) 9520, 1.5, 6.0, false, true, false, true),

    BUBBLE_CORAL_BLOCK(NamespaceID.from("minecraft:bubble_coral_block"), (short) 9521, 1.5, 6.0, false, true, false, true),

    FIRE_CORAL_BLOCK(NamespaceID.from("minecraft:fire_coral_block"), (short) 9522, 1.5, 6.0, false, true, false, true),

    HORN_CORAL_BLOCK(NamespaceID.from("minecraft:horn_coral_block"), (short) 9523, 1.5, 6.0, false, true, false, true),

    DEAD_TUBE_CORAL(NamespaceID.from("minecraft:dead_tube_coral"), (short) 9524, 0.0, 0.0, false, true, false, false),

    DEAD_BRAIN_CORAL(NamespaceID.from("minecraft:dead_brain_coral"), (short) 9526, 0.0, 0.0, false, true, false, false),

    DEAD_BUBBLE_CORAL(NamespaceID.from("minecraft:dead_bubble_coral"), (short) 9528, 0.0, 0.0, false, true, false, false),

    DEAD_FIRE_CORAL(NamespaceID.from("minecraft:dead_fire_coral"), (short) 9530, 0.0, 0.0, false, true, false, false),

    DEAD_HORN_CORAL(NamespaceID.from("minecraft:dead_horn_coral"), (short) 9532, 0.0, 0.0, false, true, false, false),

    TUBE_CORAL(NamespaceID.from("minecraft:tube_coral"), (short) 9534, 0.0, 0.0, false, false, false, false),

    BRAIN_CORAL(NamespaceID.from("minecraft:brain_coral"), (short) 9536, 0.0, 0.0, false, false, false, false),

    BUBBLE_CORAL(NamespaceID.from("minecraft:bubble_coral"), (short) 9538, 0.0, 0.0, false, false, false, false),

    FIRE_CORAL(NamespaceID.from("minecraft:fire_coral"), (short) 9540, 0.0, 0.0, false, false, false, false),

    HORN_CORAL(NamespaceID.from("minecraft:horn_coral"), (short) 9542, 0.0, 0.0, false, false, false, false),

    DEAD_TUBE_CORAL_FAN(NamespaceID.from("minecraft:dead_tube_coral_fan"), (short) 9544, 0.0, 0.0, false, true, false, false),

    DEAD_BRAIN_CORAL_FAN(NamespaceID.from("minecraft:dead_brain_coral_fan"), (short) 9546, 0.0, 0.0, false, true, false, false),

    DEAD_BUBBLE_CORAL_FAN(NamespaceID.from("minecraft:dead_bubble_coral_fan"), (short) 9548, 0.0, 0.0, false, true, false, false),

    DEAD_FIRE_CORAL_FAN(NamespaceID.from("minecraft:dead_fire_coral_fan"), (short) 9550, 0.0, 0.0, false, true, false, false),

    DEAD_HORN_CORAL_FAN(NamespaceID.from("minecraft:dead_horn_coral_fan"), (short) 9552, 0.0, 0.0, false, true, false, false),

    TUBE_CORAL_FAN(NamespaceID.from("minecraft:tube_coral_fan"), (short) 9554, 0.0, 0.0, false, false, false, false),

    BRAIN_CORAL_FAN(NamespaceID.from("minecraft:brain_coral_fan"), (short) 9556, 0.0, 0.0, false, false, false, false),

    BUBBLE_CORAL_FAN(NamespaceID.from("minecraft:bubble_coral_fan"), (short) 9558, 0.0, 0.0, false, false, false, false),

    FIRE_CORAL_FAN(NamespaceID.from("minecraft:fire_coral_fan"), (short) 9560, 0.0, 0.0, false, false, false, false),

    HORN_CORAL_FAN(NamespaceID.from("minecraft:horn_coral_fan"), (short) 9562, 0.0, 0.0, false, false, false, false),

    DEAD_TUBE_CORAL_WALL_FAN(NamespaceID.from("minecraft:dead_tube_coral_wall_fan"), (short) 9564, 0.0, 0.0, false, true, false, false),

    DEAD_BRAIN_CORAL_WALL_FAN(NamespaceID.from("minecraft:dead_brain_coral_wall_fan"), (short) 9572, 0.0, 0.0, false, true, false, false),

    DEAD_BUBBLE_CORAL_WALL_FAN(NamespaceID.from("minecraft:dead_bubble_coral_wall_fan"), (short) 9580, 0.0, 0.0, false, true, false, false),

    DEAD_FIRE_CORAL_WALL_FAN(NamespaceID.from("minecraft:dead_fire_coral_wall_fan"), (short) 9588, 0.0, 0.0, false, true, false, false),

    DEAD_HORN_CORAL_WALL_FAN(NamespaceID.from("minecraft:dead_horn_coral_wall_fan"), (short) 9596, 0.0, 0.0, false, true, false, false),

    TUBE_CORAL_WALL_FAN(NamespaceID.from("minecraft:tube_coral_wall_fan"), (short) 9604, 0.0, 0.0, false, false, false, false),

    BRAIN_CORAL_WALL_FAN(NamespaceID.from("minecraft:brain_coral_wall_fan"), (short) 9612, 0.0, 0.0, false, false, false, false),

    BUBBLE_CORAL_WALL_FAN(NamespaceID.from("minecraft:bubble_coral_wall_fan"), (short) 9620, 0.0, 0.0, false, false, false, false),

    FIRE_CORAL_WALL_FAN(NamespaceID.from("minecraft:fire_coral_wall_fan"), (short) 9628, 0.0, 0.0, false, false, false, false),

    HORN_CORAL_WALL_FAN(NamespaceID.from("minecraft:horn_coral_wall_fan"), (short) 9636, 0.0, 0.0, false, false, false, false),

    SEA_PICKLE(NamespaceID.from("minecraft:sea_pickle"), (short) 9644, 0.0, 0.0, false, false, false, false),

    BLUE_ICE(NamespaceID.from("minecraft:blue_ice"), (short) 9652, 2.8, 2.8, false, true, false, true),

    CONDUIT(NamespaceID.from("minecraft:conduit"), (short) 9653, 3.0, 3.0, false, true, true, false),

    BAMBOO_SAPLING(NamespaceID.from("minecraft:bamboo_sapling"), (short) 9655, 1.0, 1.0, false, true, false, true),

    BAMBOO(NamespaceID.from("minecraft:bamboo"), (short) 9656, 1.0, 1.0, false, true, false, false),

    POTTED_BAMBOO(NamespaceID.from("minecraft:potted_bamboo"), (short) 9668, 0.0, 0.0, false, false, false, true),

    VOID_AIR(NamespaceID.from("minecraft:void_air"), (short) 9669, 0.0, 0.0, true, false, false, true),

    CAVE_AIR(NamespaceID.from("minecraft:cave_air"), (short) 9670, 0.0, 0.0, true, false, false, true),

    BUBBLE_COLUMN(NamespaceID.from("minecraft:bubble_column"), (short) 9671, 0.0, 0.0, false, false, false, false),

    POLISHED_GRANITE_STAIRS(NamespaceID.from("minecraft:polished_granite_stairs"), (short) 9684, 1.5, 6.0, false, true, false, false),

    SMOOTH_RED_SANDSTONE_STAIRS(NamespaceID.from("minecraft:smooth_red_sandstone_stairs"), (short) 9764, 2.0, 6.0, false, true, false, false),

    MOSSY_STONE_BRICK_STAIRS(NamespaceID.from("minecraft:mossy_stone_brick_stairs"), (short) 9844, 1.5, 6.0, false, true, false, false),

    POLISHED_DIORITE_STAIRS(NamespaceID.from("minecraft:polished_diorite_stairs"), (short) 9924, 1.5, 6.0, false, true, false, false),

    MOSSY_COBBLESTONE_STAIRS(NamespaceID.from("minecraft:mossy_cobblestone_stairs"), (short) 10004, 2.0, 6.0, false, true, false, false),

    END_STONE_BRICK_STAIRS(NamespaceID.from("minecraft:end_stone_brick_stairs"), (short) 10084, 3.0, 9.0, false, true, false, false),

    STONE_STAIRS(NamespaceID.from("minecraft:stone_stairs"), (short) 10164, 1.5, 6.0, false, true, false, false),

    SMOOTH_SANDSTONE_STAIRS(NamespaceID.from("minecraft:smooth_sandstone_stairs"), (short) 10244, 2.0, 6.0, false, true, false, false),

    SMOOTH_QUARTZ_STAIRS(NamespaceID.from("minecraft:smooth_quartz_stairs"), (short) 10324, 2.0, 6.0, false, true, false, false),

    GRANITE_STAIRS(NamespaceID.from("minecraft:granite_stairs"), (short) 10404, 1.5, 6.0, false, true, false, false),

    ANDESITE_STAIRS(NamespaceID.from("minecraft:andesite_stairs"), (short) 10484, 1.5, 6.0, false, true, false, false),

    RED_NETHER_BRICK_STAIRS(NamespaceID.from("minecraft:red_nether_brick_stairs"), (short) 10564, 2.0, 6.0, false, true, false, false),

    POLISHED_ANDESITE_STAIRS(NamespaceID.from("minecraft:polished_andesite_stairs"), (short) 10644, 1.5, 6.0, false, true, false, false),

    DIORITE_STAIRS(NamespaceID.from("minecraft:diorite_stairs"), (short) 10724, 1.5, 6.0, false, true, false, false),

    POLISHED_GRANITE_SLAB(NamespaceID.from("minecraft:polished_granite_slab"), (short) 10796, 1.5, 6.0, false, true, false, false),

    SMOOTH_RED_SANDSTONE_SLAB(NamespaceID.from("minecraft:smooth_red_sandstone_slab"), (short) 10802, 2.0, 6.0, false, true, false, false),

    MOSSY_STONE_BRICK_SLAB(NamespaceID.from("minecraft:mossy_stone_brick_slab"), (short) 10808, 1.5, 6.0, false, true, false, false),

    POLISHED_DIORITE_SLAB(NamespaceID.from("minecraft:polished_diorite_slab"), (short) 10814, 1.5, 6.0, false, true, false, false),

    MOSSY_COBBLESTONE_SLAB(NamespaceID.from("minecraft:mossy_cobblestone_slab"), (short) 10820, 2.0, 6.0, false, true, false, false),

    END_STONE_BRICK_SLAB(NamespaceID.from("minecraft:end_stone_brick_slab"), (short) 10826, 3.0, 9.0, false, true, false, false),

    SMOOTH_SANDSTONE_SLAB(NamespaceID.from("minecraft:smooth_sandstone_slab"), (short) 10832, 2.0, 6.0, false, true, false, false),

    SMOOTH_QUARTZ_SLAB(NamespaceID.from("minecraft:smooth_quartz_slab"), (short) 10838, 2.0, 6.0, false, true, false, false),

    GRANITE_SLAB(NamespaceID.from("minecraft:granite_slab"), (short) 10844, 1.5, 6.0, false, true, false, false),

    ANDESITE_SLAB(NamespaceID.from("minecraft:andesite_slab"), (short) 10850, 1.5, 6.0, false, true, false, false),

    RED_NETHER_BRICK_SLAB(NamespaceID.from("minecraft:red_nether_brick_slab"), (short) 10856, 2.0, 6.0, false, true, false, false),

    POLISHED_ANDESITE_SLAB(NamespaceID.from("minecraft:polished_andesite_slab"), (short) 10862, 1.5, 6.0, false, true, false, false),

    DIORITE_SLAB(NamespaceID.from("minecraft:diorite_slab"), (short) 10868, 1.5, 6.0, false, true, false, false),

    BRICK_WALL(NamespaceID.from("minecraft:brick_wall"), (short) 10874, 2.0, 6.0, false, true, false, false),

    PRISMARINE_WALL(NamespaceID.from("minecraft:prismarine_wall"), (short) 11198, 1.5, 6.0, false, true, false, false),

    RED_SANDSTONE_WALL(NamespaceID.from("minecraft:red_sandstone_wall"), (short) 11522, 0.8, 0.8, false, true, false, false),

    MOSSY_STONE_BRICK_WALL(NamespaceID.from("minecraft:mossy_stone_brick_wall"), (short) 11846, 1.5, 6.0, false, true, false, false),

    GRANITE_WALL(NamespaceID.from("minecraft:granite_wall"), (short) 12170, 1.5, 6.0, false, true, false, false),

    STONE_BRICK_WALL(NamespaceID.from("minecraft:stone_brick_wall"), (short) 12494, 1.5, 6.0, false, true, false, false),

    NETHER_BRICK_WALL(NamespaceID.from("minecraft:nether_brick_wall"), (short) 12818, 2.0, 6.0, false, true, false, false),

    ANDESITE_WALL(NamespaceID.from("minecraft:andesite_wall"), (short) 13142, 1.5, 6.0, false, true, false, false),

    RED_NETHER_BRICK_WALL(NamespaceID.from("minecraft:red_nether_brick_wall"), (short) 13466, 2.0, 6.0, false, true, false, false),

    SANDSTONE_WALL(NamespaceID.from("minecraft:sandstone_wall"), (short) 13790, 0.8, 0.8, false, true, false, false),

    END_STONE_BRICK_WALL(NamespaceID.from("minecraft:end_stone_brick_wall"), (short) 14114, 3.0, 9.0, false, true, false, false),

    DIORITE_WALL(NamespaceID.from("minecraft:diorite_wall"), (short) 14438, 1.5, 6.0, false, true, false, false),

    SCAFFOLDING(NamespaceID.from("minecraft:scaffolding"), (short) 14790, 0.0, 0.0, false, false, false, false),

    LOOM(NamespaceID.from("minecraft:loom"), (short) 14791, 2.5, 2.5, false, true, false, false),

    BARREL(NamespaceID.from("minecraft:barrel"), (short) 14796, 2.5, 2.5, false, true, true, false),

    SMOKER(NamespaceID.from("minecraft:smoker"), (short) 14808, 3.5, 3.5, false, true, true, false),

    BLAST_FURNACE(NamespaceID.from("minecraft:blast_furnace"), (short) 14816, 3.5, 3.5, false, true, true, false),

    CARTOGRAPHY_TABLE(NamespaceID.from("minecraft:cartography_table"), (short) 14823, 2.5, 2.5, false, true, false, true),

    FLETCHING_TABLE(NamespaceID.from("minecraft:fletching_table"), (short) 14824, 2.5, 2.5, false, true, false, true),

    GRINDSTONE(NamespaceID.from("minecraft:grindstone"), (short) 14829, 2.0, 6.0, false, true, false, false),

    LECTERN(NamespaceID.from("minecraft:lectern"), (short) 14840, 2.5, 2.5, false, true, true, false),

    SMITHING_TABLE(NamespaceID.from("minecraft:smithing_table"), (short) 14853, 2.5, 2.5, false, true, false, true),

    STONECUTTER(NamespaceID.from("minecraft:stonecutter"), (short) 14854, 3.5, 3.5, false, true, false, false),

    BELL(NamespaceID.from("minecraft:bell"), (short) 14859, 5.0, 5.0, false, true, true, false),

    LANTERN(NamespaceID.from("minecraft:lantern"), (short) 14893, 3.5, 3.5, false, true, false, false),

    SOUL_LANTERN(NamespaceID.from("minecraft:soul_lantern"), (short) 14897, 3.5, 3.5, false, true, false, false),

    CAMPFIRE(NamespaceID.from("minecraft:campfire"), (short) 14901, 2.0, 2.0, false, true, true, false),

    SOUL_CAMPFIRE(NamespaceID.from("minecraft:soul_campfire"), (short) 14933, 2.0, 2.0, false, true, true, false),

    SWEET_BERRY_BUSH(NamespaceID.from("minecraft:sweet_berry_bush"), (short) 14962, 0.0, 0.0, false, false, false, false),

    WARPED_STEM(NamespaceID.from("minecraft:warped_stem"), (short) 14967, 2.0, 2.0, false, true, false, false),

    STRIPPED_WARPED_STEM(NamespaceID.from("minecraft:stripped_warped_stem"), (short) 14970, 2.0, 2.0, false, true, false, false),

    WARPED_HYPHAE(NamespaceID.from("minecraft:warped_hyphae"), (short) 14973, 2.0, 2.0, false, true, false, false),

    STRIPPED_WARPED_HYPHAE(NamespaceID.from("minecraft:stripped_warped_hyphae"), (short) 14976, 2.0, 2.0, false, true, false, false),

    WARPED_NYLIUM(NamespaceID.from("minecraft:warped_nylium"), (short) 14978, 0.4, 0.4, false, true, false, true),

    WARPED_FUNGUS(NamespaceID.from("minecraft:warped_fungus"), (short) 14979, 0.0, 0.0, false, false, false, true),

    WARPED_WART_BLOCK(NamespaceID.from("minecraft:warped_wart_block"), (short) 14980, 1.0, 1.0, false, true, false, true),

    WARPED_ROOTS(NamespaceID.from("minecraft:warped_roots"), (short) 14981, 0.0, 0.0, false, false, false, true),

    NETHER_SPROUTS(NamespaceID.from("minecraft:nether_sprouts"), (short) 14982, 0.0, 0.0, false, false, false, true),

    CRIMSON_STEM(NamespaceID.from("minecraft:crimson_stem"), (short) 14984, 2.0, 2.0, false, true, false, false),

    STRIPPED_CRIMSON_STEM(NamespaceID.from("minecraft:stripped_crimson_stem"), (short) 14987, 2.0, 2.0, false, true, false, false),

    CRIMSON_HYPHAE(NamespaceID.from("minecraft:crimson_hyphae"), (short) 14990, 2.0, 2.0, false, true, false, false),

    STRIPPED_CRIMSON_HYPHAE(NamespaceID.from("minecraft:stripped_crimson_hyphae"), (short) 14993, 2.0, 2.0, false, true, false, false),

    CRIMSON_NYLIUM(NamespaceID.from("minecraft:crimson_nylium"), (short) 14995, 0.4, 0.4, false, true, false, true),

    CRIMSON_FUNGUS(NamespaceID.from("minecraft:crimson_fungus"), (short) 14996, 0.0, 0.0, false, false, false, true),

    SHROOMLIGHT(NamespaceID.from("minecraft:shroomlight"), (short) 14997, 1.0, 1.0, false, true, false, true),

    WEEPING_VINES(NamespaceID.from("minecraft:weeping_vines"), (short) 14998, 0.0, 0.0, false, false, false, false),

    WEEPING_VINES_PLANT(NamespaceID.from("minecraft:weeping_vines_plant"), (short) 15024, 0.0, 0.0, false, false, false, true),

    TWISTING_VINES(NamespaceID.from("minecraft:twisting_vines"), (short) 15025, 0.0, 0.0, false, false, false, false),

    TWISTING_VINES_PLANT(NamespaceID.from("minecraft:twisting_vines_plant"), (short) 15051, 0.0, 0.0, false, false, false, true),

    CRIMSON_ROOTS(NamespaceID.from("minecraft:crimson_roots"), (short) 15052, 0.0, 0.0, false, false, false, true),

    CRIMSON_PLANKS(NamespaceID.from("minecraft:crimson_planks"), (short) 15053, 2.0, 3.0, false, true, false, true),

    WARPED_PLANKS(NamespaceID.from("minecraft:warped_planks"), (short) 15054, 2.0, 3.0, false, true, false, true),

    CRIMSON_SLAB(NamespaceID.from("minecraft:crimson_slab"), (short) 15058, 2.0, 3.0, false, true, false, false),

    WARPED_SLAB(NamespaceID.from("minecraft:warped_slab"), (short) 15064, 2.0, 3.0, false, true, false, false),

    CRIMSON_PRESSURE_PLATE(NamespaceID.from("minecraft:crimson_pressure_plate"), (short) 15068, 0.5, 0.5, false, true, false, false),

    WARPED_PRESSURE_PLATE(NamespaceID.from("minecraft:warped_pressure_plate"), (short) 15070, 0.5, 0.5, false, true, false, false),

    CRIMSON_FENCE(NamespaceID.from("minecraft:crimson_fence"), (short) 15102, 2.0, 3.0, false, true, false, false),

    WARPED_FENCE(NamespaceID.from("minecraft:warped_fence"), (short) 15134, 2.0, 3.0, false, true, false, false),

    CRIMSON_TRAPDOOR(NamespaceID.from("minecraft:crimson_trapdoor"), (short) 15150, 3.0, 3.0, false, true, false, false),

    WARPED_TRAPDOOR(NamespaceID.from("minecraft:warped_trapdoor"), (short) 15214, 3.0, 3.0, false, true, false, false),

    CRIMSON_FENCE_GATE(NamespaceID.from("minecraft:crimson_fence_gate"), (short) 15270, 2.0, 3.0, false, true, false, false),

    WARPED_FENCE_GATE(NamespaceID.from("minecraft:warped_fence_gate"), (short) 15302, 2.0, 3.0, false, true, false, false),

    CRIMSON_STAIRS(NamespaceID.from("minecraft:crimson_stairs"), (short) 15338, 2.0, 3.0, false, true, false, false),

    WARPED_STAIRS(NamespaceID.from("minecraft:warped_stairs"), (short) 15418, 2.0, 3.0, false, true, false, false),

    CRIMSON_BUTTON(NamespaceID.from("minecraft:crimson_button"), (short) 15496, 0.5, 0.5, false, false, false, false),

    WARPED_BUTTON(NamespaceID.from("minecraft:warped_button"), (short) 15520, 0.5, 0.5, false, false, false, false),

    CRIMSON_DOOR(NamespaceID.from("minecraft:crimson_door"), (short) 15546, 3.0, 3.0, false, true, false, false),

    WARPED_DOOR(NamespaceID.from("minecraft:warped_door"), (short) 15610, 3.0, 3.0, false, true, false, false),

    CRIMSON_SIGN(NamespaceID.from("minecraft:crimson_sign"), (short) 15664, 1.0, 1.0, false, true, true, false),

    WARPED_SIGN(NamespaceID.from("minecraft:warped_sign"), (short) 15696, 1.0, 1.0, false, true, true, false),

    CRIMSON_WALL_SIGN(NamespaceID.from("minecraft:crimson_wall_sign"), (short) 15728, 1.0, 1.0, false, true, true, false),

    WARPED_WALL_SIGN(NamespaceID.from("minecraft:warped_wall_sign"), (short) 15736, 1.0, 1.0, false, true, true, false),

    STRUCTURE_BLOCK(NamespaceID.from("minecraft:structure_block"), (short) 15743, -1.0, 3600000.0, false, true, true, false),

    JIGSAW(NamespaceID.from("minecraft:jigsaw"), (short) 15757, -1.0, 3600000.0, false, true, true, false),

    COMPOSTER(NamespaceID.from("minecraft:composter"), (short) 15759, 0.6, 0.6, false, true, false, false),

    TARGET(NamespaceID.from("minecraft:target"), (short) 15768, 0.5, 0.5, false, true, false, false),

    BEE_NEST(NamespaceID.from("minecraft:bee_nest"), (short) 15784, 0.3, 0.3, false, true, true, false),

    BEEHIVE(NamespaceID.from("minecraft:beehive"), (short) 15808, 0.6, 0.6, false, true, true, false),

    HONEY_BLOCK(NamespaceID.from("minecraft:honey_block"), (short) 15832, 0.0, 0.0, false, true, false, true),

    HONEYCOMB_BLOCK(NamespaceID.from("minecraft:honeycomb_block"), (short) 15833, 0.6, 0.6, false, true, false, true),

    NETHERITE_BLOCK(NamespaceID.from("minecraft:netherite_block"), (short) 15834, 50.0, 1200.0, false, true, false, true),

    ANCIENT_DEBRIS(NamespaceID.from("minecraft:ancient_debris"), (short) 15835, 30.0, 1200.0, false, true, false, true),

    CRYING_OBSIDIAN(NamespaceID.from("minecraft:crying_obsidian"), (short) 15836, 50.0, 1200.0, false, true, false, true),

    RESPAWN_ANCHOR(NamespaceID.from("minecraft:respawn_anchor"), (short) 15837, 50.0, 1200.0, false, true, false, false),

    POTTED_CRIMSON_FUNGUS(NamespaceID.from("minecraft:potted_crimson_fungus"), (short) 15842, 0.0, 0.0, false, false, false, true),

    POTTED_WARPED_FUNGUS(NamespaceID.from("minecraft:potted_warped_fungus"), (short) 15843, 0.0, 0.0, false, false, false, true),

    POTTED_CRIMSON_ROOTS(NamespaceID.from("minecraft:potted_crimson_roots"), (short) 15844, 0.0, 0.0, false, false, false, true),

    POTTED_WARPED_ROOTS(NamespaceID.from("minecraft:potted_warped_roots"), (short) 15845, 0.0, 0.0, false, false, false, true),

    LODESTONE(NamespaceID.from("minecraft:lodestone"), (short) 15846, 3.5, 3.5, false, true, false, true),

    BLACKSTONE(NamespaceID.from("minecraft:blackstone"), (short) 15847, 1.5, 6.0, false, true, false, true),

    BLACKSTONE_STAIRS(NamespaceID.from("minecraft:blackstone_stairs"), (short) 15859, 1.5, 6.0, false, true, false, false),

    BLACKSTONE_WALL(NamespaceID.from("minecraft:blackstone_wall"), (short) 15931, 1.5, 6.0, false, true, false, false),

    BLACKSTONE_SLAB(NamespaceID.from("minecraft:blackstone_slab"), (short) 16255, 2.0, 6.0, false, true, false, false),

    POLISHED_BLACKSTONE(NamespaceID.from("minecraft:polished_blackstone"), (short) 16258, 2.0, 6.0, false, true, false, true),

    POLISHED_BLACKSTONE_BRICKS(NamespaceID.from("minecraft:polished_blackstone_bricks"), (short) 16259, 1.5, 6.0, false, true, false, true),

    CRACKED_POLISHED_BLACKSTONE_BRICKS(NamespaceID.from("minecraft:cracked_polished_blackstone_bricks"), (short) 16260, 1.5, 6.0, false, true, false, true),

    CHISELED_POLISHED_BLACKSTONE(NamespaceID.from("minecraft:chiseled_polished_blackstone"), (short) 16261, 1.5, 6.0, false, true, false, true),

    POLISHED_BLACKSTONE_BRICK_SLAB(NamespaceID.from("minecraft:polished_blackstone_brick_slab"), (short) 16265, 2.0, 6.0, false, true, false, false),

    POLISHED_BLACKSTONE_BRICK_STAIRS(NamespaceID.from("minecraft:polished_blackstone_brick_stairs"), (short) 16279, 1.5, 6.0, false, true, false, false),

    POLISHED_BLACKSTONE_BRICK_WALL(NamespaceID.from("minecraft:polished_blackstone_brick_wall"), (short) 16351, 1.5, 6.0, false, true, false, false),

    GILDED_BLACKSTONE(NamespaceID.from("minecraft:gilded_blackstone"), (short) 16672, 1.5, 6.0, false, true, false, true),

    POLISHED_BLACKSTONE_STAIRS(NamespaceID.from("minecraft:polished_blackstone_stairs"), (short) 16684, 2.0, 6.0, false, true, false, false),

    POLISHED_BLACKSTONE_SLAB(NamespaceID.from("minecraft:polished_blackstone_slab"), (short) 16756, 2.0, 6.0, false, true, false, false),

    POLISHED_BLACKSTONE_PRESSURE_PLATE(NamespaceID.from("minecraft:polished_blackstone_pressure_plate"), (short) 16760, 0.5, 0.5, false, true, false, false),

    POLISHED_BLACKSTONE_BUTTON(NamespaceID.from("minecraft:polished_blackstone_button"), (short) 16770, 0.5, 0.5, false, false, false, false),

    POLISHED_BLACKSTONE_WALL(NamespaceID.from("minecraft:polished_blackstone_wall"), (short) 16788, 2.0, 6.0, false, true, false, false),

    CHISELED_NETHER_BRICKS(NamespaceID.from("minecraft:chiseled_nether_bricks"), (short) 17109, 2.0, 6.0, false, true, false, true),

    CRACKED_NETHER_BRICKS(NamespaceID.from("minecraft:cracked_nether_bricks"), (short) 17110, 2.0, 6.0, false, true, false, true),

    QUARTZ_BRICKS(NamespaceID.from("minecraft:quartz_bricks"), (short) 17111, 0.8, 0.8, false, true, false, true);

    static {
        GrassBlock.initStates();
        Podzol.initStates();
        OakSapling.initStates();
        SpruceSapling.initStates();
        BirchSapling.initStates();
        JungleSapling.initStates();
        AcaciaSapling.initStates();
        DarkOakSapling.initStates();
        Water.initStates();
        Lava.initStates();
        OakLog.initStates();
        SpruceLog.initStates();
        BirchLog.initStates();
        JungleLog.initStates();
        AcaciaLog.initStates();
        DarkOakLog.initStates();
        StrippedSpruceLog.initStates();
        StrippedBirchLog.initStates();
        StrippedJungleLog.initStates();
        StrippedAcaciaLog.initStates();
        StrippedDarkOakLog.initStates();
        StrippedOakLog.initStates();
        OakWood.initStates();
        SpruceWood.initStates();
        BirchWood.initStates();
        JungleWood.initStates();
        AcaciaWood.initStates();
        DarkOakWood.initStates();
        StrippedOakWood.initStates();
        StrippedSpruceWood.initStates();
        StrippedBirchWood.initStates();
        StrippedJungleWood.initStates();
        StrippedAcaciaWood.initStates();
        StrippedDarkOakWood.initStates();
        OakLeaves.initStates();
        SpruceLeaves.initStates();
        BirchLeaves.initStates();
        JungleLeaves.initStates();
        AcaciaLeaves.initStates();
        DarkOakLeaves.initStates();
        Dispenser.initStates();
        NoteBlock.initStates();
        WhiteBed.initStates();
        OrangeBed.initStates();
        MagentaBed.initStates();
        LightBlueBed.initStates();
        YellowBed.initStates();
        LimeBed.initStates();
        PinkBed.initStates();
        GrayBed.initStates();
        LightGrayBed.initStates();
        CyanBed.initStates();
        PurpleBed.initStates();
        BlueBed.initStates();
        BrownBed.initStates();
        GreenBed.initStates();
        RedBed.initStates();
        BlackBed.initStates();
        PoweredRail.initStates();
        DetectorRail.initStates();
        StickyPiston.initStates();
        TallSeagrass.initStates();
        Piston.initStates();
        PistonHead.initStates();
        MovingPiston.initStates();
        Tnt.initStates();
        WallTorch.initStates();
        Fire.initStates();
        OakStairs.initStates();
        Chest.initStates();
        RedstoneWire.initStates();
        Wheat.initStates();
        Farmland.initStates();
        Furnace.initStates();
        OakSign.initStates();
        SpruceSign.initStates();
        BirchSign.initStates();
        AcaciaSign.initStates();
        JungleSign.initStates();
        DarkOakSign.initStates();
        OakDoor.initStates();
        Ladder.initStates();
        Rail.initStates();
        CobblestoneStairs.initStates();
        OakWallSign.initStates();
        SpruceWallSign.initStates();
        BirchWallSign.initStates();
        AcaciaWallSign.initStates();
        JungleWallSign.initStates();
        DarkOakWallSign.initStates();
        Lever.initStates();
        StonePressurePlate.initStates();
        IronDoor.initStates();
        OakPressurePlate.initStates();
        SprucePressurePlate.initStates();
        BirchPressurePlate.initStates();
        JunglePressurePlate.initStates();
        AcaciaPressurePlate.initStates();
        DarkOakPressurePlate.initStates();
        RedstoneOre.initStates();
        RedstoneTorch.initStates();
        RedstoneWallTorch.initStates();
        StoneButton.initStates();
        Snow.initStates();
        Cactus.initStates();
        SugarCane.initStates();
        Jukebox.initStates();
        OakFence.initStates();
        Basalt.initStates();
        PolishedBasalt.initStates();
        SoulWallTorch.initStates();
        NetherPortal.initStates();
        CarvedPumpkin.initStates();
        JackOLantern.initStates();
        Cake.initStates();
        Repeater.initStates();
        OakTrapdoor.initStates();
        SpruceTrapdoor.initStates();
        BirchTrapdoor.initStates();
        JungleTrapdoor.initStates();
        AcaciaTrapdoor.initStates();
        DarkOakTrapdoor.initStates();
        BrownMushroomBlock.initStates();
        RedMushroomBlock.initStates();
        MushroomStem.initStates();
        IronBars.initStates();
        Chain.initStates();
        GlassPane.initStates();
        AttachedPumpkinStem.initStates();
        AttachedMelonStem.initStates();
        PumpkinStem.initStates();
        MelonStem.initStates();
        Vine.initStates();
        OakFenceGate.initStates();
        BrickStairs.initStates();
        StoneBrickStairs.initStates();
        Mycelium.initStates();
        NetherBrickFence.initStates();
        NetherBrickStairs.initStates();
        NetherWart.initStates();
        BrewingStand.initStates();
        Cauldron.initStates();
        EndPortalFrame.initStates();
        RedstoneLamp.initStates();
        Cocoa.initStates();
        SandstoneStairs.initStates();
        EnderChest.initStates();
        TripwireHook.initStates();
        Tripwire.initStates();
        SpruceStairs.initStates();
        BirchStairs.initStates();
        JungleStairs.initStates();
        CommandBlock.initStates();
        CobblestoneWall.initStates();
        MossyCobblestoneWall.initStates();
        Carrots.initStates();
        Potatoes.initStates();
        OakButton.initStates();
        SpruceButton.initStates();
        BirchButton.initStates();
        JungleButton.initStates();
        AcaciaButton.initStates();
        DarkOakButton.initStates();
        SkeletonSkull.initStates();
        SkeletonWallSkull.initStates();
        WitherSkeletonSkull.initStates();
        WitherSkeletonWallSkull.initStates();
        ZombieHead.initStates();
        ZombieWallHead.initStates();
        PlayerHead.initStates();
        PlayerWallHead.initStates();
        CreeperHead.initStates();
        CreeperWallHead.initStates();
        DragonHead.initStates();
        DragonWallHead.initStates();
        Anvil.initStates();
        ChippedAnvil.initStates();
        DamagedAnvil.initStates();
        TrappedChest.initStates();
        LightWeightedPressurePlate.initStates();
        HeavyWeightedPressurePlate.initStates();
        Comparator.initStates();
        DaylightDetector.initStates();
        Hopper.initStates();
        QuartzPillar.initStates();
        QuartzStairs.initStates();
        ActivatorRail.initStates();
        Dropper.initStates();
        WhiteStainedGlassPane.initStates();
        OrangeStainedGlassPane.initStates();
        MagentaStainedGlassPane.initStates();
        LightBlueStainedGlassPane.initStates();
        YellowStainedGlassPane.initStates();
        LimeStainedGlassPane.initStates();
        PinkStainedGlassPane.initStates();
        GrayStainedGlassPane.initStates();
        LightGrayStainedGlassPane.initStates();
        CyanStainedGlassPane.initStates();
        PurpleStainedGlassPane.initStates();
        BlueStainedGlassPane.initStates();
        BrownStainedGlassPane.initStates();
        GreenStainedGlassPane.initStates();
        RedStainedGlassPane.initStates();
        BlackStainedGlassPane.initStates();
        AcaciaStairs.initStates();
        DarkOakStairs.initStates();
        IronTrapdoor.initStates();
        PrismarineStairs.initStates();
        PrismarineBrickStairs.initStates();
        DarkPrismarineStairs.initStates();
        PrismarineSlab.initStates();
        PrismarineBrickSlab.initStates();
        DarkPrismarineSlab.initStates();
        HayBlock.initStates();
        Sunflower.initStates();
        Lilac.initStates();
        RoseBush.initStates();
        Peony.initStates();
        TallGrass.initStates();
        LargeFern.initStates();
        WhiteBanner.initStates();
        OrangeBanner.initStates();
        MagentaBanner.initStates();
        LightBlueBanner.initStates();
        YellowBanner.initStates();
        LimeBanner.initStates();
        PinkBanner.initStates();
        GrayBanner.initStates();
        LightGrayBanner.initStates();
        CyanBanner.initStates();
        PurpleBanner.initStates();
        BlueBanner.initStates();
        BrownBanner.initStates();
        GreenBanner.initStates();
        RedBanner.initStates();
        BlackBanner.initStates();
        WhiteWallBanner.initStates();
        OrangeWallBanner.initStates();
        MagentaWallBanner.initStates();
        LightBlueWallBanner.initStates();
        YellowWallBanner.initStates();
        LimeWallBanner.initStates();
        PinkWallBanner.initStates();
        GrayWallBanner.initStates();
        LightGrayWallBanner.initStates();
        CyanWallBanner.initStates();
        PurpleWallBanner.initStates();
        BlueWallBanner.initStates();
        BrownWallBanner.initStates();
        GreenWallBanner.initStates();
        RedWallBanner.initStates();
        BlackWallBanner.initStates();
        RedSandstoneStairs.initStates();
        OakSlab.initStates();
        SpruceSlab.initStates();
        BirchSlab.initStates();
        JungleSlab.initStates();
        AcaciaSlab.initStates();
        DarkOakSlab.initStates();
        StoneSlab.initStates();
        SmoothStoneSlab.initStates();
        SandstoneSlab.initStates();
        CutSandstoneSlab.initStates();
        PetrifiedOakSlab.initStates();
        CobblestoneSlab.initStates();
        BrickSlab.initStates();
        StoneBrickSlab.initStates();
        NetherBrickSlab.initStates();
        QuartzSlab.initStates();
        RedSandstoneSlab.initStates();
        CutRedSandstoneSlab.initStates();
        PurpurSlab.initStates();
        SpruceFenceGate.initStates();
        BirchFenceGate.initStates();
        JungleFenceGate.initStates();
        AcaciaFenceGate.initStates();
        DarkOakFenceGate.initStates();
        SpruceFence.initStates();
        BirchFence.initStates();
        JungleFence.initStates();
        AcaciaFence.initStates();
        DarkOakFence.initStates();
        SpruceDoor.initStates();
        BirchDoor.initStates();
        JungleDoor.initStates();
        AcaciaDoor.initStates();
        DarkOakDoor.initStates();
        EndRod.initStates();
        ChorusPlant.initStates();
        ChorusFlower.initStates();
        PurpurPillar.initStates();
        PurpurStairs.initStates();
        Beetroots.initStates();
        RepeatingCommandBlock.initStates();
        ChainCommandBlock.initStates();
        FrostedIce.initStates();
        BoneBlock.initStates();
        Observer.initStates();
        ShulkerBox.initStates();
        WhiteShulkerBox.initStates();
        OrangeShulkerBox.initStates();
        MagentaShulkerBox.initStates();
        LightBlueShulkerBox.initStates();
        YellowShulkerBox.initStates();
        LimeShulkerBox.initStates();
        PinkShulkerBox.initStates();
        GrayShulkerBox.initStates();
        LightGrayShulkerBox.initStates();
        CyanShulkerBox.initStates();
        PurpleShulkerBox.initStates();
        BlueShulkerBox.initStates();
        BrownShulkerBox.initStates();
        GreenShulkerBox.initStates();
        RedShulkerBox.initStates();
        BlackShulkerBox.initStates();
        WhiteGlazedTerracotta.initStates();
        OrangeGlazedTerracotta.initStates();
        MagentaGlazedTerracotta.initStates();
        LightBlueGlazedTerracotta.initStates();
        YellowGlazedTerracotta.initStates();
        LimeGlazedTerracotta.initStates();
        PinkGlazedTerracotta.initStates();
        GrayGlazedTerracotta.initStates();
        LightGrayGlazedTerracotta.initStates();
        CyanGlazedTerracotta.initStates();
        PurpleGlazedTerracotta.initStates();
        BlueGlazedTerracotta.initStates();
        BrownGlazedTerracotta.initStates();
        GreenGlazedTerracotta.initStates();
        RedGlazedTerracotta.initStates();
        BlackGlazedTerracotta.initStates();
        Kelp.initStates();
        TurtleEgg.initStates();
        DeadTubeCoral.initStates();
        DeadBrainCoral.initStates();
        DeadBubbleCoral.initStates();
        DeadFireCoral.initStates();
        DeadHornCoral.initStates();
        TubeCoral.initStates();
        BrainCoral.initStates();
        BubbleCoral.initStates();
        FireCoral.initStates();
        HornCoral.initStates();
        DeadTubeCoralFan.initStates();
        DeadBrainCoralFan.initStates();
        DeadBubbleCoralFan.initStates();
        DeadFireCoralFan.initStates();
        DeadHornCoralFan.initStates();
        TubeCoralFan.initStates();
        BrainCoralFan.initStates();
        BubbleCoralFan.initStates();
        FireCoralFan.initStates();
        HornCoralFan.initStates();
        DeadTubeCoralWallFan.initStates();
        DeadBrainCoralWallFan.initStates();
        DeadBubbleCoralWallFan.initStates();
        DeadFireCoralWallFan.initStates();
        DeadHornCoralWallFan.initStates();
        TubeCoralWallFan.initStates();
        BrainCoralWallFan.initStates();
        BubbleCoralWallFan.initStates();
        FireCoralWallFan.initStates();
        HornCoralWallFan.initStates();
        SeaPickle.initStates();
        Conduit.initStates();
        Bamboo.initStates();
        BubbleColumn.initStates();
        PolishedGraniteStairs.initStates();
        SmoothRedSandstoneStairs.initStates();
        MossyStoneBrickStairs.initStates();
        PolishedDioriteStairs.initStates();
        MossyCobblestoneStairs.initStates();
        EndStoneBrickStairs.initStates();
        StoneStairs.initStates();
        SmoothSandstoneStairs.initStates();
        SmoothQuartzStairs.initStates();
        GraniteStairs.initStates();
        AndesiteStairs.initStates();
        RedNetherBrickStairs.initStates();
        PolishedAndesiteStairs.initStates();
        DioriteStairs.initStates();
        PolishedGraniteSlab.initStates();
        SmoothRedSandstoneSlab.initStates();
        MossyStoneBrickSlab.initStates();
        PolishedDioriteSlab.initStates();
        MossyCobblestoneSlab.initStates();
        EndStoneBrickSlab.initStates();
        SmoothSandstoneSlab.initStates();
        SmoothQuartzSlab.initStates();
        GraniteSlab.initStates();
        AndesiteSlab.initStates();
        RedNetherBrickSlab.initStates();
        PolishedAndesiteSlab.initStates();
        DioriteSlab.initStates();
        BrickWall.initStates();
        PrismarineWall.initStates();
        RedSandstoneWall.initStates();
        MossyStoneBrickWall.initStates();
        GraniteWall.initStates();
        StoneBrickWall.initStates();
        NetherBrickWall.initStates();
        AndesiteWall.initStates();
        RedNetherBrickWall.initStates();
        SandstoneWall.initStates();
        EndStoneBrickWall.initStates();
        DioriteWall.initStates();
        Scaffolding.initStates();
        Loom.initStates();
        Barrel.initStates();
        Smoker.initStates();
        BlastFurnace.initStates();
        Grindstone.initStates();
        Lectern.initStates();
        Stonecutter.initStates();
        Bell.initStates();
        Lantern.initStates();
        SoulLantern.initStates();
        Campfire.initStates();
        SoulCampfire.initStates();
        SweetBerryBush.initStates();
        WarpedStem.initStates();
        StrippedWarpedStem.initStates();
        WarpedHyphae.initStates();
        StrippedWarpedHyphae.initStates();
        CrimsonStem.initStates();
        StrippedCrimsonStem.initStates();
        CrimsonHyphae.initStates();
        StrippedCrimsonHyphae.initStates();
        WeepingVines.initStates();
        TwistingVines.initStates();
        CrimsonSlab.initStates();
        WarpedSlab.initStates();
        CrimsonPressurePlate.initStates();
        WarpedPressurePlate.initStates();
        CrimsonFence.initStates();
        WarpedFence.initStates();
        CrimsonTrapdoor.initStates();
        WarpedTrapdoor.initStates();
        CrimsonFenceGate.initStates();
        WarpedFenceGate.initStates();
        CrimsonStairs.initStates();
        WarpedStairs.initStates();
        CrimsonButton.initStates();
        WarpedButton.initStates();
        CrimsonDoor.initStates();
        WarpedDoor.initStates();
        CrimsonSign.initStates();
        WarpedSign.initStates();
        CrimsonWallSign.initStates();
        WarpedWallSign.initStates();
        StructureBlock.initStates();
        Jigsaw.initStates();
        Composter.initStates();
        Target.initStates();
        BeeNest.initStates();
        Beehive.initStates();
        RespawnAnchor.initStates();
        BlackstoneStairs.initStates();
        BlackstoneWall.initStates();
        BlackstoneSlab.initStates();
        PolishedBlackstoneBrickSlab.initStates();
        PolishedBlackstoneBrickStairs.initStates();
        PolishedBlackstoneBrickWall.initStates();
        PolishedBlackstoneStairs.initStates();
        PolishedBlackstoneSlab.initStates();
        PolishedBlackstonePressurePlate.initStates();
        PolishedBlackstoneButton.initStates();
        PolishedBlackstoneWall.initStates();
    }

    @NotNull
    private final NamespaceID id;

    private final short defaultID;

    private final double hardness;

    private final double resistance;

    private final boolean isAir;

    private final boolean isSolid;

    private final boolean blockEntity;

    private final boolean singleState;

    @NotNull
    private final List<BlockAlternative> alternatives = new ArrayList<>();

    Block(@NotNull NamespaceID id, short defaultID, double hardness, double resistance,
            boolean isAir, boolean isSolid, boolean blockEntity, boolean singleState) {
        this.id = id;
        this.defaultID = defaultID;
        this.hardness = hardness;
        this.resistance = resistance;
        this.isAir = isAir;
        this.isSolid = isSolid;
        this.blockEntity = blockEntity;
        this.singleState = singleState;
        if (singleState) {
            addBlockAlternative(new BlockAlternative(defaultID));
        }
        Registries.blocks.put(id, this);
    }

    @Override
    @NotNull
    public Key key() {
        return this.id;
    }

    public final void addBlockAlternative(@NotNull BlockAlternative alternative) {
        this.alternatives.add(alternative);
        BlockArray.blocks[alternative.getId()] = this;
    }

    public short getBlockId() {
        return defaultID;
    }

    @NotNull
    public String getName() {
        return this.id.asString();
    }

    public double getHardness() {
        return this.hardness;
    }

    public double getResistance() {
        return this.resistance;
    }

    public boolean breaksInstantaneously() {
        return this.hardness == 0;
    }

    @NotNull
    public final List<BlockAlternative> getAlternatives() {
        return this.alternatives;
    }

    public boolean isAir() {
        return isAir;
    }

    public boolean isLiquid() {
        return this == WATER || this == LAVA;
    }

    public boolean isSolid() {
        return isSolid;
    }

    public boolean hasBlockEntity() {
        return blockEntity;
    }

    @Nullable
    public BlockAlternative getAlternative(short blockId) {
        for (BlockAlternative alt : alternatives)  {
            if (alt.getId() == blockId) {
                return alt;
            }
        }
        return null;
    }

    public short withProperties(@NotNull String... properties) {
        for (BlockAlternative alt : alternatives) {
            if (Arrays.equals(alt.getProperties(), properties)) {
                return alt.getId();
            }
        }
        return this.defaultID;
    }

    public static Block fromStateId(short blockStateId) {
        return BlockArray.blocks[blockStateId];
    }

    @NotNull
    @Override
    public String toString() {
        return "[" + this.id + "]";
    }
}
