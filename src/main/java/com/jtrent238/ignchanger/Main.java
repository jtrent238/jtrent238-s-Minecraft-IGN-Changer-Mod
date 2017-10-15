package com.jtrent238.ignchanger;

//import net.fybertech.meddle.MeddleMod;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.init.Blocks;
import net.minecraft.launchwrapper.LaunchClassLoader;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.MinecraftForge;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.jtrent238.ignchanger.command.CommandChangeIGN;
import com.jtrent238.ignchanger.command.CommandIGNChangerGUI;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;

@Mod(modid=Main.MODID, name=Main.MODNAME, version=(Main.MODVERSION))
//@MeddleMod(id=Main.MODID, name=Main.MODNAME, version=(Main.MODVERSION), author=Main.MODAUTHOR)
public class Main
{
	
    public static final String MODID = "ignchanger";
    public static final String MODVERSION = "pre-1.0.0.0";
	public static final String APIVERSION = "NA";
	public static final String MODNAME = "jtrent238's Minecraft IGN Changer Mod";
	public static final String MODAUTHOR = "jtrent238";
	public static final String MC = "1.7.10";
	
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) throws IOException
	{
		
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		//proxy.init(event);
		
		class MaxMemory {
		    {
		        Runtime rt = Runtime.getRuntime();
		        long totalMem = rt.totalMemory();
		        long maxMem = rt.maxMemory();
		        long freeMem = rt.freeMemory();
		        double megs = 1048576.0;

		        System.out.println ("Total Memory: " + totalMem + " (" + (totalMem/megs) + " MiB)");
		        System.out.println ("Max Memory:   " + maxMem + " (" + (maxMem/megs) + " MiB)");
		        System.out.println ("Free Memory:  " + freeMem + " (" + (freeMem/megs) + " MiB)");
		    }
		   }
		
		//Print Debug Information!
		System.out.println("Minecraft Version: " + Main.MC);
		System.out.println("Mod Name: " + Main.MODNAME);
		System.out.println("Mod ID: " + Main.MODID);
		System.out.println("Mod Version: " + Main.MODVERSION);
		System.out.println("Mod Author: " + Main.MODAUTHOR);
		System.out.println("API Version: " + Main.APIVERSION);
		
		
		}
	
	@ForgeSubscribe(priority = EventPriority.NORMAL)
    public void eventHandler(RenderGameOverlayEvent event) {
		
		Thread.currentThread().setName(Main.MODNAME);
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		{
			//MinecraftForge.EVENT_BUS.register(new CommandChangeIGN());
			MinecraftForge.EVENT_BUS.register(new CommandIGNChangerGUI());
		    
		}
		
		
	}
	
	@EventHandler
	public void serverStart(FMLServerStartingEvent event)
	{
		//Thread.currentThread().setName("EpicProportionsMod");
	     MinecraftServer server = MinecraftServer.getServer();
	     // Get's the current server instance
	     
	     ICommandManager command = server.getCommandManager();
	     ServerCommandManager manager = (ServerCommandManager) command;
	     
	     //manager.registerCommand(new CommandChangeIGN());
	     manager.registerCommand(new CommandIGNChangerGUI());

	}

	public void acceptOptions(List<String> arg0, File arg1, File arg2, String arg3) {
		
	}

	public String[] getLaunchArguments() {
		return null;
	}

	public String getLaunchTarget() {
		return null;
	}

	public void injectIntoClassLoader(LaunchClassLoader arg0) {
		
	}
	
	
}
