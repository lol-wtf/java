class PrintText extends Thread
{
String msg;
int i,no;
public PrintText(String msg,int no)
{
this.msg=msg;
this.no=no;
//start();
}
    public void run()
    {
    for(i=0;i<no;i++)
        System.out.println(msg);
    }

}

public class Slip11
{
public static void main(String[] arg) throws InterruptedException
{
PrintText p=new PrintText("I am in FY",10);
p.start();
PrintText p1=new PrintText("I am in SY",20);
p1.start();
PrintText p2=new PrintText("I am in TY",30);
p2.start();
}
}
