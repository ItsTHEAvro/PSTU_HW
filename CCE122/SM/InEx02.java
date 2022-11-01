class Parent {
    private void printInfoParent() {
        System.out.println("This is parent class.");
    }

    public void callPrintInfoParent() {
        printInfoParent();
    }
}

class Child extends Parent {
    public void printInfoChild() {
        System.out.println("This is child class.");
    }
}

class InEx02 {
    public static void main(String[] args) {
        Parent parentObj = new Parent();
        Child childObj = new Child();

        // parentObj.printInfoParent();
        // Error: printInfoParent() has private access in Parent
        // Using callPrintInfoParent() to call printInfoParent()
        parentObj.callPrintInfoParent();
        childObj.printInfoChild();
    }
}