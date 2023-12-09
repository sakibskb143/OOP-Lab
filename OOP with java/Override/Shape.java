package Override;
import java.util.Scanner;

public class Shape {
     
    int x , y , a ;
    
   
    Shape(int x , int y )
    {
        this.x = x ;
        this.y = y ;
    }

    Shape(int a )
    {
        this.a = a ;
    }
    

    void circle()
    {
        System.out.println("Area of the Circle : "+ (3.1416*a*a));
    }
    void square()
    {
        System.out.println("Area of the Square :"+(a*a));
    }
    void triangle()
    {
        System.out.println("Area of the Triangle : "+(0.5*x*y));
    }
    void rectangular()
    {
        System.out.println("Area of the Rectangular : "+(x*y));
    }
    public static void main(String[] args)
    {
      
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the value of x and y : ");
        int b = scr.nextInt();
        int c = scr.nextInt();
        System.out.print("Enter the value of a : ");
        int r = scr.nextInt();

        Shape area_of_circle_or_Square  = new Shape(r);
       
        Shape area_of_trian_Or_rectan = new Shape(b,c);

        area_of_circle_or_Square.circle();
        area_of_circle_or_Square.square();
        area_of_trian_Or_rectan.triangle();
        area_of_trian_Or_rectan.rectangular();

    }
}
