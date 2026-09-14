import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<MountainHare> hares = new ArrayList<>();
        hares.add(new MountainHare(4, 4.4, 120));
        hares.add(new MountainHare(7, 3.6, 150));
        hares.add(new MountainHare(1, 2.3, 100));

        System.out.println("В лесу лето!");
        // создайте объект "летний лес с зайцами"
        Forest.setSeason("лето");
        Forest forest = new Forest(hares);

        System.out.println("Список зайцев:");
        // напечатайте список всех зайцев
        forest.printHares();

        System.out.println("В лесу зима!");
        // поменяйте время года на зиму
        Forest.setSeason("зима");

        System.out.println("Список зайцев:");
        // напечатайте список всех зайцев
        forest.printHares();
    }

}
class MountainHare {
    private int age;
    private double weight;
    private int jumpLength;
    public static String color;
    public MountainHare(int age, double weight, int jumpLength) {
        this.age = age;
        this.weight = weight;
        this.jumpLength = jumpLength;
    }
    // добавьте переменные и конструктор

    @Override
    public String toString() {
        return "Заяц-беляк: " +
                "age=" + age +
                ", weight=" + weight +
                ", jumpLength=" + jumpLength +
                ", color=" + color +
                '.';
    }
}
class Forest {
    private ArrayList<MountainHare> hares;
    private static String season;
    public Forest(ArrayList<MountainHare> hares) {
        this.hares = hares;
    }
    public static void setSeason(String newSeason) {
        season = newSeason;
        if (season.equals("зима")) {
            MountainHare.color = "белый";
        } else if (season.equals("лето")) {
            MountainHare.color = "серо-рыжий";
        }
    }

    public void printHares() {
        for (MountainHare hare : hares) {
            System.out.println(hare);
        }
    }
    // объявите недостающие переменные и добавьте конструктор

    // добавьте метод setSeason(String newSeason)
    // в этом методе реализуйте логику смены цвета шубок зайцев-беляков

    // добавьте метод printHares()
}