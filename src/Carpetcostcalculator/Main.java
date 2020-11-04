package Carpetcostcalculator;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char choice;
        Scanner t = new Scanner(System.in);
        do {
            System.out.print("Enter width:");
            double width =t.nextDouble();
            System.out.print("Enter Length: ");
            double length =t.nextDouble();
            System.out.print("Enter Cost: ");
            double cost = t.nextDouble();


            Carpet carpet = new Carpet(cost);

            Floor floor = new Floor(width,length);
            Calculator calculator = new Calculator(floor, carpet);
            System.out.println("Total : " + calculator.getTotalCost());

            System.out.println("Do you want to continue y or n");
            choice = t.next().charAt(0);
        }while(choice =='Y' || choice=='y');





    }
}
