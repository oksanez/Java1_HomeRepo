/**
 * Java. Уровень 1. Урок 6
 *
 * @author Oksana Nezlobina
 * @version 2019-06-18
 */
public class Dog extends Animal {

    @Override
    public boolean run(double distance) {
        return distance < 500;
    }

    @Override
    public boolean swim(double distance) {
        return distance < 10;
    }

    @Override
    public boolean jump(double height) {
        return height < 0.5;
    }

    /**
     * Метод для проверки дистанции бега собаки в зависимости от породы
     * @param distance - дистанция
     * @param breedDog - порода собаки
     * @return
     */
    public boolean breedDogRun(double distance, String breedDog) {

        String[] fastDog = {"sheepdog", "husky"};
        boolean result = false;

        for (String dog : fastDog) {
            result = dog.equals(breedDog.toLowerCase()) ? (distance < 600) : (distance < 400);
        }

        return result;
    }
}
