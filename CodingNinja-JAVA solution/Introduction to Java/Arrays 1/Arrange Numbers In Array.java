public class Solution {
    
    public static void arrange(int[] a, int n) {
        n=a.length;
        int i=0;
        int j=n-1;
        int k=1;
        while(k<=n){
            if(k%2!=0){
                a[i]=k;
                i++;
            }
            else{
                a[j]=k;
                j--;
            }
                k++;
        }
    }
}