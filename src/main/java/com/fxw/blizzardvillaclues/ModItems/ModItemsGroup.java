package com.fxw.blizzardvillaclues.ModItems;

import com.fxw.blizzardvillaclues.BlizzardVillaClues;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemsGroup {
    public static final ResourceKey<CreativeModeTab> CUSTOM_ITEM_GROUP_KEY = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), ResourceLocation.fromNamespaceAndPath(BlizzardVillaClues.MOD_ID, "item_group"));
    public static final CreativeModeTab CUSTOM_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.BLOOD_KNIFE))
            .title(Component.translatable("itemGroup.blizzard-villa-clues"))
            .build();

    public static void initialize() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, CUSTOM_ITEM_GROUP_KEY, CUSTOM_ITEM_GROUP);

        ItemGroupEvents.modifyEntriesEvent(CUSTOM_ITEM_GROUP_KEY).register(itemGroup -> {
            itemGroup.accept(ModItems.BLOOD_KNIFE);
            itemGroup.accept(ModItems.BILL);
            itemGroup.accept(ModItems.KEY1);
            itemGroup.accept(ModItems.KEY2);
            itemGroup.accept(ModItems.WOMEN_CLOTHES);
            itemGroup.accept(ModItems.SUITCASE);
            itemGroup.accept(ModItems.WILL1);
            itemGroup.accept(ModItems.RAG);
            itemGroup.accept(ModItems.DRUG_BOTTLE);
            itemGroup.accept(ModItems.WILL2);
            itemGroup.accept(ModItems.WILL3);
            itemGroup.accept(ModItems.CHICKEN);
            itemGroup.accept(ModItems.BEEF);
            itemGroup.accept(ModItems.BLOOD_COAT);
            itemGroup.accept(ModItems.BAG);
            itemGroup.accept(ModItems.POKE);
            itemGroup.accept(ModItems.PLASTIC_BAG);
            itemGroup.accept(ModItems.ICE_BAG);
            itemGroup.accept(ModItems.HAIRDRYER);
            itemGroup.accept(ModItems.BROKEN_RECORDER);
            itemGroup.accept(ModItems.BLOOD_AXE);
            itemGroup.accept(ModItems.AXE);
            itemGroup.accept(ModItems.UNLOCKER);
            itemGroup.accept(ModItems.ANTIDOTE);
            itemGroup.accept(ModItems.RED_BAG);
            itemGroup.accept(ModItems.PLASTIC_BAG_WITH_BEEF);
            itemGroup.accept(ModItems.PLASTIC_BAG_WITH_BLOOD);
            itemGroup.accept(ModItems.LEMONADE);
            itemGroup.accept(ModItems.LEMONADE_POISONED);
            itemGroup.accept(ModItems.RAIN_COAT);
            itemGroup.accept(ModItems.BUSINESS_CARD);
            itemGroup.accept(ModItems.WATCH);
            itemGroup.accept(ModItems.PILLOW);
            itemGroup.accept(ModItems.JUICE);
            itemGroup.accept(ModItems.DRUG_X);
            itemGroup.accept(ModItems.CHEMICAL_EQUIPMENT);
            itemGroup.accept(ModItems.SMALL_BOTTLE);
            itemGroup.accept(ModItems.IOU);
            itemGroup.accept(ModItems.NOTE);
            itemGroup.accept(ModItems.LETTER);
            itemGroup.accept(ModItems.WATERING_CAN);
            itemGroup.accept(ModItems.PHOTO);
            itemGroup.accept(ModItems.BLOOD_COAT_2);
            itemGroup.accept(ModItems.NOTE2);
            itemGroup.accept(ModItems.SLEEPING_PILL_PLATE);
            itemGroup.accept(ModItems.PLATE);
            itemGroup.accept(ModItems.CROTON);
            itemGroup.accept(ModItems.WOOD_CHIP);
            itemGroup.accept(ModItems.BLOOD);
            itemGroup.accept(ModItems.MAP);
            itemGroup.accept(ModItems.ROPE);
            itemGroup.accept(ModItems.ROPE_BROKEN);
            itemGroup.accept(ModItems.WINE);
            itemGroup.accept(ModItems.DRUG_X_OLD);
            itemGroup.accept(ModItems.DRUG_X_DROP);
            itemGroup.accept(ModItems.BLOWGUN);
            itemGroup.accept(ModItems.POISONED_NEEDLE);
            itemGroup.accept(ModItems.NOTE3);
        });
    }
}
