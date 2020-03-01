package mod.equinox.buildbasics.registry;

import mod.equinox.buildbasics.BuildBasics;
import mod.equinox.buildbasics.block.ChainBlock;
import mod.equinox.buildbasics.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import mod.equinox.buildbasics.core.utils.RegistryUtils;


@Mod.EventBusSubscriber(modid = BuildBasics.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, BuildBasics.MODID);

    public static RegistryObject<Block> IRON_CHAIN = RegistryUtils.createBlock("iron_chain", () -> ModBlocks.IRON_CHAIN, ItemGroup.DECORATIONS);
    public static RegistryObject<Block> WALL_LANTERN = RegistryUtils.createBlock("wall_lantern", () -> ModBlocks.WALL_LANTERN, ItemGroup.DECORATIONS);

    public static RegistryObject<Block> POLISHED_STONE = RegistryUtils.createBlock("polished_stone", () -> ModBlocks.POLISHED_STONE, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> SMALL_STONE_BRICKS = RegistryUtils.createBlock("small_stone_bricks", () -> ModBlocks.SMALL_STONE_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> STONE_PILLAR = RegistryUtils.createBlock("stone_pillar", () -> ModBlocks.STONE_PILLAR, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> GRANITE_BRICKS = RegistryUtils.createBlock("granite_bricks", () -> ModBlocks.GRANITE_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> SMALL_GRANITE_BRICKS = RegistryUtils.createBlock("small_granite_bricks", () -> ModBlocks.SMALL_GRANITE_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> GRANITE_PILLAR = RegistryUtils.createBlock("granite_pillar", () -> ModBlocks.GRANITE_PILLAR, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> CHISELED_GRANITE = RegistryUtils.createBlock("chiseled_granite", () -> ModBlocks.CHISELED_GRANITE, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> DIORITE_BRICKS = RegistryUtils.createBlock("diorite_bricks", () -> ModBlocks.DIORITE_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> SMALL_DIORITE_BRICKS = RegistryUtils.createBlock("small_diorite_bricks", () -> ModBlocks.SMALL_DIORITE_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> DIORITE_PILLAR = RegistryUtils.createBlock("diorite_pillar", () -> ModBlocks.DIORITE_PILLAR, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> CHISELED_DIORITE = RegistryUtils.createBlock("chiseled_diorite", () -> ModBlocks.CHISELED_DIORITE, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> ANDESITE_BRICKS = RegistryUtils.createBlock("andesite_bricks", () -> ModBlocks.ANDESITE_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> SMALL_ANDESITE_BRICKS = RegistryUtils.createBlock("small_andesite_bricks", () -> ModBlocks.SMALL_ANDESITE_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> ANDESITE_PILLAR = RegistryUtils.createBlock("andesite_pillar", () -> ModBlocks.ANDESITE_PILLAR, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> CHISELED_ANDESITE = RegistryUtils.createBlock("chiseled_andesite", () -> ModBlocks.CHISELED_ANDESITE, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> COBBLESTONE_BRICKS = RegistryUtils.createBlock("cobblestone_bricks", () -> ModBlocks.COBBLESTONE_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> MOSSY_COBBLESTONE_BRICKS = RegistryUtils.createBlock("mossy_cobblestone_bricks", () -> ModBlocks.MOSSY_COBBLESTONE_BRICKS, ItemGroup.BUILDING_BLOCKS);
}
