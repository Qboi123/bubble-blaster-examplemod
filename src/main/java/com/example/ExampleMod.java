package com.example;

import com.example.init.ModBubbles;
import com.ultreon.bubbles.common.mod.Mod;
import com.ultreon.bubbles.common.mod.ModInstance;
import com.ultreon.bubbles.common.mod.ModObject;
import com.ultreon.bubbles.event.load.ModSetupEvent;
import com.ultreon.hydro.event.SubscribeEvent;
import com.ultreon.hydro.event.bus.GameEvents;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modId = ExampleMod.MOD_ID)
public class ExampleMod extends ModInstance {
    public static final String MOD_ID = "example";

    public static final Logger LOGGER = LogManager.getLogger("ExampleMod");

    public ExampleMod() {
        super(LOGGER, MOD_ID, null);

        ModBubbles.register(GameEvents.get()); // Will be replaced by ModEvents
    }

    @SubscribeEvent
    public void onModSetup(ModSetupEvent event) {

    }
}
