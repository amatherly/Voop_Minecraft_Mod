package net.brodimath.voopmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods
{
    public static final FoodProperties VOOP = new FoodProperties.Builder().effect(() -> new MobEffectInstance(MobEffects.GLOWING, 200), 1.0f).alwaysEat().build();
}
