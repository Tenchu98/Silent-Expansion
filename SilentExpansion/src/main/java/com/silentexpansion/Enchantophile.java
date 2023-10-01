import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemStat;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.silentchaos512.gear.api.stats.ItemStat;
import net.silentchaos512.gear.api.traits.TraitActionContext;
import net.silentchaos512.gear.traits.Trait;

@Override
public float onGetStat(ItemStack stack, ItemStat stat, float originalValue, TraitActionContext context) {
        if (stat == StatList.DAMAGE) {
        // Calculate the total enchantment levels
        int totalEnchantmentLevels = 0;
        for (Enchantment enchantment : EnchantmentHelper.getEnchantments(stack).keySet()) {
        totalEnchantmentLevels += EnchantmentHelper.getEnchantmentLevel(enchantment, stack);
        }

        // Modify the damage based on total levels
        float modifiedValue = originalValue + (totalEnchantmentLevels * 2.5F);
        return modifiedValue;
        }
        return super.onGetStat(stack, stat, originalValue, context);
        }

        ModTraits.registerTrait(new Enchantophile());

