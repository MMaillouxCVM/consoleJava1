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
       int o1 = pt1.orientation(s.getPt1(), s.getPt2());
       int o2 = pt2.orientation(s.getPt1(), s.getPt2());
       int o3 = s.getPt1().orientation(pt1, pt2);
       int o4 = s.getPt2().orientation(pt1, pt2);
       if (o1 != o2 && o3 != o4) {
           return true;
       }
       return false;
    }

    public boolean isColinear(Segment s) {
        int o1 = pt1.orientation(s.getPt1(), s.getPt2());
        int o2 = pt2.orientation(s.getPt1(), s.getPt2());
        int o3 = s.getPt1().orientation(pt1, pt2);
        int o4 = s.getPt2().orientation(pt1, pt2);

        return true;
    }
}
