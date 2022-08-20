package com.yeroshevich.game.achievements;

import lombok.ToString;

@ToString
public class Achievement {
    private final String description;

    public Achievement(String description) {
        this.description = description;
    }
}
