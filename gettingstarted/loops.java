import java.util.Scanner;
public class loops{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        //  for(int a = 1; a <= num; a++ ){
        //      System.out.println(a);
        //       }
        //     for(int a = num ; a >= 1; a--){
        //       System.out.println(a);
        //      }

        //     for(int multi = 1; multi <= 10; multi++){
        //      System.out.println(num + " * " + multi + " = " + num*multi);
        //     }

        boolean isPrime = true;
        for(int a = 2 ; a < num ; a++){
            if(num % a == 0){
            isPrime = false;
            break;
            }
         }
           if(isPrime){
             System.out.println(num + " is prime");
              }
            else {
                 System.out.println(num + " is not prime");
            }
        
    }
}