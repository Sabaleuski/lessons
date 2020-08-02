package GeometricFigure;

public class FigureDemo {
    private static Circle figureC;
    public static void main(String[] args) {
        Figure[] figure = new Figure[0];
        Circle figureC = new Circle(5.5);
        Square figureS = new Square(1.4);
        System.out.println(figureC.getArea());
        System.out.println(figureC.getCircumferens());
        System.out.println(figureS.getArea());
        System.out.println(figureS.getPerimeter());
    }
}
// используется принцип полиморфизма - площадь фигуры определяется по-разному, класс вызывает именно тот метод, который нужен
// используется принцип инкапсуляции - формулы для рассчёта скрыты в описаниях классов;
// используется принцип наследования - круг и квадрат реализуют интерфейс геометрической фигуры, но каждый может это делать со своими особенностями

