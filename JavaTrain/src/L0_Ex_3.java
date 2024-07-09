import java.util.Scanner;
public class L0_Ex_3 {

    public class FindMaxInArray {
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

            // یافتن بزرگترین عدد در آرایه
            int max = findMax(array);
            System.out.println("The maximum number in the array is: " + max);
        }

        public static int findMax(int[] array) {
            int max = array[0]; // فرض می‌کنیم اولین عدد بزرگترین است
            for (int num : array) {
                if (num > max) {
                    max = num; // اگر عددی بزرگتر یافت شد، آن را به عنوان بزرگترین مقدار قرار می‌دهیم
                }
            }
            return max;
        }
    }

}
