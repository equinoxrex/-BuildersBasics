package mod.equinox.buildbasics.block;

import net.minecraft.util.IStringSerializable;

public enum EnumSide implements IStringSerializable {
    LEFT("left"),
    RIGHT("right");

    private final String name;

    private EnumSide(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}