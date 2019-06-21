package sevenlesson;

/**
 * Java. Уровень 1. Урок 7
 *
 * @author Oksana Nezlobina
 * @version 2019-06-21
 */
public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    void eat(Plate plate) {
        plate.dicreaseFood(appetite);
    }

    boolean satietyCat(int food) {
        satiety = false;
        if(food >= this.appetite) satiety = true;
        return satiety;
    }




}
