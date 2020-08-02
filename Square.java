package GeometricFigure;

class Square implements Figure {
    double side;
    public Square (double side){
        this.side=side;
    }
    @Override
    public double getArea() {
        return this.side*this.side;
    }

    @Override
    public double getCircumferens() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 4*side;
    }
}
