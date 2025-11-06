package practice3;

public class Main4 {
    public static void main(String[] args) {
        GameSettings g1 = new GameSettings("Баскетбол");
        GameSettings g2 = new GameSettings("Футбол");

        g1.addPlayer();
        g2.addPlayer();
        g2.addPlayer();

        g1.printGameStatus();
        g2.printGameStatus();

        GameSettings.setMaxPlayers(25);
        g1.printGameStatus();
        g2.printGameStatus();
    }
}
