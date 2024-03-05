package Lab9.q1;

public abstract class Game {

    protected abstract void initializeGame();
    protected abstract void playingGame();
    protected abstract void ShowResult();

    public final void template(){
        initializeGame();
        playingGame();
        ShowResult();
    }
}
