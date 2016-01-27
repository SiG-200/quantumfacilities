package cf.blazecode.mod.block;

import cf.blazecode.mod.lib.Block_Info;
import cf.blazecode.mod.util.TabHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Mod Powered by BlazeCode with BRForgers Team.
 */
public class SiliconBlock extends Block
{
    public SiliconBlock(Material material)
    {
        super(material);
        this.setBlockName(Block_Info.SILICON_BLOCK);
        this.setCreativeTab(TabHandler.quantumBlockTab);
        this.setHardness(3f);
    }

}
