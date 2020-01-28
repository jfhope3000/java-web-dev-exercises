package exercises;

import java.awt.*;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner lengthInput = new Scanner(System.in);
        System.out.println("Please type in the length of the rectangle");
        int length = lengthInput.nextInt();
        System.out.println("And how about the width of your rectangle?");
        Scanner widthInput = new Scanner(System.in);
        int width = widthInput.nextInt();
        int area = (length * width);
        System.out.println("The area is of your rectangle is " + area);
        lengthInput.close();
        widthInput.close();
    }
}
