import javax.swing.*;
public class Radius
{
    public static void main(String args[])
    {
    float Radius,area;
 	Radius=Float.parseFloat(JOptionPane.showInputDialog("Enter the radius value = "));
    area=3.14f*Radius*Radius;

    System.out.println(""+area);
    }
}
