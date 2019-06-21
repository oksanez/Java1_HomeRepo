import java.sql.SQLOutput;

/**
 * Java. Уровень 1. Урок 6
 *
 * @author Oksana Nezlobina
 * @version 2019-06-18
 */
public class LessonSixHomework {

    public static void main(String[] args) {

        Animal cat = new Cat();
        String nameCat = cat.getClass().getName();

        System.out.println("Результат: " + nameCat + " run: " + cat.run(300));
        System.out.println("Результат: " + nameCat + " run: " + cat.run(120));

        System.out.println();

        System.out.println("Результат: " + nameCat + " swim: " + cat.swim(100));
        System.out.println("Результат: " + nameCat + " swim: " + cat.swim(0));

        System.out.println();

        System.out.println("Результат: " + nameCat + " jump: " + cat.jump(5));
        System.out.println("Результат: " + nameCat + " jump: " + cat.jump(1));

        System.out.println();

        Animal dog = new Dog();
        String nameDog = dog.getClass().getName();

        System.out.println("Результат: " + nameDog + " run: " + dog.run(800));
        System.out.println("Результат: " + nameDog + " run: " + dog.run(120));

        System.out.println();

        System.out.println("Результат: " + nameDog + " swim: " + dog.swim(60));
        System.out.println("Результат: " + nameDog + " swim: " + dog.swim(8));

        System.out.println();

        System.out.println("Результат: " + nameDog + " jump: " + dog.jump(0.2));
        System.out.println("Результат: " + nameDog + " jump: " + dog.jump(1));

        System.out.println();

        System.out.println("Результат: " + nameDog + " run: " +  ((Dog) dog).breedDogRun(500, "Husky"));
        System.out.println("Результат: " + nameDog + " run: " +  ((Dog) dog).breedDogRun(550, "Chihuahua"));
    }
}
