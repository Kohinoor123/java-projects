import javax.swing.*;
class clock
{
    public static void main(String[] args)
    {
        int size=(Integer.parseInt(JOptionPane.showInputDialog("Enter the size : ")));
        int a[],i,j,t;
        a=new int[size];

        for(i=0; i<a.length; i++)
        {
            a[i]=(Integer.parseInt(JOptionPane.showInputDialog("Enter the num ")));
        }
        t=a[0];
        for(j=0; j<a.length-1; j++)
        {
            a[j]=a[j+1];
           
        }
        a[a.length-1]=t;
        for(j=0;j<a.length;j++){
                 System.out.print(a[j]+"\t");
        }
    }
}