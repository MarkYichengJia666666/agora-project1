import java.util.Scanner;

public class project11
{
	public static long timecomplex(long n)
	{
	long count=0;
	for (long i = 1;i<=n;i++) 
	{
	  for (long j=i;j<=n;j++) 
	  {
		for (long k=j;k<=n;k++)
		{
	       count++;
		}
	  if (getgcd(i,j) == 1) 
	  {
		 j=n;
	  }
	 }
	}
	return count;
	}
	
	
	 public static void main(String[] args) 
	 {   System.out.println("Please input the value of n : ");
		 Scanner sc = new Scanner(System.in);
		 long n = sc.nextLong();
         timecomplex(n);
	    System.out.println("time cost is " +timecomplex(n));
	    
	    }  
	 
	 public static long getgcd(long a, long b) 
	 {  
	        long k;   
	        while ((k=a%b) != 0) {            
	            a = b;  
	            b = k;  
	        }  
	        return b;  
	    }  
}
