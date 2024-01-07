
import javax.swing.*;
class task
{
    public static void main(String[] args)
    {
        int size=(Integer.parseInt(JOptionPane.showInputDialog("Eneter the size of array =")));
        int a[];
        int i,j,k,min;
        a=new int[size];
        for(i=0; i<a.length; i++)
        {   
            a[i]=(Integer.parseInt(JOptionPane.showInputDialog("Enter the num ")));
        }
        min=a[0];
        for(j=0; j<a.length; j++)
        {
            for(k=2; k<a[j]; k++)
            {
                if(a[j]%k==0)
                {
                    break;
                }
            }
            if(a[j]==k)
            {
                if(min<a[j])
                {
                    min=a[j];
                }
            }
        }
            JOptionPane.showMessageDialog(null,min);
    }

}