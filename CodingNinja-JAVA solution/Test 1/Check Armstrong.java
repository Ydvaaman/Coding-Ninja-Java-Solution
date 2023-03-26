import java.util.Scanner;
import java.lang.Math;
public class Main {
   public static int count_digit(int b) {
   int count = 0;
   while(b != 0) {
      b = b / 10;
      count++;
   }
   return count;
}
	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n,sum=0;
       n=scan.nextInt();
      int temp=n;
      int tot=count_digit(n);
    while(n>0)
    {
        int rem =n%10;
        sum+=Math.pow(rem,tot);
        n/=10;
    }
    if(sum==temp)
        System.out.print("true");
    else
  System.out.print("false");
	}
}
