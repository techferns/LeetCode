package com.techferns.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 *
 * @author techferns
 */
public class FizzBuzzSwitch {
    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            switch (i % 15) {  // 3 * 5 = 15
                case 0:
                    result.add("FizzBuzz");
                    break;
                case 3: case 6: case 9: case 12:
                    result.add("Fizz");
                    break;
                case 5: case 10:
                    result.add("Buzz");
                    break;
                default:
                    result.add(Integer.toString(i));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> result = fizzBuzz(15);
        System.out.println(Arrays.deepToString(result.toArray()));
    }

}
