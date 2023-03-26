import java.util.*;
public class Solution {
    
   	public static void main(String[] args) {
      Scanner scan= new Scanner(System.in);
        int n= scan.nextInt();
       System.out.println("*");
        for(int i=1;i<n;i++){
            int k=1;
            System.out.print("*");
            for(int j=1;j<i;j++){
                System.out.print(k);
                k++;
            }
            for(int j=1;j<=i;j++){
                System.out.print(k);
                k--;
            }
            System.out.print("*");
            System.out.println();
    }
        for(int i=n;i>=1;i--){
            int k=1;
            System.out.print("*");
            for(int j=1;j<i;j++){
                System.out.print(k);
                k++;
            }
            for(int j=1;j<=i;j++){
                System.out.print(k);
                k--;
            }
            System.out.print("*");
     
            System.out.println();
    }
    System.out.print("*");
}}