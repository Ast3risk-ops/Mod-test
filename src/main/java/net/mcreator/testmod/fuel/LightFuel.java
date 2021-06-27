
package net.mcreator.testmod.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.testmod.item.AArmorItem;
import net.mcreator.testmod.TestModModElements;

@TestModModElements.ModElement.Tag
public class LightFuel extends TestModModElements.ModElement {
	public LightFuel(TestModModElements instance) {
		super(instance, 8);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(AArmorItem.body, (int) (1)).getItem())
			event.setBurnTime(1807);
	}
}
