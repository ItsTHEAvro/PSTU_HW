class Rectangle {
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void printArea() {
        System.out.println("Area: " + length * breadth);
    }

    public void printPerimeter() {
        System.out.println("Perimeter: " + 2 * (length + breadth));
    }
}

class Square extends Rectangle {
    public Square(int s) {
        super(s, s);
    }
}

class InEx04 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 15);
        rectangle.printArea();
        rectangle.printPerimeter();

        Square square = new Square(5);
        square.printArea();
        square.printPerimeter();
    }

}
