import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();

        if (num.length() == 1) {
            System.out.println(num);
        } else {
            char first = num.charAt(0);
            char last = num.charAt(num.length() - 1);

            String swapped = last + num.substring(1, num.length() - 1) + first;
            System.out.println(swapped);
        }
        sc.close();
    }
}
