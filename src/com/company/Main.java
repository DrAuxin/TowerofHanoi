package com.company;
import java.util.*;
public class Main
{
    public static int x;
    public static void main(String[] args)
    {
        {
            x = 0;
            Scanner user = new Scanner(System.in);
            System.out.println("Enter the number of discs in your tower of Hanoi.");
            int n = user.nextInt();
            if (n <= 1)
            {
                String error = "This is not a tower of Hanoi.";
                IllegalArgumentException e = new IllegalArgumentException(error);
                throw e;
            }
            int source = 1;
            int spare = 2;
            int target = 3;
            tower(n, source, spare, target);
        }
    }
    public static void tower(int n, int source, int spare, int target)
    {
        if (n <= 2)
        {
            System.out.println("Step " + ++x +": Move the disc on tower " + source + " to tower " + spare + ".");
            System.out.println("Step " + ++x +": Move the disc on tower " + source + " to tower " + target + ".");
            System.out.println("Step " + ++x +": Move the disc on tower " + spare + " to tower " + target + ".");
        }
        else
        {
            tower(n-1, source, target, spare);
            System.out.println("Step " + ++x +": Move the disc on tower " + source + " to tower " + target + ".");
            tower(n-1, spare, source, target);
        }
    }
}


