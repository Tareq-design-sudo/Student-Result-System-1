public class Main {
    public static void main(String[] args) {

        Student s1 = new ScienceStudent("Tareq", 101, 4.5, 4.0, 5.0);
        Student s2 = new CommerceStudent("Nihad", 102, 3.5, 4.0, 3.8);

        ResultProcessor rp = new ResultProcessor();

        rp.showResult(s1);
        rp.showResult(s2);
    }
}