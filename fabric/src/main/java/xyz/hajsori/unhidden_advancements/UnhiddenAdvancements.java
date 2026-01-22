package xyz.hajsori.unhidden_advancements;

import net.fabricmc.api.ModInitializer;

public class UnhiddenAdvancements implements ModInitializer {
    @Override
    public void onInitialize() {
        Constants.LOG.info("Unhidden Advancements Fabric loaded");
        CommonClass.init();
    }
}
