import javax.swing.*;
public class Marks3
{
    public static void main(String[] args)
    {
        String Name;
        int Roll_No,Sub_1,Sub_2,Sub_3,Sum;
        float per;

        Name=JOptionPane.showInputDialog("Enter the Name:-");
        Roll_No=Integer.parseInt(JOptionPane.showInputDialog("Enter the Roll No :- "));
        Sub_1=Integer.parseInt(JOptionPane.showInputDialog("Enter the Subject 1 Marks :- "));
        Sub_2=Integer.parseInt(JOptionPane.showInputDialog("Enter the Subject 2 Marks :- "));
        Sub_3=Integer.parseInt(JOptionPane.showInputDialog("Enter the Subject 3 Marks :- "));
        
        Sum=Sub_1+Sub_2+Sub_3;
        per=(Sum*100)/300;

        if(per>=75)
        {
            System.out.println("Your Name is :- " +Name);
            System.out.println("Your Roll No is :- "+Roll_No);
            System.out.println("Total Sum of Three Subjects :- " +Sum);
            System.out.println("Percentage of Three SUbject :- " +per);
            System.out.println("Grade is A");
        }
        else if(per>=60 && per<75)
        {
            System.out.println("Your Name is :- " +Name);
            System.out.println("Your Roll No is :- "+Roll_No);
            System.out.println("Total Sum of Three Subjects :- " +Sum);
            System.out.println("Percentage of Three SUbject :- " +per);
            System.out.println("Grade is B");
        }
        else if(per>=35 && per<60)
        {
            System.out.println("Your Name is :- " +Name);
            System.out.println("Your Roll No is :- "+Roll_No);
            System.out.println("Total Sum of Three Subjects :- " +Sum);
            System.out.println("Percentage of Three SUbject :- " +per);
            System.out.println("Grade is C");
        }
        else
        {
            System.out.println("Your Name is :- " +Name);
           System.out.println("Your Roll No is :- "+Roll_No);
            System.out.println("Total Sum of Three Subjects :- " +Sum);
            System.out.println("Percentage of Three SUbject :- " +per);
            System.out.println("Grade is D");
        }
    }
}