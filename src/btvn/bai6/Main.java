package btvn.bai6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Post> posts = new ArrayList<>();
        posts.add(new Post("Java", Arrays.asList("java", "backend")));
        posts.add(new Post("Python ", Arrays.asList("python", "data")));
        List<String> allTagsFlat = posts.stream().flatMap(p -> p.tags().stream()).toList();
        System.out.println(allTagsFlat);
    }
}
