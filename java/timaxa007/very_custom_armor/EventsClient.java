package timaxa007.very_custom_armor;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;

public class EventsClient {

	@SubscribeEvent
	public void onRenderArmomForPlayer(RenderPlayerEvent.SetArmorModel event) {
		if (event.stack == null || !(event.stack.getItem() instanceof ItemCustomArmorDummy)) return;
		ItemCustomArmorDummy ivcad = (ItemCustomArmorDummy)event.stack.getItem();
		ArmorCustomModel acm = ivcad.getModel(event.entityPlayer, event.stack, event.slot);
		if (acm != null) {
			acm.partHead.set(event.renderer.modelBipedMain.bipedHead);
			acm.partBody.set(event.renderer.modelBipedMain.bipedBody);
			acm.partRightArm.set(event.renderer.modelBipedMain.bipedRightArm);
			acm.partLeftArm.set(event.renderer.modelBipedMain.bipedLeftArm);
			acm.partRightLeg.set(event.renderer.modelBipedMain.bipedRightLeg);
			acm.partLeftLeg.set(event.renderer.modelBipedMain.bipedLeftLeg);
			acm.render(event.entityPlayer);
		}
	}

}
