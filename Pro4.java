 import java.util.Scanner;
 public class Pro4 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max,min;
        if(a>b){
            max=a;
            min=b;
        }
        else{
            max=b;
            min=a;
        }
        System.out.println("Maximum is:"+max);
        System.out.println("Minimum is:"+min);
        
    }
    
}
