package exercises;

import java.util.Scanner;


public class RectangleArea {

    public static void main(String[] args) {

        Double width;
        Double length;

        Scanner in;
        in = new Scanner(System.in);

        System.out.println("Enter rectangle width: ");
        width = in.nextDouble();

        System.out.println("Enter rectangle length: ");
        length = in.nextDouble();

        Double area;
        area = width * length;

        System.out.println("The area of your rectangle = " + area);

    }


}
