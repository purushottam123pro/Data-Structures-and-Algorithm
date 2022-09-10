import java.util.Scanner;
public class justprime{
public static boolean isPrimenumber(int num){
    for(int i = 2 ; i * i <= num ; i++){
        if(num % i == 0){
            return false;
        }
        
    }
    return true;
   } 
   public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    int num=scn.nextInt();
    isPrimenumber(num);
    if(isPrimenumber(num)){
        System.out.println(num + "  is prime");
    }
    else {System.out.println(num  + "  is not prime");}
   }
}