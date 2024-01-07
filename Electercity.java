import javax.swing.*;
public class Electercity 
{
    public static void main(String[] args)
    {
        int unit,ans;

        unit=Integer.parseInt(JOptionPane.showInputDialog("Enter the unit :- "));

        if(unit<500)
        {
            ans=unit*5;
            System.out.println("Total bill value = "+ans);
        }
        else if(unit>=500 && unit<700)
        {
            ans=unit*6;
            System.out.println("Total bill value = "+ans);
        }
        else if(unit>=700 && unit<1000)
        {
            ans=unit*8;
            System.out.println("Total bill value = "+ans);
        }
        else if(unit>=1000)
        {
            ans=unit*10;
            System.out.println("Total bill value = "+ans);
        }
    }
}
