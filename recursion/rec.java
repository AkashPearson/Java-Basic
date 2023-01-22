package recursion;

import java.util.Scanner;

public class rec {
	public static int calc(int x, int n)
	{
		if( x==0) {
			return 0;
		}
		if(n==0) {
			return 1;
		}
		int xPnm1=calc(x, n-1);
		int xpown=x * (xPnm1);
		return xpown;
	}

	public static void main(String[] args) {
		 Scanner r=new Scanner(System.in);
		 System.out.println("Enter no of you need power");
		 int x=r.nextInt();
		 System.out.println("Enter power");
		 int n=r.nextInt();
        int c= calc(x, n);
        System.out.println("Result is : "+c);
	}

}
