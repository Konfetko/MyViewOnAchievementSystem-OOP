package com.yeroshevich.game.achievements;

import com.yeroshevich.game.Player;
import com.yeroshevich.game.buffs.IBuff;
import lombok.ToString;

@ToString
public class Achievement {
    private final Player player;
    private final String title;
    private final IBuff buff;

    public Achievement(Player player, String title, IBuff buff) {
        this.player = player;
        this.title = title;
        this.buff = buff;
    }
    public void useEffects(){
        player.useBuff(this.buff);
    }
}
