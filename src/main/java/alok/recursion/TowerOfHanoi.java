package alok.recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 4;
        towerOfHanoi(n, 'a', 'b', 'c');
    }

    private static void towerOfHanoi(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println("move " + n + " from " + a + " to " + c);
            return;
        }
        towerOfHanoi(n - 1, a, c, b);
        System.out.println("move " + n + " from " + a + " to " + c);
        towerOfHanoi(n - 1, b, a, c);

    }
}
