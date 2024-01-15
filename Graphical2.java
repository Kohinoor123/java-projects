import javax.swing.*;
import java.awt.*;
public class Graphical2 extends JFrame
{	
	JLabel lblrollno,lblname;
	JButton btnshow,btnclose;
	JTextField txtname,txtrollno;
	public static void main(String[] args)
	{
		Graphical2 g=new Graphical2();
	}
	public Graphical2()
	{
		setTitle("Learning Graphical Java");
		setSize(500,400);
		lblrollno=new JLabel("Roll No ");
		lblname=new JLabel("Name ");
		txtrollno=new JTextField();
		txtname=new JTextField();
		btnshow=new JButton("Show");
		btnclose=new JButton("Close");
		GridLayout Q = new GridLayout(3,2);
		setLayout(Q);
		add(lblrollno);
		add(txtrollno);
		add(lblname);
		add(txtname);
		add(btnshow);
		add(btnclose);
		setVisible(true);		
	}
}