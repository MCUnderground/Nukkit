package cn.nukkit.block;

import cn.nukkit.item.Tool;
import cn.nukkit.utils.BlockColor;

/**
 * Created on 2015/11/24 by xtypr.
 * Package cn.nukkit.block in project Nukkit .
 */
public class HardenedClay extends Solid {
    public HardenedClay() {
        this(0);
    }

    public HardenedClay(int meta) {
        super(0);
    }

    @Override
    public int getId() {
        return HARDENED_CLAY;
    }

    @Override
    public String getName() {
        return "Hardened Clay";
    }

    @Override
    public int getToolType() {
        return Tool.TYPE_PICKAXE;
    }

    @Override
    public double getHardness() {
        return 1.25;
    }

    @Override
    public double getResistance() {
        return 7;
    }

    @Override
    public BlockColor getColor() {
        return BlockColor.ADOBE_BLOCK_COLOR;
    }
}
