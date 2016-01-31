package cf.blazecode.mod.block;

import cf.blazecode.mod.lib.Block_Info;
import cf.blazecode.mod.lib.Lib;
import cf.blazecode.mod.util.TabHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

/**
 * Mod Powered by BlazeCode with BRForgers Team.
 */
public class SiliconBlock extends Block
{
    public IIcon icon;

    public SiliconBlock(Material material)
    {
        super(material);
        this.setBlockName(Block_Info.SILICON_BLOCK);
        this.setCreativeTab(TabHandler.quantumBlockTab);
        this.setHardness(3f);
    }

    @Override
    public void registerBlockIcons(IIconRegister iIconRegister)
    {
        icon = iIconRegister.registerIcon(Lib.MOD_ID + ":siliconOre");
    }

    @Override
    public IIcon getIcon(int Side, int Meta)
    {
        return icon;
    }

}
