package com.runic.gindu.recipes;

import com.runic.gindu.blocks.ModBlocks;
import com.runic.gindu.items.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * This file was born into existence by our overlord RunicEnergy on 14Mar2017 at 21:49.
 */
public class ModRecipes {

    public static void init(){
        //Furnace Recipes
        GameRegistry.addSmelting(ModBlocks.oreSilver, new ItemStack(ModItems.ingotSilver), 0.7f);
        GameRegistry.addSmelting(ModBlocks.oreLead, new ItemStack(ModItems.ingotLead), 0.7f);
        GameRegistry.addSmelting(ModBlocks.oreAluminum, new ItemStack(ModItems.ingotAluminum), 0.7f);
        GameRegistry.addSmelting(ModBlocks.oreTin, new ItemStack(ModItems.ingotTin), 0.7f);
        GameRegistry.addSmelting(ModBlocks.oreCopper, new ItemStack(ModItems.ingotCopper), 0.7f);
        //Ingot Block Recipes
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockCopper), "XXX","XXX","XXX",'X',ModItems.ingotCopper);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockTin), "XXX","XXX","XXX",'X',ModItems.ingotTin);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockSilver), "XXX","XXX","XXX",'X',ModItems.ingotSilver);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockAluminum), "XXX","XXX","XXX",'X',ModItems.ingotAluminum);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockBrass), "XXX","XXX","XXX",'X',ModItems.ingotBrass);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockBronze), "XXX","XXX","XXX",'X',ModItems.ingotBronze);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockLead), "XXX","XXX","XXX",'X',ModItems.ingotLead);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockSteel), "XXX","XXX","XXX",'X',ModItems.ingotSteel);
        //Ingot from Ingot Block Recipes
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotCopper, 9), ModBlocks.blockCopper);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotAluminum, 9), ModBlocks.blockAluminum);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotLead, 9), ModBlocks.blockLead);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotSilver, 9), ModBlocks.blockSilver);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotTin, 9), ModBlocks.blockTin);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotBrass, 9), ModBlocks.blockBrass);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotBronze, 9), ModBlocks.blockBronze);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotSteel, 9), ModBlocks.blockSteel);

    }
}
