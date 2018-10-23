package org.bennett.mod.example.eventHandler;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraftforge.event.entity.minecart.MinecartCollisionEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MinecartExplosion {
    @SubscribeEvent
    public void onCollide(MinecartCollisionEvent event) {
        EntityMinecart minecart = event.getMinecart();
        minecart.world.createExplosion(minecart, minecart.posX, minecart.posY, minecart.posZ, 20, false);
    }
}
