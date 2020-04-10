package com.kodilla;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class diceThrowTestSuite {
    @Test
    public void testDiceThrow() {
        //Given
        List<Integer> diceThrowResults = new ArrayList();

        diceThrowResults.add(0, new Random().nextInt(2));
        diceThrowResults.add(1, new Random().nextInt(2));
        diceThrowResults.add(2, new Random().nextInt(2));
        diceThrowResults.add(3, new Random().nextInt(2));

        //When
        int sum = (diceThrowResults.get(0) + diceThrowResults.get(1) + diceThrowResults.get(2) + diceThrowResults.get(3));

        //Then
        System.out.println(sum + " " + diceThrowResults.get(0) + " " + diceThrowResults.get(1) + " " + diceThrowResults.get(2) + " " + diceThrowResults.get(3));
    }
}
