package com.runic.gindu.items;

import com.runic.gindu.data.ItemStrings;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * This file was born into existence by our overlord RunicEnergy on 14Mar2017 at 19:47.
 */
public class ModItems {
    //Declare Ingots
    public static ItemBase ingotCopper;
    public static ItemBase ingotTin;
    public static ItemBase ingotSilver;
    public static ItemBase ingotAluminum;
    public static ItemBase ingotLead;
    public static ItemBase ingotBrass;
    public static ItemBase ingotBronze;
    public static ItemBase ingotSteel;

    public static void init(){
        //Register Ingots
        ingotCopper = register(new ItemBase(ItemStrings.nIngotCopper));
        ingotTin = register(new ItemBase(ItemStrings.nIngotTin));
        ingotSilver = register(new ItemBase(ItemStrings.nIngotSilver));
        ingotAluminum = register(new ItemBase(ItemStrings.nIngotAluminum));
        ingotLead = register(new ItemBase(ItemStrings.nIngotLead));
        ingotBrass = register(new ItemBase(ItemStrings.nIngotBrass));
        ingotBronze = register(new ItemBase(ItemStrings.nIngotBronze));
        ingotSteel = register(new ItemBase(ItemStrings.nIngotSteel));
    }

    private static <T extends Item> T register(T item){
        GameRegistry.register(item);

        if(item instanceof ItemBase){
            ((ItemBase)item).registerItemModel();
        }

        return item;
    }
}
