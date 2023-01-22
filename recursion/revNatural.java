package recursion;

public class revNatural {
	public static void natural(int n)
	{
		if(n==0)
			return;
		
		System.out.print(n+" ");
		natural(n-1);//5-1  //4-1 //3-1 //2-1 /1-1
	}
	public static void main(String[] args) {
		 int n=10;
		 natural(n);

	}

}
