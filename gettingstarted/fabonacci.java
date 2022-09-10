import java.util.Scanner;
public class fabonacci{
     public static void fab(int num){
        int a = 0;
        int b = 1;
        

      for(int i =1 ; i<= num; i++){
        System.out.println(a); 
        int c = a+b;
        a = b;
        b = c;
        
       
       
      }
      

      
    }
  
  public static void main(String[] args) {
      // write your code here
      Scanner scn= new Scanner(System.in);
      int num = scn.nextInt();
      fab(num);
}
}