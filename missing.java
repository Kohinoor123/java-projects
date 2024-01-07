
import javax.swing.*;
class missing
{
	public static void main(String[] args)
	{
		int a[];
		int i,max,min,j,k;
		int size=Integer.parseInt(JOptionPane.showInputDialog("Enter the size = "));

		a=new int[size];

		for(i=0; i<a.length; i++)
		{
			a[i]=Integer.parseInt(JOptionPane.showInputDialog("Enter the num = "));	
		}
		max=a[0];
		min=a[0];
		for(j=0; j<a.length; j++)
		{
			if(a[j]>max)
			{
				max=a[j];
			}
			if(a[j]<min)
			{
				min=a[j];
			}
		}
		for(k=min; k<=max; k++)
		{
			for(j=0; j<a.length; j++)
			{
				if(k==a[j])
				{
					break;
				}
			}
			if(j==a.length)
			{
			JOptionPane.showMessageDialog(null,k);	
			}
		}
	}
}