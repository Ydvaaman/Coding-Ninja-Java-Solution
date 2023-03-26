import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n){ 
            int j=1;
            int sum=0;
            while(j<=i){   
               sum=sum+j;
                System.out.print(j);             
                if(j<i){
                    System.out.print("+");
                }
                j=j+1;
            }
            System.out.println("=" + sum);    
            i=i+1;
        }
		
	}
}
