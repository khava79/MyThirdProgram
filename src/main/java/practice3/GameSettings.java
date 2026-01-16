package practice3;

public class GameSettings {
    static int maxPlayers = 10;
    final String gameName;
    int currentPlayers;



    GameSettings(String gameName) {
        this.gameName = gameName;
        this.currentPlayers = 0;
    }

    static void setMaxPlayers(int newMax) {
        maxPlayers = newMax;
    }

    void addPlayer() {
        currentPlayers++;
        System.out.println("Добавлен игрок в игру: " + gameName);
    }

    void printGameStatus() {
        System.out.println("Игра: " + gameName + " / Игроков: " + currentPlayers + "/" + maxPlayers);

    }

}
