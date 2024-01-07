import javax.swing.*;
class index
{
	public static void main(String[] args)
	{
		int size;
		size=Integer.parseInt(JOptionPane.showInputDialog("Enter the size = "));
		String msg=" ";
		int nums[];		
		nums=new int[size];

		for(int i=0; i<nums.length; i++)
		{
			nums[i]=Integer.parseInt(JOptionPane.showInputDialog("Enter the num = "));
		}
		int k=Integer.parseInt(JOptionPane.showInputDialog("Enter the  num which u want to insert  = "));
		int p=Integer.parseInt(JOptionPane.showInputDialog("Enter the index num = "));
		nums[p-1]=k;	
		for(int j=0; j<nums.length; j++)
		{
			msg=msg+"value of :"+(j+1)+":"+nums[j]+"\n";	
		}
		JOptionPane.showMessageDialog(null,msg);
	}
}