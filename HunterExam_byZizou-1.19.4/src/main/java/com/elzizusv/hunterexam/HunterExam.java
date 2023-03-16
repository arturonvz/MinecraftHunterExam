package com.elzizusv.hunterexam;

import com.elzizusv.hunterexam.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(HunterExam.MODID)
public class HunterExam
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "hunterexam";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold Blocks which will all be registered under the "hunterexam" namespace
    //public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    // Create a Deferred Register to hold Items which will all be registered under the "hunterexam" namespace
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    // Creates a new Block with the id "hunterexam:example_block", combining the namespace and path
    //public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)));
    // Creates a new BlockItem with the id "hunterexam:example_block", combining the namespace and path
    //public static final RegistryObject<Item> EXAMPLE_BLOCK_ITEM = ITEMS.register("example_block", () -> new BlockItem(EXAMPLE_BLOCK.get(), new Item.Properties()));

    public HunterExam()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register the Deferred Register to the mod event bus so blocks get registered
        //BLOCKS.register(modEventBus);
        // Register the Deferred Register to the mod event bus so items get registered
        ITEMS.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");
        LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event)
    {
        if (event.getTab() == CreativeModeTabs.COMBAT){
            event.accept(ModItems.PLATE_01);
            event.accept(ModItems.PLATE_02);
            event.accept(ModItems.PLATE_03);
            event.accept(ModItems.PLATE_04);
            event.accept(ModItems.PLATE_05);
            event.accept(ModItems.PLATE_06);
            event.accept(ModItems.PLATE_07);
            event.accept(ModItems.PLATE_08);
            event.accept(ModItems.PLATE_09);
            event.accept(ModItems.PLATE_10);
            event.accept(ModItems.PLATE_11);
            event.accept(ModItems.PLATE_12);
            event.accept(ModItems.PLATE_13);
            event.accept(ModItems.PLATE_14);
            event.accept(ModItems.PLATE_15);
            event.accept(ModItems.PLATE_16);
            event.accept(ModItems.PLATE_17);
            event.accept(ModItems.PLATE_18);
            event.accept(ModItems.PLATE_19);
            event.accept(ModItems.PLATE_20);
            event.accept(ModItems.PLATE_21);
            event.accept(ModItems.PLATE_22);
            event.accept(ModItems.PLATE_23);
            event.accept(ModItems.PLATE_24);
            event.accept(ModItems.PLATE_25);
            event.accept(ModItems.PLATE_26);
            event.accept(ModItems.PLATE_27);
            event.accept(ModItems.PLATE_28);
            event.accept(ModItems.PLATE_29);
            event.accept(ModItems.PLATE_30);
            event.accept(ModItems.PLATE_31);
            event.accept(ModItems.PLATE_32);
            event.accept(ModItems.PLATE_33);
            event.accept(ModItems.PLATE_34);
            event.accept(ModItems.PLATE_35);
            event.accept(ModItems.PLATE_36);
            event.accept(ModItems.PLATE_37);
            event.accept(ModItems.PLATE_38);
            event.accept(ModItems.PLATE_39);
            event.accept(ModItems.PLATE_40);
            event.accept(ModItems.PLATE_41);
            event.accept(ModItems.PLATE_42);
            event.accept(ModItems.PLATE_43);
            event.accept(ModItems.PLATE_44);
            event.accept(ModItems.PLATE_45);
            event.accept(ModItems.PLATE_46);
            event.accept(ModItems.PLATE_47);
            event.accept(ModItems.PLATE_48);
            event.accept(ModItems.PLATE_49);
            event.accept(ModItems.PLATE_50);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
