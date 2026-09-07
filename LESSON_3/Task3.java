import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String> animals = new ArrayList<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        animals.add("Шиншилла");
        animals.add("Крокодил");
        animals.add("Лев");
        animals.add("Медведь");
        animals.add("Слон");

        System.out.println("Сегодня в зоопарке можно увидеть " + animals.size() + " животных.");

        System.out.println("Это будут:");
        for (String animal : animals){
            System.out.println(animal);
        }

        System.out.println("1 - Добавить животное в список");
        System.out.println("2 - Удалить животное из списка");
        System.out.println("3 - проверка животного в зоопарке");
        System.out.println("4 - очистить список");
        int command = in.nextInt();
        in.nextLine();
        if (command == 1) {
            System.out.println("Введите имя животного, которого надо добавить");
            String AddAnimal = in.nextLine();
            AddAnimalVoid(AddAnimal);
        }
        if (command == 2) {
            System.out.println("Введите имя животного, которого надо удалить");
            String DeleteAnimal = in.nextLine();
            DeleteAnimalVoid(DeleteAnimal);
        }
        if (command == 3) {
            System.out.println("Введите имя животного, которого надо проверить");
            String checkAnimal = in.nextLine();
            if (animals.contains(checkAnimal))
                System.out.println(checkAnimal + " Есть в зоопарке");
            else
                System.out.println(checkAnimal + " Нет в зоопарке");
        }
        if (command == 4){
            if (!animals.isEmpty()){
                animals.clear();
                System.out.println("список очищен");
            }
            else
                System.out.println("Список уже пуст");
        }
        System.out.println("Обновлённый список животных");
        for (String animal : animals){
            System.out.println(animal);
        }
    }
    static void AddAnimalVoid(String AddAnimal){
        animals.add(AddAnimal);
    }
    static void DeleteAnimalVoid(String DeleteAnimal){
        if (animals.remove(DeleteAnimal))
            System.out.println("Животное " + DeleteAnimal + " удалён");
        else
            System.out.println("Животное " + DeleteAnimal + " не найдено");
    }
}