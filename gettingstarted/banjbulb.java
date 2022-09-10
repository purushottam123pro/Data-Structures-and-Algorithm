import java.util.Scanner;
public class banjbulb{
public static void banjaminBulb(int n){
    for(int i= 1 ; i*i <= n; i++){
        System.out.println(i*i);

    }
}
public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    banjaminBulb(num);
}
}