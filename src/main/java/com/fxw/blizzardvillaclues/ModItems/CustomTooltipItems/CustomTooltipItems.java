package com.fxw.blizzardvillaclues.ModItems.CustomTooltipItems;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;

import java.util.function.Consumer;

public class CustomTooltipItems extends Item {
    private final String tooltipKey1;
    private final String tooltipKey2;
    public CustomTooltipItems(Properties properties, String tooltipKey1, String tooltipKey2) {
        super(properties);
        this.tooltipKey1 = tooltipKey1;
        this.tooltipKey2 = tooltipKey2;
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay displayComponent, Consumer<Component> textConsumer, TooltipFlag type) {
        textConsumer.accept(Component.translatable(this.tooltipKey1).withStyle(ChatFormatting.GOLD));
        textConsumer.accept(Component.translatable(this.tooltipKey2).withStyle(ChatFormatting.GOLD));
        super.appendHoverText(stack, context, displayComponent, textConsumer, type);
    }
}
