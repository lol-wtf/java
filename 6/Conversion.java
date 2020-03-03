import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Conversion extends JFrame
{
     JLabel lblDec,lblBin,lblOct,lblHex,l1,l2,l3;
     JTextField txtDec;
     JButton btnCalc,btnClear;
     Conversion()
     {
           lblDec = new  JLabel("Decimal Number:");
           lblBin = new  JLabel("Binary Number:");
           lblOct = new  JLabel("Octal Number:");
           lblHex = new  JLabel("Hexadecimal :");
           txtDec = new  JTextField();
           l1 = new  JLabel(); l2 = new  JLabel(); l3 = new  JLabel();
           btnCalc = new JButton("Calculate");
           btnClear = new JButton("Clear");
           setTitle("Conversion");
           setSize(300,250);
           setLayout(new GridLayout(5,2));
           add(lblDec);
           add(txtDec);
           add(lblBin);
           add(l1);
           add(lblOct);
           add(l2);
           add(lblHex);
           add(l3);
           add(btnCalc);
           add(btnClear);
           setVisible(true);
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
       btnCalc.addActionListener(new ActionListener()
       {
             public void actionPerformed(ActionEvent ae)
             {
                  int n = Integer.parseInt(
                             txtDec.getText());
                  l1.setText(
                        Integer.toBinaryString(n));
                  l2.setText(
                        Integer.toOctalString(n));
                  l3.setText(
                        Integer.toHexString(n));
             }
       });
       btnClear.addActionListener(new ActionListener()
       {
             public void actionPerformed(ActionEvent ae)
             {
                  txtDec.setText("");
                  txtDec.requestFocus();l1.setText("");
		    l2.setText("");l3.setText("");
             }
       });
  }
  public static void main(String args[])
  {
       new Conversion();
  }
}
