package btvn.bai5;

import btvn.bai3.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("alice","alice@gmail.com","ACTIVE");
        User u2 = new User("bob","bob@yahoo.com","INACTIVE");
        User u3 = new User("charlie","charlie@gmail.com","ACTIVE");
        User u4 = new User("an","an@gmail.com","ACTIVE");

        List<User> users = new ArrayList<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);

        users.stream().sorted(Comparator.comparing((User user) -> user.username().length()).reversed()).limit(3).forEach(System.out::println);
    }
}
