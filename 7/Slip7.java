import series.*;
import java.util.*;
class Slip7
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();
        
        PrimeNumber primeNum = new PrimeNumber(num);
	NumberSquare s=new NumberSquare(num);
        Fibo f=new Fibo(num);
        }
    }
