package com.yeroshevich.game.achievements;

import lombok.ToString;

import java.util.Objects;

@ToString
public class AchievementDetails {
    protected final String description;
    protected final String title;

    public AchievementDetails(String description, String title) {
        this.description = description;
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AchievementDetails that = (AchievementDetails) o;
        return Objects.equals(description, that.description) && Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, title);
    }
}
