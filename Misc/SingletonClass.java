package Misc;

class Student {
    static Student st = new Student();

    private Student() {
        System.out.println("Construct will invoke for only one object");
    }

    static Student getInstance() {
        return st;
    }
}

class SingletonClass {
    public static void main(String[] args) {
        Student st1 = Student.getInstance();
        Student st2 = Student.getInstance();

    }
}