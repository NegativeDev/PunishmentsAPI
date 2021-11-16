package club.deltapvp.punishments.api.structure;

import lombok.Data;

import java.util.UUID;

@Data
public class Note {

    private final int id;
    private final UUID owner;
    private String message;
    private UUID addedBy;
    private final long dateAdded;
    private long lastModified;

}
