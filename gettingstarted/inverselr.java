import java.util.Scanner;
public class inverselr{
    public static void inverselr(int num){
        int totaldigit = countdigitnum(num);
        int lastindex = totaldigit;
        int res = 0;
        while(num!=0){
        int lastdigit = num%10;
        num /= 10;
        res += lastindex * (int)Math.pow(10,totaldigit-lastdigit);
        lastindex--;
          
        }
        System.out.println(res);
    }
    public static int countdigitnum(int num){
        int count=0;
        while(num!= 0){
            
            num/=10;
            count++;

        }
        return count;
    }
    public static void main(String[] args){
        Scanner scn =new Scanner(System.in);
        int n = scn.nextInt();
        inverselr(n);
    }
}