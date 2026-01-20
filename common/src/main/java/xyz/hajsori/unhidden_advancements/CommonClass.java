package xyz.hajsori.unhidden_advancements;

import xyz.hajsori.unhidden_advancements.platform.Services;

public class CommonClass {
    public static void init() {
        if (Services.PLATFORM.isModLoaded("unhidden_advancements")) {
            Constants.LOG.info("Hello to unhidden_advancements");
        }
    }
}
