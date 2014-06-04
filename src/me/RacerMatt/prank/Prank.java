package me.RacerMatt.prank;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Prank extends JavaPlugin{

	public void onEnable() {
		
		Bukkit.getServer().getLogger().info("Prank v" + this.getDescription().getVersion() + "has been enabled!");
		
	}
	
	public void onDisable() {
		
		Bukkit.getServer().getLogger().info("Prank v" + this.getDescription().getVersion() + "has been disabled!");
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		Player target = Bukkit.getServer().getPlayer(args[0]);
		
		if(cmd.getName().equalsIgnoreCase("fakeop")) {
			
			if(args.length == 0) {
				
				sender.sendMessage(ChatColor.RED + "Please specify a player.");
				
				return true;
			} 
			
			else if(args.length == 1) {
				
				if(target == null) {
					
					sender.sendMessage(ChatColor.RED + "Cannot find player" + target + ".");
					
					return true;
				}
				
				else {
					
					target.sendMessage(ChatColor.YELLOW + "You have been opped!");
					
					sender.sendMessage(ChatColor.GREEN + "Fake op has been a success.");
					
				}
				
				return true;
				
			}
			
		}
			
		if (cmd.getName().equalsIgnoreCase("fakejoin")) {
				
				if (args.length == 0) {
					
					sender.sendMessage(ChatColor.RED + "Please specify a user to fakejoin!");
					
					return true;
					
				}
			
				else if (args.length == 1) {
						
						Bukkit.getServer().broadcastMessage(ChatColor.YELLOW + args[0] + " joined the game");
						
						return true;
					
					}
				
				return true;
				
				}
				
		return true;
	}
	
}
