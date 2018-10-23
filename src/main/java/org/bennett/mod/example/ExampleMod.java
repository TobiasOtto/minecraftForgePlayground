package org.bennett.mod.example;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import org.bennett.mod.example.eventHandler.BlockBreakMessage;
import org.bennett.mod.example.eventHandler.ExplodingArrows;
import org.bennett.mod.example.eventHandler.MinecartExplosion;

/**
 * Diese Klasse zeigt Minecraft, dass wir mitspielen wollen.
 */
@Mod(modid=ExampleMod.MODID, version=ExampleMod.VERSION)
public class ExampleMod {
    public static final String MODID = "examplemod" ;
    public static final String VERSION = "1.0" ;

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new BlockBreakMessage());
        MinecraftForge.EVENT_BUS.register(new MinecartExplosion());
        MinecraftForge.EVENT_BUS.register(new ExplodingArrows());
    }
}
