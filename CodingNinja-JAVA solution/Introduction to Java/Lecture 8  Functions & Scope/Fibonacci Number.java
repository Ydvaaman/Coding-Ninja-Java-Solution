
public class Solution {
	
	public static boolean checkMember(int n){		
		
	    int a=0;
        int b=1;
        if(n==0||n==1)
            return true;
        int x=a+b;
        while(x<=n)
        {
            if(x==n)
                return true;
            a=b;
            b=x;
            
            x=a+b;        
        }
       return false;
	}
}
