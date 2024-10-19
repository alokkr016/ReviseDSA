package alok.conditions_and_loop;

import java.util.Scanner;

public class FindCharacterCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);
        System.out.println(findCharCase(ch));
    }

    private static int findCharCase(char ch) {
        if(ch >= 'A' && ch <= 'B'){
            return 1;
        }else if (ch >= 'a' && ch <= 'b'){
            return 0;
        }else {
            return -1;
        }

    }
}
