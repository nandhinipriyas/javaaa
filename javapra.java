
public class class8 {
	public static void main(String args[])
	{
		int d[]=new int[]{1,34,56,78,94,56,234};
		int max=0;
		for (int counter = 1; counter < d.length; counter++)
		{
		    if (d[counter] > max)
		    {
		        max = d[counter];
		      		    }
		}  
		System.out.println("The highest maximum for the December is: " + max);


}
}