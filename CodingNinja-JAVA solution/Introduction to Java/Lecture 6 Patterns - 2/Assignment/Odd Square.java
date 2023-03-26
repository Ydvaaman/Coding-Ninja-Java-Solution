import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int i = 1;
        while(i<=N){
            int j = i-1;
            while(j<N){
                System.out.print(j*2+1);
                j++;
            }
            int k = 0;
            while(k<i-1){
                System.out.print(k*2+1);
                k++;
            }
            System.out.println();
            i++;
        }
    }
}