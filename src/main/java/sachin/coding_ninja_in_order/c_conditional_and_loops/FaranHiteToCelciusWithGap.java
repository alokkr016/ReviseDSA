package sachin.coding_ninja_in_order.c_conditional_and_loops;

import java.util.Scanner;

public class FaranHiteToCelciusWithGap  {
 

    public static double FtoC(int f){
        //c= f-32*5/9
        return ((f-32)*5)/9.0;
    }

    public static void FtoCWithGaps(int s , int b, int g){
        for(int i= s; i<=b; i+=g){
            System.out.println(i +" "+ FtoC(i) + "\n" );
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int s= in.nextInt();
        int e= in.nextInt();
        int g= in.nextInt();
        
        FtoCWithGaps(s,e,g);
    }
}
    

