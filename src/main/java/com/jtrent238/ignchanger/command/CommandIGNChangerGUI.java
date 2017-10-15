package com.jtrent238.ignchanger.command;

import java.net.MalformedURLException;

import com.jtrent238.ignchanger.gui.GUIChangeIGN;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;

public class CommandIGNChangerGUI extends CommandBase
{
    private static final String __OBFID = "CL_00000570";

    public String getCommandName()
    {
        return "ign";
    }

    /**
     * Return the required permission level for this command.
     */
    public int getRequiredPermissionLevel()
    {
        return 0;
    }

    public String getCommandUsage(ICommandSender p_71518_1_)
    {
        return "commands.ign.usage";
    }

    public void processCommand(ICommandSender p_71515_1_, String[] p_71515_2_)
    {

        //p_71515_1_.addChatMessage(new ChatComponentTranslation("TEST", new Object[0]));
        
    	
    	GUIChangeIGN.main(p_71515_2_);
        
    }
}