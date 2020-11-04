//Display left angle triangle of * using nested for loops
//Created by Raj Anilkumar

import java.util.Scanner;//using scanner class to input required amount of rows in triangle

public class ProgramFifteen {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in); //creating scanner object
        System.out.print("How many rows: ");
        int rows = input.nextInt();
        //using for loop with (initialization,condition & increment)
        for (int x = 1; x <= rows; x++)
        {
            for (int i = 1; i <= x; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}




