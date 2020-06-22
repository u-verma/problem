package org.easysolution;

public class CheckSequence {

    public static void main(String[] args) {
        int[] sequence = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean result = checkSequence(sequence, sequence.length - 1);
        System.out.println("Sequence " + result);
    }

    public static boolean checkSequence(int[] seq, int size) {
        int number = seq[size];
        while (size >= 0) {
            if (seq[size] != number) {
                return false;
            }
            number--;
            size--;
        }
        return true;
    }

    public static boolean checkSequenceRecursive(int[] seq, int size) {
        int number = seq[size];
        while (size >= 0) {
            if (seq[size] != number) {
                return false;
            }
            number--;
            size--;
        }
        return true;
    }
}
