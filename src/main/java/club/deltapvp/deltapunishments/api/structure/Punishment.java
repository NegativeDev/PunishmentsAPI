package club.deltapvp.deltapunishments.api.structure;

import lombok.Data;

import java.util.List;

@Data
public class Punishment {

    private final String id;
    private final String reason;
    private List<String> stackables;

    public Punishment(String id, String reason) {
        this.id = id;
        this.reason = reason;
    }

}
