import java.util.Scanner;
public class reversearray{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n; i++)
            arr[i]= scn.nextInt();
            reverse(arr);
            display(arr);
    }
    public static void reverse(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while(i<=j){
            swap(arr,i,j);
            i++;
            j--;

        }

    }
    public static void swap(int[] arr, int i,int j ){
        int a = arr[i];
        arr[i]= arr[j];
        arr[j]= a;


    }
    public static void display(int [] arr){ 
        for(int i =0 ; i <arr.length ; i++)
        System.out.print(arr[i]+ "\t");

    }
}