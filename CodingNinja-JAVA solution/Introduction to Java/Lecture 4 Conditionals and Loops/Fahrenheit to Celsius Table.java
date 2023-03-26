import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
       int S = scan.nextInt();
       int E = scan.nextInt();
       int W = scan.nextInt();
     int fah;
        
        while(S<=E)
        {
            fah=((5*(S-32))/9);
            System.out.println(S+" "+fah);
            S+=W;
           }
	}

}
