import java.awt.*;
import java.awt.event.*;

class Chootu extends Frame implements ActionListener

{	Button  b,b1,b2;
	TextField t1,t2,t3;
	 Chootu()
	{	
	 setSize(400,400);
	setLayout( new FlowLayout());
	setVisible(true);
	b1= new Button("click");
	b2= new Button("enter");
	t1= new TextField(10);
	t2=new TextField(10);
	t3=new TextField(10);


	add(new Label("enter  ur name"));
	add(t1);
	add(new Label("frd name"));
	add(t2);
	add (new Label("bestie name"));
	add(t3);
	add(b1);
	add(b2);
	b.addActionListener(this);
	
	}
	

	public static void main(String[]args)

	{
	  new Chootu();
	}


	public void actionPerformed(ActionEvent e)

	{
	 System.out.println("lvu");
	}
}