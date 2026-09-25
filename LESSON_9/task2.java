public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника 4см*6см = " + rectangle.getArea());

        Square square = new Square(3);
        System.out.println("Площадь квадрата 3см*3см = " + square.getArea());

        Rhombus rhombus = new Rhombus(4, 3);
        System.out.println("Площадь ромба со стороной 4см и высотой 3см = " + rhombus.getArea());

        Circle circle = new Circle(2);
        System.out.println("Площадь круга с радиусом 2см = " + circle.getArea());
    }
}
interface Figure {
    // Ниже напишите объявление метода/ов, которые будут общими для всей иерархии классов
    public double getArea();
}
class Circle implements Figure {
    // Радиус круга

    private final double r;
    public Circle(double r) {
        this.r = r;
    }
    @Override
    public double getArea() {
        return Math.PI * r * r;
    }
}
// В качестве корня иерархии всех фигур необходимо использовать заготовку интерфейса Figure
class Parallelogram implements Figure {

    @Override
    public double getArea() {
        return 0;
    }
}
class Rectangle implements Figure {
    // Длины сторон прямоугольника
    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public double getArea() {
        return a * b;
    }
}
class Rhombus implements Figure {
    // Длина стороны ромба
    private final double a;
    // Высота ромба
    private final double h;

    public Rhombus(double a, double h) {
        this.a = a;
        this.h = h;
    }
    @Override
    public double getArea() {
        return a * h;
    }
}
class Square implements Figure {
    // Длина стороны квадрата
    private final double a;

    public Square(double a) {
        this.a = a;
    }
    @Override
    public double getArea() {
        return a * a;
    }
}