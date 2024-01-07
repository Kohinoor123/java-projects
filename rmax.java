
import javax.swing.*;
class rmax
{
  public static void main(String[] args)
  {
    int size=(Integer.parseInt(JOptionPane.showInputDialog("Enter the size =")));
    int a[],max=0,i,j;
    a=new int[size];
    for(i=0; i<a.length; i++)
    {
      a[i]=(Integer.parseInt(JOptionPane.showInputDialog("Enter the elements = ")));
    }
    for(j=size-1;j>=0; j--)
    {
      if(a[j]>max)
     {
       max=a[j];
       JOptionPane.showMessageDialog(null,a[j]);
     }        
    }
  }
}