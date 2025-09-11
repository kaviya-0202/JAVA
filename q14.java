import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();

        if (num.length() % 2 == 1) {
            int mid = num.length() / 2;
            System.out.println(num.charAt(mid));
        } else {
            System.out.println("-1");
        }
        sc.close();
    }
}
