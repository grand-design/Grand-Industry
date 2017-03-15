package com.runic.gindu.blocks;

import net.minecraft.block.material.Material;

/**
 * This file was born into existence by our overlord RunicEnergy on 14Mar2017 at 22:09.
 */

public class BlockIngotBlock extends BlockBase{

    public BlockIngotBlock(String name){
        super(Material.IRON, name);
        setHardness(6f);
        setResistance(10f);
    }

}
