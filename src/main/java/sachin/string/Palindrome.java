// https://www.interviewbit.com/problems/palindrome-string/

package sachin.string;

public class Palindrome{

    public static int isPalindrome(String data) {
        int isPalindrome = 1;
        int start = 0;
        int end = data.length() - 1;
        while(start<end){
            if (data.charAt(start) != data.charAt(end)){
                isPalindrome = 0;
                break;
            }
            start++;
            end--;
        }
        return isPalindrome;
    }

    // write recusrion code 

    

   public static void main( String[] args){
      String abc = "hello";
      System.out.println(isPalindrome(abc));
   }
}
