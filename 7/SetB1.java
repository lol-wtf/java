/*
Assigement-3:-set-B
Q)1. Write a menu driven program to perform the following operations on student table.
1. Insert        2. Modify      3. Delete       4. Search        5. View All 6. Exit
*/

import java.sql.*;
import java.io.*;
public class SetB1
{
    public static void main(String[] args) 
    {
    Connection con;
    ResultSet rs;
    Statement t;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
try
{
   Class.forName("org.postgresql.Driver");
    System.out.println("Driver loaded");
    con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tybsc","postgres", "123");
    do
    {
    System.out.println("\n1.Insert\n2.Modify\n3.Delete\n4.Search\n5.View all\n6.Exit");
    System.out.println("Enter the choice");
    int ch=Integer.parseInt(br.readLine());
    switch(ch)
    {
        case 1:
            System.out.println("Enter the Rollno");
            int roll=Integer.parseInt(br.readLine());
            System.out.println("Enter the name");
            String n=br.readLine();
            System.out.println("Enter the percentage");
            int per=Integer.parseInt(br.readLine());
            t=con.createStatement();
            t.executeUpdate("insert into student values("+roll+",'"+n+"',"+per+")");
            break;
        case 2:
            System.out.println("Enter the roll no for update record");
            roll=Integer.parseInt(br.readLine());
            System.out.println("Enter the name");
            n=br.readLine();
            System.out.println("Enter the percentage");
            per=Integer.parseInt(br.readLine());
            t=con.createStatement();
            t.executeUpdate("update student set sname='"+n+"',per="
+per+" where roll="+roll);
            break;
        case 3:
            System.out.println("Enter the roll no for delete record");
            int no=Integer.parseInt(br.readLine());
            t=con.createStatement();
            t.executeUpdate("delete from student where roll="+no);
            break;

        case 4:
            System.out.println("Enter the roll no for search");
            no=Integer.parseInt(br.readLine());
            t=con.createStatement();
            rs=t.executeQuery("select * from student where roll="+no);
            while(rs.next())
            {
                System.out.println("Roll no="+rs.getInt(1));
                System.out.println("name="+rs.getString(2));
                System.out.println("percentage="+rs.getInt(3));
            }
            break;
        case 5:
            t=con.createStatement();
            rs=t.executeQuery("select * from student");
		System.out.println("Roll no	Name 	Percentage");
            while(rs.next())
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
              
            break;
        case 6:
            System.exit(0);
            break;
    }
    }while(true);
	}
catch(Exception e){System.out.println(e);}
    }

}

