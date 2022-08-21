package cr.s.f.cmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import static net.minecraft.item.ItemGroup.MISC;


public class Cmod implements ModInitializer {
    public static final ItemGroup AS = FabricItemGroupBuilder.build(
            new Identifier("tutorial", "general"),
            () -> new ItemStack(Items.BOWL));
    public static final Item MILKBOWL = new Item(new FabricItemSettings()
            .food((new FoodComponent.Builder())
                    .saturationModifier(0.2F)
                    .hunger(5)
                    .statusEffect(new StatusEffectInstance(StatusEffect.byRawId(10),2400,12),1.0F)//effect
                    .build())
            .group(Cmod.AS)
    );
    public static final Item CARROTBOWL = new Item(new FabricItemSettings()
            .food((new FoodComponent.Builder())
                    .saturationModifier(0.2F)
                    .hunger(10)
                    .statusEffect(new StatusEffectInstance(StatusEffect.byRawId(5),2400,2),1.0F)//effect
                    .statusEffect(new StatusEffectInstance(StatusEffect.byRawId(11),2400,1),1.0F)//effect
                    .build())
            .group(Cmod.AS)
    );
    public static final Item POTATOBOWL = new Item(new FabricItemSettings()
            .food((new FoodComponent.Builder())
                    .saturationModifier(0.2F)
                    .hunger(8)
                    .statusEffect(new StatusEffectInstance(StatusEffect.byRawId(23),2400,3),1.0F)//effect
                    .build())
            .group(Cmod.AS)
    );
    public static final Item COCO = new Item(new FabricItemSettings()
            .food((new FoodComponent.Builder())
                    .saturationModifier(0.2F)
                    .hunger(8)
                    .statusEffect(new StatusEffectInstance(StatusEffect.byRawId(1),2400,1),1.0F)//effect
                    .statusEffect(new StatusEffectInstance(StatusEffect.byRawId(3),2400,2),1.0F)//effect
                    .build())
            .group(Cmod.AS)
    );
    public static final Item CHICKEN_SOUP = new Item(new FabricItemSettings()
            .food((new FoodComponent.Builder())
                    .saturationModifier(0.2F)
                    .hunger(12)
                    .statusEffect(new StatusEffectInstance(StatusEffect.byRawId(22),2400,1),1.0F)//effect
                    .statusEffect(new StatusEffectInstance(StatusEffect.byRawId(24),2400,2),1.0F)//effect
                    .build())
            .group(Cmod.AS)
    );
    public static final Item JI_SOUP = new Item(new FabricItemSettings()
            .food((new FoodComponent.Builder())
                    .saturationModifier(0.2F)
                    .hunger(13)
                    .statusEffect(new StatusEffectInstance(StatusEffect.byRawId(18),2400,1),1.0F)//effect
                    .statusEffect(new StatusEffectInstance(StatusEffect.byRawId(19),1145,2),1.0F)//effect
                    .build())
            .group(Cmod.AS)
    );
    public static final Item STESO = new Item(new FabricItemSettings()
            .food((new FoodComponent.Builder())
                    .saturationModifier(0.2F)
                    .hunger(13)
                    .statusEffect(new StatusEffectInstance(StatusEffect.byRawId(10),2400,1),1.0F)//effect
                    .statusEffect(new StatusEffectInstance(StatusEffect.byRawId(5),2400,2),1.0F)//effect
                    .build())
            .group(Cmod.AS)
    );
    public static final Item NETHER_CAL = new Item(new FabricItemSettings()
            .food((new FoodComponent.Builder())
                    .saturationModifier(0.2F)
                    .hunger(13)
                    .statusEffect(new StatusEffectInstance(StatusEffect.byRawId(2),2400,2),1.0F)//effect
                    .statusEffect(new StatusEffectInstance(StatusEffect.byRawId(12),2400,2),1.0F)//effect
                    .build())
            .group(Cmod.AS)
    );
    public static final Item SUB = new Item(new FabricItemSettings()
            .food((new FoodComponent.Builder())

                    .saturationModifier(0.2F)
                    .hunger(13)
                    .statusEffect(new StatusEffectInstance(StatusEffect.byRawId(11),2400,1),1.0F)//effect
                    .statusEffect(new StatusEffectInstance(StatusEffect.byRawId(22),2400,2),1.0F)//effect
                    .build())
            .group(Cmod.AS)
    );
    @Override
    public void onInitialize()
    {
        Registry.register(Registry.ITEM, new Identifier("mor", "milkbowl"), MILKBOWL);
        Registry.register(Registry.ITEM, new Identifier("mor", "carrotbowl"), CARROTBOWL);
        Registry.register(Registry.ITEM, new Identifier("mor", "potatobowl"), POTATOBOWL);
        Registry.register(Registry.ITEM, new Identifier("mor", "coco"), COCO);
        Registry.register(Registry.ITEM, new Identifier("mor", "chicken_soup"), CHICKEN_SOUP);
        Registry.register(Registry.ITEM, new Identifier("mor", "steak_soup"), STESO);
        Registry.register(Registry.ITEM, new Identifier("mor", "nether_calm"), NETHER_CAL);
        Registry.register(Registry.ITEM, new Identifier("mor", "ji_soup"), JI_SOUP);
        Registry.register(Registry.ITEM, new Identifier("mor", "wart_soup"), SUB);
    }
}
