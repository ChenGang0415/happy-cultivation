package com.lalameow.happycultivation.register;

import com.lalameow.happycultivation.HappyCultivation;
import lombok.extern.log4j.Log4j2;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

/**
 * @author: LaoChen
 * @Date: 2021/4/1 22:14
 * @Description: item组注册器
 */
@Log4j2
public class ItemGroupRegister {
    public static  ItemGroup GROUP_MING;
    public static void register(){
        log.info("开始初始化ItemGroup");
        GROUP_MING =FabricItemGroupBuilder.build(new Identifier(HappyCultivation.MODNAME, "ming"), () -> new ItemStack(Blocks.DIAMOND_BLOCK));
        log.info("ItemGroup初始化完成");
    }
}
