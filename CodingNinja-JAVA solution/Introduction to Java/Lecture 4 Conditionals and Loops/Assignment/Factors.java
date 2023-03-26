import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
	        int number = s.nextInt();
	        int divisor = 2;
	        while(divisor<number){
	            if(number%divisor==0){
	                System.out.print(divisor+"\t");
	            }
	            divisor++;
	        }
    }
    
}
        
    
