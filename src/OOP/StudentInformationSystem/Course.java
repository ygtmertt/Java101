package OOP.StudentInformationSystem;

public class Course {
    String name;
    String code;
    String prefix;
    int note;
    Teacher courseTeacher;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
    }

    public void addTeacher(Teacher newTeacher) {
        if (this.prefix.equals(newTeacher.branch)) {
            this.courseTeacher = newTeacher;
            System.out.println("New teacher has been appointed to " + this.code);
        } else {
            System.out.println(newTeacher.name + " is not eligible to teach this class.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println("Current teacher for the " + this.name + " class is " + courseTeacher.name);
        } else {
            System.out.println(this.name + " course currently doesn't have a teacher.");
        }
    }
}
