package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ques1 {
    public static void main(String[] args) {

    IntStream intstream = IntStream.range (0,10);
    intstream.map (i -> i*2).forEach (i -> System.out.println (i));




}
}


