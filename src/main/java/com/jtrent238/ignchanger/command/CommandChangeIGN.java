package com.jtrent238.ignchanger.command;

import java.net.MalformedURLException;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;

public class CommandChangeIGN extends CommandBase
{
    private static final String __OBFID = "CL_00000570";

    public String getCommandName()
    {
        return "ChangeIGN";
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
        return "commands.ChangeIGN.usage";
    }

    public void processCommand(ICommandSender p_71515_1_, String[] p_71515_2_)
    {

        //p_71515_1_.addChatMessage(new ChatComponentTranslation("TEST", new Object[0]));
        
        
        
        
    }
}