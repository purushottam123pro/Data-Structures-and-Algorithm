import java.util.Scanner;
public class rotate{
public static int rotaten(int num, int r){
    int len = countdigitnum(num);
    r= (r % len + len) % len;
    int a = num / (int)Math.pow(10,r);
    int b = num % (int)Math.pow(10,r);
    return(b * (int)Math.pow(10,len-r) + a);
}
public static int rotaten2(int num,int r){
    int len = countdigitnum(num);
    r= (r% len +len)%len;
    int div=1; int multi=1;
    for(int i=1 ; i <= len ; i++){
        if(i<=r)
        div*=10;
        else
        multi*=10;
       
    }
     int a = num / div;
    int b = num % div;
    return(b * multi + a);

}
public static int countdigitnum(int num){
    int count=0;
    while(num!=0){
        num/=10;
        count++;
    }
    return count; 
}
public static void main(String[] args){
    Scanner scn =new Scanner(System.in);
    int num = scn.nextInt();
    int r = scn.nextInt();
    rotaten2(num,r);
    int val = rotaten2(num,r);
    System.out.println(val);

}

}