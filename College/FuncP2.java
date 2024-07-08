

import java.util.Scanner;

public class FuncP2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last number: ");
        int m = sc.nextInt();   
        FuncP2 d1 = new FuncP2();
        double b = d1.Sumofnos(m);
        System.out.println(String.format("Sum of natural nos till %d is: %g", m, b));
        double b1 = d1.Sumofsq(m);
        System.out.println(String.format("Sum of squares of natural nos till %d is: %g", m, b1));
        double b2 = d1.Sumofcube(m);
        System.out.println(String.format("Sum of cubes of n natural nos till %d is: %g", m, b2));
    }

    double Sumofnos(int l)
    {
    double d = l * (l + 1) / 2;
            return d;
        }

        double Sumofsq(int l)
    {
        double d = (l * (l + 1) * (2 * l + 1)) / 6;
        return d ;
    } 

    double Sumofcube(int l)
    {
            double d = ((l * l) * ((l + 1) * (l + 1))) / 4;
            return d;
    }
}
