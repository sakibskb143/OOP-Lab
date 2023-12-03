import java.util.Scanner;

public class Shape {
    int x , y , r  , a ;
    final double pi = 3.1416;

    Shape()
    {
       Scanner in = new Scanner(System.in);
       r =  in.nextInt();  
    }
    void circle()
    {
        System.out.println("Area of Circle : "+ (pi*r*r));
    }

    Shape(int x , int y)
    {
        this.x = x ;
        this.y = y ;
    }
    void rectangle()
    {
         System.out.println("Area of Rectangle  : "+ (x*y));
    }
    Shape (int a)
    {
        this.a = a ;
    }
    void square()
    {
         System.out.println("Area of Square : "+ (a*a));
    }
    
}
