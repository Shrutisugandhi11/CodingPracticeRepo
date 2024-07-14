package org.example.lambda;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static Integer random(Set<Integer> set) {
        return  set.stream().findFirst().get();
          }

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(100);
        set.add(1000);
        set.add(10000);
        set.add(100000);
        set.add(1000000);
        System.out.println(random(set));
        System.out.println(random(set));
        System.out.println(random(set));


        Greeter greeter = (name) -> {
            System.out.println("Good morning: " + name);
        };
        greeter.wish("shruti");
    }
}
