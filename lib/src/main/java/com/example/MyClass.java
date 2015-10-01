package com.example;

public class MyClass
{
    public static void main(String[] args)
    {
        String[] shirtsArray = {"orange", "black", "green", "blue", "red"};
        int[] numShirts = {5, 4, 3, 2, 1};

        int count = 0;

        while (count <= 5)
        {
            count++;
            System.out.println("");

            if (count == 1)
            {
                System.out.println("I own " + numShirts[0] + " shirts that are " + shirtsArray[0] + ".");
            }

            if (count == 2)
            {
                System.out.println("I own " + numShirts[1] + " shirts that are " + shirtsArray[1] + ".");
            }

            if (count == 3)
            {
                System.out.println("I own " + numShirts[2] + " shirts that are " + shirtsArray[2] + ".");
            }

            if (count == 4)
            {
                System.out.println("I own " + numShirts[3] + " shirts that are " + shirtsArray[3] + ".");
            }

            if (count == 5)
            {
                System.out.println("I own " + numShirts[4] + " shirt that is " + shirtsArray[4] + ".");
            }
        }
    }
}
