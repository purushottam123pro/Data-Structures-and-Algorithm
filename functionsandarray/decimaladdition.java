import java.util.Scanner;
public class decimaladdition{
    public static int deciaddi(int n,int m){
        int ans= 0,pow=1,carry=0;
        while(n!=0 || m!=0 || carry!=0){
            int sum = carry + n%10 + m%10;
            carry = sum/10;
            sum %=10;
            
            
            ans += sum*pow;
            pow*=10;
            n/=10;
            m/=10;


        }
        return ans;
    }
      public static int binaryaddi(int n,int m){
        int ans= 0,pow=1,carry=0;
        while(n!=0 || m!=0 || carry!=0){
            int sum = carry + n%10 + m%10;
            carry = sum/2;
            sum %=2;
            
            
            ans += sum*pow;
            pow*=10;
            n/=10;
            m/=10;


        }
        return ans;

    }
    public static int anybaseaddi(int n,int m,int b){
        int ans= 0,pow=1,carry=0;
        while(n!=0 || m!=0 || carry!=0){
            int sum = carry + n%10 + m%10;
            carry = sum/b;
            sum %=b;
            
            

            ans += sum*pow;
            pow*=10;
            n/=10;
            m/=10;


        }
        return ans;

    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
            System.out.println(anybaseaddi(scn.nextInt(),scn.nextInt(),scn.nextInt()));
        
    }
}