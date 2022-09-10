import java.util.Scanner;
public class pattern1{
    public static void pattern1(int n){
        int nsp= n-1; int nst= 1;
        for(int r =1 ; r <= n ;r++){
            for(int csp = 1; csp <= nsp; csp++)
            System.out.print("\t");
            for(int cst=1 ; cst<= nst; cst++)
            System.out.print("*\t");
            nsp--;
            nst++;
            System.out.println();


        }

        
    }
    public static void pattern2(int n){
        int nsp = 0; 
        int nst = 1;
        for(int r=1 ; r <= n ; r++){
            for(int csp = 1 ; csp <= nsp ; csp++)
            System.out.print("\t");
            for(int cst =1 ;cst <= nst; cst++)
            System.out.print("*\t");
            nsp+=0;
            nst++;
            System.out.println();
        }
        
  
    }
    public static void pattern3(int n){
        int nst= n;
        for(int r = 1 ; r<= n;r++){
            for(int cst = 1 ; cst <= nst ; cst++)
            System.out.print("*\t");
            nst--;
            System.out.println();

        }
    }
    public static void pattern3num(int n){
        int nst= 1, count=1 ;
        for(int r = 1 ; r<= n;r++){
            for(int cst = 1 ; cst <= nst ; cst++){
                System.out.print(count++ +"\t");
                

            }
            
            nst++;
            System.out.println();

        }
    }
    public static void pattern4(int n){
        int nst= n , nsp = 0;
        for(int r = 1 ; r<= n ; r++){
            for(int csp=1 ; csp<= nsp; csp++)
            System.out.print("\t");
            for(int cst=1 ; cst<= nst; cst++)
            System.out.print("*\t");
            nst--;
            nsp++;
            System.out.println();

        }
        
    }
    public static void pattern5(int n){
        int nsp = n-1, nst = 1;
        for(int r = 1 ; r <= n ; r++){
            for (int csp = 1 ; csp <= nsp ; csp++)
            System.out.print("\t");
            for(int cst = 1 ; cst <= nst ; cst++)
            System.out.print("*\t");
            nsp--;
            nst+=2;
            System.out.println();
        }

    }
    public static void pattern6(int n){
        int nsp = 0 , nst = 2*n - 1;
        for(int r = 1 ; r <= n ; r++){
            for (int csp = 1 ; csp <= nsp ; csp++)
            System.out.print("\t");
            for(int cst = 1 ; cst<= nst; cst++)
            System.out.print("*\t");
            nsp++;
            nst-=2;
            System.out.println();


        }
    }
    public static void pattern7_diamond(int n){
        if(n%2 == 0) n++;
        int nsp = n/2 , nst = 1;
        for(int r = 1 ; r <= n ; r++){
            for (int csp = 1 ; csp <= nsp ; csp++)
            System.out.print("\t");
            for(int cst = 1 ; cst<= nst; cst++)
            System.out.print("*\t");
            if(r <= n/2 ){
            nsp--;
            nst+=2;
            }
            else {
            nsp++;
            nst-=2;
            }
            System.out.println();



        }
    }
    public static void pattern7_diamondnum(int n){
        if(n%2 == 0) n++;
        int nsp = n/2 , nst = 1;
        for(int r = 1 ; r <= n ; r++){
            for (int csp = 1 ; csp <= nsp ; csp++){
                System.out.print("\t");
                
            }
            int p = (r<= n/2+1 ? r :  n-r+1);
          

            for(int cst = 1 ; cst<= nst; cst++){
                 
                System.out.print(p + "\t");
                p = (cst<= nst/2 ? p + 1 : p-1);
                
                

                
            }
            
            
            if(r <= n/2 ){
            nsp--;
            nst+=2;
            }
            else {
            nsp++;
            nst-=2;
            }
            System.out.println();
            


        }
    }
    public static void pattern8_hod(int n){
        if(n%2 == 0 ) n++;

        int nsp = 1 , nst = n/2 + 1 ;
        for(int r = 1; r <= n ; r ++){
            for(int cst = 1; cst <= nst; cst++)
            System.out.print("*\t");
            for(int csp =1 ; csp <= nsp ; csp++)
            System.out.print("\t");
            for(int cst = 1; cst <= nst; cst++)
            System.out.print("*\t");
            
            if(r <= n/2){
                nst--;
                nsp+=2;
                 }
            else{
                nst++;
                nsp-=2;
            }
            System.out.println();


        }
    }

    public static void patternd(int n){
        int nsp= 0; int nst= 1;
        for(int r =1 ; r <= n ;r++){
            for(int csp = 1; csp <= nsp; csp++)
            System.out.print("\t");
            for(int cst=1 ; cst<= nst; cst++)
            System.out.print("*\t");
            nsp++;
            nst+=0;
            System.out.println();


        }

        
    }
    public static void patternmcross(int n){
        if(n%2 == 0 ) n++;

        int nsp = 0 , nst = 1, nsp1 = n-2, nst1 = 1 ;
        for(int r = 1; r <= n ; r ++){
            for(int csp =1 ; csp <= nsp ; csp++)
            System.out.print("\t");
            for(int cst = 1; cst <= nst; cst++)
            System.out.print("\t");
            for(int csp1 =1 ; csp1 <= nsp1 ; csp1++)
            System.out.print("\t");
            for(int cst1 = 1; cst1 <= nst1; cst1++){
                if(r != n/2+1)
                System.out.print("*\t");
            }
            
            
            if(r <= n/2){
                nsp++;
                nst+=0;
                nsp1-=2;
                nst1+=0;
                 }
            else{
                nsp--;
                nst+=0;
                nsp1+=2;
                nst1+= 0; 
            }
            System.out.println();


        }
    }
    public static void pattern14(int n){
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println(n + " * " + i + " = " +(i*n));
        }

    }
    public static void pattern16(int n){
        int nsp = 2*n - 3 , nst = 1, p = 1;
        for(int r =1 ; r <= n ; r++){
            for(int cst = 1; cst <= nst; cst++ ){
                System.out.print(p++ +"\t");
                


            }
            
            for(int csp= 1; csp <= nsp; csp++){
                System.out.print("\t");
            }
            if(r==n){
                p--;
               nst--;}
            
            
            
            for(int cst = 1; cst <= nst; cst++ ){
                
                System.out.print(--p +"\t");
                

            }
            nsp-=2;
            nst++;
            System.out.println();

        }
    }
    public static void pattern12(int n){
        int nst=1,a=0,b=1;
        for(int r= 1; r <=n ; r++){
            for(int cst=1 ; cst<= nst; cst++){
                System.out.print(a+ "\t");
                int sum = a+b;
                a=b;
                b=sum;
            }
            nst++;
            System.out.println();

        }

    }
    public static void pattern13(int rows){
        
        for(int n=0 ; n <= rows; n++ ){
            int val = 1; 
            for(int r =0 ; r <= n ; r++){
                // System.out.print(n+ "C " + r + "\t");
                System.out.print(val + "\t");
                val= ((n-r)*val)/(r + 1);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern13(n);
    }
    
}