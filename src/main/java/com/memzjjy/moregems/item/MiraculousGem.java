package com.memzjjy.moregems.item;


import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static com.memzjjy.moregems.tabs.MoregemsItemTabs.MOREGEMS_TABS;

@Mod.EventBusSubscriber(modid = "moregems")
public final class MiraculousGem {
    public static Item miraculousGem;
    @SubscribeEvent
    public  static void registerItem(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                miraculousGem = new Item()
                        .setRegistryName("moregems:miraculous_gem")
                        .setCreativeTab(MOREGEMS_TABS)
        );
    }
}