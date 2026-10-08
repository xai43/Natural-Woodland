package net.takhr.naturalwoodland;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.takhr.naturalwoodland.content.register.ModItems;

public class FabricCreativeModeTab {
    ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS)
            .register((itemGroup) -> itemGroup.accept(ModItems.SUSPICIOUS_SUBSTANCE));
}
