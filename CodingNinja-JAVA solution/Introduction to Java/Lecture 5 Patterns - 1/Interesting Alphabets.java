import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int i = 1;
        while(i<=N){
            int j = 1;
            int p = N-i+1;
            while(j<=i){
                char jthChar = (char)('A'+p-1);
                System.out.print(jthChar);
                p++;
                j++;
            }
            System.out.println();

            i++;
        }
		
	}
}