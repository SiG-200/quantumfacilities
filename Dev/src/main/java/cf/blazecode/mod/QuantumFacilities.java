package cf.blazecode.mod;

import cf.blazecode.mod.lib.Lib;
import cf.blazecode.mod.util.BlockHandler;
import cf.blazecode.mod.util.ItemHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Mod Powered by BlazeCode with BRForgers Team.
 */
@Mod(modid = Lib.MOD_ID, version = Lib.MOD_VERSION, name = Lib.MOD_NAME)
public class QuantumFacilities
{
    @Mod.Instance(Lib.MOD_ID)
    public static QuantumFacilities instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
        //Handlers, Events, Items, Blocks
        ItemHandler.loadItems();
        BlockHandler.loadBlocks();
    }

    @Mod.EventHandler
    public void initE(FMLInitializationEvent e)
    {
        //Recipes, Blocks, textures

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
        //I don't know
    }
}
