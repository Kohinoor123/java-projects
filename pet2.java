import javax.swing.*;
class pet2
{
    public static void main(String args[])
    {
        String msg="";
        for(int i=0; i<5; i++)
        {
             
            for(int j=0; j<i; j++)
            {

                msg=msg+'*';   
            }
            msg=msg+"\n";
        }
         JOptionPane.showMessageDialog(null,msg);
    }
}