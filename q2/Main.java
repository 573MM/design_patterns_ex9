package Lab9.q2;

public class Main {
    public static void main(String[] args) {
        Football f = new Football();
        Game newGame = new Game();
        newGame.setGame(f);
        newGame.template();
    }
}
