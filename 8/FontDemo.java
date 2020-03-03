import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
class FontDemo extends JFrame implements ItemListener
{
JCheckBox c[]=new JCheckBox[2];
JLabel lblFont,lblSize,lblstyle;
JComboBox cmbFont,cmbsize;
JTextField txtMsg;
Font font;
FontDemo()
{
JPanel p1=new JPanel();
JPanel p2=new JPanel();
p1.setLayout(new GridLayout(4,1));
p2.setLayout(new GridLayout(4,1));

c[0]=new JCheckBox("Bold");c[0].setSelected(true);
c[1]=new JCheckBox("Italic");

String fontName[] = GraphicsEnvironment.
getLocalGraphicsEnvironment().
getAvailableFontFamilyNames();
String fontSize[]={"8","10","12","14","16","18","20","22","24","26","28","30"}; 
lblFont = new JLabel("Font");lblstyle= new JLabel("Style");
lblSize = new JLabel("Size");
txtMsg = new JTextField("Hello World!",30);
cmbFont = new JComboBox(fontName);
cmbsize = new JComboBox(fontSize);
setTitle("Font Demo");
setSize(400,300);
setLayout(new FlowLayout());

p1.add(lblFont);
p1.add(cmbFont);
p1.add(lblSize);
p1.add(cmbsize);
p2.add(lblstyle);
for(int i=0;i<2;i++)
p2.add(c[i]);

add(p1);add(p2);
add(txtMsg);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
cmbFont.addItemListener(this);
cmbsize.addItemListener(this);


}
public void itemStateChanged(ItemEvent ie)
{
String fontName=(String)cmbFont.getSelectedItem();
int size=Integer.parseInt((String)cmbsize.getSelectedItem());
int style=0,bold=0,italic=0;
if(c[0].isSelected())
 bold=Font.BOLD;
if(c[1].isSelected())
 italic=Font.ITALIC;
 style=bold+italic;
 font = new Font(fontName,style,size);
 txtMsg.setFont(font);
 

}
}
