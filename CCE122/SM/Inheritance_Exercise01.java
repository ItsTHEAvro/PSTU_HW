class Parent {
    public void printInfoParent() {
        System.out.println("This is parent class.");
    }
}

class Child extends Parent {
    public void printInfoChild() {
        System.out.println("This is child class.");
    }
}

class Inheritance_Exercise01 {
    public static void main(String[] args) {
        Parent parentObj = new Parent();
        Child childObj = new Child();
        parentObj.printInfoParent();
        childObj.printInfoChild();
        childObj.printInfoParent();
    }
}