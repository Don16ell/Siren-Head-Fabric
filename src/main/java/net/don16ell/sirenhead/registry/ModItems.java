package net.don16ell.sirenhead.registry;

import net.don16ell.sirenhead.SirenHead;
import net.don16ell.sirenhead.SirenHeadMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item STONE_BLADE = new Item(new Item.Settings().group(SirenHead.ITEM_GROUP));
    public static final ToolItem HUNTER_SWORD = new SwordItem(SirenHeadMaterial.INSTANCE, 10, -2.4F,
            new Item.Settings().group(SirenHead.ITEM_GROUP));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(SirenHead.MOD_ID, "stone_blade"), STONE_BLADE);
        Registry.register(Registry.ITEM, new Identifier(SirenHead.MOD_ID, "hunter_sword"), HUNTER_SWORD);
    }
}
