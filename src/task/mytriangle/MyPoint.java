package task.mytriangle;

/**
 *
 * @author nicol
 */
public class MyPoint {

    private int x, y;
    
    public MyPoint() {
        x=0;
        y=0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

     public double distance(int x, int y) {
        int xD = this.x - x;
        int yD = this.y - y;
        return Math.sqrt(xD*xD + yD*yD);
    }

    public double distance(MyPoint z) {
        int xD = this.x - z.getX();
        int yD = this.y - z.getY();
        return Math.sqrt(xD*xD + yD*yD);
    }
}