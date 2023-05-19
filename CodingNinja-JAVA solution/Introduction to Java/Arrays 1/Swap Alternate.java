
// public class Solution {  
//     public static void swapAlternate(int arr[]) {
//         for(int i=0;i<arr.length-1;i=i+2){
//             int temp=arr[i];
//             arr[i]=arr[i+1];
//             arr[i+1]=temp;          
//         }  	
// }



// public class Solution { 
//     public static void swapAlternate(int arr[]) {      
//         int n=arr.length;
//      for(int i=0;i<=n-2;i=i+2){
//          int temp=arr[i];
//          arr[i]=arr[i+1];
//          arr[i+1]=temp;        
//      }          
//         }  	
// }


// by using two pointer 
public class Solution {
    
    public static void swapAlternate(int arr[]) {
        int n=arr.length;
        int i=0;
        int j=1;
       while(j<n){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
           i+=2;
           j+=2;
            
        }
    }	
}