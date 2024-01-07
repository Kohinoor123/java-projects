import javax.swing.*;
public class harmonic 
{
 public static void main(String[] args)
 {
    float sum,n;
    int range;
 
    n=Float.parseFloat(JOptionPane.showInputDialog("Enter the value of n = "));
    range=Integer.parseInt(JOptionPane.showInputDialog("Enter the value of range = "));
    for(float i=1; i<=range; i++)
    {
         sum=n+n/i;
         System.out.println(sum);
    }
 }   
}
