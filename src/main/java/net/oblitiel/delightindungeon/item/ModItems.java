package net.oblitiel.delightindungeon.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.oblitiel.delightindungeon.DelightInDungeon;

public class ModItems {
    //    No se que coño hace esto¿?
//    TODO: investigar
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DelightInDungeon.MOD_ID);

    //    Objetos del mod
    public static final RegistryObject<Item> CREEPER_STEM = ITEMS.register("creeper_stem",
            () -> new Item(new Item.Properties()));


    //    Tampoco se que coño hace esto
//    TODO: investigar
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
