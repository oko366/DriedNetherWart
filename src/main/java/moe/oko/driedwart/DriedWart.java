package moe.oko.driedwart;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DriedWart implements ModInitializer {

    public static final Item DRIED_NETHER_WART = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.6f).snack().build()));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("driedwart", "dried_nether_wart"), DRIED_NETHER_WART);
    }

}