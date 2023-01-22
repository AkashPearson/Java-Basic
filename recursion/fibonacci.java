package recursion;

public class fibonacci {
	public static void fibo(int a,int b,int n)//fib=store
	{
		if(n==0)
		return ;
		
		int c=a+b;
		System.out.println(c);
		fibo(b, c, n-1);
		System.out.println(" value of a="+b+ "value of b="+c +" value of n="+n);
	}

	public static void main(String[] args) {
		 int n=15;
		 int a=0,b=1;
		 System.out.println(a );//calling fibo
		 System.out.println(b);
		 fibo(a,b,n-2);
		 
		 
	}

}
