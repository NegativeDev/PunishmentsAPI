package club.deltapvp.punishments.api.structure;

import lombok.Data;

import java.util.UUID;

/**
 * Represents a Punishment Entry
 */
@Data
public class PersistentPunishment {

    private final long id;
    private final String reason;
    private final UUID bannedBy;
    private final UUID uuid;
    private final long time;
    private final long until;
    private boolean active;
    private String removed;


}
