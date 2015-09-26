package me.adencraft2k.instabreak;


import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "InstaBreak", name = "InstaBreak", version = "1.0")
public class InstaBreak {
	
	public static Block blockInstaBreak;
	public static BlockFalling blockInstaBreakFall;
	public static Block blockInstaBreakGlowFall;
	public static Block blockInstaBreakGlow;
	public static Item itemWoodBrace;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		blockInstaBreak = new BlockInstaBreak(Material.cloth).setBlockName("InstaBreak").setBlockTextureName("InstaBreak:InstaBreak").setCreativeTab(tabInstaBreak);
		GameRegistry.registerBlock(blockInstaBreak, blockInstaBreak.getUnlocalizedName().substring(5));
		blockInstaBreakFall = (BlockFalling) new blockInstaBreakFall().setBlockName("InstaBreakFall").setBlockTextureName("InstaBreak:InstaBreakFall").setCreativeTab(tabInstaBreak);
		GameRegistry.registerBlock(blockInstaBreakFall, blockInstaBreakFall.getUnlocalizedName().substring(5));
		
		blockInstaBreakGlowFall = new blockInstaBreakGlowFall(Material.cloth).setBlockName("InstaBreakGlowFall").setBlockTextureName("InstaBreak:InstaBreakGlowFall").setCreativeTab(tabInstaBreak);
		GameRegistry.registerBlock(blockInstaBreakGlowFall, blockInstaBreakGlowFall.getUnlocalizedName().substring(5));
		
		blockInstaBreakGlow = new BlockInstaBreakGlow(Material.cloth).setBlockName("InstaBreakGlow").setBlockTextureName("InstaBreak:InstaBreakGlow").setCreativeTab(tabInstaBreak);
		GameRegistry.registerBlock(blockInstaBreakGlow, blockInstaBreakGlow.getUnlocalizedName().substring(5));
		
		
		itemWoodBrace = new itemWoodBrace().setUnlocalizedName("WoodenBrace").setTextureName("InstaBreak:woodBrace").setCreativeTab(tabInstaBreak);
		GameRegistry.registerItem(itemWoodBrace, itemWoodBrace.getUnlocalizedName().substring(5));
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		GameRegistry.addRecipe(new ItemStack(itemWoodBrace, 2), new Object[]{"S ", " S", 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(itemWoodBrace, 2), new Object[]{" S", "S ", 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(blockInstaBreak, 4), new Object[]{" W ", "WBW", " W ", 'W', Blocks.planks, 'B', itemWoodBrace});
		GameRegistry.addRecipe(new ItemStack(blockInstaBreakFall, 4), new Object[]{" S ", "SBS", " S ", 'S', Blocks.sand, 'B', itemWoodBrace});
		
		
		GameRegistry.addShapelessRecipe(new ItemStack(blockInstaBreakGlow, 3), new Object[]{Items.glowstone_dust, blockInstaBreak, blockInstaBreak, blockInstaBreak});
		GameRegistry.addShapelessRecipe(new ItemStack(blockInstaBreakGlowFall, 3), new Object[]{Items.glowstone_dust, blockInstaBreakFall, blockInstaBreakFall, blockInstaBreakFall});
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	public static CreativeTabs tabInstaBreak = new CreativeTabs("tabInstaBreak"){
		@Override
		public Item getTabIconItem(){
			return new ItemStack(blockInstaBreak).getItem();
		}
	};
	
}
