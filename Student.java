abstract class Student {
    private String name;
    private int roll;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    // Encapsulation (getter)
    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    // Abstraction (abstract method)
    public abstract double calculateGPA();
}