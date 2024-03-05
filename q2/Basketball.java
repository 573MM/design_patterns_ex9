package Lab9.q2;

public class Basketball implements IStrategy{
    @Override
    public void initializeGame() {
        System.out.println("Initalizing basketball game...");
    }

    @Override
    public void playingGame() {
        System.out.println("Playing basketball game...");
    }

    @Override
    public void ShowResult() {
        System.out.println("Showing the results for the basketball game...");
    }
}
