package sachin.coding_ninja_in_order.c_conditional_and_loops;

import java.util.Scanner;

public class FindCharacterCase  {


    public static int findChar(char a ){
        if ('a'<=a && a<='z'){
            return 0;
        }else if('A'<=a && a<='Z'){
            return 1;
        }else{
            return -1;
        }
    }
    

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        char char1 = input.next().charAt(0);

        System.out.println(findChar(char1));

    }
}

/*
 * char input =>
 * char char1 = input.next().charAt(0);
 */