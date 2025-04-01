public class Segment {
    private Point pt1;
    private Point pt2;

    public Segment(Point pt1, Point pt2){
        this.pt1 = pt1;
        this.pt2 = pt2;
    }

    public Point getPt1() {
        return pt1;
    }

    public Point getPt2() {
        return pt2;
    }

    public void setPt1(Point pt1) {
        this.pt1 = pt1;
    }

    public void setPt2(Point pt2) {
        this.pt2 = pt2;
    }

    public boolean isCrossing(Segment s) {
       return true;
    }

    public boolean isColinear(Segment s) {
        return true;
    }
}
