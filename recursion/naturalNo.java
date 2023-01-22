package recursion;
// 1 2 3 4 5 ...n
public class naturalNo {
	public static void Natural(int n)
	{    //base case
		if(n==101)
		return;
		
		System.out.print( n+" ");
		
		 Natural(n+1);//call itself
	}

	public static void main(String[] args) {
		int n=1;
		Natural(n);//function call

	}

}
