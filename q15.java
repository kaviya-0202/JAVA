import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();

        int[] freq = new int[10];
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            freq[c - '0']++;
        }

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println(i + "→" + freq[i]);
            }
        }
        sc.close();
    }
}
