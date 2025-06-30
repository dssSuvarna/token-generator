package org.example;

import java.util.ArrayList;
import java.util.List;

public class NumberCodes {

    public static void  sumOfAllDigit() {
        int x = 34524;
        int sum = 0;
        while (x!=0){
            sum+=x%10;
            x = x/10;
        }
        System.out.println("sum of all digit "+ sum);
    }
    public static void  largeDigit() {
        int x = 34924;
        int rem = 0;
        int largeDigit = 0;
        while (x!=0){
            rem=x%10;
            largeDigit = rem > largeDigit?rem:largeDigit;
            x = x/10;
        }
        System.out.println("large digit "+ largeDigit);
    }

    public static void  smallDigit() {
        int x = 34924;
        int rem = 0;
        int smallDigit = x%10;
        while (x!=0){
            rem=x%10;
            smallDigit = Math.min(rem, smallDigit);
            x = x/10;
        }
        System.out.println("small digit "+ smallDigit);
    }

    public static void  evenDigit() {
        int x = 34924;
        int rem = 0;
        int rev = 0;
        while (x!=0){
            rem=x%10;
            if (rem%2==0){
                System.out.print("even digit: "+rem);
            }
            x = x/10;
        }
    }

    public static void  powerOfDigit() {
        int base = 5;
        int power = 4;
        int result = 1;
        while (power!=0){
            result *= base;
            power--;
        }
        System.out.println("power :"+ result);
    }

    public static void  binaryToDecimal() {
        int number = 1101;
        int dec = 0;
        int temp = 1;
        while (number!=0){
            int rem = number%10;
            dec = rem*temp+dec;
            number=number/10;
            temp=temp*2;
        }
        System.out.println("decimal :"+ dec);
    }

    public static void  decimalToBinary() {
        int number = 8;
        int bin = 0;
        int temp = 1;
        while (number!=0){
            int rem = number%2;
            bin = rem*temp+bin;
            number=number/2;
            temp=temp*10;
        }
        System.out.println("binary :"+ bin);
    }

    public static void  isPalindrome() {
        int number = 12321;
        int m = number;
        int rev = 0;
        while (number!=0){
            int rem = number%10;
            rev = rev*10+rem;
            number=number/10;
        }
        System.out.println(m==rev?"Palindrome":"Not a palindrome");
    }

    public static List<Integer>  printFibonacci() {
        int n = 5;
        int a = 1;
        int b = 3;
        List<Integer> fbNumbers = new ArrayList<>();
        for (int i = 0; i<n; i++){
            int c = a+b;
            fbNumbers.add(a);
            a = b;
            b = c;
        }
        return fbNumbers;
    }
}
