import java.util.Scanner;
public class pat5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            
            for (char a = 'a'; a < 'a' + row; a++) {
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
