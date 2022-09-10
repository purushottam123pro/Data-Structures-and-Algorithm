import java.util.Scanner;
public class arrays{
    public static Scanner scn = new Scanner(System.in);
    public static void takeinput(int[] arr){
        for(int i = 0 ; i< arr.length; i++){
            arr[i] = scn.nextInt(); // setter

        }
    }
    public static void printarray(int[] arr){
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println();

    }
    public static boolean findele(int[] arr, int data){
        int n = arr.length;
        for(int i= 0; i < n; i++){
            if(arr[i]== data)
            return true;
        }
        return false;
    }
    public static int maxVal(int[] arr){
        int n = arr.length, maxEle= Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            maxEle= Math.max(maxEle, arr[i]);
            

        }
        return maxEle;
    }
    public static int minVal(int[] arr){
        int n = arr.length , minEle = Integer.MAX_VALUE;
        for(int i = 0; i<n ; i++){
            minEle = Math.min(minEle, arr[i]);

        }
        return minEle;
    }
    // (2,4,4,4,4,4,4,4,4,2), firstIndex of 4 is 2
    // (2,4,4,4,4,4,4,4,4,2), lastindex of 4 is 8
    public static void main(String[] args){
        
        int n  = scn.nextInt();
        
        int[] arr = new int[n];
        // int data = scn.nextInt();
        takeinput(arr);
        // findele(arr,data);
        
        // System.out.print(maxVal(arr));
        System.out.print(minVal(arr));
        
        // printarray(arr);



    }
}