import java.util.*;
class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n=scn.nextInt();
    
    int nsp=0;
    int nst=n;
    
    for(int i=1;i<=n;i++){
        
        for(int j=1;j<=nsp;j++){
            System.out.print("	");
        }
         for(int j=1;j<=nst;j++){
                if(i>n/2+1 && i<n){
                    if(j==1 || j==nst){
                      System.out.print("*	");
                    }else{
                        System.out.print("	");
                    }
                }
                else{
                    System.out.print("*	");
                }
            }
            
            
        
        
        if(i<=n/2){
            nst-=2;
            nsp++;
        }else{
            nst+=2;
            nsp--;
        }
        System.out.println();
    }
     

 }
}