public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.catchMouse();
        cat.giveVoice();

        Dog dog = new Dog();
        dog.bringStick();
        dog.play();

        Hamster hamster = new Hamster();
        hamster.hideFood();
        hamster.sleep();

        Fish fish = new Fish();
        fish.sleep();

        Spider spider = new Spider();
        System.out.println("У паука " + spider.getPawsCount() + " лапок.");
    }
}
abstract class Pet {
    private String voice;
    private int pawsCount;

    public Pet(String voice, int pawsCount) {
        this.voice = voice;
        this.pawsCount = pawsCount;
    }
    void sleep(){
        System.out.println("Сплю");
    }
    void play(){
        System.out.println("Играю");
    }
    void giveVoice(){
        System.out.println(voice);
    }
    int getPawsCount() {
        return pawsCount;
    }
    void setPawsCount(int pawsCount){
        this.pawsCount = pawsCount;
    }
}
class Fish extends Pet {
    Fish(){
        super("Буль, буль", 0);
    }
}
class Spider extends Pet {
    Spider() {
        super("...", 8);
    }
}
class Dog extends Pet {
    Dog(){
        super("Гав! Гав!", 4);
    }
    void bringStick(){
        System.out.println("Принёс палочку, как хороший мальчик!");
    }
}
class Cat extends Pet {
    Cat(){
        super("Мур", 4);
    }
    void catchMouse(){
        System.out.println("Поймала мышку!");
    }
}
class Hamster extends Pet {
    Hamster(){
        super("", 4);
    }
    void hideFood(){
        System.out.println("Вся еда — в щёчках!");
    }
}