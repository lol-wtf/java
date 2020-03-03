import java.io.*;
class b1
{
        public static void main(String arg[])throws IOException
        {
        int id,qty,n,i;
        String name;
        double pno;
        try
	  {
        BufferedReader br = new BufferedReader(new 					InputStreamReader(System.in));
        FileWriter f1 = new FileWriter("phone.txt");
        BufferedReader f = new BufferedReader(new FileReader("phone.txt"));
        f.mark(100);
        do
        {
        System.out.println("\n\n ******* MENU ********");
        System.out.println("1] SEARCH BY NAME ");
        System.out.println("2] ADD NEW");
        System.out.println("3] DISPLAY BILL ");
        System.out.println("4] EXIT");
        System.out.print("\nEnter Choice : \t");
        n=Integer.parseInt(br.readLine());

        switch(n)
        {
        case 1:
               System.out.print("Specify name of Person to be searched:\t");
               String s=br.readLine();
               String s1;
               while((s1=f.readLine())!=null)
               {
              
		   
               pno=Double.parseDouble(f.readLine());
			
               if(s.equals(s1))
               {                          
               System.out.print("\nNAME :  "+s1);
               System.out.print("\nPHONE NO : "+pno);
               break;
               }
               }
               f.reset();
               break;
        
        case 2:
			System.out.print("ENTER NUMBER OF Members :   ");
        		n=Integer.parseInt(br.readLine());
        		for(i=0;i<n;i++)
        		{
        
        		System.out.print("\nSPECIFY NAME :  ");
        		name=(br.readLine());
        		System.out.print("\nSPECIFY PHONE :  ");
        		pno=Double.parseDouble(br.readLine());
        
        
        		f1.write(name +"\n");
        		f1.write(new Double(pno).toString()+"\n");
       
        		}

       		 f1.close();
               
			break;
        case 3:

               String s2;
             
               while((s2=f.readLine())!=null)
               {
               //me=f.readLine();
               pno=Double.parseDouble(f.readLine());
                             
               System.out.print("\nNAME :  "+s2);
               System.out.print("\nPHONE NO. : "+pno);
               
               }
             
               f.reset();
               break;

       case 4:
               break;

      default:
               System.out.println("Invalid");
      }

      }while(n != 4);
	
	}
	catch(Exception e){System.out.println("ERR : "+e);
}
}
}


