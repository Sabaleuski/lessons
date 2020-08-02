package GeometricFigure;

class Circle implements Figure {
    double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double getArea() {
        return Math.PI*this.radius*this.radius;
    }
    public double getCircumferens(){
        return 2*Math.PI*this.radius;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}

