package com.memzjjy.moregems.tabs;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class MoregemsItemTabs {
    public static final CreativeTabs MOREGEMS_TABS = new CreativeTabs("moregems_tabs") {
        @Override
        public ItemStack getTabIconItem() {
            return null;
        }
        public ItemStack createIcon() {
            return new ItemStack(Items.DIAMOND);
        }
    };
}

