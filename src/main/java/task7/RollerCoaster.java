package task7;

public class RollerCoaster implements Attraction {
    @Override
    public void info() {
        System.out.println("Американские горки: острые ощущения.");
    }

    @Override
    public void maintain() {
        System.out.println("Американские горки: требуется проверка безопасности.");
    }
}
