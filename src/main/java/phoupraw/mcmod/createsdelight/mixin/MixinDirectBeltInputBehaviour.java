package phoupraw.mcmod.createsdelight.mixin;

import com.simibubi.create.foundation.tileEntity.behaviour.belt.DirectBeltInputBehaviour;
import org.spongepowered.asm.mixin.Mixin;
import phoupraw.mcmod.createsdelight.api.DirectBeltInput;
@Mixin(value = DirectBeltInputBehaviour.class, remap = false)
public abstract class MixinDirectBeltInputBehaviour implements DirectBeltInput.InsertionHandler {

}
