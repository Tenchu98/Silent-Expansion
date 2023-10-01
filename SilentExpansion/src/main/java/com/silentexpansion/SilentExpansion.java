package com.silentexpansion;

import net.minecraftforge.fml.common.Mod;

@Mod("silentexpansion")
public class SilentExpansion {
    public SilentExpansion() {
        // Your mod initialization code goes here.

        // Register the Netherite Material
        NetheriteMaterial.registerMaterial();
    }

}
