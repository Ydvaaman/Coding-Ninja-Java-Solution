import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int ans=0,pv=1;
        while(n>0){
            int r=n%10;
            n=n/10;
            ans=ans+(r*pv);
            pv=pv*2;  
        }
        System.out.println(ans);
	}
}
