import java.io.*;

class invaliddateexception extends Exception
{
        invaliddateexception(int n)
        {
           System.out.println("The given date is invalid ");
        }
}

class invalidmonthexception extends Exception
{
        invalidmonthexception(int m)
        {
           System.out.println("The given month is invalid ");
        }
}

class Date1
{
        public static void main(String args[])
      {
        int dd=Integer.parseInt(args[0]);
        int mm=Integer.parseInt(args[1]);
        long yy=Long.parseLong(args[2]);

        try
        {
        if(mm<1 || mm>12)
        throw new invalidmonthexception(mm);
        }

        catch(invalidmonthexception e) {}
        {
        if(mm>=1 && mm<=12)
        {
        switch(mm)
        {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:try
        {
         if(dd>=1 && dd<=31)
         System.out.println("The given Date is VALID ");
         else
         throw new invaliddateexception(dd);
        }
        catch(invaliddateexception e){}
        break;

        case 4:
        case 6:
        case 9:
        case 11:try
        {
         if(dd>=1 && dd<=30)
         System.out.println("\n\t\tTHE GIVEN DATE IS VALID ONE ");
         else
         throw new invaliddateexception(dd);
        }

        catch(invaliddateexception e) {}
        break;

        case 2:try
        {
        if(yy%4==0 || yy%100==0)
                {
                 if(dd>=1 && dd<=29)
                 System.out.println("\n\t\tTHE DATE IS VALID AND IT IS A LEAP YEAR");
                }
                 else if(dd>=1 && dd<=28)
                 System.out.println("\n\t\tTHE GIVEN DATE IS VALID");
                 else
                 throw new invaliddateexception(dd);
        }
        catch(invaliddateexception e) {}
        break;
}//switch
}//if
}//catch
}//main
}//class



