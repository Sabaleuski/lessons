package figure;


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
    public double getPerimeter() {
        return 4*side;
    }
}

