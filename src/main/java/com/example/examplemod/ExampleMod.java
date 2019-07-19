package bailwillharr.siliconcraft;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = SiliconCraft.MODID, version = SiliconCraft.VERSION)
public class SiliconCraft
{
    public static final String MODID = "siliconcraft";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("Loading SiliconCraft...");
    }
}
