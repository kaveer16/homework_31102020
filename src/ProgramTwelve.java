import java.util.Scanner; // using scanner class for testing any number

public class ProgramTwelve {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in); // creating scanner object
        System.out.print("Enter the number: ");
        int number= n.nextInt();


        boolean flag = false;
        //Using for loop here to iterate a part of the program several times.
        for(int i = 2; i <= number/2; ++i)
        {
            // condition for nonprime number
            if(number % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");
    }
}


