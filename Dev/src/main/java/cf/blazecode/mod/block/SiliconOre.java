package cf.blazecode.mod.block;

import cf.blazecode.mod.lib.Block_Info;
import cf.blazecode.mod.util.TabHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Mod Powered by BlazeCode with BRForgers Team.
 */
public class SiliconOre extends Block
{
    public SiliconOre(Material material)
    {
        super(material);
        this.setCreativeTab(TabHandler.quantumBlockTab);
        this.setBlockName(Block_Info.SILICON_ORE);
        this.setHardness(3f);
    }
}
