import java.util.Random;
import java.util.Scanner;

/**
 * Java. Уровень 1. Урок 3.
 *
 * @author Oksana Nezlobina
 * @version 07.06.2019
 */
public class LessonTreeHomework {

    public static void main(String[] args) {

        // Вызов метода
        guessingNumber();

    }

    /**
     * Реализация игры 'Угадай число!'
     *
     * Нужно угадать число от 0 до 9 и на это
     * дается только 3 попытки!
     *
     */
    public static void guessingNumber() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра 'Угадай число!'\n");

        int x = 0;

        do {

            Random randomNumber = new Random();
            int num = randomNumber.nextInt(10);

            for (int i = 0; i < 3; i++) {

                System.out.println("Введите любое число от 0 до 9. У вас 3 попытки!\nПопытка № " + (i + 1));
                int a = scanner.nextInt();

                if (num == a) {
                    System.out.println("Вы угадали!");
                    break;
                } else {
                    if(num < a) {
                        System.out.println("Вы, к сожалению, не угадали! :( Загаданное число меньше!");
                    } else {
                        System.out.println("Вы, к сожалению, не угадали! :( Загаданное число больше!");
                    }
                }
            }

            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            x = scanner.nextInt();

        } while ( x == 1);

        System.out.println("Игра окончена!");

        scanner.close();
    }
}