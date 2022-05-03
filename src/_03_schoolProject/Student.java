package _03_schoolProject;

public class Student extends Member {
    private Integer studentNumber;
    private String studentClass;

    public Student() {
    }

    public Student(String nameSurname, String IDNo, Integer age, String studentClass, Integer studentNumber) {
        super.setNameSurname(nameSurname);
        super.setIDNo(IDNo);
        super.setAge(age);
        this.studentClass = studentClass;
        this.studentNumber = studentNumber;
    }

    public Integer getStudentNumber() {
        return studentNumber;
    }

    public String getStudentClass() {
        return studentClass;
    }

    @Override
    public String toString() {
        return getNameSurname() + ", " + getIDNo() + ", " + getAge() + ", " + getStudentClass();
    }
}
