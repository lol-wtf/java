import javax.swing.*;
import java.sql.*;
public class TableExample extends JFrame
{
    public TableExample()
    {
	try
{
     int cnt=0;
    Class.forName("org.postgresql.Driver");
    
    Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tybsc",
            "postgres", "123");
  String query = "SELECT * FROM Student";
  Statement st = con.createStatement();
  ResultSet rs = st.executeQuery( query );
 
    cnt=3;

  Object[][] data=new Object[cnt][3];
  String[] columns = new String[] {"Roll No", "Name", "Percentage"};

 
for(int i=0;i<cnt & rs.next();i++)
{
data[i]=new Object[3];
data[i][0]=new Integer(rs.getInt(1));
data[i][1]=(Object)rs.getString(2);
data[i][2]=new Integer(rs.getInt(3));
}
        //create table with data
        JTable table = new JTable(data, columns);
 
        //add the table to the frame
        this.add(new JScrollPane(table));
     }
catch(Exception e){System.out.println(e);}             
        this.setTitle("Table Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        this.pack();
        this.setVisible(true);
    }
     
    public static void main(String[] args)
    {  
        new TableExample();
            
     
    }   
}
