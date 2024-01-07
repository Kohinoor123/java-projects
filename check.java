import javax.swing.*;
public class check
{
    public static void main(String[] args) 
    {
        char input = JOptionPane.showInputDialog("Enter any character: ").charAt(0);

        if ((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z'))
        {
            System.out.println("This is an Alphabet");
        } 
        else if (input >= '0' && input <= '9') 
        {
            System.out.println("This is a Digit");
        } 
        else if (input == '+' || input == '-' || input == '*' || input == '/' || input == '%') 
        {
            System.out.println("This is a Special character");
        } 
        else
        {
            System.out.println("This is an Unknown character");
        }
    }
}
