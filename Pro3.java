 import java.util.Scanner;
 public class Pro3 {
    public static void main(String[]args){
        Scanner a= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = a.nextInt();
        if(num%3==0 && num%5==0){
            System.out.println(num+" is divisible by 3 and 5.");
        }
        else{
            System.out.println(num+" is not divisible by 3 and 5.");
        }

    }
    
}
