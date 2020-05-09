package mod.equinox.buildbasics.block;

import mod.equinox.buildbasics.registry.BlockDataUtilities;
import mod.equinox.buildbasics.registry.BlockRegistry;
import mod.equinox.buildbasics.registry.ItemRegistry;
import net.minecraft.item.BlockItem;
import net.minecraft.util.IStringSerializable;

public enum EnumCandle implements IStringSerializable {
    WHITE("white_candle"),
    ORANGE("orange_candle"),
    MAGENTA("magenta_candle"),
    LIGHT_BLUE("light_blue_candle"),
    YELLOW("yellow_candle"),
    LIME("lime_candle"),
    PINK("pink_candle"),
    GRAY("gray_candle"),
    LIGHT_GRAY("light_gray_candle"),
    CYAN("cyan_candle"),
    PURPLE("purple_candle"),
    BLUE("blue_candle"),
    BROWN("brown_candle"),
    GREEN("green_candle"),
    RED("red_candle"),
    BLACK("black_candle"),
    NONE("none");

    private final String name;

    private EnumCandle(String name) {
        this.name = name;
    }

    public String toString() { return this.name; }

    public String getName() {
        return this.name;
    }
}