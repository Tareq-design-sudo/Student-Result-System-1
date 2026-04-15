class CommerceStudent extends Student {
    private double accounting, business, economics;

    public CommerceStudent(String name, int roll, double a, double b, double e) {
        super(name, roll);
        this.accounting = a;
        this.business = b;
        this.economics = e;
    }

    @Override
    public double calculateGPA() {
        return (accounting + business + economics) / 3;
    }
}