public class Triangle{
    private Point v1,v2,v3;

    //creates Triangle give 3 points
    public Triangle(Point a, Point b, Point c){
        v1=a;
        v2=b;
        v3=c;
    }
    
    //Make new points out of the doubles to store in the instance variables.
    public Triangle(double x1, double y1,double x2, double y2,double x3, double y3){
        v1 = new Point(x1,y1);
        v2 = new Point(x2,y2);
        v3 = new Point(x3,y3);
    }

    //Return the area without any rounding.
    public double getPerimeter(){
        return v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
    }

    //Return the area using Heron's formula without any rounding.
    public double getArea(){
        double S = getPerimeter() / 2;
        return S*(S-v1.distanceTo(v2))*(S-v2.distanceTo(v3))*(S-v3.distanceTo(v1));
    }

    //Return the "equilateral" "isosceles" or "scalene" Round distances to the nearest tenthousandths for your classifications.
    public String classify(){
        double a = v1.distanceTo(v2);
        double b = v2.distanceTo(v3);
        double c = v3.distanceTo(v1);
        if (a==b && b==c && c==a)
        return "equilateral";
        if (a==b || b==c || c==a)
        return "isosceles";
        return "scalene";
    }

    //The format should be "v1(23.0, 4.0) v2(-2.3, 5.001) v3(5.0, 0.52)"
    public String toString(){
        return "v1(" + v1.getX() +','+ v1.getY() + 
             ") v2(" + v2.getX() +','+ v2.getY() + 
             ") v3(" + v3.getX() +','+ v3.getY() + ')';
    }


}