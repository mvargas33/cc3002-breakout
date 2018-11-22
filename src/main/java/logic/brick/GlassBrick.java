package logic.brick;

public class GlassBrick implements Brick{
    private int lives;
    private int points;

    public GlassBrick(){
        this.lives = 1;
        this.points = 50;
    }

    @Override
    public void hit() {

    }

    @Override
    public boolean isDestroyed() {
        return false;
    }

    @Override
    public int getScore() {
        return 0;
    }

    @Override
    public int remainingHits() {
        return 0;
    }
}
