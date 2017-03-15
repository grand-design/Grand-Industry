package com.runic.gindu.blocks;

import net.minecraft.block.material.Material;

/**
 * This file was born into existence by our overlord RunicEnergy on 14Mar2017 at 19:47.
 */

public class BlockOre extends BlockBase{

    public BlockOre(String name){
        super(Material.ROCK, name);//Sets all subclasses to inherit ROCK material
        setHardness(3f);
        setResistance(5f);
    }

}
