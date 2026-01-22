package xyz.hajsori.unhidden_advancements;

import net.minecraftforge.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class UnhiddenAdvancements {
    public UnhiddenAdvancements() {
        Constants.LOG.info("Unhidden Advancements Forge loaded");
        CommonClass.init();
    }
}
