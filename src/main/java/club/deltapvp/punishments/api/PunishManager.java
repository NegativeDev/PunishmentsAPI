package club.deltapvp.punishments.api;

import club.deltapvp.punishments.api.structure.Punishment;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.CommandSender;

import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

public interface PunishManager {

     Optional<Punishment> findPunishment(String input);

     void executePunishment(CommandSender staff, OfflinePlayer offender, Punishment punishment, boolean silent);

     Map<String, Punishment> getPunishmentMap();

     Map<Long, ArrayList<Object>> getBanMap();

     Map<Long, ArrayList<Object>> getMuteMap();

     Map<Long, ArrayList<Object>> getWarnMap();

     Map<Long, ArrayList<Object>> getKickMap();

     void reload();
    
}
