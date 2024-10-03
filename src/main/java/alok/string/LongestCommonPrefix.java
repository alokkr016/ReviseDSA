package alok.string;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] A) {
        String result = "";
        if(A.length > 0) {
            Arrays.sort(A);
            String smallestWord = A[0];
            for (int i = 0; i < smallestWord.length(); i++) {
                char characterToCheck = smallestWord.charAt(i);
                int j = 1;
                while (j < A.length){
                    if(characterToCheck != A[j].charAt(i)){
                        return result;
                    }
                    j++;
                }
                if(j == A.length){
                    result += characterToCheck;
                }
            }

            return result;
        }else{
            return result;
        }
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
            String arr[] = {"abab", "ab", "abcd"    };
        System.out.println(longestCommonPrefix.longestCommonPrefix(arr));
    }
}
