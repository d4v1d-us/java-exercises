package exercises;

import java.util.Scanner;

public class MPG {

    public static void main(String[] args) {

        Double miles;
        Double gallons;

        Scanner in;
        in = new Scanner(System.in);

        System.out.println("How many miles did you drive? ");
        miles = in.nextDouble();

        System.out.println("How many gallons of gas did you burn? ");
        gallons = in.nextDouble();

        Double MPG;
        MPG = miles / gallons;

        System.out.println("Your MPG = " + MPG);

    }
}
