package net.brodimath.voopmod.item;

import net.brodimath.voopmod.Voop;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs
{

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Voop.MODID);

    public static final RegistryObject<CreativeModeTab> VOOP_TAB = CREATIVE_MODE_TABS.register("voopmod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.VOOP.get()))
                    .title(Component.translatable("creativetab.voopmod_tab"))
                    .displayItems((pParameters, pOutput) ->
                    {
                        pOutput.accept(ModItems.VOOP.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
