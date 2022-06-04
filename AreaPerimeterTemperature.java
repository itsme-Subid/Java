import java.util.Scanner;
import java.lang.Math;

// Fully bug free Area, Perimeter and Temperature calculator/converter.
// Made by itsme-Subid
// Special thanks to: Rajeet Kumar Ash for helping me to understand the Java Concepts.
// Thank you to those who helped me in this project.
// Date: 04-06-2022

class Input {
    static Scanner sc = new Scanner(System.in);
}

class Area extends Input {
    public static void control() {
        System.out.println(
                "\nEnter the shape you want to calculate the area of: (1) circle, (2) cylinder, (3) rectangle, (4) square, (5) trapezoid, (6) scalene triangle, (7) equilateral triangle, (8) isosceles triangle, (9) exit");
        int areaInput = sc.nextInt();
        if (areaInput > 0 && areaInput < 9) {
            System.out.print("\nYou have chosen to calculate the area of a ");
        }
        switch (areaInput) {
            case 1:
                System.out.println("circle");
                circle();
                break;
            case 2:
                System.out.println("cylinder");
                cylinder();
                break;
            case 3:
                System.out.println("rectangle");
                rectangle();
                break;
            case 4:
                System.out.println("square");
                square();
                break;
            case 5:
                System.out.println("trapezoid");
                trapezium();
                break;
            case 6:
                System.out.println("scalene triangle");
                scaleneTriangle();
                break;
            case 7:
                System.out.println("equilateral triangle");
                equilateralTriangle();
                break;
            case 8:
                System.out.println("isosceles triangle");
                isoscelesTriangle();
                break;
            case 9:
                System.out.println("Exiting...");
                System.exit(0);
                break;
            default:
                System.out.println("\nInvalid input \nEnter valid input");
                control();

        }
    }

    public static void circle() {
        System.out.println("Enter the radius of the circle");
        double radius = sc.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.println("Area of circle is: " + area);
    }

    public static void cylinder() {
        System.out.println("Enter the radius and height of the cylinder");
        double r = sc.nextDouble(), h = sc.nextDouble();
        double area = (2 * 3.14 * r * h) + (2 * 3.14 * r * r);
        System.out.println("Area of cylinder is: " + area);
    }

    public static void rectangle() {
        System.out.println("Enter the length and breadth of the rectangle");
        double l = sc.nextDouble(), b = sc.nextDouble();
        double area = l * b;
        System.out.println("Area of rectangle is: " + area);
    }

    public static void square() {
        System.out.println("Enter the side of the square");
        double s = sc.nextDouble();
        double area = s * s;
        System.out.println("Area of square is: " + area);
    }

    public static void trapezium() {
        System.out.println("Enter the two bases and height of the trapezium");
        double a = sc.nextDouble(), b = sc.nextDouble(), h = sc.nextDouble();
        double area = ((a + b) / 2) * h;
        System.out.println("Area of trapezium is: " + area);
    }

    public static void scaleneTriangle() {
        System.out.println("Enter the base and the height of the scalene triangle");
        double b = sc.nextDouble(), h = sc.nextDouble();
        double area = (h * b) / 2;
        System.out.println("Area of triangle is: " + area);
    }

    public static void equilateralTriangle() {
        System.out.println("Enter the side of the equilateral triangle");
        double s = sc.nextDouble();
        double area = (Math.sqrt(3) / 4) * s * s;
        System.out.println("Area of triangle is: " + area);
    }

    public static void isoscelesTriangle() {
        System.out.println("Enter the side and the base of the isosceles triangle");
        double a = sc.nextDouble(), b = sc.nextDouble();
        double area = (a * b) / 2;
        System.out.println("Area of triangle is: " + area);
    }
}

class Perimeter extends Input {
    public static void control() {
        System.out.println(
                "\nEnter the shape you want to calculate the perimeter of: (1) circle, (2) cylinder, (3) rectangle, (4) square, (5) trapezoid, (6) scalene triangle, (7) equilateral triangle, (8) isosceles triangle, (9) exit");
        int perimeterInput = sc.nextInt();
        if (perimeterInput > 0 && perimeterInput < 9) {
            System.out.print("\nYou have chosen to calculate the perimeter of a ");
        }
        switch (perimeterInput) {
            case 1:
                System.out.println("circle");
                circle();
                break;
            case 2:
                System.out.println("cylinder");
                cylinder();
                break;
            case 3:
                System.out.println("rectangle");
                rectangle();
                break;
            case 4:
                System.out.println("square");
                square();
                break;
            case 5:
                System.out.println("trapezoid");
                trapezium();
                break;
            case 6:
                System.out.println("scalene triangle");
                scaleneTriangle();
                break;
            case 7:
                System.out.println("equilateral triangle");
                equilateralTriangle();
                break;
            case 8:
                System.out.println("isosceles triangle");
                isoscelesTriangle();
                break;
            case 9:
                System.out.println("Exiting...");
                System.exit(0);
                break;
            default:
                System.out.println("\nInvalid input \nEnter valid input");
                control();

        }
    }

    public static void circle() {
        System.out.println("Enter the radius of the circle");
        double r = sc.nextDouble();
        double perimeter = 2 * 3.14 * r;
        System.out.println("Perimeter of circle is: " + perimeter);
    }

    public static void cylinder() {
        System.out.println("Enter the radius and height of the cylinder");
        double r = sc.nextDouble(), h = sc.nextDouble();
        double perimeter = 2 * 3.14 * r * h;
        System.out.println("Perimeter of cylinder is: " + perimeter);
    }

