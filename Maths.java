import javax.swing.*;
public class Maths 
{
    public static void main(String[] args)
    {
        int num1,num2;
 	
	num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the num 1 = "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the num 2 = "));
              
             
        System.out.println(" "+(num1+num2));
        System.out.println(" "+(num1-num2));
        System.out.println(" "+(num1*num2));
        System.out.println(" "+(num1/num2));
        System.out.println(" "+(num1%num2));

    }    
}
