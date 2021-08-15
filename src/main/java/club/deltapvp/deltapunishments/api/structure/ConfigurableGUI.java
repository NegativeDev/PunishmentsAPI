package club.deltapvp.deltapunishments.api.structure;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class ConfigurableGUI {

    private final String id;
    private final String title;
    private final int rows;
    private final List<Integer> fillerSlots;
    private final boolean enabled;
    private final Map<String, Map<String, Object>> slots;

    public ConfigurableGUI(String id, String title, int rows, List<Integer> fillerSlots, boolean enabled, Map<String, Map<String, Object>> slots) {
        this.id = id;
        this.title = title;
        this.rows = rows;
        this.fillerSlots = fillerSlots;
        this.slots = slots;
        this.enabled = enabled;
    }

}
