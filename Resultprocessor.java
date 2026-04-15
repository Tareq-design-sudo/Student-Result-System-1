class ResultProcessor {
    public void showResult(Student s) {
        System.out.println("Name: " + s.getName());
        System.out.println("Roll: " + s.getRoll());
        System.out.println("GPA: " + s.calculateGPA());
        System.out.println("----------------------");
    }
}