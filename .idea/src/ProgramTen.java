//Write a program to input any number and check if it Armstrong number or not
//Created by Raj Anilkumar on 03//11/2020

public class ProgramTen {
    public static void main(String[] args) {

        int number = 153, originalNumber, remainder, result = 0;

        originalNumber = number;
         //Using While Loop to execute group of statements repeatedly or more number of times
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}


