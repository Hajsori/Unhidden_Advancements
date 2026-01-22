package xyz.hajsori.unhidden_advancements;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class UnhiddenAdvancements {
    public UnhiddenAdvancements(IEventBus eventBus) {
        Constants.LOG.info("Unhidden Advancements NeoForge loaded");
        CommonClass.init();
    }
}
