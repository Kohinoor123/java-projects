import javax.swing.*;
class task1
{
	static int sum(int x, int y)
	{
		int sum;
		sum=x+y;
		return sum;
	}
	public static void main(String[] args)
	{
		int a,b,ans;
		a=(Integer.parseInt(JOptionPane.showInputDialog("Enter the A = ")));
		b=(Integer.parseInt(JOptionPane.showInputDialog("Enter the B = ")));
		ans=sum(a,b);
		JOptionPane.showMessageDialog(null,ans);
	}
}