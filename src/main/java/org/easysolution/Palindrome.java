package org.easysolution;

public class Palindrome {
    public static void main(String[] args) {
        String str = "abhcchba";

        char[] chars = str.toCharArray();

        boolean result = isPalindrome(chars, 0, chars.length - 1);
        boolean result2 = isPalindrome(chars);

        System.out.println("isPalindrome recursively: " + result);
        System.out.println("isPalindrome : " + result2);

    }

    private static boolean isPalindrome(char[] chars) {
        int lowerBound = 0;
        int upperBound = chars.length - 1;

        while (lowerBound <= upperBound) {
            if (chars[lowerBound] != chars[upperBound]) {
                return false;
            }
            lowerBound++;
            upperBound--;
        }
        return true;
    }

    public static boolean isPalindrome(char[] chars, int lowerBound, int upperBound) {
        if (upperBound <= lowerBound) {
            return true;
        }
        if (chars[lowerBound] != chars[upperBound]) {
            return false;
        } else {
            return isPalindrome(chars, ++lowerBound, --upperBound);
        }
    }


}
