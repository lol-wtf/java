import java.io.*;

abstract class Shape 
{
        double dim1, dim2;
        Shape(double a, double b)
        {
                dim1 = a;
                dim2 = b;
        }
        abstract double area();
        abstract double volume();
}

class Sphere extends Shape
{
        Sphere(double a)
        {
                super(a,0);
        }
        double area()
        {
                System.out.print("\nArea of Sphere:");
                return 4*Math.PI*Math.pow(dim1,2);
        }
        double volume()
        {
                System.out.print("\nVolume of Sphere:");
                return 4*Math.PI*Math.pow(dim1,3)/3;
        }

}

class Cone extends Shape
{
        Cone(double a, double b)
        {
                super(a,b);
        }
        double area()
        {
                System.out.print("\nArea of Cone:");
                return Math.PI*dim1*Math.sqrt(Math.pow(dim1,2)+Math.pow(dim2,2));
        }
        double volume()
        {
                System.out.print("\nVolume of Cone:");
                return Math.PI*Math.pow(dim1,2)*dim2/3;
        }
}

class Cylinder extends Shape
{
        Cylinder(double a, double b)
        {
                super(a,b);
        }
        double area()
        {
                System.out.print("\nArea of Cylinder:");
                return 2*Math.PI*dim1*dim2 + 2*Math.PI*Math.pow(dim1,2);
        }
        double volume()
        {
                System.out.print("\nVolume of Cylinder:");
                return Math.PI*Math.pow(dim1,2)*dim2;
        }
}

class Slip1
{
        public static void main(String args[])
        {
                Shape s;
                s = new Sphere(4);
                System.out.println(s.area()+"........");
                System.out.println(s.volume()+"......");

                s = new Cone(5,8);
                System.out.println(s.area()+"........");
                System.out.println(s.volume()+"......");

                s = new Cylinder(5,3);
                System.out.println(s.area()+"........");
                System.out.println(s.volume()+"......");
        }
}
