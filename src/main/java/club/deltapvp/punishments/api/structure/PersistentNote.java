package club.deltapvp.punishments.api.structure;

import lombok.Data;

import java.util.UUID;

/**
 * Represents a Note
 */
@Data
public class PersistentNote {

    private final long id;
    private final String content;
    private final UUID uuid;
    private final UUID addedBy;
    private final long lastModified;
    private final PunishmentType punishmentType;

}
