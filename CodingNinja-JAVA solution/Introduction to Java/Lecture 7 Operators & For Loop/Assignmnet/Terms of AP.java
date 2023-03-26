// import java.util.Scanner;
// public class Main {
// 	public static void main(String[] args) {
// 		Scanner s = new Scanner(System.in);
//         int N= s.nextInt();
//         int count=0;
//         for(int i=1;;i++){
//             int k=3*i+2;
//             if(k%4!=0){
//                 System.out.print(k+" ");
//                 count++;
//             }
//             if(count==N){
//                 break;
//             }
//         }
// 	}
// }

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int x= s.nextInt();
        int i=1;
        int count=0;
        while(count!=x)
        {
          int k=(3*i)+2;
            if(k%4!=0){
                System.out.print(k+" ");
                count++;
            }
        i++;
        }
       
	}
}

