//Display right angle triangle of @ using nested for loops

import java.util.Scanner;

public class ProgramEight {

    public static void main(String[] args) {
            int i,j,n;
            System.out.print("Input nof rows : ");
            //not necessary to use scanner here, but using here to input rows as many as required.
            Scanner in = new Scanner(System.in); //creating scanner object
             n= in.nextInt();

            for(i=1;i<=n;i++) //using nested for loop statement
            {
                for(j=1;j<=i;j++)
                    System.out.print("@");

                System.out.println("");
            }
        }
    }

