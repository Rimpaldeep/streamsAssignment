package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ques4 {
    public static void main(String[] args) {
        List<Integer> average = new ArrayList<> (Arrays.asList (4, 2, 3, 6, 7, 8));
        average.stream ().mapToInt (i -> i).average ().ifPresent (avg -> System.out.println (avg));

    }
}

