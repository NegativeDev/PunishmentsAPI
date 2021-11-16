package club.deltapvp.punishments.api;

import club.deltapvp.punishments.api.structure.Punishment;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.CommandSender;

import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

public interface PunishManager {

     /**
      * Find a punishment through a String
      * @param input Input
      * @return If the string is valid punishment, return. If not, return empty.
      */
     Optional<Punishment> findPunishment(String input);

     /**
      * Code to execute a punishment
      * @param staff Staff Member
      * @param offender Offender
      * @param punishment Punishment
      * @param silent Is the punishment silent?
      * @param skipToFinal Skip to the final offense?
      */
     void executePunishment(CommandSender staff, OfflinePlayer offender, Punishment punishment, boolean silent, boolean skipToFinal);

     Map<String, Punishment> getPunishmentMap();

     Map<Long, ArrayList<Object>> getBanMap();

     Map<Long, ArrayList<Object>> getMuteMap();

     Map<Long, ArrayList<Object>> getWarnMap();

     Map<Long, ArrayList<Object>> getKickMap();

     void reload();
    
}
