package com.codedifferently.labs.partA.ex01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partA.ex01.PlayerTest;

public class PlayerTest2 {
    @Test
    public void PlayerTest01(){
        String expected = "Player: LeBron James\n" +
                "Height: 2.06m\n" +
                "yearsInLeague: 20 yrs\n" +
                "Team:Lakers\n" +
                "Player Count:3\n" +
                "\n" +
                "Player: Stephen Curry\n" +
                "Height: 1.88m\n" +
                "yearsInLeague: 14 yrs\n" +
                "Team:Warriors\n" +
                "Player Count:3\n" +
                "\n" +
                "Player: James Harden\n" +
                "Height: 1.96m\n" +
                "yearsInLeague: 33 yrs\n" +
                "Team:Sixers\n" +
                "Player Count:3\n" +
                "\n" +
                "Player Count:3";
        String actual = PlayerTest.team();
        Assertions.assertEquals(expected, actual);
    }
}
