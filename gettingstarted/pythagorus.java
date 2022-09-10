import java.util.Scanner;
public class pythagorus{
    public static boolean triplet(int a, int b, int c){
        if(a*a==b*b+c*c) return true;
        else if(b*b==a*a+c*c) return true;
        else if(c*c==b*b+a*a) return true;
        else return false;

    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
         int b = scn.nextInt();
          int c = scn.nextInt();
          boolean ans = triplet(a,b,c);
          System.out.println(ans);
          

            }

    
}