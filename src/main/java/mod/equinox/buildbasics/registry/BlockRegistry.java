package mod.equinox.buildbasics.registry;

import mod.equinox.buildbasics.BuildBasics;
import mod.equinox.buildbasics.block.ModBlocks;
import mod.equinox.buildbasics.core.utils.BlockUtilities;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * @credit - bageldotjpg & SmellyModder(Luke Tonon)
 */
@Mod.EventBusSubscriber(modid = BuildBasics.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, BuildBasics.MODID);

    public static RegistryObject<Block> IRON_CHAIN = mod.equinox.buildbasics.core.utils.BlockUtilities.createBlock("iron_chain", () -> ModBlocks.IRON_CHAIN, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> WALL_LANTERN = mod.equinox.buildbasics.core.utils.BlockUtilities.createBlock("wall_lantern", () -> ModBlocks.WALL_LANTERN, ItemGroup.DECORATIONS);

    public static RegistryObject<Block> POLISHED_STONE = mod.equinox.buildbasics.core.utils.BlockUtilities.createBlock("polished_stone", () -> ModBlocks.POLISHED_STONE, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> SMALL_STONE_BRICKS = mod.equinox.buildbasics.core.utils.BlockUtilities.createBlock("small_stone_bricks", () -> ModBlocks.SMALL_STONE_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> STONE_PILLAR = mod.equinox.buildbasics.core.utils.BlockUtilities.createBlock("stone_pillar", () -> ModBlocks.STONE_PILLAR, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> GRANITE_BRICKS = mod.equinox.buildbasics.core.utils.BlockUtilities.createBlock("granite_bricks", () -> ModBlocks.GRANITE_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> SMALL_GRANITE_BRICKS = mod.equinox.buildbasics.core.utils.BlockUtilities.createBlock("small_granite_bricks", () -> ModBlocks.SMALL_GRANITE_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> GRANITE_PILLAR = mod.equinox.buildbasics.core.utils.BlockUtilities.createBlock("granite_pillar", () -> ModBlocks.GRANITE_PILLAR, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> CHISELED_GRANITE = mod.equinox.buildbasics.core.utils.BlockUtilities.createBlock("chiseled_granite", () -> ModBlocks.CHISELED_GRANITE, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> DIORITE_BRICKS = mod.equinox.buildbasics.core.utils.BlockUtilities.createBlock("diorite_bricks", () -> ModBlocks.DIORITE_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> SMALL_DIORITE_BRICKS = mod.equinox.buildbasics.core.utils.BlockUtilities.createBlock("small_diorite_bricks", () -> ModBlocks.SMALL_DIORITE_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> DIORITE_PILLAR = mod.equinox.buildbasics.core.utils.BlockUtilities.createBlock("diorite_pillar", () -> ModBlocks.DIORITE_PILLAR, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> CHISELED_DIORITE = mod.equinox.buildbasics.core.utils.BlockUtilities.createBlock("chiseled_diorite", () -> ModBlocks.CHISELED_DIORITE, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> ANDESITE_BRICKS = mod.equinox.buildbasics.core.utils.BlockUtilities.createBlock("andesite_bricks", () -> ModBlocks.ANDESITE_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> SMALL_ANDESITE_BRICKS = mod.equinox.buildbasics.core.utils.BlockUtilities.createBlock("small_andesite_bricks", () -> ModBlocks.SMALL_ANDESITE_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> ANDESITE_PILLAR = mod.equinox.buildbasics.core.utils.BlockUtilities.createBlock("andesite_pillar", () -> ModBlocks.ANDESITE_PILLAR, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> CHISELED_ANDESITE = mod.equinox.buildbasics.core.utils.BlockUtilities.createBlock("chiseled_andesite", () -> ModBlocks.CHISELED_ANDESITE, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> COBBLESTONE_BRICKS = mod.equinox.buildbasics.core.utils.BlockUtilities.createBlock("cobblestone_bricks", () -> ModBlocks.COBBLESTONE_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> MOSSY_COBBLESTONE_BRICKS = mod.equinox.buildbasics.core.utils.BlockUtilities.createBlock("mossy_cobblestone_bricks", () -> ModBlocks.MOSSY_COBBLESTONE_BRICKS, ItemGroup.BUILDING_BLOCKS);

    public static RegistryObject<Block> TERRACOTTA_BRICKS = BlockUtilities.createBlock("terracotta_bricks", () -> ModBlocks.TERRACOTTA_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> WHITE_TERRACOTTA_BRICKS = BlockUtilities.createBlock("white_terracotta_bricks", () -> ModBlocks.WHITE_TERRACOTTA_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> ORANGE_TERRACOTTA_BRICKS = BlockUtilities.createBlock("orange_terracotta_bricks", () -> ModBlocks.ORANGE_TERRACOTTA_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> MAGENTA_TERRACOTTA_BRICKS = BlockUtilities.createBlock("magenta_terracotta_bricks", () -> ModBlocks.MAGENTA_TERRACOTTA_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_BRICKS = BlockUtilities.createBlock("light_blue_terracotta_bricks", () -> ModBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> YELLOW_TERRACOTTA_BRICKS = BlockUtilities.createBlock("yellow_terracotta_bricks", () -> ModBlocks.YELLOW_TERRACOTTA_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> LIME_TERRACOTTA_BRICKS = BlockUtilities.createBlock("lime_terracotta_bricks", () -> ModBlocks.LIME_TERRACOTTA_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> PINK_TERRACOTTA_BRICKS = BlockUtilities.createBlock("pink_terracotta_bricks", () -> ModBlocks.PINK_TERRACOTTA_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> GRAY_TERRACOTTA_BRICKS = BlockUtilities.createBlock("gray_terracotta_bricks", () -> ModBlocks.GRAY_TERRACOTTA_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_BRICKS = BlockUtilities.createBlock("light_gray_terracotta_bricks", () -> ModBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> CYAN_TERRACOTTA_BRICKS = BlockUtilities.createBlock("cyan_terracotta_bricks", () -> ModBlocks.CYAN_TERRACOTTA_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> PURPLE_TERRACOTTA_BRICKS = BlockUtilities.createBlock("purple_terracotta_bricks", () -> ModBlocks.PURPLE_TERRACOTTA_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> BLUE_TERRACOTTA_BRICKS = BlockUtilities.createBlock("blue_terracotta_bricks", () -> ModBlocks.BLUE_TERRACOTTA_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> BROWN_TERRACOTTA_BRICKS = BlockUtilities.createBlock("brown_terracotta_bricks", () -> ModBlocks.BROWN_TERRACOTTA_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> GREEN_TERRACOTTA_BRICKS = BlockUtilities.createBlock("green_terracotta_bricks", () -> ModBlocks.GREEN_TERRACOTTA_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> RED_TERRACOTTA_BRICKS = BlockUtilities.createBlock("red_terracotta_bricks", () -> ModBlocks.RED_TERRACOTTA_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> BLACK_TERRACOTTA_BRICKS = BlockUtilities.createBlock("black_terracotta_bricks", () -> ModBlocks.BLACK_TERRACOTTA_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> WHITE_GLAZED_TERRACOTTA_PILLAR = BlockUtilities.createBlock("white_glazed_terracotta_pillar", () -> ModBlocks.WHITE_GLAZED_TERRACOTTA_PILLAR, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> ORANGE_GLAZED_TERRACOTTA_PILLAR = BlockUtilities.createBlock("orange_glazed_terracotta_pillar", () -> ModBlocks.ORANGE_GLAZED_TERRACOTTA_PILLAR, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> MAGENTA_GLAZED_TERRACOTTA_PILLAR = BlockUtilities.createBlock("magenta_glazed_terracotta_pillar", () -> ModBlocks.MAGENTA_GLAZED_TERRACOTTA_PILLAR, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> LIGHT_BLUE_GLAZED_TERRACOTTA_PILLAR = BlockUtilities.createBlock("light_blue_glazed_terracotta_pillar", () -> ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_PILLAR, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> YELLOW_GLAZED_TERRACOTTA_PILLAR = BlockUtilities.createBlock("yellow_glazed_terracotta_pillar", () -> ModBlocks.YELLOW_GLAZED_TERRACOTTA_PILLAR, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> LIME_GLAZED_TERRACOTTA_PILLAR = BlockUtilities.createBlock("lime_glazed_terracotta_pillar", () -> ModBlocks.LIME_GLAZED_TERRACOTTA_PILLAR, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> PINK_GLAZED_TERRACOTTA_PILLAR = BlockUtilities.createBlock("pink_glazed_terracotta_pillar", () -> ModBlocks.PINK_GLAZED_TERRACOTTA_PILLAR, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> GRAY_GLAZED_TERRACOTTA_PILLAR = BlockUtilities.createBlock("gray_glazed_terracotta_pillar", () -> ModBlocks.GRAY_GLAZED_TERRACOTTA_PILLAR, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> LIGHT_GRAY_GLAZED_TERRACOTTA_PILLAR = BlockUtilities.createBlock("light_gray_glazed_terracotta_pillar", () -> ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_PILLAR, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> CYAN_GLAZED_TERRACOTTA_PILLAR = BlockUtilities.createBlock("cyan_glazed_terracotta_pillar", () -> ModBlocks.CYAN_GLAZED_TERRACOTTA_PILLAR, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> PURPLE_GLAZED_TERRACOTTA_PILLAR = BlockUtilities.createBlock("purple_glazed_terracotta_pillar", () -> ModBlocks.PURPLE_GLAZED_TERRACOTTA_PILLAR, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> BLUE_GLAZED_TERRACOTTA_PILLAR = BlockUtilities.createBlock("blue_glazed_terracotta_pillar", () -> ModBlocks.BLUE_GLAZED_TERRACOTTA_PILLAR, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> BROWN_GLAZED_TERRACOTTA_PILLAR = BlockUtilities.createBlock("brown_glazed_terracotta_pillar", () -> ModBlocks.BROWN_GLAZED_TERRACOTTA_PILLAR, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> GREEN_GLAZED_TERRACOTTA_PILLAR = BlockUtilities.createBlock("green_glazed_terracotta_pillar", () -> ModBlocks.GREEN_GLAZED_TERRACOTTA_PILLAR, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> RED_GLAZED_TERRACOTTA_PILLAR = BlockUtilities.createBlock("red_glazed_terracotta_pillar", () -> ModBlocks.RED_GLAZED_TERRACOTTA_PILLAR, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> BLACK_GLAZED_TERRACOTTA_PILLAR = BlockUtilities.createBlock("black_glazed_terracotta_pillar", () -> ModBlocks.BLACK_GLAZED_TERRACOTTA_PILLAR, ItemGroup.DECORATIONS);

    public static RegistryObject<Block> WHITE_PURPUR = BlockUtilities.createBlock("white_purpur_block", () -> ModBlocks.WHITE_PURPUR, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> ORANGE_PURPUR = BlockUtilities.createBlock("orange_purpur_block", () -> ModBlocks.ORANGE_PURPUR, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> MAGENTA_PURPUR = BlockUtilities.createBlock("magenta_purpur_block", () -> ModBlocks.MAGENTA_PURPUR, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> LIGHT_BLUE_PURPUR = BlockUtilities.createBlock("light_blue_purpur_block", () -> ModBlocks.LIGHT_BLUE_PURPUR, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> YELLOW_PURPUR = BlockUtilities.createBlock("yellow_purpur_block", () -> ModBlocks.YELLOW_PURPUR, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> LIME_PURPUR = BlockUtilities.createBlock("lime_purpur_block", () -> ModBlocks.LIME_PURPUR, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> PINK_PURPUR = BlockUtilities.createBlock("pink_purpur_block", () -> ModBlocks.PINK_PURPUR, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> GRAY_PURPUR = BlockUtilities.createBlock("gray_purpur_block", () -> ModBlocks.GRAY_PURPUR, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> LIGHT_GRAY_PURPUR = BlockUtilities.createBlock("light_gray_purpur_block", () -> ModBlocks.LIGHT_GRAY_PURPUR, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> CYAN_PURPUR = BlockUtilities.createBlock("cyan_purpur_block", () -> ModBlocks.CYAN_PURPUR, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> PURPLE_PURPUR = BlockUtilities.createBlock("purple_purpur_block", () -> ModBlocks.PURPLE_PURPUR, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> BLUE_PURPUR = BlockUtilities.createBlock("blue_purpur_block", () -> ModBlocks.BLUE_PURPUR, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> BROWN_PURPUR = BlockUtilities.createBlock("brown_purpur_block", () -> ModBlocks.BROWN_PURPUR, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> GREEN_PURPUR = BlockUtilities.createBlock("green_purpur_block", () -> ModBlocks.GREEN_PURPUR, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> RED_PURPUR = BlockUtilities.createBlock("red_purpur_block", () -> ModBlocks.RED_PURPUR, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> BLACK_PURPUR = BlockUtilities.createBlock("black_purpur_block", () -> ModBlocks.BLACK_PURPUR, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> PRISMARINE_TILES = BlockUtilities.createBlock("prismarine_tiles", () -> ModBlocks.PRISMARINE_TILES, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> PRISMARINE_PILLAR = BlockUtilities.createBlock("prismarine_pillar", () -> ModBlocks.PRISMARINE_PILLAR, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> CHISELED_PRISMARINE = BlockUtilities.createBlock("chiseled_prismarine", () -> ModBlocks.CHISELED_PRISMARINE, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> DARK_PRISMARINE_BRICKS = BlockUtilities.createBlock("dark_prismarine_bricks", () -> ModBlocks.DARK_PRISMARINE_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> DARK_PRISMARINE_TILES = BlockUtilities.createBlock("dark_prismarine_tiles", () -> ModBlocks.DARK_PRISMARINE_TILES, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> DARK_PRISMARINE_PILLAR = BlockUtilities.createBlock("dark_prismarine_pillar", () -> ModBlocks.DARK_PRISMARINE_PILLAR, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> CHISELED_DARK_PRISMARINE = BlockUtilities.createBlock("chiseled_dark_prismarine", () -> ModBlocks.CHISELED_DARK_PRISMARINE, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> ABYSSAL_LANTERN = BlockUtilities.createBlock("abyssal_lantern", () -> ModBlocks.ABYSSAL_LANTERN, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> INFERNAL_LANTERN = BlockUtilities.createBlock("infernal_lantern", () -> ModBlocks.INFERNAL_LANTERN, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> SMALL_END_STONE_BRICKS = BlockUtilities.createBlock("small_end_stone_bricks", () -> ModBlocks.SMALL_END_STONE_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> END_STONE_TILES = BlockUtilities.createBlock("end_stone_tiles", () -> ModBlocks.END_STONE_TILES, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> END_STONE_PILLAR = BlockUtilities.createBlock("end_stone_pillar", () -> ModBlocks.END_STONE_PILLAR, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> FIREBRAND = BlockUtilities.createBlock("firebrand", () -> ModBlocks.FIREBRAND, ItemGroup.DECORATIONS);

    public static RegistryObject<Block> OAK_BOARDS = BlockUtilities.createBlock("oak_boards", () -> ModBlocks.OAK_BOARDS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> SPRUCE_BOARDS = BlockUtilities.createBlock("spruce_boards", () -> ModBlocks.SPRUCE_BOARDS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> BIRCH_BOARDS = BlockUtilities.createBlock("birch_boards", () -> ModBlocks.BIRCH_BOARDS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> JUNGLE_BOARDS = BlockUtilities.createBlock("jungle_boards", () -> ModBlocks.JUNGLE_BOARDS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> ACACIA_BOARDS = BlockUtilities.createBlock("acacia_boards", () -> ModBlocks.ACACIA_BOARDS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> DARK_OAK_BOARDS = BlockUtilities.createBlock("dark_oak_boards", () -> ModBlocks.DARK_OAK_BOARDS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> ROTTEN_OAK_PLANKS = BlockUtilities.createBlock("rotten_oak_planks", () -> ModBlocks.ROTTEN_OAK_PLANKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> ROTTEN_SPRUCE_PLANKS = BlockUtilities.createBlock("rotten_spruce_planks", () -> ModBlocks.ROTTEN_SPRUCE_PLANKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> ROTTEN_BIRCH_PLANKS = BlockUtilities.createBlock("rotten_birch_planks", () -> ModBlocks.ROTTEN_BIRCH_PLANKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> ROTTEN_JUNGLE_PLANKS = BlockUtilities.createBlock("rotten_jungle_planks", () -> ModBlocks.ROTTEN_JUNGLE_PLANKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> ROTTEN_ACACIA_PLANKS = BlockUtilities.createBlock("rotten_acacia_planks", () -> ModBlocks.ROTTEN_ACACIA_PLANKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> ROTTEN_DARK_OAK_PLANKS = BlockUtilities.createBlock("rotten_dark_oak_planks", () -> ModBlocks.ROTTEN_DARK_OAK_PLANKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> MOSSY_OAK_PLANKS = BlockUtilities.createBlock("mossy_oak_planks", () -> ModBlocks.MOSSY_OAK_PLANKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> MOSSY_SPRUCE_PLANKS = BlockUtilities.createBlock("mossy_spruce_planks", () -> ModBlocks.MOSSY_SPRUCE_PLANKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> MOSSY_BIRCH_PLANKS = BlockUtilities.createBlock("mossy_birch_planks", () -> ModBlocks.MOSSY_BIRCH_PLANKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> MOSSY_JUNGLE_PLANKS = BlockUtilities.createBlock("mossy_jungle_planks", () -> ModBlocks.MOSSY_JUNGLE_PLANKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> MOSSY_ACACIA_PLANKS = BlockUtilities.createBlock("mossy_acacia_planks", () -> ModBlocks.MOSSY_ACACIA_PLANKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> MOSSY_DARK_OAK_PLANKS = BlockUtilities.createBlock("mossy_dark_oak_planks", () -> ModBlocks.MOSSY_DARK_OAK_PLANKS, ItemGroup.BUILDING_BLOCKS);

    public static RegistryObject<Block> GLASS_DOOR = BlockUtilities.createBlock("glass_door", () -> ModBlocks.GLASS_DOOR, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> OAK_GLASS_DOOR = BlockUtilities.createBlock("oak_glass_door", () -> ModBlocks.GLASS_DOOR, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> SPRUCE_GLASS_DOOR = BlockUtilities.createBlock("spruce_glass_door", () -> ModBlocks.GLASS_DOOR, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> BIRCH_GLASS_DOOR = BlockUtilities.createBlock("birch_glass_door", () -> ModBlocks.GLASS_DOOR, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> JUNGLE_GLASS_DOOR = BlockUtilities.createBlock("jungle_glass_door", () -> ModBlocks.GLASS_DOOR, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> ACACIA_GLASS_DOOR = BlockUtilities.createBlock("acacia_glass_door", () -> ModBlocks.GLASS_DOOR, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> DARK_OAK_GLASS_DOOR = BlockUtilities.createBlock("dark_oak_glass_door", () -> ModBlocks.GLASS_DOOR, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> IRON_GLASS_DOOR = BlockUtilities.createBlock("iron_glass_door", () -> ModBlocks.GLASS_DOOR, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> IRON_BAR_DOOR = BlockUtilities.createBlock("iron_bar_door", () -> ModBlocks.GLASS_DOOR, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> GLASS_TRAPDOOR = BlockUtilities.createBlock("glass_trapdoor", () -> ModBlocks.GLASS_DOOR, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> OAK_GLASS_TRAPDOOR = BlockUtilities.createBlock("oak_glass_trapdoor", () -> ModBlocks.GLASS_DOOR, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> SPRUCE_GLASS_TRAPDOOR = BlockUtilities.createBlock("spruce_glass_trapdoor", () -> ModBlocks.GLASS_DOOR, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> BIRCH_GLASS_TRAPDOOR = BlockUtilities.createBlock("birch_glass_trapdoor", () -> ModBlocks.GLASS_DOOR, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> JUNGLE_GLASS_TRAPDOOR = BlockUtilities.createBlock("jungle_glass_trapdoor", () -> ModBlocks.GLASS_DOOR, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> ACACIA_GLASS_TRAPDOOR = BlockUtilities.createBlock("acacia_glass_trapdoor", () -> ModBlocks.GLASS_DOOR, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> DARK_OAK_GLASS_TRAPDOOR = BlockUtilities.createBlock("dark_oak_glass_trapdoor", () -> ModBlocks.GLASS_DOOR, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> IRON_GLASS_TRAPDOOR = BlockUtilities.createBlock("iron_glass_trapdoor", () -> ModBlocks.GLASS_DOOR, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> IRON_BAR_TRAPDOOR = BlockUtilities.createBlock("iron_bar_trapdoor", () -> ModBlocks.GLASS_DOOR, ItemGroup.DECORATIONS);

    public static RegistryObject<Block> WHITE_CANDLE = BlockUtilities.createBlock("white_candle", () -> ModBlocks.BLACK_CANDLE, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> ORANGE_CANDLE = BlockUtilities.createBlock("orange_candle", () -> ModBlocks.BLACK_CANDLE, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> MAGENTA_CANDLE = BlockUtilities.createBlock("magenta_candle", () -> ModBlocks.BLACK_CANDLE, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> LIGHT_BLUE_CANDLE = BlockUtilities.createBlock("light_blue_candle", () -> ModBlocks.BLACK_CANDLE, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> YELLOW_CANDLE = BlockUtilities.createBlock("yellow_candle", () -> ModBlocks.BLACK_CANDLE, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> LIME_CANDLE = BlockUtilities.createBlock("lime_candle", () -> ModBlocks.BLACK_CANDLE, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> PINK_CANDLE = BlockUtilities.createBlock("pink_candle", () -> ModBlocks.BLACK_CANDLE, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> GRAY_CANDLE = BlockUtilities.createBlock("gray_candle", () -> ModBlocks.BLACK_CANDLE, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> LIGHT_GRAY_CANDLE = BlockUtilities.createBlock("light_gray_candle", () -> ModBlocks.BLACK_CANDLE, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> CYAN_CANDLE = BlockUtilities.createBlock("cyan_candle", () -> ModBlocks.BLACK_CANDLE, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> PURPLE_CANDLE = BlockUtilities.createBlock("purple_candle", () -> ModBlocks.BLACK_CANDLE, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> BLUE_CANDLE = BlockUtilities.createBlock("blue_candle", () -> ModBlocks.BLACK_CANDLE, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> BROWN_CANDLE = BlockUtilities.createBlock("brown_candle", () -> ModBlocks.BLACK_CANDLE, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> GREEN_CANDLE = BlockUtilities.createBlock("green_candle", () -> ModBlocks.BLACK_CANDLE, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> RED_CANDLE = BlockUtilities.createBlock("red_candle", () -> ModBlocks.BLACK_CANDLE, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> BLACK_CANDLE = BlockUtilities.createBlock("black_candle", () -> ModBlocks.BLACK_CANDLE, ItemGroup.DECORATIONS);

}
