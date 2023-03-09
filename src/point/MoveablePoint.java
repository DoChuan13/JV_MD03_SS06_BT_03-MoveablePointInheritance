package point;

public class MoveablePoint extends Point {
    private float xSpeed, ySpeed;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] array = {this.xSpeed, this.ySpeed};
        return array;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }

    public String move() {
        float x = super.getX() + this.getXSpeed();
        float y = super.getY() + this.getYSpeed();
        super.setXY(x, y);
        return "Move to New Point {" +
                "x = " + getX() +
                ", y = " + getY() +
                "}";
    }

    @Override
    public String toString() {
        return super.toString() + "Speed {" +
                "xSpeed = " + xSpeed +
                ", ySpeed = " + ySpeed +
                '}';
    }
}
