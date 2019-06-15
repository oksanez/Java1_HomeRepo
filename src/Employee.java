/**
 * Java. Уровень 1. Урок 5
 *
 * @author Oksana Nezlobina
 * @version 2019-06-12
 */
public class Employee {

    private String surname;
    private String name;
    private String middlename;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Employee(String surname, String name, String middlename, String position, String email, String phone, double salary, int age) {
        this.surname = surname;
        this.name = name;
        this.middlename = middlename;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public Employee() {
    }

    public void infoCard(String surname, String name, String middlename, String position, String email, String phone, double salary, int age) {
        System.out.println("ФИО: " + surname + " " + name + " " + middlename +
                "\nДолжность: " + position +
                "\nEmail: " + email +
                "\nТелефон: " + phone +
                "\nЗарплата: " + salary + " \u20BD" +
                "\nВозраст: " + age);
    }

    public void ageFilter() {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванов", "Петр", "Васильевич", "Дизайнер", "ivanov_petr@mail.ru", "+7(999)123-12-12", 80000, 45);
        employees[1] = new Employee("Линева", "Алина", "Петровна", "Бухгалтер", "alina@mail.ru", "+7(987)333-76-17", 73000, 42);
        employees[2] = new Employee("Морозов", "Максим", "Михайлович", "Инженер", "max88@mail.ru", "+7(966)456-12-77", 100000, 31);
        employees[3] = new Employee("Смирнова", "Галина", "Ивановна", "Программист", "galka@mail.ru", "+7(952)543-12-43", 140000, 29);
        employees[4] = new Employee("Дмитриев", "Николай", "Олегович", "Менеджер", "nikola_dmitriev@mail.ru", "+7(954)765-43-34", 70000, 21);

        for (Employee person : employees) {
            if(person.age > 40){
                System.out.println(person.toString());
            }
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middlename='" + middlename + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary + "\u20BD" +
                ", age=" + age +
                '}';
    }
}