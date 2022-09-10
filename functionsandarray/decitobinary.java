import java.util.Scanner;
public class decitobinary{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b= scn.nextInt();
        int c = scn.nextInt();
        int anytodeci=anytodecimal(n,b);
        // System.out.println(anytodeci);
        int anytoany= decimaltoany(anytodeci,c);
        System.out.println(anytoany);

        //  int binary = decitobina(n);
        //  int decimal = binarytodeci(binary);
        // System.out.println(binary);
        // System.out.println(decimal);

    }
    public static int decitobina(int n){
        // int power = 0;
        int power = 1;
        int ans = 0;
        while(n != 0 ){
            
            int ld = n%2;
            n/=2;
            // ans+= ld*(int)Math.pow(10,power);
             ans += ld*power;
             power*=10;
            // power++;

        }
        return ans;
    }
    public static int binarytodeci(int n){
        int power = 1;
        int ans = 0;
        while(n!=0){
            int rem = n%10;
            n/=10;
            ans += rem*power;
            power*=2;
        }
        return ans;
    }
    public static int decimaltoany(int n,int c){
        int ans=0;
        int power = 1;
        while(n!=0){
            int rem=n%c;
            n/=c;
            ans += rem*power;
            power*=10;
        }
        return ans;
    }
    public static int anytodecimal(int n,int b){
        int ans = 0, power=1;
        while(n!=0){
            int rem= n%10;
            n/=10;
            ans+= rem*power;
            power*=b;
        }
        return ans;
    }
}