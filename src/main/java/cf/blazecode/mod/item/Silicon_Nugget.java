package cf.blazecode.mod.item;

import cf.blazecode.mod.lib.Item_Info;
import cf.blazecode.mod.lib.Lib;
import cf.blazecode.mod.util.TabHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

/**
 * Mod Powered by BlazeCode with BRForgers Team.
 */
public class Silicon_Nugget extends Item
{
    public Silicon_Nugget()
    {
        this.setCreativeTab(TabHandler.quantumItemTab);
        this.setUnlocalizedName(Item_Info.ITEM_SILICON_NUGGET);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(Lib.MOD_ID + ":" + getUnlocalizedName());
    }
}
