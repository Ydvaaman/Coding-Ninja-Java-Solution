import java.util.Scanner;
public class Solution {

	public static void printFahrenheitTable(int start, int end, int step) {
		    int fah;
            while(start<=end){
            fah=((5*(start-32))/9);
            System.out.println(start+"  "+fah);
            start+=step;
   
        }
	}
}