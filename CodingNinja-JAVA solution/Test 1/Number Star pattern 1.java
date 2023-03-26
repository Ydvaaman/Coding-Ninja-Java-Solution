import java.util.Scanner;
public class runner {

	public static void main(String[] args) {
		
        Scanner scan=new Scanner(System.in);
        int n =scan.nextInt();
        for(int i=1;i<=n;i++){
            int k=n;
            for(int j=1;j<=n-i;j++){
                System.out.print(k);
            k--;
            }
            for(int j=0;j<=0;j++){
                System.out.print("*");
            }
            if(i>1){
                int l=i-1;
                for(int j=1;j<i;j++){
                    System.out.print(l);
                    l--;
                }
            }    
            System.out.println();
        }
	}
}
