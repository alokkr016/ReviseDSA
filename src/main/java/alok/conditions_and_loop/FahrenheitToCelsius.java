package alok.conditions_and_loop;

import java.util.Scanner;

public class FahrenheitToCelsius {

    public static int fToC(int f){
        return (int)((f - 32) * (5/9.0));
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i += 20) {
            System.out.println(i + " " + fToC(i));
        }

    }

}
