
class MyNumber
{
        private int number;
        MyNumber()
        {
                number=0;
        }
        MyNumber(int number)
        {
                this.number=number;
        }

        void isNegative()
        {
                if(number<0)
                        System.out.println("Number is negative");
        }
        void isPositive()
        {
                if(number>0)
                        System.out.println("Number is positive");
        }
        void isZero()
        {
                if(number==0)
                        System.out.println("Number is Zero");
        }
        void isOdd()
        {
                if(number%2!=0)
                        System.out.println("Number is odd");
        }
        void isEven()
        {
                if(number%2==0)
                        System.out.println("Number is Even");
        }
}


class MyNumberDemo
{
        public static void main(String args[])
        {
                int res;
                res=Integer.parseInt(args[0]);
                MyNumber m= new MyNumber(res);
                if(args.length==1)
                {
                        m.isNegative();
                        m.isPositive();
                        m.isZero();
                        m.isEven();
                        m.isOdd();
                }
                else
                        System.out.println("Arguments not valid");
        }
}


