package com.lalameow.happycultivation.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class HappyCultivationClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("onInitializeClient");
    }
}
