package com.silentexpansion.material;

import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.silentchaos512.gear.material.IMaterialInstance;
import net.silentchaos512.gear.material.MaterialInstance;
import net.silentchaos512.gear.material.MaterialManager;
import net.silentchaos512.gear.traits.TraitInstance;

public final class NetheriteMaterial {
    private NetheriteMaterial() {}

    public static void registerMaterial() {
        IMaterialInstance netheriteMaterial = MaterialManager.get(SilentExpansion.getId("netherite"));
        netheriteMaterial.definitions()
                .setCraftable(true)
                .setRepairIngredient(Ingredient.fromItems(Items.NETHERITE_INGOT))
                .setMiningSpeed(9.0f)
                .setMiningLevel(4)
                .setTraits(TraitInstance.of(ModTraits.ENCHANTOPHILE, 1)); // Apply the Enchantophile trait
    }
}

