package xyz.hajsori.unhidden_advancements.mixin;

import net.minecraft.advancements.DisplayInfo;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import xyz.hajsori.unhidden_advancements.Translation;

@Mixin(DisplayInfo.class)
public class DisplayInfoMixin {
    @Final
    @Shadow private Component description;
    @Final
    @Shadow private boolean hidden;

    @Inject(method = "isHidden", at = @At("RETURN"), cancellable = true)
    public void isHidden(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }

    @Inject(method = "getDescription", at = @At("RETURN"), cancellable = true)
    public void getDescription(CallbackInfoReturnable<Component> cir) {
        if (
                hidden &&
                        !description.toString().contains("advancements.create.")
        ) {
            String languageCode = Minecraft.getInstance().getLanguageManager().getSelected();
            String advancementText = Translation.HIDDEN_ADVANCEMENT.get(languageCode);
            if (advancementText == null) {
                advancementText = Translation.HIDDEN_ADVANCEMENT.get("en_us");
            }

            cir.setReturnValue(description.copy().append(Component.literal(advancementText)));
        }
    }
}
