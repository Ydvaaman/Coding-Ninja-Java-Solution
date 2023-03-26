import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        int n=scan.nextInt();
        int p=scan.nextInt();
        boolean isDec=true;
        int i=1;
        while(i<n){
            int c=scan.nextInt();
            if(c==p){
                System.out.print("false");
                System.exit(0);
            }
            else if(c>p){
                isDec=false;
            }
            else{
                if(isDec==false){
                    System.out.print("false");
                    return;
                }
            }
            p=c;
            i++;      
        }
        System.out.print("true");
	}
}
