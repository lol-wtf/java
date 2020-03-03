import java.awt.*;
import java.io.*;
import java.awt.event.*;   
import javax.swing.*;


    public class SetB2 extends JFrame implements ActionListener
{
       	JMenu m1,m2,m3,sub;
       	JMenuBar mb;
        JMenuItem m[];
        JRadioButtonMenuItem r1,r2;	
        JTextArea t1; 
	String text="";
	int sum=0;
	int numarr[]=new int[50];	
        public SetB2()
        {
             setLayout(new FlowLayout());
            JLabel l1=new JLabel("Numbers");
            mb=new JMenuBar();
            m1=new JMenu("File");
            m2=new JMenu("Compute");
            m3=new JMenu("Operations");
         
            sub=new JMenu("Sort");
            r1=new JRadioButtonMenuItem("Ascending");
                   
            r2=new JRadioButtonMenuItem("Descending");
      	   
            
 
            String str[]={"Load","Save","Exit","sum","Average","Maximum","Minimum","Median","Search"};
            m=new JMenuItem[str.length];

            for(int i=0;i<str.length;i++)
               m[i]=new JMenuItem(str[i]);
	    m1.add(m[0]);
	    m1.add(m[1]);
            m1.addSeparator();
            m1.add(m[2]);
            
            m2.add(m[3]);
            m2.add(m[4]);
	    m2.add(m[5]);
	    m2.add(m[6]);
            m2.add(m[7]);
	    
		sub.add(r1);
		sub.add(r2);
            	m3.add(m[8]);
		m3.add(sub);
           			 																																														
            mb.add(m1);
            mb.add(m2);
            mb.add(m3);
         JPanel p1=new JPanel();p1.setLayout(new GridLayout(2,1));
        t1=new JTextArea(8,20);
	p1.add(l1);
	p1.add(new JScrollPane(t1));
	add(mb);
	add(p1);
         for(int i=0;i<9;i++)
	m[i].addActionListener(this);
	r1.addActionListener(this);
	r2.addActionListener(this);   
 
       } // public
 
	public void actionPerformed(ActionEvent ae)
	{
		text=t1.getText();
		if(ae.getSource()==m[0])
		{
			
			for(int i=0;i<50;i++)
			t1.append((Math.round(Math.random()*100))+"\n");
		}
		if(ae.getSource()==m[1])
		{
			try
			{
			FileWriter f1 = new FileWriter("number.txt");
			f1.write(text);
			f1.close();
			BufferedReader br=new BufferedReader(new FileReader("number.txt"));
			String no="";int i=0;
			 while((no=br.readLine())!=null)
            		{
				int n=Integer.parseInt(no);
				numarr[i++]=n;
			}
			}
			catch(IOException e){System.out.println("Error : "+e);}
		}
		if(ae.getSource()==m[2])
			System.exit(0);
		
		if(ae.getSource()==m[3])
		{
			sum=0;
			                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             for(int i=0;i<numarr.length;i++)
				sum=sum+numarr[i];
			JOptionPane.showMessageDialog(null,"Sum = "+sum);
		}
		if(ae.getSource()==m[4])
		{
			float avg=(float)sum/50;
			JOptionPane.showMessageDialog(null,"Average = "+avg);
		}
		if(ae.getSource()==m[5])
		{
			int max=0;
			for(int i=0;i<numarr.length;i++)
            		  if(max<numarr[i])
				max=numarr[i];
			JOptionPane.showMessageDialog(null,"Maximum = "+max);
		}
		if(ae.getSource()==m[6])
		{
			int min=0;
			for(int i=0;i<numarr.length;i++)
            		  if(min>numarr[i])
				min=numarr[i];
			JOptionPane.showMessageDialog(null,"Minimum = "+min);
		}
		if(ae.getSource()==m[7])
		{			
			int median=numarr[numarr.length/2];
			JOptionPane.showMessageDialog(null,"Median = "+median);
		}
		if(ae.getSource()==m[8])
		{
		int flag=0;
		String input= JOptionPane.showInputDialog("Please Enter Number to Search");
		int no=Integer.parseInt(input);
		for(int i=0;i<numarr.length;i++)
		{
            	  if(no==numarr[i])
		  {	
			flag=1;
			//System.out.println(flag);	
			JOptionPane.showMessageDialog(null,"Number Found");
			break;
		  }
		  
		}
		if(flag==0)
		JOptionPane.showMessageDialog(null,"Number Not Found");
		}
		if(ae.getSource()==r1)
		{
		int[] arr=new int[50];
		arr=numarr;int temp;	
        		for (int i = 0; i <arr.length ; i++) 
		        {
		            for (int j = i + 1; j < arr.length; j++)  	                       				    {
		                if (arr[i] > arr[j]) 
                		{
					temp = arr[i];
		                        arr[i] = arr[j];
		                        arr[j] = temp;
                		}
           		    }
			}
		t1.setText("");
		for (int i = 0; i <arr.length ; i++) 
			t1.append(arr[i]+"\n");
			
	}
	if(ae.getSource()==r2)
		{
		int[] arr=new int[50];
		arr=numarr;int temp;	
        		for (int i = 0; i <arr.length ; i++) 
		        {
		            for (int j = i + 1; j < arr.length; j++)  	                       				    {
		                if (arr[i] > arr[j]) 
                		{
					temp = arr[i];
		                        arr[i] = arr[j];
		                        arr[j] = temp;
                		}
           		    }
			}
		t1.setText("");
		for (int i = arr.length-1; i >=0 ; i--) 
			t1.append(arr[i]+"\n");
			
	}
	
	}
    public static void main(String arg[])
   {
    SetB2 c =new 
SetB2();
    c.setSize(250,350);
    c.setVisible(true);
    c.setLocation(100,100);
    c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
 }


