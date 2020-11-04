//

import java.util.Scanner;

public class ProgramSeven {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("enter the number: ");
        int sum =num.nextInt();
    }
    public static int sumFirstAndLast(int number){
        // number = 12 should output 3
        int num = number;
        if(num < 0){
            return -1;
        }
        int lastDigit = num % 10;

        while(num >= 10){
            num = number / 10;
        }
        int firstDigit = num ;
        return firstDigit + lastDigit;
    }
}




