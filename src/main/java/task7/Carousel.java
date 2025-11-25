package task7;

public class Carousel implements Attraction {
    @Override
    public void info() {
        System.out.println("Карусель: спокойный аттракцион.");
    }

    @Override
    public void maintain() {
        System.out.println("Карусель: нуждается в регулярном тех.обслуживании.");
    }
}
