package Lab9.q2;

public class Football implements IStrategy{

    @Override
    public void initializeGame() {
        System.out.println("Initalizing football game...");
    }

    @Override
    public void playingGame() {
        System.out.println("Playing football game...");
    }

    @Override
    public void ShowResult() {
        System.out.println("Showing the results for the football game...");
    }
    
}
