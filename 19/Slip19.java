
import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;

/*
<APPLET CODE="Slip19.class" WIDTH = 400 HEIGHT =200>
</APPLET>
*/


public class Slip19 extends Applet implements KeyListener
{
        String msg=new String();
        int n;
        public void init()
        {
	  addKeyListener(this);
	  
	}
				public void keyPressed(KeyEvent e)
				{
                                msg="Key Pressed "+e.getKeyChar();
                                repaint();
                                }
                                public void keyReleased(KeyEvent e)
                                {
                                msg="Key Released "+e.getKeyChar();
                                repaint();
                                }
                                
                                public void keyTyped(KeyEvent e)
                                {
                                msg="Key Typed "+e.getKeyChar();
                                repaint();
                                }       
              
				
                             
        public void paint(Graphics g)
        {
        int x=(this.getWidth()/2)-20;
        int y=this.getHeight()/2;
                g.drawString(msg,x,y);
        }


}



