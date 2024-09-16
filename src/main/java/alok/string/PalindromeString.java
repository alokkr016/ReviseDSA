package alok.string;

/**
 * https://www.interviewbit.com/problems/palindrome-string/
 */

public class PalindromeString {

    public int isPalindrome(String A) {
        A = A.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return isPalindromeHelper(A, 0, A.length() - 1);
    }

    //It might fail due to stackoverflow
    private int isPalindromeHelper(String a, int start, int end) {
        if(start >= end){
            return 1;
        }

        if (a.charAt(start) != a.charAt(end)) {
            return 0;
        } else {
            return isPalindromeHelper(a, start + 1, end - 1);
        }
    }

    private int isPalindromeIterative(String a, int start, int end) {
        int isPalindrome = 1;

        while (start < end) {
            if (a.charAt(start) != a.charAt(end)) {
                isPalindrome = 0;
                break;
            }
            start++;
            end--;

        }

        return isPalindrome;
    }


    public static void main(String[] args) {
        PalindromeString palindromeString = new PalindromeString();
        String input = "an";
        System.out.println(palindromeString.isPalindrome(input));
    }
}
