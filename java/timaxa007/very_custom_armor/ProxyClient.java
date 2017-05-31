package timaxa007.very_custom_armor;

import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraftforge.common.MinecraftForge;

public class ProxyClient extends ProxyServer {

	public void preInit() {
		MinecraftForge.EVENT_BUS.register(new EventsClient());
	}

}
