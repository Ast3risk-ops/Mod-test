
package net.mcreator.testmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.testmod.itemgroup.CustomitemsItemGroup;
import net.mcreator.testmod.TestModModElements;

@TestModModElements.ModElement.Tag
public class Kirby_OreIngotItem extends TestModModElements.ModElement {
	@ObjectHolder("test_mod:kirby_ore_ingot")
	public static final Item block = null;
	public Kirby_OreIngotItem(TestModModElements instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(CustomitemsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("kirby_ore_ingot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
