import javax.swing.*;

public class avrage 
{
    public static void main(String[] args) {
        float num1, num2, num3, average;
        
        num1 = Float.parseFloat(JOptionPane.showInputDialog("Enter number 1:"));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("Enter number 2:"));
        num3 = Float.parseFloat(JOptionPane.showInputDialog("Enter number 3:"));
        
        average = (num1 + num2 + num3) / 3;

        System.out.println("Average: " + average);
    }
}
