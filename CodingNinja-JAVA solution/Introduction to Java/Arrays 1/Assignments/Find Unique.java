public class Solution {
    public static int findUnique(int[] arr) {
    label:
     for(int i=0;i<arr.length;i++){
         for(int j=0;j<arr.length;j++ ){
             if(i==j) continue;
             if(arr[i]==arr[j]) continue label;  
         }
         return arr[i];
     }    
          return 0;   
    }
}


