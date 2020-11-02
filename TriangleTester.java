public class TriangleTester{

	public static void main(String[] args){
		Triangle t1 = new Triangle(0,0,0,1,1,0);
		System.out.println(t1.getArea());
		System.out.println(t1.getPerimeter());
		Point a = new Point(0,0);
		Point b = new Point(4,0);
		Point c = new Point(3,1);
		Triangle t2 = new Triangle(a,b,c);
		System.out.println(t2.getArea());
		System.out.println(t2.getPerimeter());
		System.out.println(t1);
		Triangle equil = new Triangle(1,0,-1,0,0,Math.sqrt(3));
		Triangle isos = new Triangle(-1,0,0,-1,5,5);
		Triangle scalene = new Triangle(1,1,5,5,5,0);
		System.out.println(equil.classify());
		System.out.println(isos.classify());
		System.out.println(scalene.classify());
	}
}
