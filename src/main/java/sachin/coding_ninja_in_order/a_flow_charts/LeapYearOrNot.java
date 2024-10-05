package sachin.coding_ninja_in_order.a_flow_charts;

import java.util.Scanner;

public class LeapYearOrNot {

    public static boolean isLeap(int year){
        boolean isLeap = false;
        if (year%4 == 0){
            if (year % 100 == 0){
                if(year%400 == 0){
                    isLeap =true;
                }else{
                    isLeap =false;
                }
            }else{
                isLeap =true;
            }
        }else{
            isLeap = false;
        }
        return isLeap ;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year = input.nextInt();

        int n = input.nextInt();
        for (int i= 1; i<n;i++){
            System.out.println(isLeap(year));
        }
        

    }

}
