package com.techferns.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 *@author techferns
 */
public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) { // Check if index is divisible by 3 and 5
                result.add("FizzBuzz");
            } else if (i % 3 == 0) { // Check if index is divisible by 3
                result.add("Fizz");
            } else if (i % 5 == 0) { // Check if index is divisible by 5
                result.add("Buzz");
            } else {
                result.add(Integer.toString(i)); // add index to list
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> result = fizzBuzz(15);
        System.out.println(Arrays.deepToString(result.toArray()));
    }

    public static List<String> fizzBuzzLambda(int n) { // Solution using Lambda
        List<String> result = new ArrayList<>();
        IntStream.rangeClosed(1, n).mapToObj(i -> i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz " : "Fizz ") : (i % 5 == 0 ? "Buzz " : i + "")).forEach(result::add);
        return result;
    }
}