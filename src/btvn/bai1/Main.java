package btvn.bai1;

import java.io.ObjectInputFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        User u1 = new User("alice","alice@gmail.com","ACTIVE");
        User u2 = new User("bob","bob@gmail.com","INACTIVE");
        User u3 = new User("charlie","charlie@gmail.com","ACTIVE");

        List<User> studentList = new ArrayList<>();
        studentList.add(u1);
        studentList.add(u2);
        studentList.add(u3);

        studentList.forEach(System.out::println);
    }
}
