package alok.introduction;

public class IsMemberOfFibonacci {
    public static boolean isMemberOfFibonacci(int n) {
        if (n <= 1) {
            return true;
        }
        int a = 0;
        int b = 1;
        int c = a + b;
        boolean isMember = false;

        while (c <= n) {
            c = a + b;
            if (c == n) {
                isMember = true;
            }
            a = b;
            b = c;
        }

        return isMember;
    }

    public static void main(String[] args) {
        for (int i = 1; i <=13; i++) {
            if (isMemberOfFibonacci(i)) {
                System.out.print(i + " ");
            }
        }
//        System.out.println(isMemberOfFibonacci(13));
    }
}
