package com.runic.gindu;

import com.runic.gindu.data.ModStrings;
import com.runic.gindu.items.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * This file was born into existence by our overlord RunicEnergy on 14Mar2017 at 19:52.
 */
public class ginduTab extends CreativeTabs{

    public static final ginduTab creativeTab = new ginduTab(); //Provides instance of Creative Tab for reference in other classes

    public ginduTab(){
        super(ModStrings.MODID); //Gets Mod ID for Creative Tab id
    }

    @Override
    public Item getTabIconItem(){
        return ModItems.ingotCopper; //Sets icon of Creative Tab
    }
}
