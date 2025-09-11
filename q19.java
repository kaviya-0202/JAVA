import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int product = 1, temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            product *= digit;
            temp /= 10;
        }

        System.out.println(product);
        sc.close();
    }
}
