import javax.swing.*;
public class Marks2 
{
    public static void main(String[] args)
    {
            int Maths,Chemistry,Physic,Sum,Sum2;

            Maths=Integer.parseInt(JOptionPane.showInputDialog("Enter the Maths marks:- "));
            Physic=Integer.parseInt(JOptionPane.showInputDialog("Enter the Physic marks:- "));
            Chemistry=Integer.parseInt(JOptionPane.showInputDialog("Enter the Chemistry marks:- "));
            
            Sum=Maths+Physic+Chemistry;
            Sum2=Maths+Physic;

            System.out.println("Sum of three Subjects:- " +Sum+ " And Sum Of Two Subjects "+Sum2);

            if(Maths>=65 && Physic>=55 && Chemistry>=50 && Sum>=190 || Sum2>=140)
            {
                System.out.println("The Student is eligable for Professional Course");
            }

            else
            {
                System.out.println("Plz Reenter the marks");
            }
    }
}
