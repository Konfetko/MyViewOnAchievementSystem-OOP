package com.yeroshevich.game.buffs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
public class Buff {
    private final String buffTitle;
    private final int buffVolume;
}
