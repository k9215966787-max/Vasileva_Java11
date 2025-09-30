import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первую строку: ");
        String firstString = scanner.nextLine();

        System.out.print("Введите вторую строку: ");
        String secondString = scanner.nextLine();

        if (firstString.equals(secondString)) {
            System.out.println("Строки совпадают");
        } else {
            System.out.println("Строки отличаются");
        }
    }
}