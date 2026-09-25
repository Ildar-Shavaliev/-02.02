import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Вас приветствует виртуальная АТС!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш номер телефона:");
        String number = scanner.next();
        System.out.println("Введите номер пользователя, которому хотите позвонить:");
        String friendNumber = scanner.next();
        System.out.println("Выберите модель телефона собеседника, 1 - стационарный телефон, 2 - мобильный телефон, 3 - смартфон:");
        int type = scanner.nextInt();

        if (type < 1 || type > 3) {
            System.out.println("Введена неверная модель телефона");
            return;
        }

        getPhone(type, number).makeCall(friendNumber);
    }

    public static Phone getPhone(int type, String number) {
        if (type == 1) {
            // если выбран стационарный телефон, создайте объект класса LandlinePhone
            return new LandlinePhone(number);
        } else if (type == 2) {
            // если выбран мобильный телефон, создайте объект класса MobilePhone
            return new MobilePhone(number);
        } else {
            // иначе создайте экземпляр класса Smartphone
            return new Smartphone(number);
        }
    }

}
// допишите реализацию класса Smartphone
class Smartphone extends MobilePhone {

    public Smartphone(String number) {
        super(number);
    }
    public void makeCall(String targetNumber, String appName) {
        System.out.println("Звоним с номера " + "TODO"); // номер можно взять из родителя, если нужно
        System.out.println("Позвоним через приложение " + appName + " по номеру " + targetNumber);
        System.out.println("Привет!");
    }
    // объявите метод sendEmail()
    public void sendEmail(String email, String messageText) {
        System.out.println("Напишем другу сообщение " + messageText + " по email " + email);
    }

}
class MobilePhone extends Phone {
    public MobilePhone(String number) {
        super(number);
    }
    //объявите метод sendSms()
    public void sendSms (String targetNumber, String messageText){
        System.out.println("Отправляем сообщение " + messageText + " по номеру " + targetNumber);
    }
}
// допишите реализацию класса LandlinePhone
class LandlinePhone extends Phone {
    public LandlinePhone(String number) {
        super(number);
    }
}
abstract class Phone {
    private final String number;

    public Phone(String number) {
        this.number = number;
    }

    public void makeCall(String targetNumber) {
        System.out.println("Звоним с номера " + number);
        System.out.println("Набираем номер " + targetNumber + " и звоним по сотовой связи");
        System.out.println("Привет!");
    }

}