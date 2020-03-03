package series;

public class Fibo
{
int f0=0,f1=1,f2;
public Fibo(int n)
{
System.out.println("First "+n+"Fibonocci Numbers are");
System.out.println(f0);
System.out.println(f1);
for (int i = 0; i < n-2; i++)
{
f2=f0+f1;
System.out.println(f2);
f0=f1;f1=f2;
}
}
}
