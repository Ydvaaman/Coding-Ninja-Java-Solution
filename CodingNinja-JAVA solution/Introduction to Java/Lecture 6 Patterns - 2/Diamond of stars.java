import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int i=1;
        int mid =(N+1)/2;
        while(i<=mid){
             int j=1;
             while(j<=mid-i){
                 System.out.print(" ");
                 j++; 
             }
             int s=1;
            
            while(s<=2*i -1){ 
                System.out.print("*");
                s++;
            }
            System.out.println();
            i++;
        }
        int p=1;
         while(p<=mid-1){
            int j=1;
             while(j<=p){
                 System.out.print(" ");
                 j++; 
             }
             int s2=1;
             while(s2<=N - (2*p)){
                 System.out.print("*");
                 s2++; 
             }
            System.out.println();
            p++;
        }
    }
}