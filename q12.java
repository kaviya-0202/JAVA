import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = 0, temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += fact(digit);
            temp /= 10;
        }

        if (sum == num) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not Strong Number");
        }
        sc.close();
    }

    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
}
