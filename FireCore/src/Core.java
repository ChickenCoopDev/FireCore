
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public class Core extends JavaPlugin {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if (sender.hasPermission("core.tpall"))
	  if(cmd.getName().equalsIgnoreCase("tpall")){
	  
		  Player s = (Player) sender;
	  
	      for(Player p : getServer().getOnlinePlayers()){
	        p.teleport(s.getLocation());
	        
	        p.getPlayer().sendMessage(ChatColor.GRAY + "You have teleported all players");
	      }
	       
	
		
		if (sender.hasPermission("core.fly")) {
			if (args.length > 0) {
				@SuppressWarnings("deprecation")
				Player p = Bukkit.getPlayer(args[0]);
				if (p == null) {
					sender.sendMessage(ChatColor.GRAY + "Player not found");
				}
				
			} else {
				@SuppressWarnings("deprecation")
				Player player = Bukkit.getPlayer(args[0]);
				player.setAllowFlight(!player.getAllowFlight());
				sender.sendMessage(ChatColor.GRAY + "Turned flying to" + player.getAllowFlight() + "for" + player.getDisplayName());
			}
		} else {
			
			@SuppressWarnings("deprecation")
			Player player = Bukkit.getPlayer(sender.getName());
			player.setAllowFlight(!player.getAllowFlight());
			sender.sendMessage(ChatColor.GRAY + "Turned flying to" + player.getAllowFlight() + "for" + player.getDisplayName());
				}
		
		}
		
		{
	
	if (sender.hasPermission("core.suiside"))
			  if(cmd.getName().equalsIgnoreCase("suiside")) {
				  Player p = (Player) sender;
				  p.setHealth(0);
				  p.sendMessage(ChatColor.GRAY + p.getDisplayName() + ChatColor.GRAY + "You have killed yourself!");
			  }
	
		
		}
	if (sender.hasPermission("core.list"))
		  if(cmd.getName().equalsIgnoreCase("list")) {
			  Player p = (Player) sender;
			  p.getServer().getOnlinePlayers();
			  p.sendMessage(ChatColor.GRAY + "List of online players");
	{
		if (sender.hasPermission("core.list"))
			  if(cmd.getName().equalsIgnoreCase("<3")) {
				  Player p1 = (Player) sender;
				  p1.sendMessage(ChatColor.RED + "<3");
				 
				  {
				  
				  }
		return true;
	}
	
		  }
		
	}
	return false;
	}
}




 

	


