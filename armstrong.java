 import java.util.Scanner;
 public class armstrong {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int originalnum = num;
        int result=0;
        while(num!=0){
            int digit= num %10;
            result += Math.pow(digit,3);
            num /=10;
            System.out.println(result);
        
        }
        if(result==originalnum){
            System.out.println("this is armstrong number");
        }
            else
                System.out.println("not a armstrong number");
            
        }
        

    }
    

