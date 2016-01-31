package cf.blazecode.mod.util;

import cf.blazecode.mod.item.Silicon_Dust;
import cf.blazecode.mod.item.Silicon_Ingot;
import cf.blazecode.mod.item.Silicon_Nugget;
import cf.blazecode.mod.item.Silicon_Raw;
import cf.blazecode.mod.lib.Item_Info;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * Mod Powered by BlazeCode with BRForgers Team.
 */
public class ItemHandler
{
    public static Item silicon_Ingot;
    public static Item silicon_Dust;
    public static Item silicon_Nugget;
    public static Item silicon_Raw;

    public static void loadItems()
    {
        silicon_Ingot = new Silicon_Ingot();
        silicon_Dust = new Silicon_Dust();
        silicon_Nugget = new Silicon_Nugget();
        silicon_Raw = new Silicon_Raw();
    }

    public static void registerItems()
    {
        GameRegistry.registerItem(silicon_Dust, Item_Info.ITEM_SILICON_DUST);
        GameRegistry.registerItem(silicon_Ingot, Item_Info.ITEM_SILICON_INGOT);
        GameRegistry.registerItem(silicon_Nugget, Item_Info.ITEM_SILICON_NUGGET);
        GameRegistry.registerItem(silicon_Raw, Item_Info.ITEM_SILICON_RAW);
    }
}
