/**
 * Java. Уровень 1. Урок
 *
 * @author Oksana Nezlobina
 * @version 2019-06-12
 */
public class LessonFiveHomework {

    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.infoCard("Иванов", "Петр", "Васильевич",
                "Дизайнер",
                "ivanov_petr@mail.ru",
                "+7(999)123-12-12",
                80000,
                25);

        System.out.println();

        employee.ageFilter();
    }
}
