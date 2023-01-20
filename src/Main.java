import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = sc.nextDouble();

        double num2 = 0;
        char operator = ' ';

        while (true) {
            System.out.print("Введите второе число: ");
            num2 = sc.nextDouble();
            System.out.print("Введите оператор (+, -, *, /): ");
            operator = sc.next().charAt(0);

            if (num2 != 0 || operator != '/') {
                break;
            }
            System.out.println("Вы не можете поделить на ноль, измените второе число: ");
        }

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.printf("Ошибка! Введён не тот оператор");
                return;
        }

        System.out.printf("%.1f %c %.1f = %.1f", num1, operator, num2, result);
    }
}