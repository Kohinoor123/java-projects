
import javax.swing.*;
class rever
{
	public static void main(String[] args)
	{
		int i,j,d,d2;
		int size=Integer.parseInt(JOptionPane.showInputDialog("Enter the size = "));
		int nums[];
		nums=new int[size];
		for(i=0; i<nums.length; i++)
		{
			nums[i]=Integer.parseInt(JOptionPane.showInputDialog("Enter the num= "));
		}
		for(j=0; j<nums.length; j++)
		{
			d=0;
			d2=0;
			while(nums[j]!=0)
			{
				d=nums[j]%10;
				nums[j]=nums[j]/10;
				d2=(d2*10)+d;		
			}
			JOptionPane.showMessageDialog(null,d2);
		}
	}

}