package OOP.StudentInformationSystem;

public class Test {
    public static void main(String[] args) {
        Course math = new Course("Mathematics", "MATH101", "MATH");
        Course physics = new Course("Physics", "PHYS101", "PHYS");
        Course chemistry = new Course("Chemistry", "CHEM101", "CHEM");

        Teacher mathTeacher = new Teacher("Edmond Summers", "928365", "MATH");
        Teacher physicsTeacher = new Teacher("Michael Gray", "559911", "PHYS");
        Teacher chemistryTeacher = new Teacher("Rose Leslie", "981108", "CHEM");

        math.addTeacher(mathTeacher);
        physics.addTeacher(physicsTeacher);
        chemistry.addTeacher(chemistryTeacher);

        Student student1 = new Student("Jane Wilde", "2002267", 3, math, physics, chemistry);
        student1.addBulkExamNote(30, 65, 70);
        student1.isPass();
        Student student2 = new Student("Jackson Jones", "2108872", 3, math, physics, chemistry);
        student2.addBulkExamNote(12, 71, 43);
        student2.isPass();
        Student student3 = new Student("Ellis Grover", "1901923", 3, math, physics, chemistry);
        student3.addBulkExamNote(70, 90, 80);
        student3.isPass();

        student1.printGrades();
        System.out.println();
        student2.printGrades();
        System.out.println();
        student3.printGrades();
        System.out.println();

        math.printTeacher();
        physics.printTeacher();
        chemistry.printTeacher();
    }
}