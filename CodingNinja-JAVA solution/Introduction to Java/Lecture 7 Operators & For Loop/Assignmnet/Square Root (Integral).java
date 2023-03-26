import java.lang.Math;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
        int i=1;
        while(i*i<=n){ 
            i++;
        }
        int k=i-1;
        System.out.println(k);
	}
}
