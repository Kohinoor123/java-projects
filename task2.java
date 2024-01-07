import javax.swing.*;
class task2
{
    public static void main(String[] args)
    {
        int a[],b[];
        int size,i,j;
        size=(Integer.parseInt(JOptionPane.showInputDialog("Enter The Size of the array : ")));
        a=new int[size];
        b=new int[size];
        for(i=0; i<a.length; i++)
        {
            a[i]=(Integer.parseInt(JOptionPane.showInputDialog("Enter the Numbers ")));
        }
        for(j=0; j<b.length; j++)
        {
            b[j]=(Integer.parseInt(JOptionPane.showInputDialog("Enter the numbers : ")));
        }
        String ans=merge(a,b);
	System.out.println(ans);
    }
static String merge(int x[],int y[])
{
    int i=0;
    String r="";
    for(i=0;i<x.length;i++)
    {
	r=r+x[i]+","+y[i]+",";
    }
  return r;		
}
}