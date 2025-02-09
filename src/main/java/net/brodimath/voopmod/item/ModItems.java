package net.brodimath.voopmod.item;

import net.brodimath.voopmod.Voop;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Voop.MODID);
    public static final RegistryObject<Item> VOOP = ITEMS.register("voop", () -> new Item(new Item.Properties().food(ModFoods.VOOP)));
//    public static final RegistryObject<Item> VOOP = ITEMS.register("voopmod", () -> new Item(new Item.Properties().food(ModFoods.VOOP)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
