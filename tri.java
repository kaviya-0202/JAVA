 import java.util.Scanner;
 public class tri {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the angles:");
        int angle=sc.nextInt();
        int angle1=sc.nextInt();
        int angle2=sc.nextInt();
        if(angle==angle1){
            if(angle1==angle2){
                System.out.println("equilateral trianlge");
            }
        
        else if(angle == angle1 && angle1 != angle2 && angle != angle2){
                 System.out.println("isoceles triangle"); 
            
        }
       
                   
        }
                
                else
                    if(angle !=angle1 && angle1 != angle2 &&angle2!=angle)
                    System.out.println("scalen triangle");
                }
            }
            
        
        

    

