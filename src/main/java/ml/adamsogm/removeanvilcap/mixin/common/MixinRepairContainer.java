package ml.adamsogm.removeanvilcap.mixin.common;

import net.minecraft.inventory.container.RepairContainer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(RepairContainer.class)
public abstract class MixinRepairContainer {
	@ModifyConstant(method = "updateRepairOutput", constant = @Constant(intValue = 40, ordinal = 2))
	private int modifyInt(int input) {
		return Integer.MAX_VALUE;
	}
}
