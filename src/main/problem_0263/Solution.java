package problem_0263;

public class Solution {

    public static void main(String[] args) {
        System.out.printf("is 6 ugly? %b\n", isUgly(6));
        System.out.printf("is 1 ugly? %b\n", isUgly(1));
        System.out.printf("is 14 ugly? %b\n", isUgly(14));
    }
    public static boolean isUgly(int n) {
        while (n > 0) {
            if (n == 1)
                return true;
            if (n % 2 == 0)
                n = n / 2;
            else if (n % 3 == 0)
                n = n / 3;
            else if (n % 5 == 0)
                n = n / 5;
            else
                return false;
        }
        return false;
    }
}
