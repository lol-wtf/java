import java.io.*;
class SetB1
{
        public static void main(String arg[])throws IOException
        {
        int id,qty,n,i;
        String name;
        double price;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileWriter f1 = new FileWriter("item.dat");

        
        
        System.out.print("ENTER NUMBER OF ITEMS :   ");
        n=Integer.parseInt(br.readLine());
        for(i=0;i<n;i++)
        {
        System.out.print("\n\nSPECIFY ID :  ");
        id=Integer.parseInt(br.readLine());
        System.out.print("\nSPECIFY NAME :  ");
        name=(br.readLine());
        System.out.print("\nSPECIFY PRICE :  ");
        price=Double.parseDouble(br.readLine());
        System.out.print("\nSPECIFY QUANTITY :  ");
        qty=Integer.parseInt(br.readLine());

        f1.write(new Integer(id).toString()+"\n");
        f1.write(name +"\n");
        f1.write(new Double(price).toString()+"\n");
        f1.write(new Integer(qty).toString()+"\n");
        }

        f1.close();

        BufferedReader f = new BufferedReader(new FileReader("item.dat"));
        f.mark(100);
        do
        {
        System.out.println("\n\n ******* MENU ********");
        System.out.println("1] SEARCH BY NAME ");
        System.out.println("2] SEARCH COSTLIEST ITEM ");
        System.out.println("3] DISPLAY BILL ");
        System.out.println("4] EXIT");
        System.out.print("\nEnter Choice : \t");
        n=Integer.parseInt(br.readLine());

        switch(n)
       
       {
        case 1:
               System.out.print("Specify name of item to be searched:\t");
               String s=br.readLine();
               String s1;
               while((s1=f.readLine())!=null)
               {
               id=Integer.parseInt(s1);
               name=f.readLine();
               price=Double.parseDouble(f.readLine());
               qty=Integer.parseInt(f.readLine());

               if(s.equals(name))
               {
               System.out.print("\n\n Specified item is : ");
               System.out.print("\nID :  "+id);
               System.out.print("\nNAME :  "+name);
               System.out.print("\nPRICE : "+price);
               System.out.print("\nQUANTITY :  "+qty+"\n\n");
               break;
               }
               }
               f.reset();
               break;
        
        case 2:
               String s3;
               double max=0;
               while((s3=f.readLine())!=null)
               {
               id=Integer.parseInt(s3);
               name=f.readLine();
               price=Double.parseDouble(f.readLine());
               qty=Integer.parseInt(f.readLine());
               if(price > max)
               max=price;
               }
               f.reset();
               while((s1=f.readLine())!=null)
               {
               id=Integer.parseInt(s1);
               name=f.readLine();
               price=Double.parseDouble(f.readLine());
              
               qty=Integer.parseInt(f.readLine());
               if(price == max)
               {
               System.out.print("\n\n Costliest Item is : ");
               System.out.println("\nID :  "+id);
               System.out.print("\nNAME : "+name);
               System.out.print("\nPRICE : "+price);
               System.out.print("\nQUANTITY : "+qty+"\n\n");
               }
               }
               f.reset();
               break;

        case 3:

               String s2;
               double tot=0;
               while((s2=f.readLine())!=null)
               {
               id=Integer.parseInt(s2);
               name=f.readLine();
               price=Double.parseDouble(f.readLine());
               qty=Integer.parseInt(f.readLine());
               tot=tot+price*qty;
               System.out.println("\n\nID : "+id);
               System.out.print("\nNAME :  "+name);
               System.out.print("\nPRICE : "+price);
               System.out.print("\nQUANTITY : "+qty+"\n\n");
               }

               System.out.println("\n\nBill Generated :  "+tot);
               f.reset();
               break;

       case 4:
               break;

      default:
               System.out.println("Invalid");
      }

      }while(n != 4);
}
}


