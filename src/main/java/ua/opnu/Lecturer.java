package ua.opnu;

public class Lecturer extends Person {
    private String uniDepartment;
    private int salary;
    public Lecturer(String lastname, String firstname, int age, String uniDepartment, int salary) {
        super(lastname, firstname, age);
        this.uniDepartment = uniDepartment;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getUniDepartment() {
        return uniDepartment;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setUniDepartment(String uniDepartment) {
        this.uniDepartment = uniDepartment;
    }

    @Override
    public String toString() {
        return "Викладач кафедри " + uniDepartment + ", " + getLastname() + " " + getFirstname()
                + ", вік: " + getAge() + ". Зарплата: " + salary;
    }
}
