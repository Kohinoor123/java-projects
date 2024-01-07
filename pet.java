import javax.swing.*;
class pet
{
	public static void main(String[] value)
	{
		int num=Integer.parseInt(JOptionPane.showInputDialog("Enter the num = "));
		int c=1;
		for(int r=1; r<=num; r++)
		{
			for(int s=1; s<=num-r; s++)
			{
				System.out.print(" ");
			}
			
				for(int k=c; k>=1; k--)
				{
					System.out.print(k);
				}		
				c+=2;
			System.out.println();
		}
	}
}