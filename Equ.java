import javax.swing.*;
public class Equ
{
    public static void main(String[] args)
    {
        float a,b,c,d;
        a=Float.parseFloat(JOptionPane.showInputDialog("Enter the a value :-"));
        b=Float.parseFloat(JOptionPane.showInputDialog("Enter the b value :-"));
        c=Float.parseFloat(JOptionPane.showInputDialog("Enter the c value :-"));

        d=(b*b)-4*(a*c);
        System.out.println(""+d);
    }   
}
