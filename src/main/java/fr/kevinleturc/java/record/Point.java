package fr.kevinleturc.java.record;

import java.util.Map;

public record Point(int x, int y) {

    public Map<String, Integer> toMap() {
        return Map.of("x", x, "y", y);
    }
}
