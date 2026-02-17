import java.util.Scanner;

public class alice_bob {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int n=src.nextInt();
        int[] arr=new int[n];
        int[] brr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=src.nextInt();
        }
        for(int i=0;i<n;i++){
            brr[i]=src.nextInt();
        }
        int ali=0,bob=0;
        for(int i=0;i<n;i++){
                if(arr[i]>brr[i])
                    ali++;
                else if(arr[i]<brr[i])
                    bob++;
        }
        System.out.print("["+ali+","+bob+"]");
    }
}