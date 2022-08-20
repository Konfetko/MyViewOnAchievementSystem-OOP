package com.yeroshevich.game.achievements;

import lombok.ToString;

import java.util.Objects;

@ToString
public class Achievement {
    private final String description;

    public Achievement(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Achievement that = (Achievement) o;
        return Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description);
    }
}
