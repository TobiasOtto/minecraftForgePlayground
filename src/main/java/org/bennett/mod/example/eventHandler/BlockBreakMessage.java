package org.bennett.mod.example.eventHandler;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BlockBreakMessage {

    @SubscribeEvent
    public void onBreakEvent (BlockEvent.BreakEvent event){
        event.getPlayer().sendStatusMessage(new TextComponentString("Block kaputt"),false);
    }
}
