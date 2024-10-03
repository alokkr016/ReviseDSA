

package sachin.coding_ninja_in_order;

import java.util.Scanner;

public class Average{

    public static double averageOfNumbers(int a , int b ,int c) {
         double ans = (a+b+c)/3.0;
         return ans;
    }


   public static void main( String  args []){

      Scanner input = new Scanner(System.in);
      int a = input.nextInt();
      int b = input.nextInt();
      int c = input.nextInt();
      
      System.out.println(averageOfNumbers(a, b, c));
   }

}


/*

3 syntax of creating array

// spread operator - to learn

string [] arr
string arr []


String is not premitive (pascal casing )
int  is primitive (first char is small)

*/