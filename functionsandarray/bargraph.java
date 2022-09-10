import java.util.Scanner;
public class bargraph{
    public static int maximum(int[] arr){
        int max = -(int)10e9;
        for(int i = 0 ; i < arr.length; i++){
            if (max < arr.length)
            max=arr[i];
        }
        return max;
    }
    public static void bargraph(int[] arr){
        int height= maximum(arr);
        for(int h = height ; h > 0 ; h--){
            for(int i = 0 ; i < arr.length;i++){
                if(arr[i]>=h)
                System.out.print("*\t");
                else
                System.out.print("\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i =0 ; i < n ; i++){
         arr[i]= scn.nextInt();
        }
        bargraph(arr);

    }
}