import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner[] myArray = new Scanner[]{new Scanner(System.in)};
        System.out.println("Enter Array");
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The Number");
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == x) {
                System.out.println("The number exists");
            } else {
                System.out.println("The number doesn't exist");
            }
        }


    }
}



