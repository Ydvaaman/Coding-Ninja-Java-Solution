import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int f1 =1;
        int f2=1;
        int i;
        int f =0;
       
       for(i=1;i<n;i++){
           // System.out.print(f1+" ");
           f = f1+f2;
           f1=f2;
           f2 = f; 
       }
    System.out.println(f1);
	}
}
