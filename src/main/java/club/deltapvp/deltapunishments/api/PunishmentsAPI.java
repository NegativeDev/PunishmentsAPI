package club.deltapvp.deltapunishments.api;

import club.deltapvp.deltapunishments.api.managers.GUIManager;
import club.deltapvp.deltapunishments.api.managers.PunishManager;
import lombok.experimental.UtilityClass;

@UtilityClass
public final class PunishmentsAPI {

    public GUIManager getGUIManager() {
        return GUIManager.getInstance();
    }

    public PunishManager getPunishManager() {
        return PunishManager.getInstance();
    }
   
}
