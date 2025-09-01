 import java.util.Scanner;
 public class pat4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);    
        char ch= sc .next().charAt(0);
        char a='A';
    for(char i=a;i<=ch;i++){
            for(char j= a;j<=i;j++)
            System.out.print(j);
            System.out.println();
}
    }
}

