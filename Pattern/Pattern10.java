import java.util.*;

class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n=scn.nextInt();
    int nsp=n/2;
    int nst=-1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=nsp;j++){
            System.out.print("	");
        }
        System.out.print("*	");
        for(int j=1;j<=nst;j++){
            System.out.print("	");
        }
        if(i>1 && i<n)
         System.out.print("*	");
        if(i<=n/2){
            nsp--;
            nst+=2;
        }else{
            nsp++;
            nst-=2;
        }
        System.out.println();
    }
     

 }
}