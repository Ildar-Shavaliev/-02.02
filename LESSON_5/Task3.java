import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Scanner in = new Scanner(System.in);
        bankAccount.setMoneyAmount(1000); // передайте в банкомат сумму на счету
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " р.");
        double sum = in.nextDouble();// вызовите метод вывода средств
        System.out.println("Со счёта снято " + sum + " р.");
        double finalPrice = bankAccount.getMoneyAmount() - sum;
        System.out.println("Количество денег на счету - " + finalPrice + " р.");
    }
}

class BankAccount {
    public long getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(long moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    private long moneyAmount;

    // допишите код методов
    // используйте параметр newMoneyAmount для установки нового значения
}