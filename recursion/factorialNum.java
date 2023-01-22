package recursion;

public class factorialNum {
	
public static int factorial(int n)
{
	if(n==0 ||n==1) 
		
		return 1;	
	
	int fact=factorial(n-1);
	int merge=n*fact;
	return merge;
	 
}
	public static void main(String[] args) {
		 int n=6;
		 System.out.println(factorial(n));
		 
		 

	}

}
