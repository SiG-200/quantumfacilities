package cf.blazecode.mod.util;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Mod Powered by BlazeCode with BRForgers Team.
 */
public class TabHandler
{
    public static CreativeTabs quantumItemTab = new CreativeTabs("Quantum Facilities Items") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return ItemHandler.silicon_Ingot;
        }
    };

    public static CreativeTabs quantumBlockTab = new CreativeTabs("Quantum Facilities Blocks") {
        @Override
        public Item getTabIconItem() {
            return ItemHandler.silicon_Dust;
        }
    };
}
