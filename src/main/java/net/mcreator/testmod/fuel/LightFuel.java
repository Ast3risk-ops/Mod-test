
package net.mcreator.testmod.fuel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.testmod.block.KirbyBlock;

@Mod.EventBusSubscriber
public class LightFuel {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(KirbyBlock.block, (int) (1)).getItem())
			event.setBurnTime(2002);
	}
}
