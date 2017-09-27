import java.util.Scanner;

public class Q5 {
	public static long timecomplex(long n){
	long j = 5;
	long Sum = 0;
	while (j < n/2) 
	{ long k = 5;
	while (k < n) 
	{ Sum +=1;
	k = (long) (k*1.3) ;
	} 
	j = (long) (1.3*j) ;
	}
	return Sum;
	}
	 public static void main(String[] args) 
	 {   System.out.println("Please input the value of n : ");
		 Scanner sc = new Scanner(System.in);
		 long n = sc.nextLong();
         timecomplex(n);
	    System.out.println("time cost is " +timecomplex(n)); 
	    }  
}
