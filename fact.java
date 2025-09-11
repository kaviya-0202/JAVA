 import java .util.Scanner;
 public class fact {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=1;
        for(int i=3;i>1;i--){
             b =b*i;
        }
        System.out.println(b);
    }
    
}
