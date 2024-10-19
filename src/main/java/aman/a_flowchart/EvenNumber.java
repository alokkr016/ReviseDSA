package aman.a_flowchart;

import java.util.Scanner;

public class EvenNumber {

    public static void evenNumber(int n) {
        for(int i = 1; i<=n; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        evenNumber(num);
        
    }
}
