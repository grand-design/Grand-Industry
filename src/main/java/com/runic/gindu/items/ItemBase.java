package com.runic.gindu.items;

import com.runic.gindu.gindu;
import com.runic.gindu.ginduTab;
import net.minecraft.item.Item;

/**
 * This file was born into existence by our overlord RunicEnergy on 14Mar2017 at 19:47.
 */
public class ItemBase extends Item{

    protected String name;

    public ItemBase(String name){
        this.name = name;//Requires subclasses to super item ID
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ginduTab.creativeTab);
    }

    public void registerItemModel(){
        gindu.proxy.registerItemRenderer(this, 0, name);//Feeds stuff to ClientProxy for texture loading
    }

}
