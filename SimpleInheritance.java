class Employee {
    String name;
    double salary;

    void showDetails() {
        System.out.println("name: " + name);
        System.out.println("salary: " + salary);
    }
}

class Developer extends Employee {
    String prgLang;

    void showDevelopersInfo() {
        System.out.println(prgLang + " developer");
    }
}

class SimpleInheritance {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.name = "Ammy";
        dev.salary = 80000;
        dev.prgLang = "Python";
        dev.showDetails();
        dev.showDevelopersInfo();
    }
}

