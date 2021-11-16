package club.deltapvp.punishments.api.structure;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@RequiredArgsConstructor
public class ConfigurableGUI {

    private final String id;
    private final String title;
    private final int rows;
    private final List<Integer> fillerSlots;
    private final boolean enabled;
    private final Map<String, Map<String, Object>> slots;
    private String fillerMaterial;
    private int fillerData;

}
