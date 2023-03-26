import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long ans=0,pv=1;
        while(n>0){
            int r = n%2;
            n=n/2;
            ans=ans+(r*pv);
            pv=pv*10;     
        }
        System.out.print(ans);
	}
}
