package grubma.aplushiemod.modid.item;

import grubma.aplushiemod.modid.APlushieMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SUSPICIOUS_SUBSTANCE = (registerItem("suspicious_substance", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(APlushieMod.MOD_ID,"suspicious_substance"))))));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(APlushieMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        APlushieMod.LOGGER.info("Registering Mod Items for " + APlushieMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(SUSPICIOUS_SUBSTANCE);
        });
    }
}
