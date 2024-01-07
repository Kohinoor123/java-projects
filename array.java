import javax.swing.*;
class array
{
	public static void main(String[] args)
	{
		//declare the import
		int size=Integer.parseInt(JOptionPane.showInputDialog("Enter the size : "));
		int a[], a2[];
		a= new int[size];
		a2=new int [size];
		int i,j,k,l;
		for(i=0; i<a.length; i++)
		{
			a[i]=Integer.parseInt(JOptionPane.showInputDialog("Enter the Numbers1:- "));	
		}
		for(j=0; j<a2.length; j++)
		{
			a2[j]=Integer.parseInt(JOptionPane.showInputDialog("Enter the Numbers2:- "));
		}
		for(k=0; k<size; k++)
		{
			for(l=0; l<size; l++)		
			{
				if(a[k]==a2[l])
				{
						JOptionPane.showMessageDialog(null,a[k]);
				}
			}
		}
	}
}