import java.util.Scanner;

public class p20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count = 0;
        int temp = num;
        if (num == 0) count = 1;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        System.out.println("Count of digits = " + count);
        sc.close();
    }
}
