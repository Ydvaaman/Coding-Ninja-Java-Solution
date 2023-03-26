// import java.util.Scanner;
// public class Main {
	
// 	public static void main(String[] args) {
// 		Scanner s=new Scanner(System.in);
//         int n = s.nextInt();
//         int rev=0;
//         int rem=0;
// 	}
// }

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n , reversenum = 0;
        while(temp > 0 ){
            int lastdigit = temp % 10;
            temp = temp/10;
            reversenum = reversenum *10 + lastdigit;
        }
       System.out.println(reversenum); 
	}
}
