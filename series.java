import javax.swing.*;
public class series
{
    public static void main(String[] args)
    {
        int num,sum=0,mul=1;
        num=Integer.parseInt(JOptionPane.showInputDialog("Enter the num  = "));
        for(int i=1; i<=num; i++)    
        {
        
            sum=sum+(num*mul);
            System.out.print(sum+"\t");
            mul=mul*10;
        }
    }
}
