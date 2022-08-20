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
    static int[] twosum(int[] nums,int sum){
        Map<Integer,Integer> complements = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer complementIndex = complements.get(nums[i]);
            if(complementIndex!=null)
                return new int[]{i,complementIndex};
            complements.put(sum-nums[i],i);
        }
        return nums;
    }
    public static void main(String[] args) throws IOException, SQLException {


        AchievementManager manager = new AchievementManager();
        Player player = new Player("konfetko",new Stats(5,2));
        System.out.println(player);
        manager.completeAchievement(new Achievement(player,"Потомок Давида",new StrengthBuff(5)));
        System.out.println(player);

//        Set<User> users = new HashSet<>(); // при добавлении вызывается метод hashCode у каждого юзера,
//                                            // если этот хэш одинаковый,то вызывается метод equals
//        users.add(new User(1L,"A"));
//        users.add(new User(1L,"B"));
//        users.add(new User(2L,"C"));
//
//        for(var user:users){
//            System.out.println(user);
//        }


        //HtmlTwitchParser parser = new HtmlTwitchParser("https://www.twitch.tv/directory/game/Just%20Chatting");
//        HtmlTwitchParser parser = new HtmlTwitchParser("");
//        parser.parse();

//        InputStream stream = new FileInputStream(new File("src/main/resources/ArcheAge_sample.jpg"));
//        var blob = new SerialBlob(stream.readAllBytes());
//        System.out.println(blob);

//        for (var i:twosum(new int[]{5,2,4},9)
//             ) {
//            System.out.println(i);
//        }
    }

}