import javax.swing.*;

public class nine
{
	public static void main(String[] args)
	{
		int sr;
		int lr;
		int i;
		int sum=0;
		sr=Integer.parseInt(JOptionPane.showInputDialog("Enter the num  = "));
		lr=Integer.parseInt(JOptionPane.showInputDialog("Enter the num  = "));

		for(i=sr; i<lr; i++)
		{
			if(i%9==0)
			{
				System.out.println(" "+i);
				sum+=i;
			}
		}
		System.out.print(" "+sum);	
	}
}	