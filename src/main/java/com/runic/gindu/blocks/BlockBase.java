package com.runic.gindu.blocks;

import com.runic.gindu.gindu;
import com.runic.gindu.ginduTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

/**
 * This file was born into existence by our overlord RunicEnergy on 14Mar2017 at 19:47.
 */
public class BlockBase extends Block{
    protected String name;

    public BlockBase(Material material, String name){
        super(material);
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ginduTab.creativeTab);
    }

    public void registerItemModel(ItemBlock itemBlock){
        gindu.proxy.registerItemRenderer(itemBlock, 0, name);
    }

}
