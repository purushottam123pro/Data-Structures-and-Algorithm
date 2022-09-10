import java.util.Scanner;
public class primefac{
    public static void primef(int num){
        int pn=2;
        for(pn= 2; pn*pn<= num; pn++ ){
            while(num%pn == 0){
            num/=pn;
            System.out.print(pn + " ");
            }

        }
        if(num!=1)
        System.out.print(num);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        primef(n);
    }
}