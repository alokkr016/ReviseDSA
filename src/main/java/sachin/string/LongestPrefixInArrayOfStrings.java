// https://www.interviewbit.com/problems/palindrome-string/

package sachin.string;

public class LongestPrefixInArrayOfStrings{

    public static String longestCommonPrefix(String[] A) {
        int size_of_smallest_string = Integer.MAX_VALUE;
        for (int i=0 ;i < A.length; i++){
            if (size_of_smallest_string > A[i].length()){
                size_of_smallest_string = A[i].length();
            }
        }
        for (int i=0 ;i < A.length; i++){
            for (int j= 0 j<size_of_smallest_string; j++){

            }
        }
    }

    // write recusrion code 

    

   public static void main( String[] args){
      String [] abc = {"hello", "he"};
      System.out.println(longestCommonPrefix(abc));
   }
}