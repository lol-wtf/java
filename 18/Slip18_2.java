import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
class Slip18_2 extends JFrame implements Runnable,ActionListener
{
        Thread t;
        int y,cnt=0;
        JButton btnStart;
	Color randomColor;
        char c;
        Slip18_2()
        {
               
               setSize(500,500);
               btnStart=new JButton("Start");
               btnStart.addActionListener(this);
               add(btnStart);
               setLayout(new FlowLayout());
               setVisible(true);
               setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               
        }
        public void run ()
        {
	      
	       Random r = new Random();
	      c = (char) (r.nextInt(26) + 'A');
	      float red = r.nextFloat();
	      float gr = r.nextFloat();
	      float b = r.nextFloat();
	      randomColor = new Color(red, gr, b);
               while(true)
               {
               
                     try
		  {
                  if(y<getWidth()) y++;
                  else y=0;
                  repaint();
                  Thread.sleep(50);
             }catch(Exception e) {}
             }
             
       }
  public void actionPerformed(ActionEvent ae)
                {

                     if((ae.getSource()==btnStart))
                      {
                                         
                           t = new Thread(this);
                           t.start();
                       }
                       }
  public void paint(Graphics g)
  {
       super.paint(g);
	setBackground(Color.pink);
	
       g.setColor(randomColor);
             
       g.drawString(""+c,60, y);
       
       
       
  }
  public static void main(String args[])
  {
       new Slip18_2();
  }
}
