import javax.swing.*;
class armstrong
{
    public static void main(String[] args)
    {
        int num,d,i,cnt=0,t,sum=0,p;
        num=(Integer.parseInt(JOptionPane.showInputDialog("ENter the num =")));
        t=num;
        while(num!=0)
        {  
            num=num/10;
            cnt++;
        }
        
        while(t!=0)
        {
            d=t%10;
            t=t/10;
            p=1;
            for(i=1; i<=cnt; i++)
            {
                p*=d;
               // JOptionPane.showMessageDialog(null,d);                
            }
            sum+=p;
        }
            JOptionPane.showMessageDialog(null,sum);
        
    }
}