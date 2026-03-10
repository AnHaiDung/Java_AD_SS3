package btvn.bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class UserRepository {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        User u1 = new User("alice","alice@gmail.com","ACTIVE");
        User u2 = new User("bob","bob@yahoo.com","INACTIVE");
        User u3 = new User("charlie","charlie@gmail.com","ACTIVE");

        List<User> users = new ArrayList<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);
        String username = "alice";
        Optional<User> findUserByUsername = users.stream().filter(value -> value.username().contains(username)).findFirst();
        if (findUserByUsername.isPresent()) {
            System.out.println("Welcome " + findUserByUsername.get().username());
        } else {
            System.out.println("Guest login");
        }
    }
}
