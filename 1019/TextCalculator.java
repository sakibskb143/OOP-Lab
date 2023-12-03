import java.util.Scanner;

public class TextCalculator {
    Calculator calc1 , calc2 ;
    TextCalculator()
    {

         int a , b , c , d ;
         Scanner in = new Scanner(System.in);
         System.out.println("Enter the value of first object : ");
          a = in.nextInt() ;
          b = in.nextInt() ;
         System.out.println("Enter the value of first object : ");
          d = in.nextInt();
          c = in.nextInt();
         
        calc1 = new Calculator(a, b);
        calc2 =  new Calculator(c, d);

        System.out.println("Out of first object : ");
        calc1.add();
        calc1.subtra();
        System.out.println("Out of Second object : ");
        calc2.add();
        calc2.subtra();

    }
    public static void main(String[] args)
    {
        TextCalculator calc = new TextCalculator() ;
    }
    
}
