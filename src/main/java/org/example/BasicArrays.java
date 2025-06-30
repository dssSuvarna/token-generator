package org.example;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BasicArrays {

    public static int  testOperator() {
        int x = 10;
        return x++;
    }

    public static void   mapAndFlatMap() {
        List<String> names = List.of("dee", "meg");
        List<Integer> nameLengths = names.stream().map(String::length).toList();
        System.out.println("map result : "+ Arrays.toString(nameLengths.toArray()));

        List<List<String>> flatMapNames = List.of(List.of("dee", "meg"), List.of("kim", "nat"));
        List<String> flatMapNamesLengths = flatMapNames.stream().flatMap(List::stream).toList();
        System.out.println("map result : "+ Arrays.toString(flatMapNamesLengths.toArray()));
    }

    public static void   switchCondition() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        char op = scanner.next().charAt(0);
        int y = scanner.nextInt();
        switch (op){
            case '+':
                System.out.println(x+y);
                break;
            case '-':
                System.out.println(x-y);
                break;
            default:
                System.out.println("invalid input");
        }
    }
}
