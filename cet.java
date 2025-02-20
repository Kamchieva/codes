package Queue;

import java.util.HashSet;
import java.util.Set;

public class cet {

    public static void main(String[] args) {

        Set<String> balls = new HashSet<>();
        balls.add("blue");
        balls.add("green");
        balls.add("yellow");
        balls.add("red");
        balls.remove("red");

        balls.add(new String("purple"));
        System.out.println(balls.size());
        balls.forEach(System.out::println);
    }


    }

