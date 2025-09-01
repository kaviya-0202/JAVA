import java.util.Scanner;

public class Pro6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();       
        int gender = sc.nextInt();    

        if (gender != 1 && gender != 2) {
            System.out.println("Invalid");
        } else {
            if (age < 25) {
                if (gender == 1) {
                    System.out.println("Group 1");
                } else {
                    System.out.println("Group 2");
                }
            } else if (age >= 25 && age <= 45) {
                if (gender == 1) {
                    System.out.println("Group 3");
                } else {
                    System.out.println("Group 4");
                }
            } else { 
                System.out.println("Group 5");
            }
        }
    }
}
