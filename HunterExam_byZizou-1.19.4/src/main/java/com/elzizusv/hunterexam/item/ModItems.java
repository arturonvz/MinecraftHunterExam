package com.elzizusv.hunterexam.item;

import com.elzizusv.hunterexam.HunterExam;
import com.elzizusv.hunterexam.base.ModArmorMaterial;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HunterExam.MODID);

    public static final RegistryObject<Item> PLATE_01 = ITEMS.register("plate_01", () -> new ArmorItem(ArmorTiers.PLATE01, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_02 = ITEMS.register("plate_02", () -> new ArmorItem(ArmorTiers.PLATE02, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_03 = ITEMS.register("plate_03", () -> new ArmorItem(ArmorTiers.PLATE03, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_04 = ITEMS.register("plate_04", () -> new ArmorItem(ArmorTiers.PLATE04, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_05 = ITEMS.register("plate_05", () -> new ArmorItem(ArmorTiers.PLATE05, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_06 = ITEMS.register("plate_06", () -> new ArmorItem(ArmorTiers.PLATE06, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_07 = ITEMS.register("plate_07", () -> new ArmorItem(ArmorTiers.PLATE07, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_08 = ITEMS.register("plate_08", () -> new ArmorItem(ArmorTiers.PLATE08, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_09 = ITEMS.register("plate_09", () -> new ArmorItem(ArmorTiers.PLATE09, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_10 = ITEMS.register("plate_10", () -> new ArmorItem(ArmorTiers.PLATE10, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_11 = ITEMS.register("plate_11", () -> new ArmorItem(ArmorTiers.PLATE11, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_12 = ITEMS.register("plate_12", () -> new ArmorItem(ArmorTiers.PLATE12, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_13 = ITEMS.register("plate_13", () -> new ArmorItem(ArmorTiers.PLATE13, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_14 = ITEMS.register("plate_14", () -> new ArmorItem(ArmorTiers.PLATE14, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_15 = ITEMS.register("plate_15", () -> new ArmorItem(ArmorTiers.PLATE15, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_16 = ITEMS.register("plate_16", () -> new ArmorItem(ArmorTiers.PLATE16, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_17 = ITEMS.register("plate_17", () -> new ArmorItem(ArmorTiers.PLATE17, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_18 = ITEMS.register("plate_18", () -> new ArmorItem(ArmorTiers.PLATE18, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_19 = ITEMS.register("plate_19", () -> new ArmorItem(ArmorTiers.PLATE19, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_20 = ITEMS.register("plate_20", () -> new ArmorItem(ArmorTiers.PLATE20, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_21 = ITEMS.register("plate_21", () -> new ArmorItem(ArmorTiers.PLATE21, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_22 = ITEMS.register("plate_22", () -> new ArmorItem(ArmorTiers.PLATE22, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_23 = ITEMS.register("plate_23", () -> new ArmorItem(ArmorTiers.PLATE23, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_24 = ITEMS.register("plate_24", () -> new ArmorItem(ArmorTiers.PLATE24, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_25 = ITEMS.register("plate_25", () -> new ArmorItem(ArmorTiers.PLATE25, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_26 = ITEMS.register("plate_26", () -> new ArmorItem(ArmorTiers.PLATE26, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_27 = ITEMS.register("plate_27", () -> new ArmorItem(ArmorTiers.PLATE27, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_28 = ITEMS.register("plate_28", () -> new ArmorItem(ArmorTiers.PLATE28, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_29 = ITEMS.register("plate_29", () -> new ArmorItem(ArmorTiers.PLATE29, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_30 = ITEMS.register("plate_30", () -> new ArmorItem(ArmorTiers.PLATE30, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_31 = ITEMS.register("plate_31", () -> new ArmorItem(ArmorTiers.PLATE31, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_32 = ITEMS.register("plate_32", () -> new ArmorItem(ArmorTiers.PLATE32, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_33 = ITEMS.register("plate_33", () -> new ArmorItem(ArmorTiers.PLATE33, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_34 = ITEMS.register("plate_34", () -> new ArmorItem(ArmorTiers.PLATE34, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_35 = ITEMS.register("plate_35", () -> new ArmorItem(ArmorTiers.PLATE35, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_36 = ITEMS.register("plate_36", () -> new ArmorItem(ArmorTiers.PLATE36, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_37 = ITEMS.register("plate_37", () -> new ArmorItem(ArmorTiers.PLATE37, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_38 = ITEMS.register("plate_38", () -> new ArmorItem(ArmorTiers.PLATE38, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_39 = ITEMS.register("plate_39", () -> new ArmorItem(ArmorTiers.PLATE39, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_40 = ITEMS.register("plate_40", () -> new ArmorItem(ArmorTiers.PLATE40, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_41 = ITEMS.register("plate_41", () -> new ArmorItem(ArmorTiers.PLATE41, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_42 = ITEMS.register("plate_42", () -> new ArmorItem(ArmorTiers.PLATE42, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_43 = ITEMS.register("plate_43", () -> new ArmorItem(ArmorTiers.PLATE43, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_44 = ITEMS.register("plate_44", () -> new ArmorItem(ArmorTiers.PLATE44, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_45 = ITEMS.register("plate_45", () -> new ArmorItem(ArmorTiers.PLATE45, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_46 = ITEMS.register("plate_46", () -> new ArmorItem(ArmorTiers.PLATE46, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_47 = ITEMS.register("plate_47", () -> new ArmorItem(ArmorTiers.PLATE47, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_48 = ITEMS.register("plate_48", () -> new ArmorItem(ArmorTiers.PLATE48, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_49 = ITEMS.register("plate_49", () -> new ArmorItem(ArmorTiers.PLATE49, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_50 = ITEMS.register("plate_50", () -> new ArmorItem(ArmorTiers.PLATE50, EquipmentSlot.CHEST, new Item.Properties()));


    public static class ArmorTiers{
        public static final ArmorMaterial PLATE01 = new ModArmorMaterial(
                "plate01",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE02 = new ModArmorMaterial(
                "plate02",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE03 = new ModArmorMaterial(
                "plate03",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE04 = new ModArmorMaterial(
                "plate04",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE05 = new ModArmorMaterial(
                "plate05",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE06 = new ModArmorMaterial(
                "plate06",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE07 = new ModArmorMaterial(
                "plate07",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE08 = new ModArmorMaterial(
                "plate08",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE09 = new ModArmorMaterial(
                "plate09",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE10 = new ModArmorMaterial(
                "plate10",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE11 = new ModArmorMaterial(
                "plate11",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE12 = new ModArmorMaterial(
                "plate12",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE13 = new ModArmorMaterial(
                "plate13",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE14 = new ModArmorMaterial(
                "plate14",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE15 = new ModArmorMaterial(
                "plate15",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE16 = new ModArmorMaterial(
                "plate16",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE17 = new ModArmorMaterial(
                "plate17",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE18 = new ModArmorMaterial(
                "plate18",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE19 = new ModArmorMaterial(
                "plate19",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE20 = new ModArmorMaterial(
                "plate20",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE21 = new ModArmorMaterial(
                "plate21",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE22 = new ModArmorMaterial(
                "plate22",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE23 = new ModArmorMaterial(
                "plate23",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE24 = new ModArmorMaterial(
                "plate24",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE25 = new ModArmorMaterial(
                "plate25",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE26 = new ModArmorMaterial(
                "plate26",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE27 = new ModArmorMaterial(
                "plate27",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE28 = new ModArmorMaterial(
                "plate28",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE29 = new ModArmorMaterial(
                "plate29",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE30 = new ModArmorMaterial(
                "plate30",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE31 = new ModArmorMaterial(
                "plate31",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE32 = new ModArmorMaterial(
                "plate32",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE33 = new ModArmorMaterial(
                "plate33",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE34 = new ModArmorMaterial(
                "plate34",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE35 = new ModArmorMaterial(
                "plate35",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE36 = new ModArmorMaterial(
                "plate36",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE37 = new ModArmorMaterial(
                "plate37",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE38 = new ModArmorMaterial(
                "plate38",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE39 = new ModArmorMaterial(
                "plate39",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE40 = new ModArmorMaterial(
                "plate40",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE41 = new ModArmorMaterial(
                "plate41",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE42 = new ModArmorMaterial(
                "plate42",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE43 = new ModArmorMaterial(
                "plate43",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE44 = new ModArmorMaterial(
                "plate44",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE45 = new ModArmorMaterial(
                "plate45",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE46 = new ModArmorMaterial(
                "plate46",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE47 = new ModArmorMaterial(
                "plate47",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE48 = new ModArmorMaterial(
                "plate48",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE49 = new ModArmorMaterial(
                "plate49",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
        public static final ArmorMaterial PLATE50 = new ModArmorMaterial(
                "plate50",
                99999,
                new int[]{8, 8, 8, 8},
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.1f,
                () -> Ingredient.of(Items.NETHERITE_CHESTPLATE)
        );
    }
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
