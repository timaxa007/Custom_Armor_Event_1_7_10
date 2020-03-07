package timaxa007.very_custom_armor;

import net.minecraft.client.model.ModelBiped;
import net.minecraftforge.common.MinecraftForge;

public class ProxyClient extends ProxyServer {

	static final ModelBiped model = new ModelBiped();
	static {model.bipedHead.showModel = 
			model.bipedHeadwear.showModel = 
			model.bipedBody.showModel = 
			model.bipedRightArm.showModel = 
			model.bipedLeftArm.showModel = 
			model.bipedRightLeg.showModel = 
			model.bipedLeftLeg.showModel = false;
	}

	public void preInit() {
		MinecraftForge.EVENT_BUS.register(new EventsClient());
	}

}
