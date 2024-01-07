import javax.swing.*;
class close 
{
    public static void main(String [] args)
    {
        int size,i,k,l,sum=0,a[];
        size=(Integer.parseInt(JOptionPane.showInputDialog("Enter the size ")));
        a=new int[size];
        for(i=0; i<a.length; i++)
        {
           a[i]=(Integer.parseInt(JOptionPane.showInputDialog("Enter the value ")));
        }
        for(k=0; k<a.length; k++)
        {
            for(l=k+1; l<a.length; l++)
            {
                sum=a[k]+a[l];
                if(sum<=0 && sum>=-1)
                {
                    JOptionPane.showMessageDialog(null,"This is near value of 0 : "+sum);
                    JOptionPane.showMessageDialog(null,"The Numbers is :"+k+"&&"+l);
                }
            }
            
        }
    }

}