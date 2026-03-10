package btvn.bai4;

import btvn.bai3.User;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("alice","alice@gmail.com","ACTIVE");
        User u2 = new User("bob","bob@yahoo.com","INACTIVE");
        User u3 = new User("charlie","charlie@gmail.com","ACTIVE");
        User u4 = new User("alice","alice1@gmail.com","ACTIVE");

        List<User> users = new ArrayList<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);

        Set<String> seen = new HashSet<>();
        List<User> removeUser = users.stream()
                .filter(user -> seen.add(user.username()))
                .toList();

        removeUser.forEach(System.out::println);
    }
}
