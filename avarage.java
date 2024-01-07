import javax.swing.*;
class avarage
{
	public static void main(String[] args)
	{
		int size=Integer.parseInt(JOptionPane.showInputDialog("Enter the size = "));
		int a[];
		 a=new int[size];
		int max,min;

		for(int i=0; i<a.length; i++)
		{
			a[i]=Integer.parseInt(JOptionPane.showInputDialog("Enter the num ="));
		}

		max=a[0];
		min=a[0];
		for(int j=0; j<a.length; j++)
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
		System.out.println(max);
		System.out.println(min);
			int sum=0;
		for(int k=0; k<a.length; k++)
		{
			if(k>min && k<max)
			{
				sum+=k;
			}
		}
		JOptionPane.showMessageDialog(null,sum);
		int avar=sum/(size-2);
		String msg=("Avar= "+avar +"\n");
		JOptionPane.showMessageDialog(null,msg);
	}
}