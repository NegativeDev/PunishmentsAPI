package club.deltapvp.punishments.api.structure;

import lombok.Data;

import java.util.List;

/**
 * Represents a Punishment Type from punishments.yml
 */
@Data
public class Punishment {

    private final String id;
    private final String reason;
    private List<String> stackables;

}
