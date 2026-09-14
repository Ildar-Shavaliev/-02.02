import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите сумму перевода в рублях.");
        // считайте сумму перевода при помощи scanner.nextDouble()
        double amount = scanner.nextDouble();
        boolean isValid = TransactionValidator.isValidAmount(amount); // добавьте вызов метод isValidAmount
        if (isValid)
            System.out.println("Спасибо! Ваш перевод на сумму " + amount + " р. успешно выполнен.");
    }
}
class TransactionValidator {
    // объявите константы
    public static final double min_amount = 1.0;
    public static final double max_amount = 5000.0;
    // объявите метод isValidAmount()
    // внутри метода добавьте проверки на минимальную и максимальную сумму перевода
    public static boolean isValidAmount(double amount) {
        if (amount < min_amount) {
            System.out.println("Минимальная сумма перевода: " + min_amount + " р. Попробуйте ещё раз!");
            return false;
        }

        if (amount > max_amount) {
            System.out.println("Максимальная сумма перевода: " + max_amount + " р. Попробуйте ещё раз!");
            return false;
        }
        else
            return true;
    }
}