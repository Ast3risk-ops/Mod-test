package net.mcreator.testmod.procedures;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.testmod.TestModModElements;
import net.mcreator.testmod.TestModMod;

import java.util.Map;

@TestModModElements.ModElement.Tag
public class XpOnKeyPressedProcedure extends TestModModElements.ModElement {
	public XpOnKeyPressedProcedure(TestModModElements instance) {
		super(instance, 13);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TestModMod.LOGGER.warn("Failed to load dependency entity for procedure XpOnKeyPressed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).giveExperiencePoints((int) 99999999);
	}
}
