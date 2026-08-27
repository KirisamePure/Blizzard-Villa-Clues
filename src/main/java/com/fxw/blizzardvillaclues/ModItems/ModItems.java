package com.fxw.blizzardvillaclues.ModItems;

import com.fxw.blizzardvillaclues.BlizzardVillaClues;
import com.fxw.blizzardvillaclues.ModItems.CustomTooltipItems.CustomTooltipItems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {
    public static final Item BLOOD_KNIFE = register("blood_knife",
            settings -> new CustomTooltipItems(settings, "itemTooltip1.blizzard-villa-clues.blood_knife", "itemTooltip2.blizzard-villa-clues.blood_knife"),
            new Item.Properties());
    public static final Item BILL = register("bill",
            settings -> new CustomTooltipItems(settings, "itemTooltip1.blizzard-villa-clues.bill", "itemTooltip2.blizzard-villa-clues.bill"),
            new Item.Properties());
    public static final Item KEY1 = register("key1",
            settings -> new CustomTooltipItems(
                    settings, "itemTooltip1.blizzard-villa-clues.key1", "itemTooltip2.blizzard-villa-clues.key1"),
            new Item.Properties());
    public static final Item KEY2 = register("key2",
            settings -> new CustomTooltipItems(
                    settings, "itemTooltip1.blizzard-villa-clues.key2", "itemTooltip2.blizzard-villa-clues.key2"),
            new Item.Properties());
    public static final Item WOMEN_CLOTHES = register("women_clothes",
            settings -> new CustomTooltipItems(
                    settings, "itemTooltip1.blizzard-villa-clues.women_clothes", "itemTooltip2.blizzard-villa-clues.women_clothes"),
            new Item.Properties());
    public static final Item SUITCASE = register("suitcase",
            settings -> new CustomTooltipItems(
                    settings, "itemTooltip1.blizzard-villa-clues.suitcase", "itemTooltip2.blizzard-villa-clues.suitcase"),
            new Item.Properties());
    public static final Item WILL1 = register("will1",
            settings -> new CustomTooltipItems(
                    settings, "itemTooltip1.blizzard-villa-clues.will1", "itemTooltip2.blizzard-villa-clues.will1"),
            new Item.Properties());
    public static final Item RAG = register("rag",
            settings -> new CustomTooltipItems(
                    settings, "itemTooltip1.blizzard-villa-clues.rag", "itemTooltip2.blizzard-villa-clues.rag"),
            new Item.Properties());
    public static final Item DRUG_BOTTLE = register("drug_bottle",
            settings -> new CustomTooltipItems(
                    settings, "itemTooltip1.blizzard-villa-clues.drug_bottle", "itemTooltip2.blizzard-villa-clues.drug_bottle"),
            new Item.Properties());
    public static final Item WILL2 = register("will2",
            settings -> new CustomTooltipItems(
                    settings, "itemTooltip1.blizzard-villa-clues.will2", "itemTooltip2.blizzard-villa-clues.will2"),
            new Item.Properties());
    public static final Item WILL3 = register("will3",
            settings -> new CustomTooltipItems(
                    settings, "itemTooltip1.blizzard-villa-clues.will3", "itemTooltip2.blizzard-villa-clues.will3"),
            new Item.Properties());
    public static final Item CHICKEN = register("chicken",
            settings -> new CustomTooltipItems(
                    settings, "itemTooltip1.blizzard-villa-clues.chicken", "itemTooltip2.blizzard-villa-clues.chicken"),
            new Item.Properties());
    public static final Item BEEF = register("beef",
            settings -> new CustomTooltipItems(
                    settings, "itemTooltip1.blizzard-villa-clues.beef", "itemTooltip2.blizzard-villa-clues.beef"),
            new Item.Properties());
    public static final Item BLOOD_COAT = register("blood_coat",
            settings -> new CustomTooltipItems(
                    settings, "itemTooltip1.blizzard-villa-clues.blood_coat", "itemTooltip2.blizzard-villa-clues.blood_coat"),
            new Item.Properties());
    public static final Item BAG = register("bag",
            settings -> new CustomTooltipItems(
                    settings, "itemTooltip1.blizzard-villa-clues.bag", "itemTooltip2.blizzard-villa-clues.bag"),
            new Item.Properties());
    public static final Item POKE = register("poke",
            settings -> new CustomTooltipItems(
                    settings, "itemTooltip1.blizzard-villa-clues.poke", "itemTooltip2.blizzard-villa-clues.poke"),
            new Item.Properties());
    public static final Item PLASTIC_BAG = register("plastic_bag",
            settings -> new CustomTooltipItems(
                    settings, "itemTooltip1.blizzard-villa-clues.plastic_bag", "itemTooltip2.blizzard-villa-clues.plastic_bag"),
            new Item.Properties());
    public static final Item ICE_BAG = register("ice_bag",
            settings -> new CustomTooltipItems(
                    settings, "itemTooltip1.blizzard-villa-clues.ice_bag", "itemTooltip2.blizzard-villa-clues.ice_bag"),
            new Item.Properties());
    public static final Item HAIRDRYER = register("hairdryer",
            settings -> new CustomTooltipItems(
                    settings, "itemTooltip1.blizzard-villa-clues.hairdryer", "itemTooltip2.blizzard-villa-clues.hairdryer"),
            new Item.Properties());
    public static final Item BROKEN_RECORDER = register("broken_recorder",
            settings -> new CustomTooltipItems(
                    settings, "itemTooltip1.blizzard-villa-clues.broken_recorder", "itemTooltip2.blizzard-villa-clues.broken_recorder"),
            new Item.Properties());
    public static final Item AXE = register("axe",
            settings -> new CustomTooltipItems(
                    settings, "itemTooltip1.blizzard-villa-clues.axe", "itemTooltip2.blizzard-villa-clues.axe"),
            new Item.Properties());
    public static final Item BLOOD_AXE = register("blood_axe",
            settings -> new CustomTooltipItems(
                    settings, "itemTooltip1.blizzard-villa-clues.blood_axe", "itemTooltip2.blizzard-villa-clues.blood_axe"),
            new Item.Properties());
    public static final Item UNLOCKER = registerHelper("unlocker");
    public static final Item ANTIDOTE = registerHelper("antidote");
    public static final Item RED_BAG = registerHelper("red_bag");
    public static final Item PLASTIC_BAG_WITH_BLOOD = registerHelper("plastic_bag_with_blood");
    public static final Item PLASTIC_BAG_WITH_BEEF = registerHelper("plastic_bag_with_beef");
    public static final Item LEMONADE = registerHelper("lemonade");
    public static final Item LEMONADE_POISONED = registerHelper("lemonade_poisoned");
    public static final Item RAIN_COAT = registerHelper("rain_coat");
    public static final Item BUSINESS_CARD = registerHelper("business_card");
    public static final Item WATCH = registerHelper("watch");
    public static final Item PILLOW = registerHelper("pillow");
    public static final Item JUICE = registerHelper("juice");
    public static final Item DRUG_X = registerHelper("drug_x");
    public static final Item CHEMICAL_EQUIPMENT = registerHelper("chemical_equipment");
    public static final Item SMALL_BOTTLE = registerHelper("small_bottle");
    public static final Item IOU = registerHelper("iou");
    public static final Item NOTE = registerHelper("note");
    public static final Item LETTER = registerHelper("letter");
    public static final Item WATERING_CAN = registerHelper("watering_can");
    public static final Item PHOTO = registerHelper("photo");
    public static final Item BLOOD_COAT_2 = registerHelper("blood_coat_2");
    public static final Item NOTE2 = registerHelper("note2");
    public static final Item SLEEPING_PILL_PLATE = registerHelper("sleeping_pill_plate");
    public static final Item PLATE = registerHelper("plate");
    public static final Item CROTON = registerHelper("croton");
    public static final Item WOOD_CHIP = registerHelper("wood_chip");
    public static final Item BLOOD = registerHelper("blood");

    public static Item register(String name, Function<Item.Properties, Item> itemFactory, Item.Properties settings) {
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(BlizzardVillaClues.MOD_ID, name));
        Item item = itemFactory.apply(settings.setId(itemKey));
        Registry.register(BuiltInRegistries.ITEM, itemKey, item);

        return item;
    }
    public static Item registerHelper(String name) {
        return register(name,
                settings -> new CustomTooltipItems(
                        settings, "itemTooltip1.blizzard-villa-clues." + name, "itemTooltip2.blizzard-villa-clues." + name),
                new Item.Properties());
    }

    public static void initialize() {
    }
}
