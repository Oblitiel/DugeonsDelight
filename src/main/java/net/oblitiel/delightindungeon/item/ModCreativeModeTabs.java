package net.oblitiel.delightindungeon.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.oblitiel.delightindungeon.DelightInDungeon;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DelightInDungeon.MOD_ID);

    public static final RegistryObject<CreativeModeTab> DELIGHT_IN_DUNGEON_TAB = CREATIVE_MODE_TABS
            .register("delight_in_dungeon",
                    () -> CreativeModeTab.builder()
                            .icon(() -> new ItemStack(ModItems.CREEPER_STEM.get()))
                            .title(Component.translatable("creativetab.delight_in_dungeon_tab"))
                            .displayItems((pParameters, pOutput) -> {
                                //Añado los objetos
                                pOutput.accept(ModItems.CREEPER_STEM.get());
                                pOutput.accept(ModItems.CREEPER_FRUIT.get());
                            })
                            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
