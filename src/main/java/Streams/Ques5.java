package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ques5 {

    public static void main(String[] args) {
        List <User> list = new ArrayList<> ();
        list.add (new User ("Rimpaldeep", "Kaur", "India", Collections.singleton ("Amritsar, Kerala")));
        list.add (new User ("John", "Kasunic", "Canada", Collections.singleton ("Toronto, Brampton, Scarborough")));
        list.add (new User ("Adam", "Robinson", "Canada", Collections.singleton ("Toronto, Brampton, Scarborough")));
        System.out.println (list);
        
    }
}
