class ScienceStudent extends Student {
    private double physics, chemistry, math;

    public ScienceStudent(String name, int roll, double p, double c, double m) {
        super(name, roll);
        this.physics = p;
        this.chemistry = c;
        this.math = m;
    }

    @Override
    public double calculateGPA() {
        return (physics + chemistry + math) / 3;
    }
}