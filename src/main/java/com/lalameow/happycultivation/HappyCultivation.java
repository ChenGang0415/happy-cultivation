package com.lalameow.happycultivation;

import com.lalameow.happycultivation.register.BlockRegister;
import com.lalameow.happycultivation.register.ItemGroupRegister;
import com.lalameow.happycultivation.register.ItemRegister;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import net.fabricmc.api.ModInitializer;


public class HappyCultivation implements ModInitializer {
    public final static String MODNAME="happy-cultivation";

    @Override
    public void onInitialize() {
        ItemGroupRegister.register();
        ItemRegister.regist();
        BlockRegister.register();
    }
}
