package com.yeroshevich;

import com.yeroshevich.StreamParse.HtmlTwitchParser;
import com.yeroshevich.game.Player;
import com.yeroshevich.game.achievements.Achievement;
import com.yeroshevich.game.achievements.AchievementManager;
import com.yeroshevich.game.buffs.StrengthBuff;
import com.yeroshevich.game.stats.Stats;

import javax.sql.rowset.serial.SerialBlob;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.*;
import java.util.regex.Pattern;

public class Main {
  
    public static void main(String[] args) throws IOException, SQLException {


        AchievementManager manager = new AchievementManager();
        Player player = new Player("konfetko",new Stats(5,2));
        System.out.println(player);
        manager.completeAchievement(new Achievement(player,"Потомок Давида",new StrengthBuff(5)));
        System.out.println(player);


    }

}
