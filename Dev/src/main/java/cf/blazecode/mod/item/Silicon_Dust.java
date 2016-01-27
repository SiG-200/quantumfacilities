package cf.blazecode.mod.item;

import cf.blazecode.mod.lib.Item_Info;
import cf.blazecode.mod.util.TabHandler;
import net.minecraft.item.Item;

/**
 * Mod Powered by BlazeCode with BRForgers Team.
 */
public class Silicon_Dust extends Item
{
    public Silicon_Dust()
    {
        this.setCreativeTab(TabHandler.quantumItemTab);
        this.setUnlocalizedName(Item_Info.ITEM_SILICON_DUST);
    }
}
