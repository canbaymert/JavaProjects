package _04_schoolManagementSystem;

public class Student extends Member {
    private Integer studentNumber;
    private Integer studentClass;

    public Student() {
    }

    public Student(String nameSurname, String IDNo, Integer age, Integer studentClass, Integer studentNumber) {
        super.setNameSurname(nameSurname);
        super.setIDNo(IDNo);
        super.setAge(age);
        this.studentClass = studentClass;
        this.studentNumber = studentNumber;
    }

    public Integer getStudentNumber() {
        return studentNumber;
    }

    public Integer getStudentClass() {
        return studentClass;
    }

    @Override
    public String toString() {
        return getNameSurname() + ", " + getIDNo() + ", " + getAge() + ", " + getStudentClass();
    }
}
