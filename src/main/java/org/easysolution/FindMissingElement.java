package org.easysolution;

import java.util.HashSet;
import java.util.Set;

public class FindMissingElement {
    public static void main(String[] args) {
        int[] arr = {7, 9, 10, 15};
        findMissingElementSequentially(arr);

        int [] unsortedArr = {2, 4, 10, 7};
        int position = 5;

        int missingElement = findKthMissingElement(unsortedArr, position);

        System.out.println("K th missing element is :" + missingElement);
    }

    private static int findKthMissingElement(int[] unsortedArr, int position) {

        int min = unsortedArr[0];
        int max = unsortedArr[0];
        Set integerSet = new HashSet<Integer>();
        int missingCounter = 0;

        for (int index = 0; index < unsortedArr.length; index++) {

            if (unsortedArr[index] < min){
                min = unsortedArr[index];
            }else if(unsortedArr[index] > max){
                max = unsortedArr[index];
            }

            integerSet.add(unsortedArr[index]);
        }

        for (int counter = min; counter <=max ; counter++) {
            if(!integerSet.contains(counter)){
                missingCounter++;
                if (position == missingCounter){
                    return counter;
                }
            }
        }

        return -1;
    }

    private static void findMissingElementSequentially(int[] arr) {
        int diff = arr[0];

        for (int index = 1; index < arr.length; index++) {
            while (diff < arr[index] - index) {
                System.out.println("missing element : " + (diff + index));
                diff++;
            }
        }
    }
}
