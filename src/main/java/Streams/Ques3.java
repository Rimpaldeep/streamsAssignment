package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ques3 {
    public static void main(String[] args) {
        List <Integer> addition = new ArrayList<> (Arrays.asList (1,2,3,4,5,6,7,8));
        addition.stream ().map (i -> i+2).filter (i -> i%2==0).forEach (i -> System.out.println (i));
    }
}
