package alok.recursion;

import java.util.ArrayList;
import java.util.List;

public class ReturnPermutationOfString {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(returnPermutationOfString(str));
    }

    private static List<String> returnPermutationOfString(String str) {
        List<String> result = new ArrayList<>();
        if (str.isEmpty()) {
            result.add("");
            return result;
        }

        char firstCharacter = str.charAt(0);
        List<String> permutationOfRemainingString = returnPermutationOfString(str.substring(1));

        for (String perm : permutationOfRemainingString) {
            for (int i = 0; i <= perm.length(); i++) { // i <= perm.length() because we have to consider last index in case of substring
                String newPermutation = perm.substring(0, i) + firstCharacter + perm.substring(i);
                result.add(newPermutation);
            }
        }

        return result;
    }
}
