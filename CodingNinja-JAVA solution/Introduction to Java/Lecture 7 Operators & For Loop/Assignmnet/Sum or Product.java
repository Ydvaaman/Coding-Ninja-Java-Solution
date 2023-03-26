import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sum=0;
        int m=1;
        int N =s.nextInt();
        int C=s.nextInt();
        if (C==1){
           for(int i=1;i<=N;i++){
               sum=sum+i;   
           }
            System.out.println(sum);
        }
        else if(C==2){
            for(int j=1;j<=N;j++){
                m=m*j;
                
            }
            System.out.println(m);
        }
        else{
            System.out.println(-1);
        } 
	}
}
