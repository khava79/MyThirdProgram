package task7;

public class RollerCoaster implements Attraction {
    @Override
    public void info() {
        System.out.println("Амереканские горки: острые ощущения.");
    }

    @Override
    public void maintain() {
        System.out.println("Амереканские горки: требуется проверка безопасности.");
    }
}
