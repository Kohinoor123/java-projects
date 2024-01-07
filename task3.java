import javax.swing.*;
class task3
{
	public static void main(String[] args)
	{
		int size=(Integer.parseInt(JOptionPane.showInputDialog("Enter the size of the array = ")));
		int a[],b[];
		a=new int[size];
		b=new int[size];                                                                                        
		int i,j,h;
		int ans[];
		for(i=0; i<a.length; i++)	
		{
			a[i]=(Integer.parseInt(JOptionPane.showInputDialog("Enter the a's vlaue = ")));	
		}
		for(j=0; j<a.length; j++)
		{
			b[j]=(Integer.parseInt(JOptionPane.showInputDialog("Enter the b's value = ")));
		}
		
		ans=merge(a,b);
		
		
		for(h=0; h<ans.length; h++)
		{
			JOptionPane.showMessageDialog(null,ans[h]);
		}
	}
	static int[] merge(int x[],int y[])
	{
		
		int result[]=new int[x.length+y.length];
		

		return result;
	}
}