    public static void rectangle() {
        System.out.println("Enter the length and breadth of the rectangle");
        double l = sc.nextDouble(), b = sc.nextDouble();
        double perimeter = 2 * (l + b);
        System.out.println("Perimeter of rectangle is: " + perimeter);
    }

    public static void square() {
        System.out.println("Enter the side of the square");
        double s = sc.nextDouble();
        double perimeter = 4 * s;
        System.out.println("Perimeter of square is: " + perimeter);
    }

    public static void trapezium() {
        System.out.println("Enter the all the sides of the trapezium");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble(), d = sc.nextDouble();
        double perimeter = a + b + c + d;
        System.out.println("Perimeter of trapezium is: " + perimeter);
    }

    public static void scaleneTriangle() {
        System.out.println("Enter the three sides of the scalene triangle");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        double perimeter = a + b + c;
        System.out.println("Perimeter of triangle is: " + perimeter);
    }

    public static void equilateralTriangle() {
        System.out.println("Enter the side of the equilateral triangle");
        double a = sc.nextDouble();
        double perimeter = 3 * a;
        System.out.println("Perimeter of equilateral triangle is: " + perimeter);
    }

    public static void isoscelesTriangle() {
        double a = sc.nextDouble(), b = sc.nextDouble();
        double perimeter = 2 * a + b;
        System.out.println("Perimeter of isosceles triangle is: " + perimeter);
    }
}

class Temperature extends Input {
    public static void control() {
        System.out.println(
                "\nEnter the conversion you want to convert the temperature from: (1) celsius to fahrenheit, (2) celsius to kelvin, (3) fahrenheit to celsius, (4) fahrenheit to kelvin, (5) kelvin to celsius, (6) kelvin to fahrenheit, (7) exit");
        int temperatureInput = sc.nextInt();
        if (temperatureInput > 0 && temperatureInput < 9) {
            System.out.print("\nYou have chosen to convert a temperature from ");
        }
        switch (temperatureInput) {
            case 1:
                System.out.println("celsius to fahrenheit");
                celsiusToFahrenheit();
                break;
            case 2:
                System.out.println("celsius to kelvin");
                celsiusToKelvin();
                break;
            case 3:
                System.out.println("fahrenheit to celsius");
                fahrenheitToCelsius();
                break;
            case 4:
                System.out.println("fahrenheit to kelvin");
                fahrenheitToKelvin();
                break;
            case 5:
                System.out.println("kelvin to celsius");
                kelvinToCelsius();
                break;
            case 6:
                System.out.println("kelvin to fahrenheit");
                kelvinToFahrenheit();
                break;
            case 7:
                System.out.println("Exiting...");
                System.exit(0);
                break;
            default:
                System.out.println("\nInvalid input \nEnter valid input");
                control();
        }
    }

    public static void celsiusToFahrenheit() {
        System.out.println("Enter the temperature in Celsius");
        double c = sc.nextDouble();
        double f = (c * 9 / 5) + 32;
        System.out.println("Fahrenheit: " + f);
    }

    public static void fahrenheitToCelsius() {
        System.out.println("Enter the temperature in Fahrenheit");
        double f = sc.nextDouble();
        double c = (f - 32) * 5 / 9;
        System.out.println("Celsius: " + c);
    }

    public static void celsiusToKelvin() {
        System.out.println("Enter the temperature in Celsius");
        double c = sc.nextDouble();
        double k = c + 273.15;
        System.out.println("Kelvin: " + k);
    }

    public static void kelvinToCelsius() {
        System.out.println("Enter the temperature in Kelvin");
        double k = sc.nextDouble();
        double c = k - 273.15;
        System.out.println("Celsius: " + c);
    }

    public static void fahrenheitToKelvin() {
        System.out.println("Enter the temperature in Fahrenheit");
        double f = sc.nextDouble();
        double k = ((f - 32) * 5 / 9) + 273.15;
        System.out.println("Kelvin: " + k);
    }

    public static void kelvinToFahrenheit() {
        System.out.println("Enter the temperature in Kelvin");
        double k = sc.nextDouble();
        double f = ((k - 459.67) * 9 / 5) + 32;
        System.out.println("Fahrenheit: " + f);
    }
}

public class AreaPerimeterTemperature extends Input {
    public static void main(String args[]) {
        System.out.println("\nWelcome to the most usefull operational program!");
        System.out.println(
                "\nEnter the operation you want to execute of: (1) area, (2) perimeter, (3) temperature, (4) exit");
        int operation = sc.nextInt();
        if (operation > 0 && operation < 4) {
            System.out.print("\nYou have chosen ");
        }
        switch (operation) {
            case 1:
                System.out.println("area to execute ");
                Area.control();
                break;
            case 2:
                System.out.println("perimeter to execute ");
                Perimeter.control();
                break;
            case 3:
                System.out.println("temperature to execute ");
                Temperature.control();
                break;
            case 4:
                System.out.println("Exiting...");
                System.exit(0);
                break;
            default:
                System.out.println("\nInvalid input \nEnter valid input");
                main(null);
        }
        System.out.println("Would you like to execute another operation? (1) yes, (2) no");
        int answer = sc.nextInt();
        if (answer == 1) {
            main(null);
        } else {
            System.out.println("Exiting...");
            System.exit(0);
        }
    }
}