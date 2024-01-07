
import javax.swing.*;
class size
{
	public static void main(String[] args)
	{
		int size=Integer.parseInt(JOptionPane.showInputDialog("Enter the size  = "));
		int a[],count=0,r;
		a= new int[size];

		for(int i=0; i<a.length; i++)
		{
			a[i]=Integer.parseInt(JOptionPane.showInputDialog("Enter the num  = "));
		}
		for(int j=0; j<a.length-1; j++)
		{
			for(int k=j+1; k<a.length; k++)
			{
				if(a[j]==a[k])
				{
					count++;
					break;
				}
			}
		}
		r=size-count;

		JOptionPane.showMessageDialog(null,r);
	}
}