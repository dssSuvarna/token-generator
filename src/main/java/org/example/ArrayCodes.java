package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;

public class ArrayCodes {

    public static int secondLargestElement(){
        int[] secondLargestArray = {3, 4, 6, 8};

        Map<String, Integer> largestElement = new HashMap<>();
        for (int j : secondLargestArray) {
            largestElement.put("largestElement", j);
            int currentLargestElement = largestElement.get("largestElement");
            if (j > currentLargestElement) {
                largestElement.replace("largestElement", j);
            }
        }
        return largestElement.get("largestElement");
    }

    public static List<Integer>  checkDuplicateElement(){
        int[] duplicateArrayRequest = {3, 4, 6, 3, 8, 4};

        Map<Integer, Integer> duplicateArray = new HashMap<>();
        for (int j : duplicateArrayRequest) {
            Integer currentDuplicateElement = duplicateArray.get(j);
            if (currentDuplicateElement != null) {
                Integer count = duplicateArray.get(j)+1;
                duplicateArray.replace(j, count);
            } else {
                duplicateArray.put(j, 1);
            }
        }
        List<Integer> result = new ArrayList<>();
        duplicateArray.forEach((key, value) -> {
            if (value>1){
                result.add(key);
            }
        });
        return result;
    }

    public static void  sortArray(){
        int[] array = {3, 0, 4, 0, 0, 6, 3, 8, 4};
        // Bubble Sort Algorithm
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("Sorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void   moveZerosToRight(){
        int[] array = {3, 0, 4, 0, 0, 6, 3, 8, 4};
        int index = 0;
        for (int i: array){
            if (i!=0){
                array[index++] = i;
            }
        }
        while (index<array.length){
            array[index++]=0;
        }
        System.out.println("Sorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static Set<Set<Integer>> findThePairs(){
        int sum = 6;
        int[] array = {3, 2, 4, 0, 1, 5, 4};
        Set<Set<Integer>> result = new HashSet<>();
        for (int i = 0; i < array.length; i++){
            Set<Integer> pair = new HashSet<>();
            for (int j = i+1; j < array.length; j++){
                if (array[i]+array[j] == sum){
                    pair.add(array[i]);
                    pair.add(array[j]);
                    result.add(pair);
                }
            }
        }
        return result;
    }

    public static int smallestElement() {
        int[] array = {3, 2, 4, 0, 1, 5, 4};
        int[] sortedArray = Arrays.stream(array).sorted().toArray();
        return sortedArray[0];
    }

    public static int kthSmallestElement() {
        int position = 3;
        int[] array = {3, 2, 4, 0, 1, 5, 4};
        int[] sortedArray = Arrays.stream(array).sorted().toArray();
        return sortedArray[position-1];
    }

    public static int[] moveNegativesToLeftSide() {
        int index = 0;
        int[] array = {3, -2, 4, 0, -1, 5, -4};
        List<Integer> positiveElements = new ArrayList<>();
        for (int i: array){
            if (i<0){
               array[index++]=i;
            } else {
                positiveElements.add(i);
            }
        }
        for (Integer j: positiveElements){
            array[index++] = j;
        }
        return array;
    }

    public static int findTheSmallestCombination() {
        int sum = 6;
        int[] array = {3, 2, 1, 0, 1, 1, 2, 1};
        int smallestCombination = 0;
        int oldCombination = 0;
        boolean isCombination = false;
        for (int i =0; i < array.length-1; i++){
            int currentSum = 0;
            smallestCombination=0;
            int indexCount = 1;
            for (int j = i; j< array.length; j++){
                int possibleSum =currentSum+array[j];
                currentSum = possibleSum;
                if (possibleSum == sum){
                    smallestCombination = indexCount++;
                    isCombination=true;
                    break;
                }
                smallestCombination=indexCount++;
                isCombination=false;
            }
            if (i==0 && isCombination){
                oldCombination=smallestCombination;
            } else if(i!=0 && oldCombination>smallestCombination && isCombination){
                oldCombination=smallestCombination;
            }

        }
        return oldCombination;
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int start = 0; // Start of the sliding window
        int currentSum = 0; // Current sum of the window
        int minLength = Integer.MAX_VALUE; // Minimum length of subarray

        // Iterate through the array
        for (int end = 0; end < n; end++) {
            // Add the current element to the sum
            currentSum += nums[end];

            // Shrink the window while the sum is greater than or equal to the target
            while (currentSum >= target) {
                // Update the minimum length
                minLength = Math.min(minLength, end - start + 1);

                // Remove the element at 'start' and move the start forward
                currentSum -= nums[start];
                start++;
            }
        }

        // If no valid subarray is found, return 0
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

    // Function to find the common prefix among all strings in the array
    public static String findCommonPrefix(String[] strings) {
        if (strings == null || strings.length == 0) return "";
        String prefix = strings[0];

        for (int i = 1; i < strings.length; i++) {
            while (strings[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    // Main function to find the longest remaining string
    public static String findLongestRemainingString(String[] strings) {
        if (strings == null || strings.length == 0) return "";

        String commonPrefix = findCommonPrefix(strings);
        String longestRemaining = "";

        for (String str : strings) {
            String remaining = str.substring(commonPrefix.length());
            if (remaining.length() > longestRemaining.length()) {
                longestRemaining = remaining;
            }
        }

        return longestRemaining;
    }

    public static int findTotalChocolateBought(int rupees) {
        int costOfOneChocolate = 3;
        int numberOfChocolates = rupees / costOfOneChocolate;
        int wrappers = numberOfChocolates;
        while (wrappers>=3){
           int newChocolate =  wrappers/costOfOneChocolate;
           numberOfChocolates = numberOfChocolates + newChocolate;
           wrappers = wrappers % 3 + newChocolate;
        }
        return  numberOfChocolates;
    }

    public static int getMinSum(int[] array, int n) {
        int len = array.length;

        // Step 1: Calculate the sum of the first 'n' elements
        int currentSum = 0;
        for (int i = 0; i < n; i++) {
            currentSum += array[i];
        }

        int minSum = currentSum;

        // Step 2: Use sliding window technique to find the minimum sum for any n adjacent elements (circular)
        for (int i = 1; i < len; i++) {
            // Remove the element at index i-1 and add the element at index (i + n - 1) % len (circular wraparound)
            currentSum = currentSum - array[i - 1] + array[(i + n - 1) % len];
            minSum = Math.min(minSum, currentSum);
        }

        return minSum;
    }

    public static int maxElement(int[] array) {
        for (int i = 0; i< array.length-1 ; i++){
            if (array[i+1]<array[i]){
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
        }
        return array[array.length-1];
    }

    public static int[] reverseAnArray(int[] array) {
        int[] resultArray = new int[array.length];
        int index = 0;
        for (int i = array.length-1; i >= 0 ; i--){
            resultArray[index++] = array[i];
        }
        return resultArray;
    }

    public static int[] rotateArrayToTheKthStep(int[] array) {
        int step = 3;
        for (int i = 1; i <= step ; i++){
            int temp = array[0];
            array[0] = array[array.length-1];
            for (int j = array.length-1; j > 0; j--){
                array[j] = array[j-1];
            }
            array[1] = temp;
        }
        return array;
    }

    public static int findTheMissingNumber(int[] array) {
        int missingNumber = 0;
        for (int i = 0; i < array.length-1 ; i++){
            int nextNumber = array[i]+1;
            if (nextNumber!= array[i+1]){
                missingNumber = array[i]+1;
                break;
            }
        }
        return missingNumber;
    }

    public static List<Integer> zx(int[] array) {
        List<Integer> duplicateNumbers = new ArrayList<>();
        for (int i = 0; i < array.length-1 ; i++){
            for (int j = i+1; j < array.length-1; j++){
                if (array[i] == array[j]){
                    duplicateNumbers.add(array[i]);
                    break;
                }
            }
        }
        return duplicateNumbers;
    }
    private static boolean isPrime(int number){
        int n = 10;
        int count = 0;
        for (int i = 1; i <= n; i++){
            if (number%i == 0) {
                count++;
            }
        }
        return count == 2;
    }
    public static Map<Integer, Integer> sumOfAdjuscentPrimeNumber() {
        int[] array = new int[]{2,3,5,8,9,7};
        Map<Integer, Integer> sumOfPrime = new HashMap<>();
        for (int i = 0; i < array.length; i++){
            if (ArrayCodes.isPrime(array[i])){
                int sum = 0;
                if (i==0){
                    sum+=array[i+1];
                    sumOfPrime.put(array[i], sum);
                } else if (i==array.length-1) {
                    sum+=array[i-1];
                    sumOfPrime.put(array[i], sum);
                } else {
                    sum+=array[i+1] + array[i-1];
                    sumOfPrime.put(array[i], sum);
                }
            }
        }
        return sumOfPrime;
    }

    public static void secondSmallDigit() {
        int[] array = new int[]{2,3,5,8,9,7};
        int small = array[array.length-1];
        int secondSmall =0;
        for (int i=0; i<array.length; i++){
            if (array[i]<small){
                secondSmall=small;
                small=array[i];
            }
            if (array[i]<secondSmall && small!= array[i]){
                secondSmall=array[i];
            }
        }
        System.out.println("second small digit : "+secondSmall);
    }

    public static void secondOccurenceOfADigit() {
        int[] array = {2,3,5,8,3,7};
        int key = 3;
        int count = 0;
        int index = 0;
        for (int i =0; i< array.length; i++){
            if (array[i] == key){
                count++;
                if (count==2){
                    index = i;
                    break;
                }
            }
        }
        System.out.println("second index of occurence : "+index);

    }

    public static List<Integer> printDuplicateElements() {
        int[] array = {2,3,5,8,3,3,2};
        int index = 0;
        List<Integer> resultArray = new LinkedList<>();
        for (int i =0; i< array.length; i++){
            int count = 0;
            for (int j =i+1; j< array.length; j++){
               if(!resultArray.contains(array[i])){
                    if (array[i]==array[j]){
                        count++;
                    }
                }
            }
            if (count>0){
                resultArray.add(array[i]);
            }
        }
        return resultArray;

    }

    public static Integer largestSumOfTwoElements() {
        int[] array = {2,3,5,8,3,3,9};
        int largestSum = 0;
        List<Integer> resultArray = new LinkedList<>();
        for (int i =0; i< array.length; i++){
            for (int j =0; j< array.length; j++){
                if (i!=j){
                    int sum = array[i]+array[j];
                    if (sum>largestSum){
                        largestSum=sum;
                    }
                }
            }
        }
        return largestSum;

    }

    public static int[] sortFirstHalfInAscendingAndNextInDescending() {
        int[] array = {2,3,5,8,3,3,9};
        int[] resultArray = new int[array.length];
        int index = 0;        for (int i=0; i<array.length-1; i++){
            for (int j=0; j<array.length-1-i; j++){
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
        int half = (array.length/2);

        for (int k=0; k<half; k++){
            resultArray[index++]= array[k];
        }
        for (int l=array.length-1; l>=half; l--){
            resultArray[index++]= array[l];
        }
        return resultArray;

    }

    public static Map<Integer, Integer> freequencyOfElements() {
        int[] array = {2,3,5,8,3,3,9};
        Map<Integer, Integer> result = new HashMap<>();
        for (int i=0; i<array.length; i++){
            if (result.containsKey(array[i])){
                int count = result.get(array[i]);
                result.replace(array[i], ++count);
            } else {
                result.put(array[i], 1);
            }
        }
        return result;
    }
    public static Map<Integer, Integer> sortFrequencyOfElements() {
        int[] array = {2,3,5,8,3,3,9};
        Map<Integer, Integer> result = new HashMap<>();
        for (int i=0; i<array.length; i++){
            if (result.containsKey(array[i])){
                int count = result.get(array[i]);
                result.replace(array[i], ++count);
            } else {
                result.put(array[i], 1);
            }
        }
        // Sort the map by frequency

      return result.entrySet()
            .stream()
            .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue())) // Descending order
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1,
                LinkedHashMap::new
            ));
    }



}
