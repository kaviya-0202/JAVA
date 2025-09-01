 import java.util.Scanner;
 public class equi {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int row=1;row<a-row;row++){
            for(int col=1;col<=a-row;col++){
                System.out.print("");
                for(int col1=1;col1<=2*row-1;col1++){
                    System.out.print("*");
                }
                System.out.println();

            }
        }

    }
}
