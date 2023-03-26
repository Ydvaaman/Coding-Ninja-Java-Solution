import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {	
	Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int i=1;
        while(i<=N){
            char p= (char)('A'+i-1);
            int j=1;
            while(j<=i){
                System.out.print(p);
                p=(char)(p+1);
                j=j+1;
            }
            System.out.println();
            i=i+1;                                
        }
		
	}

}
