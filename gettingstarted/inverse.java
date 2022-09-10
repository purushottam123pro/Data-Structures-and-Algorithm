import java.util.Scanner;
public class inverse{
    public static void inverse(int num){
        int lastindex =1, res = 0;
        while(num!= 0){
            
            int lastdigit = num%10;
            num /= 10;
            res += lastindex*(int)Math.pow(10,lastdigit-1);
            lastindex++;


        }
        System.out.println(res);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        inverse(n);
    }
}