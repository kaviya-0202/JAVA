import java.util.Arrays;
public class removeduplicate{
public static void main(String[]args){
    int arr [] = {4,2,4,1,2,3,3};
    Arrays.sort(arr);
    int j=0;
    for(int i=0;i<arr.length;i++){
        if( arr[i]!=arr[i+1]){
            arr[j++]=arr[i];
                arr[j++]=arr[arr.length-1];
                for( i=0;i<j;i++){
                    System.out.println(arr [i]+"");
                }
            }
        }
    }
}


