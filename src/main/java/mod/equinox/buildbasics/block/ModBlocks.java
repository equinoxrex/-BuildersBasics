package mod.equinox.buildbasics.block;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.DyeColor;

import static net.minecraft.block.Blocks.*;

public class ModBlocks {
    public static Block SMOOTH_STONE_STAIRS = new StairsBlock(() -> SMOOTH_STONE.getDefaultState(), Block.Properties.create(Material.ROCK,MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("smooth_stone_stairs");
    public static Block CRACKED_STONE_BRICK_STAIRS = new StairsBlock(() -> SMOOTH_STONE.getDefaultState(), Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("cracked_stone_brick_stairs");
    public static Block CRACKED_STONE_BRICK_SLABS = new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("cracked_stone_brick_slabs");

    public static Block POLISHED_STONE = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("polished_stone");
    public static Block SMALL_STONE_BRICKS = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("small_stone_bricks");
    public static Block STONE_PILLAR = new RotatedPillarBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("stone_pillar");
    public static Block GRANITE_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("granite_bricks");
    public static Block SMALL_GRANITE_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F,6.0F)).setRegistryName("small_granite_bricks");
    public static Block GRANITE_PILLAR = new RotatedPillarBlock(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("granite_pillar");
    public static Block CHISELED_GRANITE = new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("chiseled_granite");
    public static Block DIORITE_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("diorite_bricks");
    public static Block SMALL_DIORITE_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F,6.0F)).setRegistryName("small_diorite_bricks");
    public static Block DIORITE_PILLAR = new RotatedPillarBlock(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("diorite_pillar");
    public static Block CHISELED_DIORITE = new Block(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("chiseled_diorite");
    public static Block ANDESITE_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("andesite_bricks");
    public static Block SMALL_ANDESITE_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F,6.0F)).setRegistryName("small_andesite_bricks");
    public static Block ANDESITE_PILLAR = new RotatedPillarBlock(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("andesite_pillar");
    public static Block CHISELED_ANDESITE = new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("chiseled_andesite");
    public static Block TERRACOTTA_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.ADOBE).hardnessAndResistance(1.25F, 4.2F)).setRegistryName("terracotta_bricks");
    public static Block WHITE_TERRACOTTA_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.25F, 4.2F)).setRegistryName("white_terracotta_bricks");
    public static Block ORANGE_TERRACOTTA_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.ORANGE_TERRACOTTA).hardnessAndResistance(1.25F, 4.2F)).setRegistryName("orange_terracotta_bricks");
    public static Block MAGENTA_TERRACOTTA_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.MAGENTA_TERRACOTTA).hardnessAndResistance(1.25F, 4.2F)).setRegistryName("magenta_terracotta_bricks");
    public static Block LIGHT_BLUE_TERRACOTTA_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(1.25F, 4.2F)).setRegistryName("light_blue_terracotta_bricks");
    public static Block YELLOW_TERRACOTTA_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.YELLOW_TERRACOTTA).hardnessAndResistance(1.25F, 4.2F)).setRegistryName("yellow_terracotta_bricks");
    public static Block LIME_TERRACOTTA_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.LIME_TERRACOTTA).hardnessAndResistance(1.25F, 4.2F)).setRegistryName("lime_terracotta_bricks");
    public static Block PINK_TERRACOTTA_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.PINK_TERRACOTTA).hardnessAndResistance(1.25F, 4.2F)).setRegistryName("pink_terracotta_bricks");
    public static Block GRAY_TERRACOTTA_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.GRAY_TERRACOTTA).hardnessAndResistance(1.25F, 4.2F)).setRegistryName("gray_terracotta_bricks");
    public static Block LIGHT_GRAY_TERRACOTTA_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_GRAY_TERRACOTTA).hardnessAndResistance(1.25F, 4.2F)).setRegistryName("light_gray_terracotta_bricks");
    public static Block CYAN_TERRACOTTA_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.CYAN_TERRACOTTA).hardnessAndResistance(1.25F, 4.2F)).setRegistryName("cyan_terracotta_bricks");
    public static Block PURPLE_TERRACOTTA_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.PURPLE_TERRACOTTA).hardnessAndResistance(1.25F, 4.2F)).setRegistryName("purple_terracotta_bricks");
    public static Block BLUE_TERRACOTTA_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.25F, 4.2F)).setRegistryName("blue_terracotta_bricks");
    public static Block BROWN_TERRACOTTA_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.BROWN_TERRACOTTA).hardnessAndResistance(1.25F, 4.2F)).setRegistryName("brown_terracotta_bricks");
    public static Block GREEN_TERRACOTTA_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(1.25F, 4.2F)).setRegistryName("green_terracotta_bricks");
    public static Block RED_TERRACOTTA_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.RED_TERRACOTTA).hardnessAndResistance(1.25F, 4.2F)).setRegistryName("red_terracotta_bricks");
    public static Block BLACK_TERRACOTTA_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.BLACK_TERRACOTTA).hardnessAndResistance(1.25F, 4.2F)).setRegistryName("black_terracotta_bricks");
    public static Block WHITE_GLAZED_TERRACOTTA_PILLAR = new GlazedTerracottaPillarBlock(Block.Properties.create(Material.ROCK, DyeColor.WHITE).hardnessAndResistance(1.4F)).setRegistryName("white_glazed_terracotta_pillar");
    public static Block ORANGE_GLAZED_TERRACOTTA_PILLAR = new GlazedTerracottaPillarBlock(Block.Properties.create(Material.ROCK, DyeColor.ORANGE).hardnessAndResistance(1.4F)).setRegistryName("orange_glazed_terracotta_pillar");
    public static Block MAGENTA_GLAZED_TERRACOTTA_PILLAR = new GlazedTerracottaPillarBlock(Block.Properties.create(Material.ROCK, DyeColor.MAGENTA).hardnessAndResistance(1.4F)).setRegistryName("magenta_glazed_terracotta_pillar");
    public static Block LIGHT_BLUE_GLAZED_TERRACOTTA_PILLAR = new GlazedTerracottaPillarBlock(Block.Properties.create(Material.ROCK, DyeColor.LIGHT_BLUE).hardnessAndResistance(1.4F)).setRegistryName("light_blue_glazed_terracotta_pillar");
    public static Block YELLOW_GLAZED_TERRACOTTA_PILLAR = new GlazedTerracottaPillarBlock(Block.Properties.create(Material.ROCK, DyeColor.YELLOW).hardnessAndResistance(1.4F)).setRegistryName("yellow_glazed_terracotta_pillar");
    public static Block LIME_GLAZED_TERRACOTTA_PILLAR = new GlazedTerracottaPillarBlock(Block.Properties.create(Material.ROCK, DyeColor.LIME).hardnessAndResistance(1.4F)).setRegistryName("lime_glazed_terracotta_pillar");
    public static Block PINK_GLAZED_TERRACOTTA_PILLAR = new GlazedTerracottaPillarBlock(Block.Properties.create(Material.ROCK, DyeColor.PINK).hardnessAndResistance(1.4F)).setRegistryName("pink_glazed_terracotta_pillar");
    public static Block GRAY_GLAZED_TERRACOTTA_PILLAR = new GlazedTerracottaPillarBlock(Block.Properties.create(Material.ROCK, DyeColor.GRAY).hardnessAndResistance(1.4F)).setRegistryName("gray_glazed_terracotta_pillar");
    public static Block LIGHT_GRAY_GLAZED_TERRACOTTA_PILLAR = new GlazedTerracottaPillarBlock(Block.Properties.create(Material.ROCK, DyeColor.LIGHT_GRAY).hardnessAndResistance(1.4F)).setRegistryName("light_gray_glazed_terracotta_pillar");
    public static Block CYAN_GLAZED_TERRACOTTA_PILLAR = new GlazedTerracottaPillarBlock(Block.Properties.create(Material.ROCK, DyeColor.CYAN).hardnessAndResistance(1.4F)).setRegistryName("cyan_glazed_terracotta_pillar");
    public static Block PURPLE_GLAZED_TERRACOTTA_PILLAR = new GlazedTerracottaPillarBlock(Block.Properties.create(Material.ROCK, DyeColor.PURPLE).hardnessAndResistance(1.4F)).setRegistryName("purple_glazed_terracotta_pillar");
    public static Block BLUE_GLAZED_TERRACOTTA_PILLAR = new GlazedTerracottaPillarBlock(Block.Properties.create(Material.ROCK, DyeColor.BLUE).hardnessAndResistance(1.4F)).setRegistryName("blue_glazed_terracotta_pillar");
    public static Block BROWN_GLAZED_TERRACOTTA_PILLAR = new GlazedTerracottaPillarBlock(Block.Properties.create(Material.ROCK, DyeColor.BROWN).hardnessAndResistance(1.4F)).setRegistryName("brown_glazed_terracotta_pillar");
    public static Block GREEN_GLAZED_TERRACOTTA_PILLAR = new GlazedTerracottaPillarBlock(Block.Properties.create(Material.ROCK, DyeColor.GREEN).hardnessAndResistance(1.4F)).setRegistryName("green_glazed_terracotta_pillar");
    public static Block RED_GLAZED_TERRACOTTA_PILLAR = new GlazedTerracottaPillarBlock(Block.Properties.create(Material.ROCK, DyeColor.RED).hardnessAndResistance(1.4F)).setRegistryName("red_glazed_terracotta_pillar");
    public static Block BLACK_GLAZED_TERRACOTTA_PILLAR = new GlazedTerracottaPillarBlock(Block.Properties.create(Material.ROCK, DyeColor.BLACK).hardnessAndResistance(1.4F)).setRegistryName("black_glazed_terracotta_pillar");
    public static Block WHITE_PURPUR = new Block(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("white_purpur_block");
    public static Block ORANGE_PURPUR = new Block(Block.Properties.create(Material.ROCK, MaterialColor.ADOBE).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("orange_purpur_block");
    public static Block MAGENTA_PURPUR = new Block(Block.Properties.create(Material.ROCK, MaterialColor.MAGENTA).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("magenta_purpur_block");
    public static Block LIGHT_BLUE_PURPUR = new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIAMOND).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("light_blue_purpur_block");
    public static Block YELLOW_PURPUR = new Block(Block.Properties.create(Material.ROCK, MaterialColor.YELLOW).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("yellow_purpur_block");
    public static Block LIME_PURPUR = new Block(Block.Properties.create(Material.ROCK, MaterialColor.LIME).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("lime_purpur_block");
    public static Block PINK_PURPUR = new Block(Block.Properties.create(Material.ROCK, MaterialColor.PINK).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("pink_purpur_block");
    public static Block GRAY_PURPUR = new Block(Block.Properties.create(Material.ROCK, MaterialColor.GRAY).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("gray_purpur_block");
    public static Block LIGHT_GRAY_PURPUR = new Block(Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_GRAY).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("light_gray_purpur_block");
    public static Block CYAN_PURPUR = new Block(Block.Properties.create(Material.ROCK, MaterialColor.CYAN).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("cyan_purpur_block");
    public static Block PURPLE_PURPUR = new Block(Block.Properties.create(Material.ROCK, MaterialColor.PURPLE).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("purple_purpur_block");
    public static Block BLUE_PURPUR = new Block(Block.Properties.create(Material.ROCK, MaterialColor.BLUE).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("blue_purpur_block");
    public static Block BROWN_PURPUR = new Block(Block.Properties.create(Material.ROCK, MaterialColor.BROWN).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("brown_purpur_block");
    public static Block GREEN_PURPUR = new Block(Block.Properties.create(Material.ROCK, MaterialColor.GREEN).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("green_purpur_block");
    public static Block RED_PURPUR = new Block(Block.Properties.create(Material.ROCK, MaterialColor.RED).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("red_purpur_block");
    public static Block BLACK_PURPUR = new Block(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("black_purpur_block");
    public static Block IRON_CHAIN = new ChainBlock(Block.Properties.create(Material.IRON, MaterialColor.AIR).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)).setRegistryName("iron_chain");
    public static Block PRISMARINE_TILES = new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIAMOND).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("prismarine_tiles");
    public static Block PRISMARINE_PILLAR = new RotatedPillarBlock(Block.Properties.create(Material.ROCK, MaterialColor.DIAMOND).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("prismarine_pillar");
    public static Block CHISELED_PRISMARINE = new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIAMOND).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("chiseled_prismarine");
    public static Block DARK_PRISMARINE_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIAMOND).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("dark_prismarine_bricks");
    public static Block DARK_PRISMARINE_TILES = new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIAMOND).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("dark_prismarine_tiles");
    public static Block DARK_PRISMARINE_PILLAR = new RotatedPillarBlock(Block.Properties.create(Material.ROCK, MaterialColor.DIAMOND).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("dark_prismarine_pillar");
    public static Block CHISELED_DARK_PRISMARINE = new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIAMOND).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("chiseled_dark_prismarine");
    public static Block ABYSSAL_LANTERN = new Block(Block.Properties.create(Material.GLASS, MaterialColor.QUARTZ).hardnessAndResistance(0.3F).sound(SoundType.GLASS).lightValue(15)).setRegistryName("abyssal_lantern");
    public static Block SMALL_END_STONE_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(0.8F)).setRegistryName("small_end_stone_bricks");
    public static Block END_STONE_TILES = new Block(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(0.8F)).setRegistryName("end_stone_tiles");
    public static Block END_STONE_PILLAR = new RotatedPillarBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(0.8F)).setRegistryName("end_stone_pillar");
    public static Block OAK_BOARDS = new Block(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("oak_boards");
    public static Block SPRUCE_BOARDS = new Block(Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("spruce_boards");
    public static Block BIRCH_BOARDS = new Block(Block.Properties.create(Material.WOOD, MaterialColor.SAND).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("birch_boards");
    public static Block JUNGLE_BOARDS = new Block(Block.Properties.create(Material.WOOD, MaterialColor.DIRT).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("jungle_boards");
    public static Block ACACIA_BOARDS = new Block(Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("acacia_boards");
    public static Block DARK_OAK_BOARDS = new Block(Block.Properties.create(Material.WOOD, MaterialColor.DIRT).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("dark_oak_boards");
    public static Block OAK_GLASS_DOOR = new GlassDoorBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)).setRegistryName("oak_glass_door");
    public static Block SPRUCE_GLASS_DOOR = new GlassDoorBlock(Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).hardnessAndResistance(3.0F).sound(SoundType.WOOD)).setRegistryName("spruce_glass_door");
    public static Block BIRCH_GLASS_DOOR = new GlassDoorBlock(Block.Properties.create(Material.WOOD, MaterialColor.SAND).hardnessAndResistance(3.0F).sound(SoundType.WOOD)).setRegistryName("birch_glass_door");
    public static Block JUNGLE_GLASS_DOOR = new GlassDoorBlock(Block.Properties.create(Material.WOOD, MaterialColor.DIRT).hardnessAndResistance(3.0F).sound(SoundType.WOOD)).setRegistryName("jungle_glass_door");
    public static Block ACACIA_GLASS_DOOR = new GlassDoorBlock(Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(3.0F).sound(SoundType.WOOD)).setRegistryName("acacia_glass_door");
    public static Block DARK_OAK_GLASS_DOOR = new GlassDoorBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(3.0F).sound(SoundType.WOOD)).setRegistryName("dark_oak_glass_door");
    public static Block IRON_GLASS_DOOR = new GlassDoorBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(5.0F).sound(SoundType.METAL)).setRegistryName("iron_glass_door");
    public static Block GLASS_DOOR = new GlassDoorBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.3F).sound(SoundType.GLASS)).setRegistryName("glass_door");
    public static Block WHITE_CANDLE = new CandleBlock(Block.Properties.create(Material.CLAY, MaterialColor.SNOW).hardnessAndResistance(0.3F).sound(SoundType.SLIME).lightValue(5)).setRegistryName("white_candle");
    public static Block ORANGE_CANDLE = new CandleBlock(Block.Properties.create(Material.CLAY, MaterialColor.ADOBE).hardnessAndResistance(0.3F).sound(SoundType.SLIME).lightValue(5)).setRegistryName("orange_candle");
    public static Block MAGENTA_CANDLE = new CandleBlock(Block.Properties.create(Material.CLAY, MaterialColor.MAGENTA).hardnessAndResistance(0.3F).sound(SoundType.SLIME).lightValue(5)).setRegistryName("magenta_candle");
    public static Block LIGHT_BLUE_CANDLE = new CandleBlock(Block.Properties.create(Material.CLAY, MaterialColor.DIAMOND).hardnessAndResistance(0.3F).sound(SoundType.SLIME).lightValue(5)).setRegistryName("light_blue_candle");
    public static Block YELLOW_CANDLE = new CandleBlock(Block.Properties.create(Material.CLAY, MaterialColor.YELLOW).hardnessAndResistance(0.3F).sound(SoundType.SLIME).lightValue(5)).setRegistryName("yellow_candle");
    public static Block LIME_CANDLE = new CandleBlock(Block.Properties.create(Material.CLAY, MaterialColor.LIME).hardnessAndResistance(0.3F).sound(SoundType.SLIME).lightValue(5)).setRegistryName("lime_candle");
    public static Block PINK_CANDLE = new CandleBlock(Block.Properties.create(Material.CLAY, MaterialColor.PINK).hardnessAndResistance(0.3F).sound(SoundType.SLIME).lightValue(5)).setRegistryName("pink_candle");
    public static Block GRAY_CANDLE = new CandleBlock(Block.Properties.create(Material.CLAY, MaterialColor.GRAY).hardnessAndResistance(0.3F).sound(SoundType.SLIME).lightValue(5)).setRegistryName("gray_candle");
    public static Block LIGHT_GRAY_CANDLE = new CandleBlock(Block.Properties.create(Material.CLAY, MaterialColor.LIGHT_GRAY).hardnessAndResistance(0.3F).sound(SoundType.SLIME).lightValue(5)).setRegistryName("light_gray_candle");
    public static Block CYAN_CANDLE = new CandleBlock(Block.Properties.create(Material.CLAY, MaterialColor.CYAN).hardnessAndResistance(0.3F).sound(SoundType.SLIME).lightValue(5)).setRegistryName("cyan_candle");
    public static Block PURPLE_CANDLE = new CandleBlock(Block.Properties.create(Material.CLAY, MaterialColor.PURPLE).hardnessAndResistance(0.3F).sound(SoundType.SLIME).lightValue(5)).setRegistryName("purple_candle");
    public static Block BLUE_CANDLE = new CandleBlock(Block.Properties.create(Material.CLAY, MaterialColor.BLUE).hardnessAndResistance(0.3F).sound(SoundType.SLIME).lightValue(5)).setRegistryName("blue_candle");
    public static Block BROWN_CANDLE = new CandleBlock(Block.Properties.create(Material.CLAY, MaterialColor.BROWN).hardnessAndResistance(0.3F).sound(SoundType.SLIME).lightValue(5)).setRegistryName("brown_candle");
    public static Block GREEN_CANDLE = new CandleBlock(Block.Properties.create(Material.CLAY, MaterialColor.GREEN).hardnessAndResistance(0.3F).sound(SoundType.SLIME).lightValue(5)).setRegistryName("green_candle");
    public static Block RED_CANDLE = new CandleBlock(Block.Properties.create(Material.CLAY, MaterialColor.RED).hardnessAndResistance(0.3F).sound(SoundType.SLIME).lightValue(5)).setRegistryName("red_candle");
    public static Block BLACK_CANDLE = new CandleBlock(Block.Properties.create(Material.CLAY, MaterialColor.BLACK).hardnessAndResistance(0.3F).sound(SoundType.SLIME).lightValue(5)).setRegistryName("black_candle");

    public static Block POLISHED_STONE_STAIRS = new StairsBlock(() -> POLISHED_STONE.getDefaultState(), Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("polished_stone_stairs");
    public static Block SMALL_STONE_BRICK_STAIRS = new StairsBlock(() -> SMALL_STONE_BRICKS.getDefaultState(), Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("small_stone_brick_stairs");
    public static Block GRANITE_BRICK_STAIRS = new StairsBlock(() -> GRANITE_BRICKS.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("granite_brick_stairs");
    public static Block SMALL_GRANITE_BRICK_STAIRS = new StairsBlock(() -> SMALL_GRANITE_BRICKS.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("small_granite_brick_stairs");
    public static Block DIORITE_BRICK_STAIRS = new StairsBlock(() -> DIORITE_BRICKS.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("diorite_brick_stairs");
    public static Block SMALL_DIORITE_BRICK_STAIRS = new StairsBlock(() -> SMALL_DIORITE_BRICKS.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("small_diorite_brick_stairs");
    public static Block ANDESITE_BRICK_STAIRS = new StairsBlock(() -> ANDESITE_BRICKS.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("andesite_brick_stairs");
    public static Block SMALL_ANDESITE_BRICK_STAIRS = new StairsBlock(() -> SMALL_ANDESITE_BRICKS.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("small_andesite_brick_stairs");
    public static Block TERRACOTTA_BRICK_STAIRS = new StairsBlock(() -> TERRACOTTA_BRICKS.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.ADOBE).hardnessAndResistance(1.25F, 4.2F)).setRegistryName("terracotta_brick_stairs");
    public static Block WHITE_TERRACOTTA_BRICK_STAIRS = new StairsBlock(() -> WHITE_TERRACOTTA_BRICKS.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.25F, 4.2F)).setRegistryName("white_terracotta_brick_stairs");
    public static Block ORANGE_TERRACOTTA_BRICK_STAIRS = new StairsBlock(() -> ORANGE_TERRACOTTA_BRICKS.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.ORANGE_TERRACOTTA).hardnessAndResistance(1.25F, 4.2F)).setRegistryName("orange_terracotta_brick_stairs");
    public static Block MAGENTA_TERRACOTTA_BRICK_STAIRS = new StairsBlock(() -> MAGENTA_TERRACOTTA_BRICKS.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.MAGENTA_TERRACOTTA).hardnessAndResistance(1.25F, 4.2F)).setRegistryName("magenta_terracotta_brick_stairs");
    public static Block LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS = new StairsBlock(() -> LIGHT_BLUE_TERRACOTTA_BRICKS.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(1.25F, 4.2F)).setRegistryName("light_blue_terracotta_brick_stairs");
    public static Block YELLOW_TERRACOTTA_BRICK_STAIRS = new StairsBlock(() -> YELLOW_TERRACOTTA_BRICKS.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.YELLOW_TERRACOTTA).hardnessAndResistance(1.25F, 4.2F)).setRegistryName("yellow_terracotta_brick_stairs");
    public static Block LIME_TERRACOTTA_BRICK_STAIRS = new StairsBlock(() -> LIME_TERRACOTTA_BRICKS.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.LIME_TERRACOTTA).hardnessAndResistance(1.25F, 4.2F)).setRegistryName("lime_terracotta_brick_stairs");
    public static Block PINK_TERRACOTTA_BRICK_STAIRS = new StairsBlock(() -> PINK_TERRACOTTA_BRICKS.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.PINK_TERRACOTTA).hardnessAndResistance(1.25F, 4.2F)).setRegistryName("pink_terracotta_brick_stairs");
    public static Block GRAY_TERRACOTTA_BRICK_STAIRS = new StairsBlock(() -> GRAY_TERRACOTTA_BRICKS.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GRAY_TERRACOTTA).hardnessAndResistance(1.25F, 4.2F)).setRegistryName("gray_terracotta_brick_stairs");
    public static Block LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS = new StairsBlock(() -> LIGHT_GRAY_TERRACOTTA_BRICKS.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_GRAY_TERRACOTTA).hardnessAndResistance(1.25F, 4.2F)).setRegistryName("light_gray_terracotta_brick_stairs");
    public static Block CYAN_TERRACOTTA_BRICK_STAIRS = new StairsBlock(() -> CYAN_TERRACOTTA_BRICKS.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.CYAN_TERRACOTTA).hardnessAndResistance(1.25F, 4.2F)).setRegistryName("cyan_terracotta_brick_stairs");
    public static Block PURPLE_TERRACOTTA_BRICK_STAIRS = new StairsBlock(() -> PURPLE_TERRACOTTA_BRICKS.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.PURPLE_TERRACOTTA).hardnessAndResistance(1.25F, 4.2F)).setRegistryName("purple_terracotta_brick_stairs");
    public static Block BLUE_TERRACOTTA_BRICK_STAIRS = new StairsBlock(() -> BLUE_TERRACOTTA_BRICKS.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(1.25F, 4.2F)).setRegistryName("blue_terracotta_brick_stairs");
    public static Block BROWN_TERRACOTTA_BRICK_STAIRS = new StairsBlock(() -> BROWN_TERRACOTTA_BRICKS.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BROWN_TERRACOTTA).hardnessAndResistance(1.25F, 4.2F)).setRegistryName("brown_terracotta_brick_stairs");
    public static Block GREEN_TERRACOTTA_BRICK_STAIRS = new StairsBlock(() -> GREEN_TERRACOTTA_BRICKS.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(1.25F, 4.2F)).setRegistryName("green_terracotta_brick_stairs");
    public static Block RED_TERRACOTTA_BRICK_STAIRS = new StairsBlock(() -> RED_TERRACOTTA_BRICKS.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.RED_TERRACOTTA).hardnessAndResistance(1.25F, 4.2F)).setRegistryName("red_terracotta_brick_stairs");
    public static Block BLACK_TERRACOTTA_BRICK_STAIRS = new StairsBlock(() -> BLACK_TERRACOTTA_BRICKS.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK_TERRACOTTA).hardnessAndResistance(1.25F, 4.2F)).setRegistryName("black_terracotta_brick_stairs");
    public static Block OAK_BOARD_STAIRS = new StairsBlock(() -> OAK_BOARDS.getDefaultState(), Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("oak_board_stairs");
    public static Block SPRUCE_BOARD_STAIRS = new StairsBlock(() -> SPRUCE_BOARDS.getDefaultState(), Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("spruce_board_stairs");
    public static Block BIRCH_BOARD_STAIRS = new StairsBlock(() -> BIRCH_BOARDS.getDefaultState(), Block.Properties.create(Material.WOOD, MaterialColor.SAND).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("birch_board_stairs");
    public static Block JUNGLE_BOARD_STAIRS = new StairsBlock(() -> JUNGLE_BOARDS.getDefaultState(), Block.Properties.create(Material.WOOD, MaterialColor.DIRT).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("jungle_board_stairs");
    public static Block ACACIA_BOARD_STAIRS = new StairsBlock(() -> ACACIA_BOARDS.getDefaultState(), Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("acacia_board_stairs");
    public static Block DARK_OAK_BOARD_STAIRS = new StairsBlock(() -> DARK_OAK_BOARDS.getDefaultState(), Block.Properties.create(Material.WOOD, MaterialColor.DIRT).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("dark_oak_board_stairs");

    public static Block WISTERIA_GLASS_DOOR = new GlassDoorBlock(Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(3.0F).sound(SoundType.WOOD)).setRegistryName("wisteria_glass_door");
    public static Block WISTERIA_BOARDS = new Block(Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("wisteria_boards");

}
