package org.example.PerformingOperations2011;

import java.sql.Array;

public class PerformingOperations2011 {
//    There is a programming language with only four operations and one variable X:
//
//            ++X and X++ increments the value of the variable X by 1.
//            --X and X-- decrements the value of the variable X by 1.
//    Initially, the value of X is 0.
//
//    Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.
//    Example 1:
//    Input: operations = ["--X","X++","X++"]
//    Output: 1

    public static void main(String[] args) {

        int x = 0;
        String[] operations = new String[]{"--X", "X++", "X++"};

        for (String operation : operations) {
            if (operation.charAt(1) == '-') x--;
            else x++;
        }


//        int arrLength = operation.length;
//
//        for (int i = 0; i < arrLength; i++) {
//
//            System.out.println("Before operation X = " + x);
//
//            String operate = operation[i];
//
//            if (operate.contains("X++")) ++x;
//            else if (operate.contains("++X")) x++;
//            else if (operate.contains("X--")) x--;
//            else if (operate.contains("--X")) --x;
//
//            System.out.println("After operation X = " + x);
//

//
//        if (operate.contains("X++")){
//            ++x;
//        } else if (operate.contains("++X")) {
//            x++;
//        }else if (operate.contains("X--")) {
//            x--;
//        }else if (operate.contains("--X")) {
//            --x;
//        }

        }


    }

