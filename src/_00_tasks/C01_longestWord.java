package _00_tasks;

import java.util.Scanner;

public class C01_longestWord {
    // Create a method that returns the longest word in a sentence.
    // If there are two words with same length, method should return the first one according to alphabetical order.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a sentence with one space between all words : ");
        String input = scan.nextLine();
        LongestWord(input);

    }

    private static void LongestWord(String input) {
        String longestword = "";
        int longestsize = 0;
        input = input.trim().replaceAll("\\p{Punct}", "");
        String[] arr = input.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > longestsize) {
                longestsize = arr[i].length();
                longestword = arr[i];
            }
        }
        System.out.println("The longest word in this sentence is '"+longestword +
                "' which consists of (" + longestsize + ") characters.");
    }
}

