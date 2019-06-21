package sevenlesson;

/**
 * Java. Уровень 1. Урок 7
 *
 * @author Oksana Nezlobina
 * @version 2019-06-21
 */
public class Plate {

    private int food;

    Plate(int food) {
        this.food = food;
    }

    void dicreaseFood(int food) {
        if(food > this.food) {
            System.out.println("Еды меньше чем заявленного аппетита! :(  Еда : " + this.food + ". Аппетит: " + food);
        } else {
            this.food -= food;
        }
    }

    int getFood() {
        return food;
    }

    void addFood(int food) {
        this.food += food;
    }

    @Override
    public String toString() {
        return "Food: " + food;
    }
}
