package alok.conditions_and_loop;

import java.util.Scanner;

public class SalaryCalculator {
    //Total_salary = Basic + HRA + DA + Allow – PF
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int basic = in.nextInt();
        char grade = in.next().charAt(0);

        double hra = basic * .2;
        double da = basic  * .5;
        double pf = basic * .11;

        double finalSalary = basic + hra + da - pf;

        if(grade == 'A'){
            finalSalary += 1700;
        } else if (grade == 'B') {
            finalSalary += 1500;
        }else{
            finalSalary += 1300;
        }

        System.out.println(Math.round(finalSalary));
    }
}
