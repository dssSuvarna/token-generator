package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int secondLargestElement  = ArrayCodes.secondLargestElement();
        System.out.println("Largest element of the Array : "+secondLargestElement);

        System.out.println("===================================================");

        List<Integer> checkDuplicateElement  = ArrayCodes.checkDuplicateElement();
        System.out.println("Duplicate elements in an Array : "+checkDuplicateElement);

        System.out.println("===================================================");

        ArrayCodes.sortArray();
        ArrayCodes.moveZerosToRight();

        System.out.println("===================================================");

        Set<Set<Integer>> pair = ArrayCodes.findThePairs();
        System.out.println("Pair : "+pair);

        System.out.println("===================================================");

        int smallestElement = ArrayCodes.smallestElement();
        System.out.println("Smallest element : "+smallestElement);

        System.out.println("===================================================");

        int kthSmallestElement = ArrayCodes.kthSmallestElement();
        System.out.println("kth Smallest element : "+kthSmallestElement);

        System.out.println("===================================================");

        int[] moveNegativesToLeftSide = ArrayCodes.moveNegativesToLeftSide();
        System.out.println("move negatives to right : "+ Arrays.toString(moveNegativesToLeftSide));

        System.out.println("===================================================");

        int[] arr = {2, 3, 1, 2, 4, 3};
        int target = 7;
        // Get the result
        int result = ArrayCodes.minSubArrayLen(target, arr);
        // Print the result
        System.out.println("Smallest subarray length: " + result); // Output: 2

        System.out.println("===================================================");

        int subArray = ArrayCodes.findTheSmallestCombination();
        System.out.println("move negatives to right : "+ subArray);

        System.out.println("===================================================");


        String[] example1 = {"Thalaiva", "Thala", "Thalapathy"};
        String[] example2 = {"Raja", "Software"};
        String[] example3 = {"Hibambe", "Hibambe"};
        String[] example4 = {"HyhRaja", "HibokmbeRaja"};

        System.out.println("Example 1 Output: " + ArrayCodes.findLongestRemainingString(example1)); // Output: "pathy"
        System.out.println("Example 2 Output: " + ArrayCodes.findLongestRemainingString(example2)); // Output: "Software"
        System.out.println("Example 3 Output: " + ArrayCodes.findLongestRemainingString(example3));
        System.out.println("Example 3 Output: " + ArrayCodes.findLongestRemainingString(example4));

        System.out.println("===================================================");

        int chocolates = ArrayCodes.findTotalChocolateBought(21);
        System.out.println("Total number of chcocolates : "+ chocolates);

        System.out.println("===================================================");

        int[] array1 = {3, 4, 5, 1, 2};
        int n1 = 3;
        System.out.println("Minimum sum for array1: " + ArrayCodes.getMinSum(array1, n1)); // Output: 6


        System.out.println("===================================================");

        int[] array = {9, 4, 6, 1, 2};
        int maxElement = ArrayCodes.maxElement(array);
        System.out.println("max element : "+ maxElement);

        System.out.println("===================================================");

        int[] arrayReverse = {9, 4, 6, 1, 2};
        int[] reversedArray = ArrayCodes.reverseAnArray(arrayReverse);
        System.out.println("reversed array elements : "+ Arrays.toString(reversedArray));


        System.out.println("===================================================");

        int[] rotateAnArray = {9, 4, 6, 1, 2};
        int[] rotatedAnArray = ArrayCodes.rotateArrayToTheKthStep(rotateAnArray);
        System.out.println("Kth rotated array elements : "+ Arrays.toString(rotatedAnArray));

        System.out.println("===================================================");

        int[] missingNumberArray = {5,3,7,8,10};
        int missingNumber = ArrayCodes.findTheMissingNumber(missingNumberArray);
        System.out.println("Missing number in the elements : "+ missingNumber);

        System.out.println("===================================================");

        int resultInt = BasicArrays.testOperator();
        System.out.println("Operator result : "+ resultInt);

        System.out.println("===================================================");

        BasicArrays.mapAndFlatMap();

        System.out.println("===================================================");

        BasicArrays.switchCondition();

        System.out.println("===================================================");

        new  Test();
        new Test();
        Test t1 = new Test();
        System.out.println(t1.x);

        System.out.println("===================================================");
        NumberCodes.sumOfAllDigit();

        System.out.println("===================================================");
        NumberCodes.largeDigit();

        System.out.println("===================================================");
        NumberCodes.smallDigit();

        System.out.println("===================================================");
        NumberCodes.evenDigit();

        System.out.println("===================================================");
        NumberCodes.powerOfDigit();

        System.out.println("===================================================");
        NumberCodes.binaryToDecimal();

        System.out.println("===================================================");
        NumberCodes.decimalToBinary();

        System.out.println("===================================================");
        NumberCodes.isPalindrome();

        System.out.println("===================================================");
        List<Integer> fb = NumberCodes.printFibonacci();
        System.out.println("Fibonacci numbers : "+fb);

        System.out.println("===================================================");
        Map<Integer, Integer> sumOfPrime = ArrayCodes.sumOfAdjuscentPrimeNumber();
        System.out.println("Sum of adjuscent prime : "+sumOfPrime);

        System.out.println("===================================================");
        ArrayCodes.secondSmallDigit();

        System.out.println("===================================================");
        ArrayCodes.secondOccurenceOfADigit();

        System.out.println("===================================================");
        List<Integer> duplicateElements =ArrayCodes.printDuplicateElements();
        System.out.println("Print duplicate elements : "+duplicateElements);

        System.out.println("===================================================");
        Integer largestSumOfTwoElements =ArrayCodes.largestSumOfTwoElements();
        System.out.println("Largest sum of two elements : "+largestSumOfTwoElements);

        System.out.println("===================================================");
        Map<Integer, Integer>  frequencyOfElements =ArrayCodes.freequencyOfElements();
        System.out.println("frequency of elements : "+frequencyOfElements);

        System.out.println("===================================================");
        Map<Integer, Integer>  sortedFrequencyOfElements =ArrayCodes.sortFrequencyOfElements();
        System.out.println("sorted frequency of elements : "+sortedFrequencyOfElements);
    }

}