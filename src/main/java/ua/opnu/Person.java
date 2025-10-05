package ua.opnu;

public class Person {
    private String lastname;
    private String firstname;
    private int age;

    public Person(String lastname, String firstname, int age) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.age = age;
    }

    public String getLastname() {
        return this.lastname;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public int getAge() {
        return age;
    }

    public void setLastname(String name) {
        this.lastname = name;
    }

    public void setFirstname(String name) {
        this.firstname = name;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    @Override
    public String toString() {
        return "Людина " + lastname + " " + firstname + ", вік: " + age;
    }
}
