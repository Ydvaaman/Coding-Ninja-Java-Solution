import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int sum_e = 0;
        int sum_o = 0; 
        int N = s.nextInt();
        while(N!=0)
        {
            int rem = N%10;
        if(rem%2==0)
        {  
          sum_e = sum_e + rem;
        }
        else
        {
            sum_o = sum_o + rem;
        }
         N = N/10;
    }
      System.out.println(sum_e+" "+sum_o)  ;

	}
}
