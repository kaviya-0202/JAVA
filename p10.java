 import java.util.Scanner;
 public class p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int primaryAge = sc.nextInt();
        int addOnAge = sc.nextInt();
        int empType = sc.nextInt();
        int income = sc.nextInt();

    
        boolean isEligible = true;

    
        if (primaryAge < 21 || primaryAge > 60) {
            isEligible = false;
        }

        
        if (addOnAge < 18) {
            isEligible = false;
        }

    
        if (empType < 1 || empType > 4) {
            isEligible = false;
        }

        
        if (income > 300000) {
            isEligible = false;
        }

        
        if (isEligible) {
            System.out.println("Yes. You are eligible for SBI credit cards");
        } else {
            System.out.println("No. You are not eligible for SBI credit cards");
        }

        
    }
}
    

