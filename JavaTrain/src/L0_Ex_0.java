import java.util.Scanner;

public class L0_Ex_0 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // دریافت اندازه آرایه
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            // ایجاد آرایه
            int[] array = new int[size];

            // دریافت اعداد آرایه از کاربر
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            // دریافت عددی که باید جستجو شود
            System.out.print("Enter the number to search for: ");
            int number = scanner.nextInt();

            // جستجو در آرایه
            boolean result = searchArray(array, number);
            System.out.println("Result: " + result);
        }

        public static boolean searchArray(int[] array, int number) {
            int count = 0;
            for (int num : array) {
                if (num == number) {
                    count++;
                }
            }

            if (count > 0) {
                System.out.println("Number " + number + " is found " + count + " times in the array.");
                return true;
            } else {
                System.out.println("Number " + number + " is not found in the array.");
                return false;
            }
        }
    }





