import java.util.*;

            public class digitnum{
       public static int countDigitOfNumber(int num){
       //  public static void countDigitOfNumber(int num){
       int count = 0;
          while(num != 0){
        num = num/10;
        count++;
           }
        return count;
        //  System.out.println(count);
          }
      public static int reverseOfnumber(int num){
        int ans = 0;
         while(num != 0){
        int digit = num%10;
         num = num/10;
           ans = ans*10 + digit;
            }
           return ans;
      }
      public static void printDigit(int num){ 
              while(num != 0){
               int digit1 = num %10;
               num= num/10;
               System.out.println(digit1);
                 }
               }
    public static void digitOfnumberp(int num){
                    int len = countDigitOfNumber(num) - 1;
                     while(len>= 0){
    
                      int digit = num / (int)Math.pow(10,len);
                         num = num % (int)Math.pow(10,len);
                        System.out.println(digit);
                        len--;
                        }
                    }
    


    public static void main(String[] args){
    
                 Scanner scn = new Scanner(System.in);
                  int num = scn.nextInt();
                    // countDigitOfNumber()
    
                 // int ans = countDigitOfNumber(num);
                    // System.out.println(ans);
     
                  digitOfnumberp(num);
   
     
                   //  printDigit(nval);
                    //  System.out.println(nval);

                  }
                      }