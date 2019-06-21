package sevenlesson;

/**
 * Java. Уровень 1. Урок 7
 *
 * @author Oksana Nezlobina
 * @version 2019-06-21
 */
public class LessonSevenHomework {

    public static void main(String[] args) {

        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Barsik", 17);
        cat[1] = new Cat("Murzik", 10);
        cat[2] = new Cat("Asya", 5);

        Plate plate = new Plate(30);

        for (int i = 0; i < cat.length; i++) {
            int food = plate.getFood();
            System.out.println(plate);
            cat[i].eat(plate);
            System.out.println(plate);
            boolean res = cat[i].satietyCat(food);
            System.out.println("Сытость кота №" + (i + 1) + " : " + res);
        }

        System.out.println();

        System.out.println("Добавление еды в тарелку!");
        plate.addFood(11);
        System.out.println(plate);
    }
}
