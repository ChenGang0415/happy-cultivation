package com.lalameow.happycultivation.register;

import com.lalameow.happycultivation.HappyCultivation;
import lombok.extern.log4j.Log4j2;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

/**
 * @author: 陈刚
 * @Date: 2021/4/1 22:09
 * @Description: Item注册器
 */
@Log4j2
public class ItemRegister {
    public static final Item FABRIC_ITEM = new Item(new FabricItemSettings().group(ItemGroupRegister.GROUP_MING));

    public static void regist(){
        log.info("开始初始化Item");
        Registry.register(Registry.ITEM, new Identifier(HappyCultivation.MODNAME, "test"), FABRIC_ITEM);
        log.info("Item初始化1完成");
    }
}
