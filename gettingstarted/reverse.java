import java.util.Scanner;
public class reverse{
    public static void reverseofnumber(int num){
        int digit;
        while(num!=0){
            digit = num%10;
            num /= 10;
            System.out.println(digit);
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
         int num = scn.nextInt();
         reverseofnumber(num);

        
    }
}