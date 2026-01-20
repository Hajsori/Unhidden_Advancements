package xyz.hajsori.unhidden_advancements;

import java.util.HashMap;
import java.util.Map;

public class Translation {
    public static final Map<String, String> HIDDEN_ADVANCEMENT;

    static {
        HIDDEN_ADVANCEMENT = new HashMap<>();
        HIDDEN_ADVANCEMENT.put("en_us", "\n§7(Hidden Advancement)");
        HIDDEN_ADVANCEMENT.put("de_de", "\n§7(Ausgeblendeter Fortschritt)");
    }
}
