import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int factor = 1, temp = 1;
        System.out.print("Please enter the number you want to get the factorial of : ");
        int number = scanner.nextInt();

        while (number < 0) {
            System.err.print("The entered number cannot be less than zero. - Please re-enter number : ");
            number = scanner.nextInt();
        }

        while (number > 0) {

            temp *= number * factor;
            number--;

        }
        System.out.println("Result : " + temp);
    }
}
