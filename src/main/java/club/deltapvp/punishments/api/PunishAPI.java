package club.deltapvp.punishments.api;

import lombok.Getter;

public abstract class PunishAPI {

    @Getter
    private static PunishAPI instance;

    public abstract PunishManager getPunishManager();
}
