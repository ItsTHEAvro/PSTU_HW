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

class LnEx05 {
    public static void main(String[] args) {
        Square[] squares = new Square[10];
        for (int i = 0; i < squares.length; i++) {
            squares[i] = new Square(i);
        }

        for (int i = 0; i < squares.length; i++) {
            System.out.println("Side Length: " + i);
            squares[i].printArea();
            squares[i].printPerimeter();
            System.out.println();
        }
    }
}
