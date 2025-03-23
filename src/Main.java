import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double side1, side2, hypotenuse;
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the first side of the triangle : ");
        side1 = input.nextDouble();
        System.out.print("Enter the second side of the triangle : ");
        side2 = input.nextDouble();
        hypotenuse = Math.sqrt((side1*side1) + (side2*side2));
        System.out.println("Hypotenuse of the triangle is " + hypotenuse);

    }
}