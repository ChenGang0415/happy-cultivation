package com.lalameow.happycultivation.register;

import com.lalameow.happycultivation.HappyCultivation;
import lombok.extern.log4j.Log4j2;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

/**
 * @author: LaoChen
 * @Date: 2021/4/1 23:19
 * @Description: 方块 注册
 */
@Log4j2
public class BlockRegister {
    //玄铁矿
    public static final Block BLOCK_XUANTIE = new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f));
    //陨铁矿
    public static final Block BLOCK_YUNTIE = new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f));
    //寒铁矿
    public static final Block BLOCK_HANTIE = new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f));
    //紫精铁
    public static final Block BLOCK_ZIJINGTIE = new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f));
    //秘银矿
    public static final Block BLOCK_MIYIN = new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f));
    //钨矿
    public static final Block BLOCK_WUKUANG = new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f));
    //赤铜矿
    public static final Block BLOCK_CHITONG = new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f));

    /**
     * 注册方框
     */
    public static void register(){
        log.info("开始创建 block");
        Registry.register(Registry.BLOCK, new Identifier(HappyCultivation.MODNAME, "xuantie"), BLOCK_XUANTIE);
        Registry.register(Registry.ITEM, new Identifier(HappyCultivation.MODNAME, "xuantie"), new BlockItem(BLOCK_XUANTIE, new Item.Settings().group(ItemGroupRegister.GROUP_MING)));

        Registry.register(Registry.BLOCK, new Identifier(HappyCultivation.MODNAME, "yuntie"), BLOCK_YUNTIE);
        Registry.register(Registry.ITEM, new Identifier(HappyCultivation.MODNAME, "yuntie"), new BlockItem(BLOCK_YUNTIE, new Item.Settings().group(ItemGroupRegister.GROUP_MING)));

        Registry.register(Registry.BLOCK, new Identifier(HappyCultivation.MODNAME, "hantie"), BLOCK_HANTIE);
        Registry.register(Registry.ITEM, new Identifier(HappyCultivation.MODNAME, "hantie"), new BlockItem(BLOCK_HANTIE, new Item.Settings().group(ItemGroupRegister.GROUP_MING)));

        Registry.register(Registry.BLOCK, new Identifier(HappyCultivation.MODNAME, "zijingtie"), BLOCK_ZIJINGTIE);
        Registry.register(Registry.ITEM, new Identifier(HappyCultivation.MODNAME, "zijingtie"), new BlockItem(BLOCK_ZIJINGTIE, new Item.Settings().group(ItemGroupRegister.GROUP_MING)));

        Registry.register(Registry.BLOCK, new Identifier(HappyCultivation.MODNAME, "miyin"), BLOCK_MIYIN);
        Registry.register(Registry.ITEM, new Identifier(HappyCultivation.MODNAME, "miyin"), new BlockItem(BLOCK_MIYIN, new Item.Settings().group(ItemGroupRegister.GROUP_MING)));

        Registry.register(Registry.BLOCK, new Identifier(HappyCultivation.MODNAME, "wukuang"), BLOCK_WUKUANG);
        Registry.register(Registry.ITEM, new Identifier(HappyCultivation.MODNAME, "wukuang"), new BlockItem(BLOCK_WUKUANG, new Item.Settings().group(ItemGroupRegister.GROUP_MING)));

        Registry.register(Registry.BLOCK, new Identifier(HappyCultivation.MODNAME, "chitong"), BLOCK_CHITONG);
        Registry.register(Registry.ITEM, new Identifier(HappyCultivation.MODNAME, "chitong"), new BlockItem(BLOCK_CHITONG, new Item.Settings().group(ItemGroupRegister.GROUP_MING)));
        log.info("block创建完成");

    }
}
