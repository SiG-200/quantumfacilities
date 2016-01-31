package cf.blazecode.mod.util;

import cf.blazecode.mod.block.SiliconBlock;
import cf.blazecode.mod.block.SiliconOre;
import cf.blazecode.mod.lib.Block_Info;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Mod Powered by BlazeCode with BRForgers Team.
 */
public class BlockHandler
{
    public static Block siliconOre;
    public static Block siliconBlock;


    public static void loadBlocks()
    {
        siliconOre = new SiliconOre(Material.rock);
        siliconBlock = new SiliconBlock(Material.rock);
    }

    public static void registerBlocks()
    {
        GameRegistry.registerBlock(siliconOre, Block_Info.SILICON_ORE);
        GameRegistry.registerBlock(siliconBlock, Block_Info.SILICON_BLOCK);
    }


}
