import java.util.Scanner;
import java.util.Scanner;
public class L1_Ex_2 {
    abstract class Shape {
        abstract double getPerimeter();
        abstract double getArea();
    }
    class Rectangle extends Shape {
        private double length;
        private double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        double getPerimeter() {
            return 2 * (length + width);
        }

        @Override
        double getArea() {
            return length * width;
        }

        public boolean isSquare() {
            return length == width;
        }
    }


    public class Main {
        public void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // دریافت طول و عرض اولین شکل هندسی
            System.out.print("Enter the length of the first shape: ");
            double length1 = scanner.nextDouble();
            System.out.print("Enter the width of the first shape: ");
            double width1 = scanner.nextDouble();

            // ایجاد اولین شکل هندسی
            Rectangle shape1 = new Rectangle(length1, width1);

            // نمایش محیط و مساحت اولین شکل هندسی
            System.out.println("Perimeter of the first shape: " + shape1.getPerimeter());
            System.out.println("Area of the first shape: " + shape1.getArea());
            if (shape1.isSquare()) {
                System.out.println("The first shape is a square.");
            } else {
                System.out.println("The first shape is a rectangle.");
            }

            // دریافت طول و عرض دومین شکل هندسی
            System.out.print("Enter the length of the second shape: ");
            double length2 = scanner.nextDouble();
            System.out.print("Enter the width of the second shape: ");
            double width2 = scanner.nextDouble();

            // ایجاد دومین شکل هندسی
            Rectangle shape2 = new Rectangle(length2, width2);

            // نمایش محیط و مساحت دومین شکل هندسی
            System.out.println("Perimeter of the second shape: " + shape2.getPerimeter());
            System.out.println("Area of the second shape: " + shape2.getArea());
            if (shape2.isSquare()) {
                System.out.println("The second shape is a square.");
            } else {
                System.out.println("The second shape is a rectangle.");
            }

            scanner.close();
        }
    }


    }

