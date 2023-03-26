import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int i=1;
        int x= 65;
        while(i<=N){
            int j=1;
            while(j<=i){
                System.out.print((char)x);
                j=j+1;
            }
                x=x+1;
            System.out.println();
            i=i+1;     
        }	
	}

}