package ua.opnu;

public class Main {
    public static void main(String[] args) {
        Person student1 = new Student("Дуднік", "Захар", 18, "АІ-245", 123456);
        Person student2 = new Student("Коваленко", "Олена", 20, "АІ-144", 654321);
        Person student3 = new Student("Шевчук", "Михайло", 22, "АІ-343", 982301);

        Person lecturer1 = new Lecturer("Соколов", "Володимир", 45, "Комп'ютерних наук", 25000);
        Person lecturer2 = new Lecturer("Бондаренко", "Ірина", 58, "Вищої математики", 32000);
        Person lecturer3 = new Lecturer("Мельник", "Сергій", 31, "Економічної теорії", 18500);

        Person[] people = new Person[6];

        people[0] = student1;
        people[1] = lecturer1;
        people[2] = student2;
        people[3] = lecturer2;
        people[4] = student3;
        people[5] = lecturer3;

        System.out.println("Інформація про людей:");

        for (Person person : people) {
            System.out.println(person);
        }
    }
}
