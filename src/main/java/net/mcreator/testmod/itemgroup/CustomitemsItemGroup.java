
package net.mcreator.testmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.testmod.item.ChickenItem;
import net.mcreator.testmod.TestModModElements;

@TestModModElements.ModElement.Tag
public class CustomitemsItemGroup extends TestModModElements.ModElement {
	public CustomitemsItemGroup(TestModModElements instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabcustomitems") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ChickenItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
