class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    int salary;

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;
}

class Manager extends Member {
    String department;
}

class Inheritance_Exercise03 {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "Avro";
        employee1.age = 30;
        employee1.phoneNumber = "+8801700000000";
        employee1.address = "Barisal";
        employee1.salary = 30000;
        employee1.specialization = "Machine Learning";

        Manager manager = new Manager();
        manager.name = "Jyotirmoy";
        manager.age = 32;
        manager.phoneNumber = "+8801900000000";
        manager.address = "Dhaka";
        manager.salary = 50000;
        manager.department = "Artificial Intelligence";

        System.out.println("Employee Info");
        System.out.println("Name: " + employee1.name);
        System.out.println("Age: " + employee1.age);
        System.out.println("Phone Number: " + employee1.phoneNumber);
        System.out.println("Address: " + employee1.address);
        employee1.printSalary();
        System.out.println("Specialization: " + employee1.specialization);

        System.out.println("\n");

        System.out.println("Manager Info");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        manager.printSalary();
        System.out.println("Department: " + manager.department);
    }

}
