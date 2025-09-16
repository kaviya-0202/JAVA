  import java.util.Arrays;
  import java.util.*;
 public class lrotation {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        int leftr=sc.nextInt();
        
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        leftr=leftr%size;
        for(int i=1;i<leftr;i++){
    int temp=arr[0];
    for(int j =0;j<size-1;j++){
        arr[j]=arr[j+1];

    }
    arr[size-1]=temp;
        }
        System.out.println(Arrays.toString(arr));

    }
    
}
