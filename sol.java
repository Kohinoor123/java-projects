import javax.swing.*;
class sol
{
	public static void main(String[] args)
	{
		int x;
		x=(Integer.parseInt(JOptionPane.showInputDialog("Enter the num = ")));
		
		if(x%2==1)
		{
			JOptionPane.showMessageDialog(null,"Weried");
		}
		else
		{
			if(x>=2 && x<=5)
			{
				JOptionPane.showMessageDialog(null,"Not Weried");
			}
			else if(x>=6 && x<=20)
			{
				JOptionPane.showMessageDialog(null,"Weried");
			}
			else if(x>20)
			{
				JOptionPane.showMessageDialog(null,"Not Werried");
			}
		}
	}
}