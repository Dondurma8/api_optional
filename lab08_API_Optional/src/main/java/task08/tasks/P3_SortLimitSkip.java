package task08.tasks;

import task08.data.TestData;
import task08.model.Post;

import java.util.List;

public
class P3_SortLimitSkip {

    public static void go() {

        printHeader("Problem P3 – sorted(), limit(), skip()");

        List<Post> posts = TestData.getPosts();

        System.out.println("--- [1] TOP 3 posts by likes ---");
//TODO 11


        System.out.println("\n--- [2] Posts from newest ---");
//TODO 12

        System.out.println("\n--- [3] Posts starting from the 4th (skip 3) ---");
//TODO 13

        System.out.println("\n--- [4] Pagination – page 2, size 4 ---");
        int page     = 2;
        int pageSize = 4;

//TODO 14

        System.out.println("\n--- [BONUS] Sorting: category → likes descending ---");
//TODO 15


    }

    private static void printHeader(String title) {
        System.out.println("\n" + "=".repeat(60));
        System.out.println(" " + title);
        System.out.println("=".repeat(60));
    }
}