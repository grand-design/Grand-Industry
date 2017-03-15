package com.runic.gindu.blocks;

import com.runic.gindu.data.BlockStrings;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * This file was born into existence by our overlord RunicEnergy on 14Mar2017 at 19:47.
 */
public class ModBlocks {
    //Declare Ores
    public static BlockOre oreCopper;
    public static BlockOre oreTin;
    public static BlockOre oreAluminum;
    public static BlockOre oreLead;
    public static BlockOre oreSilver;
    public static BlockOre oreEViridian;
    public static BlockOre oreECerulean;
    //Declare Ingot Blocks
    public static BlockIngotBlock blockCopper;
    public static BlockIngotBlock blockTin;
    public static BlockIngotBlock blockSilver;
    public static BlockIngotBlock blockAluminum;
    public static BlockIngotBlock blockLead;
    public static BlockIngotBlock blockBrass;
    public static BlockIngotBlock blockBronze;
    public static BlockIngotBlock blockSteel;

    public static void init(){
        //Register Ores
        oreCopper = register(new BlockOre(BlockStrings.nOreCopper));
        oreTin = register(new BlockOre(BlockStrings.nOreTin));
        oreAluminum = register(new BlockOre(BlockStrings.nOreAluminum));
        oreLead = register(new BlockOre(BlockStrings.nOreLead));
        oreSilver = register(new BlockOre(BlockStrings.nOreSilver));
        oreEViridian = register(new BlockOre(BlockStrings.nOreEViridian));
        oreECerulean = register(new BlockOre(BlockStrings.nOreECerulean));
        //Register Ingot Blocks
        blockCopper = register(new BlockIngotBlock(BlockStrings.nBlockCopper));
        blockTin = register(new BlockIngotBlock(BlockStrings.nBlockTin));
        blockSilver = register(new BlockIngotBlock(BlockStrings.nBlockSilver));
        blockAluminum = register(new BlockIngotBlock(BlockStrings.nBlockAluminum));
        blockLead = register(new BlockIngotBlock(BlockStrings.nBlockLead));
        blockBrass = register(new BlockIngotBlock(BlockStrings.nBlockBrass));
        blockBronze = register(new BlockIngotBlock(BlockStrings.nBlockBronze));
        blockSteel = register(new BlockIngotBlock(BlockStrings.nBlockSteel));
    }

    private static <T extends Block> T register(T block, ItemBlock itemBlock){
        GameRegistry.register(block);
        GameRegistry.register(itemBlock);

        if(block instanceof BlockBase){
            ((BlockBase)block).registerItemModel(itemBlock);
        }

        return block;
    }

    private static <T extends Block> T register(T block) {
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        return register(block, itemBlock);
    }
}
