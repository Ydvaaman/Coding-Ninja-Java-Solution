/*import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
        int N = scan.nextInt();
        int i=1;
        while(i<=N){
            int spaces=1;
            while(spaces<=N-i){
                System.out.print(" ");
                spaces= spaces+1;
                
            }
           int j=1;
            int k=i;
            while(j<=i){
                System.out.print(k);
                j++;
                k++;
          
            }
            System.out.println();
            i=i+1;
                 
        }
	}
}
*/

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
          Scanner scr = new Scanner(System.in);
        int N = scr.nextInt();
     for(int i=1;i<=N;i++){
         for(int j=1;j<=N-i;j++){
             System.out.print(" "); 
         }
         int num=i;
         for(int j=1;j<i;j++){
             System.out.print(num);
             num++;
         }
          for(int j=1;j<=i;j++){
             System.out.print(num);
             num--;
         }
         System.out.println();
     }
	}
}
