import java.util.*;
   
  class Main{
   
   public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      while(n!=0){
          System.out.println(n%10);
          n/=10;
      }
    }
   }