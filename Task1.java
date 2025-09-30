import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("Первое число больше второго");
        } else if (firstNumber < secondNumber) {
            System.out.println("Первое число меньше второго");
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("Сумма: " + (firstNumber + secondNumber));
        System.out.println("Разность: " + (firstNumber - secondNumber));
        if (secondNumber != 0) {
            System.out.println("Деление: " + (firstNumber / secondNumber));
        } else {
            System.out.println("Деление невозможно (на ноль)");
        }
        System.out.println("Умножение: " + (firstNumber * secondNumber));
    }
}