import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;

/*
<APPLET CODE="Slip9.class" WIDTH = 400 HEIGHT =200>
</APPLET>
*/


public class Slip9 extends Applet
{
        String msg=new String();
        int n;
        public void init()
        {

         addMouseMotionListener(new MouseMotionAdapter()
         {
	    public void mouseMoved(MouseEvent me)
	    {
	      msg="Mouse Moved: X="+me.getX()+"Y="+me.getY();
              repaint();
            }
        });

        addMouseListener(new MouseAdapter()
        {
           public void mouseClicked(MouseEvent me)
           {
               n=me.getButton();
               if(n==1)
               {
                  msg="Mouse Left Clicked: X="+me.getX()+"Y="+me.getY();
                  repaint();
               }
               if(n==3)
               {
                  msg="Mouse Right Clicked: X="+me.getX()+"Y="+me.getY();
                  repaint();
               }

             }
          });
          addMouseListener(new MouseAdapter()
          {
          public void mousePressed(MouseEvent me)
          {
           msg="Mouse Pressed: X="+me.getX()+"Y="+me.getY();
           repaint();
         }
        });

       addMouseMotionListener(new MouseMotionAdapter()
        {
              public void mouseDragged(MouseEvent me)
              {
              msg="Mouse Dragged: X="+me.getX()+"Y="+me.getY();
              repaint();
          }
         });




              
        }
        public void paint(Graphics g)
        {
        int x=(this.getWidth()/2)-20;
        int y=this.getHeight()/2;
                g.drawString(msg,x,y);
        }


}



