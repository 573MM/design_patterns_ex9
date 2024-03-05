package Lab9.q2;

public class Game {
    private IStrategy iStrategy;
    public void setGame(IStrategy iStrategy){
        this.iStrategy = iStrategy;
    }
    public void template(){
        this.iStrategy.initializeGame();
        this.iStrategy.playingGame();
        this.iStrategy.ShowResult();
    }

    
} 