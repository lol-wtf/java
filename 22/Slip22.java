import java.awt.*;
import java.io.*;
import java.awt.event.*;   
import javax.swing.*;


    public class Slip22 extends JFrame implements ActionListener
{
       	JMenu m1,m2;
       	JMenuBar mb;
        JMenuItem m[];
        int n1,n2;	
        public Slip22()
        {
             setLayout(new FlowLayout());
            JLabel l1=new JLabel("Numbers");
            mb=new JMenuBar();
            m2=new JMenu("Compute");
            m1=new JMenu("Operations");
                
 
            String str[]={"Accept","Exit","GCD","Power"};
            m=new JMenuItem[str.length];

            for(int i=0;i<str.length;i++)
               m[i]=new JMenuItem(str[i]);
	    m1.add(m[0]);
		m1.addSeparator();
	    m1.add(m[1]);
                   
            
            m2.add(m[2]);
            m2.add(m[3]);
	             			 																																														
            mb.add(m1);
            mb.add(m2);
              
	add(mb);
	
         for(int i=0;i<4;i++)
	m[i].addActionListener(this);
	
 
       } // public
 
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==m[0])
		{
		String input= JOptionPane.showInputDialog("Please Enter First Number");
		n1=Integer.parseInt(input);
		String input2= JOptionPane.showInputDialog("Please Enter Second Number");
		n2=Integer.parseInt(input2);
		
		}
		if(ae.getSource()==m[1])
			System.exit(0);
		
		if(ae.getSource()==m[2])
		{
			int no1=n1,no2=n2;
			int gcd=0,r=0;
			while(no2!=0)
			{
				r=no1%no2;
				no1=no2;
				no2=r;
			}
			gcd=no1;
		JOptionPane.showMessageDialog(null,"GCD = "+gcd);
		}
		if(ae.getSource()==m[3])
		{
			double pow=Math.pow(n1,n2);
			JOptionPane.showMessageDialog(null,"Power = "+pow);
		}
		
	}
	
	
    public static void main(String arg[])
   {
    Slip22 c =new 
Slip22();
    c.setSize(250,350);
    c.setVisible(true);
    c.setLocation(100,100);
    c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
 }


