package menjadi.programmer.data;

import menjadi.programmer.annotation.Fancy;

@Fancy(name = "Agung")
public enum Level {
    STANDARD("Standard Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    private String description;
    Level(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
