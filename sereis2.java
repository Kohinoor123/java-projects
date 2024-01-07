import javax.swing.*;
public class sereis2
{
	public static void main(String[] args)
	{
		int x,range,sum,i,j,sum2=0;
		range=Integer.parseInt(JOptionPane.showInputDialog("Enter the Range :- "));
		x=Integer.parseInt(JOptionPane.showInputDialog("Enter the Num :- "));

		for(i=0; i<=range; i++)
		{
			sum=1;
			if(i%2==1)
			{
				for(j=1; j<=i; j++)
				{
					sum*=x;
					
				}
					sum2+=sum;	
			}	
		}
			System.out.println(" "+sum2);		
	}
}				