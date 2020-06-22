package org.easysolution;

public class FindMissingElement {
    public static void main(String[] args) {
        int[] arr = {7, 9, 10, 15};
        findMissingElementSequentially(arr);
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
