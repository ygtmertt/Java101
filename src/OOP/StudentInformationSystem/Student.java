package OOP.StudentInformationSystem;

public class Student {
    String name;
    String stuNo;
    int classAmount;
    Course math;
    Course physics;
    Course chemistry;
    double average;
    boolean isPass;

    Student(String name, String stuNo, int classAmount, Course math, Course physics, Course chemistry) {
        this.name = name;
        this.stuNo = stuNo;
        this.classAmount = classAmount;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        this.isPass = false;
    }

    public double calcAverage() {
        this.average = (double) (this.math.note + this.chemistry.note + this.physics.note) / classAmount;
        return this.average;
    }

    public boolean isCheckPass() {
        return calcAverage() >= 50 && (this.math.note + this.chemistry.note + this.physics.note) != 0;
    }

    public void addBulkExamNote(int math, int physics, int chemistry) {
        if (math >= 0 && math <= 100) {
            this.math.note = math;
        }
        if (physics >= 0 && physics <= 100) {
            this.physics.note = physics;
        }
        if (chemistry >= 0 && chemistry <= 100) {
            this.chemistry.note = chemistry;
        }
    }

    public void isPass() {
        if (isCheckPass()) {
            System.out.println("Congratulations! You have passed this grade with an average of " + this.average);
        } else if (!isCheckPass()) {
            System.out.println("You couldn't pass this grade because your average was " + this.average);
        } else {
            System.out.println("Grades have not been announced as of yet.");
        }
    }

    public void printGrades() {
        System.out.println("Student Name:\t" + this.name + "\n" +
                "Student Number:\t" + this.stuNo + "\n" +
                "Math Grade:\t" + this.math.note + "\n" +
                "Physics Grade:\t" + this.physics.note + "\n" +
                "Chemistry Grade:\t" + this.chemistry.note);
    }
}
