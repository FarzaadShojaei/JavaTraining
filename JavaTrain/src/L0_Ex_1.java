import java.util.Scanner;
public class L0_Ex_1 {


    public class CalculatorMenu {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // دریافت دو عدد صحیح از کاربر
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // نمایش منوی انتخابی
            System.out.println("Menu:");
            System.out.println("1. Display the sum of the two numbers");
            System.out.println("2. Display the difference between the larger and the smaller number");
            System.out.println("3. Display the product of the two numbers");
            System.out.println("4. Display the division of the two numbers");

            // دریافت انتخاب کاربر
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();

            // انجام عملیات بر اساس انتخاب کاربر
            switch (choice) {
                case 1:
                    System.out.println("The sum of the two numbers is: " + (num1 + num2));
                    break;
                case 2:
                    if (num1 > num2) {
                        System.out.println("The difference between the larger and the smaller number is: " + (num1 - num2));
                    } else {
                        System.out.println("The difference between the larger and the smaller number is: " + (num2 - num1));
                    }
                    break;
                case 3:
                    System.out.println("The product of the two numbers is: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("The division of the two numbers is: " + ((double) num1 / num2));
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option from 1 to 4.");
                    break;
            }

            scanner.close();
        }
    }

}
