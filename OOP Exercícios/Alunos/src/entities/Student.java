package entities;

public class Student {

    public String name;
    public double note1, note2, note3;

    public double finalGrade() {
        return note1 + note2 + note3;
    }

    public double missingPoints() {
        if (finalGrade() < 60) {
            return 60.0 - finalGrade();
        } else {
            return 0.0;
        }
    }
    public String toString() {
        return "NOTA FINAL = " + String.format("%.2f", finalGrade());
    }
}
