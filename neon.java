 import java.util.Scanner;
 public class neon {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        int square = a*a;
        int res= 0;
        while(square!=0){
            int digit= square%10;
            res+=digit;
            square = square/10;
            System.out.println(res);
        }
        if(res==a){
            System.out.println("this is neoan number"); 

        }
        else 
        System.out.println("not a neon number");

    }
    
}
