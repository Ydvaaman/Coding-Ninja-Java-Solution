import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
	    int n=scan.nextInt();
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<i;j++){
	            System.out.print("0");
	        }
	         for(int j=0;j<=0;j++){
	            System.out.print("*");
	        }
	        for(int j=n-i+1;j>1;j--){
	            System.out.print("0");
	        }
	        for(int j=1;j<=1;j++){
	            System.out.print("*");
	        }
	        for(int j=1;j<n-i+1;j++){
	            System.out.print("0");
	        }
	         for(int j=0;j<=0;j++){
	            System.out.print("*");
	        }
	         for(int j=1;j<i;j++){
	            System.out.print("0");
	        }
	        
	        
	        System.out.println();
	    }
	
	}
}
