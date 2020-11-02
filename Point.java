public class Point{

    private double x,y;

    //construct a point give coords
    public Point(double X, double Y){
        x=X;
        y=Y;
    }

    //construct a point given a point  (redundant , just provides flexibility)
    public Point(Point p){
        x= p.x;  //private access in the same file is allowed!
        y= p.y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double distanceTo(Point other){
        return Math.sqrt((x-other.getX())*(x-other.getX())+(y-other.getY())*(y-other.getY()));
    }

    public boolean equals(Point other) {
        return other != null && other.getX()==x && other.getY()==y;
    }


}
