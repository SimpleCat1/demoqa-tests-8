package com.simbirsoft.data;

import java.util.Arrays;
import java.util.HashMap;

public enum DataForParamerizedTests {
    UNKNOWN(0, "unknown"), ENUM1(1, "enum1");
//такая параметризация , у меня не работала  снесколькми данынмими, которые я в нее подавал, моет быть из-за hashMap, который да и весь код скопировал и не изменял, может в hashMap добавить занчений, который он принимает?

    private static HashMap<Integer, DataForParamerizedTests> enumById = new HashMap<>();
    static {
        Arrays.stream(values()).forEach(e -> enumById.put(e.getId(), e));
    }

    public static DataForParamerizedTests getById(int id) {
        return enumById.get(id);
    }

    private int id;
    private String description;

    DataForParamerizedTests(int id, String description) {
        this.id = id;
        this.description= description;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }
}
