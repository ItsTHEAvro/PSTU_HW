class Shape {
    public void printShapeInfo() {
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape {
    public void printRectangleInfo() {
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Shape {
    public void printCircleShapeInfo() {
        System.out.println("This is circular shape");
    }
}

class Square extends Rectangle {
    public void printSquareinfo() {
        System.out.println("Square is a rectangle");
    }
}

class Inheritance_Exercise06 {
    public static void main(String[] args) {
        Square sqr = new Square();
        sqr.printShapeInfo();
        sqr.printRectangleInfo();
    }
}