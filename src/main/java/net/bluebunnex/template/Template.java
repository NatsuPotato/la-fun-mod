package net.bluebunnex.template;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.modificationstation.stationapi.api.event.registry.BlockRegistryEvent;
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.template.item.TemplateFoodItem;
import net.modificationstation.stationapi.api.template.item.TemplateMushroomStewItem;
import net.modificationstation.stationapi.api.util.Namespace;
import net.modificationstation.stationapi.api.util.Null;

public class Template {

    @Entrypoint.Namespace
    public static final Namespace NAMESPACE = Null.get();

    public static Item TOMATO;
    public static Item CURRY;

    public static Block TOMATO_CROP;

    @EventListener
    public void registerItems(ItemRegistryEvent event) {

        TOMATO = new TemplateFoodItem(NAMESPACE.id("tomato"), 2, false)
                .setMaxCount(8)
                .setTranslationKey(NAMESPACE, "tomato");

        CURRY = new TemplateMushroomStewItem(NAMESPACE.id("curry"), 10)
                .setTranslationKey(NAMESPACE, "curry");
    }

    @EventListener
    public void registerBlocks(BlockRegistryEvent event) {

        TOMATO_CROP = new TomatoCropBlock(NAMESPACE.id("tomato_crop"))
                .setTranslationKey(NAMESPACE, "tomato_crop");
    }
}
