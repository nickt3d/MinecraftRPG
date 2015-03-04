package ca.robotnick.rpgMod;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

	@Mod(modid = rpgCraft.MODID, version = rpgCraft.VERSION)
	public class rpgCraft {

		public static final String MODID = "rpgMod";
		public static final String VERSION = "1.0";
		
	    public static Item soul;

	    @EventHandler
	    public static final void preInit(FMLInitializationEvent event) {
	        soul = new ItemSoul();
	        GameRegistry.registerItem(soul, "Soul");
	    }
	    
	    @EventHandler
	    public static final void Init(FMLInitializationEvent event) {
	    	
	    }
}
