package me.hammale.Sewer;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class SewerBlockListener implements Listener {
	
  @EventHandler
  public void onBlockBreak(BlockBreakEvent e)
  {
    Block b = e.getBlock();
    if (b.getType() == Material.WALL_SIGN) {
      Sign sign = (Sign)b.getState();
      if ((sign.getLine(0).equals("Stay Out")) && (sign.getLine(1).equals("Danger!!!")) && (sign.getLine(2).equals("Trespassers")) && (sign.getLine(3).equals("Will DIE!!!")))
      {
        b.getWorld().strikeLightning(b.getLocation());
      }
    }
  }
}