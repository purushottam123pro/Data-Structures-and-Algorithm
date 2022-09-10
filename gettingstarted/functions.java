import java.util.Scanner;
public class functions{
    public static Scanner scn = new Scanner(System.in);
      public static void printmessage(){
        System.out.println("hello everyone");

         }
      public static void printTable(int num){
        for(int multi = 1; multi <= 10; multi++){
            System.out.println(num*multi);
        } 
      }
      public static void printTableRange(int a,int b){
        
        for(int i = a ; i<= b; i++){
            printTable(i);
            System.out.println("==================");
              }
        }
      public static int sumOfTwoNumber(){
        int a = scn.nextInt();
        int b = scn.nextInt();
        return(a+b);
      }
      public static void main(String[] args){
        //  printmessage();
        //  int num = scn.nextInt();
        //  printTable(num);
         int a = scn.nextInt(); 
         int b = scn.nextInt();
        printTableRange(a,b);
        // int ans = sumOfTwoNumber();
        // System.out.println(ans);
     

     }
}