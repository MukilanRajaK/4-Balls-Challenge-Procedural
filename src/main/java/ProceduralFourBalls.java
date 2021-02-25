import processing.core.PApplet;

public class ProceduralFourBalls extends  PApplet
{
    public static final int WIDTH = 1000;
    public static final int HEIGHT = 750;
    public static final int BackGroundColor = 255;
    public static final int Radius = 10;
    private int Ball1Width=1;
    private int Ball2Width=1;
    private int Ball3Width=1;
    private int Ball4Width=1;
    private int Ball1Height;
    private int Ball2Height;
    private int Ball3Height;
    private int Ball4Height;

    public static void main(String Args[])
    {
        PApplet.main("ProceduralFourBalls",Args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
        background(BackGroundColor);
        setBall1Height();
        setBall2Height();
        setBall3Height();
        setBall4Height();
    }

    private void setBall4Height() { Ball4Height=(4*HEIGHT)/5; }

    private void setBall3Height() {
        Ball3Height=(3*HEIGHT)/5;
    }

    private void setBall2Height() {
        Ball2Height=(2*HEIGHT)/5;
    }

    private void setBall1Height() {
        Ball1Height=(1*HEIGHT)/5;
    }

    @Override
    public void draw() {

        Draw4Circles();
    }

    private void Draw4Circles() {
        ellipse( Ball1Width,Ball1Height, Radius,Radius);
        ellipse( Ball2Width,Ball2Height,Radius,Radius);
        ellipse( Ball3Width,Ball3Height,Radius,Radius);
        ellipse( Ball4Width,Ball4Height,Radius,Radius);
        AddBall1Width();
        AddBall2Width();
        AddBall3Width();
        AddBall4Width();
    }

    private void AddBall4Width() {
        Ball4Width+=4;
    }

    private void AddBall3Width() {
        Ball3Width+=3;
    }

    private void AddBall2Width() {
        Ball2Width+=2;
    }

    private void AddBall1Width() {
        Ball1Width+=1;
    }
}


