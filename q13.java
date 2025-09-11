import java.util.Scanner;

public class q13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int result = num;
        while (result > 9) {
            result = digitSum(result);
        }

        if (result == 1) {
            System.out.println("Magic Number");
        } else {
            System.out.println("Not Magic Number");
        }
        sc.close();
    }

    static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
