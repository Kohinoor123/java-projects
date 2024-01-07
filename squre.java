import javax.swing.*;
public class squre
{
	public static void main(String[] args)
	{
		int i,n,squre;
		n=Integer.parseInt(JOptionPane.showInputDialog("Enter the num  = "));
		
		for(i=1; i<=n; i++)
		{
			squre=i*i;
			System.out.println(" "+squre);
		}
		
	}
}	
		