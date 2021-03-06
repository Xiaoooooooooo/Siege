package net.siegerpg.siege.core.commands.admin;

import net.siegerpg.siege.core.Webstore.WebstoreUtils;
import net.siegerpg.siege.core.drops.Reward;
import net.siegerpg.siege.core.items.implemented.misc.keys.HillyWoodsDungeonKey;
import net.siegerpg.siege.core.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class GetKey implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player) {
            sender.sendMessage(Utils.lore("<red>Only console can use this command."));
            return false;
        }
        if (args.length != 3) {
            sender.sendMessage(Utils.lore("<red>You did not fill in the proper arguments /getKey player HillyWoods/Twilight amount."));
            return false;
        }
        Player targetPlayer = Bukkit.getPlayer(args[0]);
        if (targetPlayer == null) {
            sender.sendMessage(Utils.lore("<red>This player is null."));
            return false;
        }
        String type;
        int amount;
        try {
            type = args[1];
            amount = Integer.parseInt(args[2]);
        } catch (Exception e){
            sender.sendMessage(Utils.lore("<red>Exception parsing command."));
            return false;
        }
        if (!type.equals("HillyWoods") && !type.equals("Twilight")) {
            sender.sendMessage(Utils.lore("<red>The key type is incorrect."));
            return false;
        } else if (type.equals("HillyWoods")) {
            WebstoreUtils.giveItemToPlayer(targetPlayer, new HillyWoodsDungeonKey(0).getUpdatedItem(false).asQuantity(amount));
        }
        return true;
    }
}