import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class slip20Q2 extends JFrame implements ActionListener
{
     JLabel lblNm,lblAdd,lblPh,lblEmail;
     JTextField txtNm,txtAdd,txtPh,txtEmail;
     JButton btnAdd,btnDel,btnNext,btnPre;
     Connection con=null;
     ResultSet rs=null;
     slip20Q2()
     {
           lblNm = new  JLabel("Name:");
           lblAdd = new  JLabel("Address:");
           lblPh = new  JLabel("Phone:");
           lblEmail = new  JLabel("Email:");
           txtNm = new  JTextField();
           txtAdd = new  JTextField();
           txtPh = new  JTextField();
           txtEmail = new  JTextField();
           btnAdd = new JButton("Add");
           btnDel = new JButton("Delete");
	   btnNext = new JButton("Next");
	   btnPre = new JButton("Previous");
	   setTitle("Phone Book");
           setSize(350,200);
           setLayout(new GridLayout(4,3,20,20));
           add(lblNm);
           add(txtNm);
	   add(btnAdd);
           add(lblAdd);
           add(txtAdd);
	   add(btnDel);
           add(lblPh);
           add(txtPh);
	   add(btnNext);
           add(lblEmail);
           add(txtEmail);
           add(btnPre);
try{
		Class.forName("org.postgresql.Driver");
	        con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tybsc","postgres", "123");
		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			rs = st.executeQuery("select * from phone"); 
		rs.first(); 
		setRecord(rs); 
		
		}
		catch(Exception e)	
		{    
         	System.out.println(e);
                }
	
	   btnAdd.addActionListener(this);
	   btnDel.addActionListener(this);
	   btnNext.addActionListener(this);
	   btnPre.addActionListener(this);
           setVisible(true);
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void setRecord(ResultSet rs) throws Exception 
	{ 
		txtNm.setText(rs.getString(1));
		txtAdd.setText(rs.getString(2));
		txtPh.setText(rs.getString(3));
		txtEmail.setText(rs.getString(4));
		
	}
	public void actionPerformed(ActionEvent ae)
	{	
	String name=txtNm.getText();
	int flag=1;	
	String addr=txtAdd.getText();
	String ph=txtPh.getText();
	String email=txtEmail.getText();
	try{
	if(ae.getSource()==btnAdd)
	{
	if(name.equals(""))
	{
	JOptionPane.showMessageDialog(null,"Please Enter Name");
	txtNm.requestFocus();
	flag=0;
	}
	double pho=Double.parseDouble(ph);
	if(pho<0)
	{
	JOptionPane.showMessageDialog(null,"Please Enter Correct Phone Number");
	txtPh.requestFocus();
	flag=0;
	}
	if(flag==1)
	{
	Statement t=con.createStatement();
            int r=t.executeUpdate("insert into phone values('"+name+"','"+addr+"','"+ph+"','"+email+"')");
		if(r!=-1)
		JOptionPane.showMessageDialog(null,"Record Added Successfully");
		rs.first(); 
		setRecord(rs); 
	}
		}
		if(ae.getSource()==btnNext)
		{
		if(rs.next()) 
		setRecord(rs);
		else
		{
		rs.last();setRecord(rs);
		}
		}
		if(ae.getSource()==btnPre)
		{
		if(rs.previous()) 
		setRecord(rs);
		else
		{
		rs.first();setRecord(rs);
		}
		}
		if(ae.getSource()==btnDel)
		{
PreparedStatement ps=con.prepareStatement("delete from phone where name=? and add=? and ph=?");
ps.setString(1,name);
ps.setString(2,addr);
ps.setString(3,ph);
          	int res=ps.executeUpdate();
		if(res!=-1)
		JOptionPane.showMessageDialog(null,"Record Deleted Successfully");
		}
		}		
		catch(Exception e)	
		{    
         	System.out.println(e);
                }
	
	}
	public static void main(String arg[])
	{
	new slip20Q2();
	}
}
