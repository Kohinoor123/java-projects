import javax.swing.*;
public class Tempreture
{
    public static void main(String[] args)
    {
        int tempreture;

        tempreture=Integer.parseInt(JOptionPane.showInputDialog("Enter the Tempreture :- "));

        if(tempreture<0)
        {
            System.out.println("Freezing Weather");
        }
        if(tempreture>=0 && tempreture<10)
        {
            System.out.println("Very Cold Weather");
        }
        if(tempreture>=10 && tempreture<20)
        {
            System.out.println("Cold Weather");
        }
        if(tempreture>=20 && tempreture<30)
        {
            System.out.println("Normal Weather");
        }
        if(tempreture>=30 && tempreture<40)
        {
            System.out.println("Hot");
        }
        if(tempreture>=40)
        {
            System.out.println("Very Hot");
        }
    }
}