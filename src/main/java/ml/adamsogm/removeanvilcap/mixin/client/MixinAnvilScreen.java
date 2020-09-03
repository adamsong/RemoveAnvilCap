package ml.adamsogm.removeanvilcap.mixin.client;

import net.minecraft.client.gui.screen.inventory.AnvilScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(AnvilScreen.class)
public abstract class MixinAnvilScreen {
	@ModifyConstant(method = "func_230451_b_", constant = @Constant(intValue = 40, ordinal = 0))
	private int modifyInt(int input) {
		return Integer.MAX_VALUE;
	}
}
