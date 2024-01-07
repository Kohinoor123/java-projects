
import javax.swing.*;
public class Multiply
{
    public static void main(String[] args)
    {
        int Num;
    
         Num=Integer.parseInt(JOptionPane.showInputDialog("Enter the Num = "));

        for(int i=1; i<=10; i++)
        {
            int Result=Num*i;
             System.out.println("Num "+Num+"*"+i+" = "+Result);
        }
    }
}

