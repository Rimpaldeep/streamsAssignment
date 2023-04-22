package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


public class Ques2 {
    public static void main(String[] args) {
        List<Integer> multiplication = new ArrayList<> (Arrays.asList (2,3,6,4,7,9));
        List<Integer> collect = multiplication.stream ().map (i -> i * 2).collect (Collectors.toList ());
        System.out.println (collect);


    }
}
