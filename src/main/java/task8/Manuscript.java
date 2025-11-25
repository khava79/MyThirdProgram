package task8;

public class Manuscript implements Exhibit {
    @Override
    public void describe() {
        System.out.println("Манускрипт: древний текст.");
    }

    @Override
    public void preserve() {
        System.out.println("Манускрипт: требует контролируемой влажности и температуры.");
    }
}
