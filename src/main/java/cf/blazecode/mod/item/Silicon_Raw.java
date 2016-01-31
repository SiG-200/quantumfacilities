package cf.blazecode.mod.item;

import cf.blazecode.mod.lib.Item_Info;
import cf.blazecode.mod.util.TabHandler;
import net.minecraft.item.Item;

/**
 * This app is maintened by BlazeCode - Blazing The Code
 * Web: http://blazecode.cf
 *
 * @since 30/01/2016/01/2016
 * <p/>
 * Created By: SiG-200
 */
public class Silicon_Raw extends Item
{
    public Silicon_Raw()
    {
        this.setUnlocalizedName(Item_Info.ITEM_SILICON_RAW);
        this.setCreativeTab(TabHandler.quantumItemTab);
    }
}
