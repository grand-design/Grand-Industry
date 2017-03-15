package com.runic.gindu;

import com.runic.gindu.blocks.ModBlocks;
import com.runic.gindu.data.ModStrings;
import com.runic.gindu.items.ModItems;
import com.runic.gindu.proxies.CommonProxy;
import com.runic.gindu.recipes.ModRecipes;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * This file was born into existence by our overlord RunicEnergy on 14Mar2017 at 18:19.
 */

@Mod(modid = ModStrings.MODID, version = ModStrings.VERSION, name = ModStrings.MODNAME)
public class gindu {
    @Mod.Instance
    public static gindu instance;
    @SidedProxy(serverSide = ModStrings.SERVER_PROXY, clientSide = ModStrings.CLIENT_PROXY, modId = ModStrings.MODID)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ModItems.init(); //Initializes items
        ModBlocks.init(); //Initializes blocks
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        ModRecipes.init(); //Initializes recipes
    }


    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
