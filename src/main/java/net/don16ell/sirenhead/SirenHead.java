package net.don16ell.sirenhead;

import net.don16ell.sirenhead.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;

public class SirenHead implements ModInitializer {

    public static final String MOD_ID = "sirenhead";


    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "sirenheadweapons"),
            () -> new ItemStack(ModItems.HUNTER_SWORD));

    public static final ItemGroup OTHER_GROUP = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "sirenheadall"))
            .icon(() -> new ItemStack(ModItems.STONE_BLADE))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(ModItems.STONE_BLADE));
                stacks.add(new ItemStack(ModItems.HUNTER_SWORD));
            }).build();

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}