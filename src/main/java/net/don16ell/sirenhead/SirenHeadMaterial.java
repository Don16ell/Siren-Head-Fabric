package net.don16ell.sirenhead;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class SirenHeadMaterial implements ToolMaterial {

    public static final SirenHeadMaterial INSTANCE = new SirenHeadMaterial();

    @Override
    public int getDurability() {
        return 3251;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 8.7F;
    }

    @Override
    public float getAttackDamage() {
        return 2.0F;
    }

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 12;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.STONE);
    }
}