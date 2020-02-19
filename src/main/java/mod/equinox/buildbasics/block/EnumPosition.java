package mod.equinox.buildbasics.block;

import net.minecraft.util.IStringSerializable;

public enum EnumPosition implements IStringSerializable {
    TOP("top"),
    UPPER("upper"),
    LOWER("lower"),
    BOTTOM("bottom");

    private final String name;

    private EnumPosition(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    public String getName() {
        return this.name;
    }
}