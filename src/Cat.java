/**
 * Java. Уровень 1. Урок 6
 *
 * @author Oksana Nezlobina
 * @version 2019-06-18
 */
public class Cat extends Animal {

    @Override
    public boolean run(double distance) {
        return distance < 200;
    }

    @Override
    public boolean swim(double distance) {
        return false;
    }

    @Override
    public boolean jump(double height) {
        return height < 2;
    }
}
