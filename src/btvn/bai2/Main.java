package btvn.bai2;

import java.io.ObjectInputFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        User u1 = new User("alice","alice@gmail.com","ACTIVE");
        User u2 = new User("bob","bob@yahoo.com","INACTIVE");
        User u3 = new User("charlie","charlie@gmail.com","ACTIVE");

        List<User> studentList = new ArrayList<>();
        studentList.add(u1);
        studentList.add(u2);
        studentList.add(u3);

        studentList.forEach(System.out::println);
        System.out.println("nhung user co duoi la gmail.com");
        studentList.stream().filter( value -> value.email().contains("gmail.com")).forEach(System.out::println);

    }
}
