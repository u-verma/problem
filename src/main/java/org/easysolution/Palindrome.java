package org.easysolution;

public class Palindrome {
    public static void main(String[] args) {
        String str = "abhchba";

        char[] chars = str.toCharArray();

        boolean result = isPalindrome(chars, 0, chars.length - 1);

        System.out.println("isPalindrome: " + result);

    }

    public static boolean isPalindrome(char [] chars, int lowerBound, int upperBound){
        if(upperBound <= lowerBound){
            return true;
        }
        if(chars[lowerBound] != chars[upperBound]){
            return false;
        }else{
            return isPalindrome(chars, ++lowerBound, --upperBound);
        }
    }


}
