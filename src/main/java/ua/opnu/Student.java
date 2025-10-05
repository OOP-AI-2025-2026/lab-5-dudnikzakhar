package ua.opnu;

public class Student extends Person {
    private String studentGroup;
    private int studentCardNumber;

    public Student(String lastname, String firstname, int age, String studentGroup, int studentCardNumber) {
        super(lastname, firstname, age);
        this.studentGroup = studentGroup;
        this.studentCardNumber = studentCardNumber;
    }

    public String getStudentGroup() {
        return studentGroup;
    }

    public int getStudentCardNumber() {
        return studentCardNumber;
    }

    public void setStudentCardNumber(int newCardNumber) {
        this.studentCardNumber = newCardNumber;
    }

    public void setStudentGroup(String newGroup) {
        this.studentGroup = newGroup;
    }

    @Override
    public String toString() {
        return "Студент групи " + studentGroup + ", " + getLastname() + " " + getFirstname()
                + ", вік: " + getAge() + ". Номер студентського квитка: " + studentCardNumber;
    }
}
