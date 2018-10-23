package org.bennett.mod.example.eventHandler;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.ProjectileImpactEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ExplodingArrows {
    @SubscribeEvent
    public void onHurt(ProjectileImpactEvent event) {
        Entity entityHit = event.getRayTraceResult().entityHit;
        if (entityHit != null) {
            World world = entityHit.world;
            world.createExplosion(entityHit, entityHit.posX, entityHit.posY, entityHit.posZ, 4, true);
        } else {
            //BlockPos blockPos = event.getRayTraceResult().getBlockPos();
            Entity entity = event.getEntity();
            if (entity != null) {
                World world = entity.world;
                world.createExplosion(entity, entity.posX, entity.posY, entity.posZ, 4, true);
            }
        }
    }
}
