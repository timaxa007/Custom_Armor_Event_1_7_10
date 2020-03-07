package timaxa007.very_custom_armor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public abstract class ItemCustomArmorDummy extends ItemArmor {

	public ItemCustomArmorDummy(ItemArmor.ArmorMaterial armorMaterial, int armorType) {
		super(armorMaterial, 0, armorType);
	}

	@SideOnly(Side.CLIENT)
	public ArmorCustomModel getModel(EntityLivingBase entityPlayer, ItemStack stack, int slot) {
		return null;
	}

}
