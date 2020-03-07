package timaxa007.very_custom_armor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemCustomArmor extends ItemCustomArmorDummy {

	public ItemCustomArmor(ItemArmor.ArmorMaterial armorMaterial, int armorType) {
		super(armorMaterial, armorType);
	}

	@SideOnly(Side.CLIENT)
	ArmorCustomModel acm0 = new ArmorCustomModelTest(0);

	@SideOnly(Side.CLIENT)
	ArmorCustomModel acm1 = new ArmorCustomModelTest(1);

	@SideOnly(Side.CLIENT)
	ArmorCustomModel acm2 = new ArmorCustomModelTest(2);

	@SideOnly(Side.CLIENT)
	ArmorCustomModel acm3 = new ArmorCustomModelTest(3);

	@SideOnly(Side.CLIENT)
	@Override
	public ArmorCustomModel getModel(EntityLivingBase entityPlayer, ItemStack stack, int slot) {
		switch (slot) {
		case 3:return acm0;
		case 2:return acm1;
		case 1:return acm2;
		case 0:return acm3;
		default:return null;
		}
	}

	@SideOnly(Side.CLIENT)
	@Override
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack is, int armorSlot) {
		return ProxyClient.model;
	}

}
