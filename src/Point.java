public class Point {
    private float x;
    private float y;

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float produitVectoriel(Point pt1, Point pt2) {
        return (pt2.getX() - pt1.getX())*(this.y-pt1.getY())-(pt2.getY()-pt1.getY())*(this.x-pt1.getX());
    }

    public int orientation(Point pt1, Point pt2){
        if (produitVectoriel(pt1, pt2) > 0) {
            return 1;
        } else if (produitVectoriel(pt1, pt2) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
