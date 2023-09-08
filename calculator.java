import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator extends WindowAdapter implements ActionListener
{
Frame f=new Frame();
String a,b,c;
String d;
String r="";
int y=0;
int t=0;
String u="";
TextField t1;
Calculator()
{
	t1=new TextField();
	Panel p=new Panel();
	p.setLayout(new BorderLayout());
	p.add(t1,BorderLayout.NORTH);
	p.setForeground(Color.black);
	Panel p1=new Panel();
	Button b1=new Button("1");
	Button b2=new Button("2");
	Button b3=new Button("3");
	Button b4=new Button("4");
	Button b5=new Button("5");
	Button b6=new Button("6");
	Button b7=new Button("7");
	Button b8=new Button("8");
	Button b9=new Button("9");
	Button b0=new Button("+");
	Button b11=new Button("0");
	Button b12=new Button("-");
	Button b13=new Button("*");
	Button b14=new Button("/");
	Button b15=new Button("=");
	Button b16=new Button("C");
	Button b17=new Button("sqrt");
	Button b18=new Button("%");
	b0.setBackground(Color.black);
	b12.setBackground(Color.black);
	b13.setBackground(Color.black);
	b14.setBackground(Color.black);
	b15.setBackground(Color.orange);
	b16.setBackground(Color.black);
	b17.setBackground(Color.black);
	b18.setBackground(Color.black);

	b0.setForeground(Color.orange);
	b12.setForeground(Color.orange);
	b13.setForeground(Color.orange);
	b14.setForeground(Color.orange);
	b15.setForeground(Color.black);
	b16.setForeground(Color.orange);
	b17.setForeground(Color.orange);
	b18.setForeground(Color.orange);
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	b6.addActionListener(this);
	b7.addActionListener(this);
	b8.addActionListener(this);
	b9.addActionListener(this);
	b0.addActionListener(this);
	b11.addActionListener(this);
	b12.addActionListener(this);
	b13.addActionListener(this);
	b14.addActionListener(this);
	b15.addActionListener(this);
	b16.addActionListener(this);
	b17.addActionListener(this);
	b18.addActionListener(this);
	p1.add(b1);
	p1.add(b2);
	p1.add(b3);
	p1.add(b4);
	p1.add(b5);
	p1.add(b6);
	p1.add(b7);
	p1.add(b8);
	p1.add(b9);
	p1.add(b0);
	p1.add(b11);
	p1.add(b12);
	p1.add(b13);
	p1.add(b14);
	p1.add(b18);
	p1.add(b17);
	p1.add(b16);
	p1.add(b15);
	p1.setLayout(new GridLayout(6,3,5,5));
	p.add(p1);
	f.add(p);
	f.addWindowListener(new WindowAdapter()
	{
		public void windowClosing(WindowEvent e)
		{
			f.dispose();
		}
	});
	f.setVisible(true);
	f.setSize(300,500);
}
public void actionPerformed(ActionEvent e)
{
	a=e.getActionCommand();
	u=t1.getText();
	if(a.equals("sqrt"))
	{
		d="sqrt";
		t1.setText("");
	}
	else if(a.equals("+"))
	{
		b=u;
		d="+";
		t1.setText("");
	}
	else if(a.equals("-"))
{
	b=u;
		d="-";
		t1.setText("");
	}
	else if(a.equals("*"))
	{
		b=u;
		d="*";
		t1.setText("");
	}
	else if(a.equals("/"))
	{
		b=u;
		d="/";
		t1.setText("");
	}
	else if(a.equals("C"))
	{
		b=u;
		t1.setText("");
	}
	else if(a.equals("="))
	{
	  y=Integer.parseInt(b);
	  t=Integer.parseInt(t1.getText());
	  if(d.equals("+"))
	  {
		  r=String.valueOf(y+t);
		  t1.setText(r);
	  }
	  else if(d.equals("-"))
	  {
		  r=String.valueOf(y-t);
		  t1.setText(r);
	  }
	  else if(d.equals("*"))
	  {
		  r=String.valueOf(y*t);
		  t1.setText(r);
	  }
	  else if(d.equals("/"))
	  {
		  r=String.valueOf(y/t);
		  t1.setText(r);
	  }
	  else if(d.equals("sqrt"))
	  {
	  	Double j=Math.sqrt(Double.parseDouble(t1.getText()));
	  	r=String.valueOf(j);
		  t1.setText(r);
	  }
	}
	else
	{
		t1.setText(t1.getText()+a);
		
	}
	
}
public static void main(String args[])
{
Calculator c=new Calculator();
}
}