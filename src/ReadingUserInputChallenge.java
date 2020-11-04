import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        System.out.println(hasNextInteger());
        
    }

    static boolean hasNextInteger() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int en = input.nextInt();

        int num = 0;
        int sum = 0;
        int i = 1;

        while (i <= en) {
            System.out.println("enter number" + i);
            num = input.nextInt();
            sum = sum + num;
            i++;
        }
        System.out.println("The total is :" + sum);
        return true;
    }
}



