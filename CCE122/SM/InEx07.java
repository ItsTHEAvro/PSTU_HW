class Quadrilateral {
    protected double x1, x2, x3, x4, y1, y2, y3, y4;
}

class Point extends Quadrilateral{
    protected void setCoordinate(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        this.x1 = x1;
        this.y1 = y1 ;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
    }
}

class Square extends Point {
    Square(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        setCoordinate(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    double area() {
        double d = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        return d * d;
    }
}

class Rectangle extends Point {
    Rectangle(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        setCoordinate(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    double area() {
        double d1 = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double d2 = Math.sqrt((x1 - x4) * (x1 - x4) + (y1 - y4) * (y1 - y4));
        return d1 * d2;
    }
}

class Trapezoid extends Point {
    private double height;

    Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, double height) {
        setCoordinate(x1, y1, x2, y2, x3, y3, x4, y4);
        this.height = height;
    }

    double area() {
        double d1 = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double d2 = Math.sqrt((x3 - x4) * (x3 - x4) + (y3 - y4) * (y3 - y4));
        return ((d1 + d2) * height) / 2;
    }
}

class Parallelogram extends Point {
    private double height;

    Parallelogram(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, double height) {
        setCoordinate(x1, y1, x2, y2, x3, y3, x4, y4);
        this.height = height;
    }

    double area() {
        double d1 = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        return d1 * height;
    }
}

class InEx07 {
    public static void main(String[] args) {
        Square sq = new Square(10, 10, 20, 10, 20, 20, 10, 20);
        System.out.println("Area Of The Square is " + sq.area());
        
        Rectangle rec = new Rectangle(10, 10, 30, 10, 30, 20, 10, 20);
        System.out.println("Area Of The Rectangle is " + rec.area());
        
        Parallelogram p = new Parallelogram(10, 10, 30, 10, 20, 20, 0, 20, 8);
        System.out.println("Area Of The Parallelogram is " + p.area());
        
        Trapezoid t = new Trapezoid(10, 10, 30, 10, 40, 20, 0, 20, 8);
        System.out.println("Area Of The Trapezoid is " + t.area());
    }
}