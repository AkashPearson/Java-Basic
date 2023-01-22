package recursion;

public class sumNatural {
	public static void sum(int n,int sum,int i)
	{
	if(i==n) 
	 {
		System.out.println("sum of "+n+" natural no is : "+ (sum +=i));
		return;
	 }
		sum +=i;
		
		sum(n,sum,i+1);
		System.out.println("i= "+i +"  n<= "+n+" sum= "+sum);
		 
	}
	public static void main(String[] args) {
		 
		 sum(10,0,1);
		
	}

}
