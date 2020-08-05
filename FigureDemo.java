package figure;

public class FigureDemo {
    private static Circle figureC;
    public static void main(String[] args) {
        Figure[] figure = new Figure[0];
        Circle figureC = new Circle(5.5);
        Square figureS = new Square(1.4);
        System.out.println("Площадь круга " + figureC.getArea());
        System.out.println("Периметр окружности " + figureC.getPerimeter());
        System.out.println("Площадь квадрата " + figureS.getArea());
        System.out.println("Периметр квадрата " + figureS.getPerimeter());
    }
}