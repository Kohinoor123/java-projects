import javax.swing.*;
class prime
{
	public static void main(String values[])
	{
		//Declare the varible
		int Upper_limit,Lower_limit,j,i;
		Lower_limit=Integer.parseInt(JOptionPane.showInputDialog("Enter the Lower limit to find prime number = "));
		Upper_limit=Integer.parseInt(JOptionPane.showInputDialog("Enter the Upper limit to find prime number = "));

		for(i =Lower_limit; i<Upper_limit; i++)
		{
			for(j=2; j<i; j++)
			{
				if(i%j==0)
				{
					break;
				}
			}
			if(j==i)
			{
				System.out.println(i+ "  is the prime numbers between the limits");
			}
		}
	}
}