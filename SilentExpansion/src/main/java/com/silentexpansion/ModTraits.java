package com.silentexpansion;

import com.silentexpansion.traits.EnchantophileTrait;
import net.silentchaos512.gear.api.traits.Trait;
import net.silentchaos512.gear.util.Const;

public class ModTraits {
    public static final Trait ENCHANTOPHILE = new EnchantophileTrait();

    public static void registerTraits() {
        // Register your traits here
        Const.Traits.material(VanillaMaterials.IRON, ENCHANTOPHILE);
    }
}

