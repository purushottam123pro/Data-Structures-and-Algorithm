import java.util.Scanner;
public class isPrime{
    
  public static boolean isPrimenumber(int num){
    for(int i = 2 ; i * i <= num ; i++){
        if(num % i == 0){
            return false;
        }
        
    }
    return true;
   } 

   public static void allprinerange(int lo, int hi){
    for(int num = lo  ; num <= hi  ; num ++ )
     {
        if(isPrimenumber(num)){
            System.out.println(num);

        }
     }
   }
   public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    
     while(t-- > 0 ){
        int num  = scn.nextInt();
        if(isPrimenumber(num)){
            System.out.println("prime");

        }
        else{System.out.println("not prime");
        }
    }
  
    // int lo = scn.nextInt();
    // int hi= scn.nextInt();
    //   allprinerange(lo, hi);
    // isPrimenumber(num);
    // boolean r = isPrimenumber(num);
    // System.out.println(r);

  }
}