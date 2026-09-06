package com.fxw.blizzardvillaclues.ModItems.MapItems;

import net.minecraft.core.component.DataComponents;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.CustomModelData;
import net.minecraft.world.level.Level;

import java.util.List;


public class MapItem extends Item {
    public MapItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult use(Level level, Player player, InteractionHand interactionHand) {
        ItemStack itemStack = player.getItemInHand(interactionHand);
        if (!level.isClientSide()) {
            CustomModelData currData = itemStack.get(DataComponents.CUSTOM_MODEL_DATA);
            int currStyle = 0;
            if (currData != null && !currData.floats().isEmpty()) {
                currStyle = (int) currData.floats().get(0).floatValue();
            }
            int nextStyle = (currStyle + 1) % 4;
            CustomModelData newData = new CustomModelData(
                    List.of((float) nextStyle),
                    List.of(),
                    List.of(),
                    List.of()
            );
            itemStack.set(DataComponents.CUSTOM_MODEL_DATA, newData);
            level.playSound(
                    null,
                    player.getX(), player.getY(), player.getZ(),
                    SoundEvents.BOOK_PAGE_TURN,
                    SoundSource.PLAYERS,
                    0.5f, 1.0f
            );
        }
        return InteractionResult.SUCCESS;
    }
}
