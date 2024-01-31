/* 312. Using Frame in applet */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyWin extends Frame  implements ActionListener
{
	Label lblrollno; 
	TextField txtrollno ;
	Button btnexit;
	public MyWin()
	{
		setTitle("Frame Window");
		setLayout(new FlowLayout());
		setSize(300,300);
		lblrollno=new Label("Rollno");
		txtrollno=new TextField(20);
		btnexit=new Button("Exit");
		add(lblrollno);
		add(txtrollno);
		add(btnexit);
		btnexit.addActionListener(this);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		dispose(); 
	}
		
}	
public class AppletFrame1 extends JApplet implements ActionListener
{
	Button btnshow;
	public void init()
	{	
		btnshow=new Button("Show");
		add(btnshow);
		btnshow.addActionListener(this);	
	}
	public void actionPerformed(ActionEvent e)
	{
		MyWin q=new MyWin();
					
	}
}
/*
	<Applet Code="AppletFrame1.class"  Width="300"  Height="300">
	</Applet>
*/
	