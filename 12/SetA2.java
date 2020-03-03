import java.awt.*;
import java.awt.event.*;   
import javax.swing.*;
   
public class SetA2 extends JFrame implements ActionListener
{
        JTextField t1,t2;
	
        JCheckBox c[]=new JCheckBox[3];
      	JRadioButton r[]=new JRadioButton[3];	
	
      	
	public static void main(String arg[])
	{
	    SetA2 c =new SetA2();
	    c.setSize(250,200);
	    c.setVisible(true);
	    c.setLocation(500,200);
	    c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
        public SetA2()
        {
        
      
         setLayout(new FlowLayout());
	 JPanel p1=new JPanel();
	 p1.setLayout(new GridLayout(4,1));
	 ButtonGroup b1 = new ButtonGroup();
	 ButtonGroup b2 = new ButtonGroup();
 

        //add radio buttons

        
 

	JPanel p2=new JPanel();
	p2.setLayout(new GridLayout(4,1));
        JLabel l1=new JLabel("Your Name : ");
	JLabel l2=new JLabel(" Your Class ");
	JLabel l3=new JLabel(" Your Hobbies ");
        t1=new JTextField(10);
	t2=new JTextField(22);
	 r[0]=new JRadioButton("FY");r[0].setSelected(true);
         r[1]=new JRadioButton("SY");
	 r[2]=new JRadioButton("TY");
	for(int i=0;i<3;i++)
        b1.add(r[i]);
	
        c[0]=new JCheckBox("Music");c[0].setSelected(true);
	c[1]=new JCheckBox("Dance");
	c[2]=new JCheckBox("Sport");
 	for(int i=0;i<3;i++)
 	b2.add(c[i]);
	
          add(l1);add(t1);
	p1.add(l2);
	for(int i=0;i<3;i++)
	  p1.add(r[i]);
	p2.add(l3);
	for(int i=0;i<3;i++)
	  p2.add(c[i]);
	add(p1);add(p2);
	add(t2);
	for(int i=0;i<3;i++)
	{
        r[i].addActionListener(this);  
        c[i].addActionListener(this);
        }
       } 
 
  public void actionPerformed(ActionEvent ae)
  {
	String na=t1.getText();
	 String hobby="",cl="";
	for(int i=0;i<3;i++)
	if(c[i].isSelected())
		 hobby=c[i].getText()+" ";
		for(int i=0;i<3;i++)
	if(r[i].isSelected())
		 cl=r[i].getText()+" ";
	t2.setText("Name : "+na+" Class : "+cl+" Hobbies : "+hobby);	 
  }
   
 }


