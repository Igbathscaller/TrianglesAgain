public class Tester{

	public static void main(String[] args){
		Point a = new Point(0.1, 0.1);
		Point b = new Point(-1.9, 0.1);
		Point c = new Point(-0.9, -1.632051);
		Point d = new Point(-54.3, 84.7);
		Point e = new Point(43.2, 98.443);
		Point f = new Point(-61.2948, 28.0);
		System.out.println(a.distanceTo(b));
		System.out.println(b.distanceTo(c));
		System.out.println(a.distanceTo(c));
		System.out.println(d.distanceTo(e));
		System.out.println(e.distanceTo(f));
		System.out.println(f.distanceTo(d));
		Triangle david = new Triangle(0.1, 0.1, -1.9, 0.1,-0.9, -1.632051);
		Triangle devin = new Triangle(-0.8, 0.8, 0.8, -0.8, 999.9, 999.9);
		Triangle kevin = new Triangle(-54.3, 84.7, 43.2, 98.443, -61.2948, 28.0);
		Triangle alvin = new Triangle(0.0, 0.0, 0.0, 0.0, 426.9, 823.0);
		Triangle seven = new Triangle(5,5,5,5,5,5);
		Triangle giver = new Triangle(1,6,2,5,3,4);
		System.out.println(david.toString());
		System.out.println(devin.toString());
		System.out.println(kevin.toString());
		System.out.println(alvin);
		System.out.println(seven);
		System.out.println(giver);
		System.out.println(david.classify());
		System.out.println(devin.classify());
		System.out.println(kevin.classify());
		System.out.println(alvin.classify());
		System.out.println(seven.classify());
		System.out.println(giver.classify());
		System.out.println(david.getPerimeter());
		System.out.println(devin.getPerimeter());
		System.out.println(kevin.getPerimeter());
		System.out.println(alvin.getPerimeter());
		System.out.println(seven.getPerimeter());
		System.out.println(giver.getPerimeter());
		System.out.println(david.getArea());
		System.out.println(devin.getArea());
		System.out.println(kevin.getArea());
		System.out.println(alvin.getArea());
		System.out.println(seven.getArea());
		System.out.println(giver.getArea());
		david.setVertex(1, c);
		System.out.println(david);
		david.setVertex(2, a);
		System.out.println(david);
		david.setVertex(3, b);
		System.out.println(david);
		System.out.println(david.getArea());
	}
	/*
	Distance test cases:
	- Nice numbers: (-1.0, -1.0) to (2.0, 3.0) should give 5.0
	- Ugly numbers: (0.5248, -0.8002) to (-2.437885, 1.94) should give 4.0356
	- Vertical: (-5.329, 7.8) to (-5.329, -2.2) should give 10.0
	- Horizontal: (7.8, -5.329) to (-2.2, -5.239) should give 10.0
	- Degenerate: (5.0, 5.0) to (5.0, 5.0) should give 0.0
	-Can also swap points to make sure distances are the same
	
	Classify test cases:
	- Equilateral (with side len 2.0, upside down): (0.1, 0.1), (-1.9, 0.1), (-0.9, -1.632051)
	- Isoceles (pointing diagonal up right): (-0.8, 0.8), (0.8, -0.8), (999.9, 999.9)
	- Scalene: (-54.3, 84.7), (43.2, 98.443), (-61.2948, 28.0)
	- Degenerate Isoceles (0.0, 0.0) (0.0, 0.0) (426.9, 823.0)
	- Degenerate Equilateral (5.0, 5.0) (5.0, 5.0) (5.0, 5.0)
	
	Perimeter test cases:
	- Normal case: (0.5248, -0.8002) (-2.437885, 1.94) (0.0, 0.0) gives 8.1081
	- Degenerate Isoceles (0.0, 0.0) (0.0, 0.0) (426.9, 823.0) gives 1854.2628
	- Degenerate Equilateral (5.0, 5.0) (5.0, 5.0) (5.0, 5.0) gives 0.0

	Area test cases:
	- Normal case: (0.5248, -0.8002) (-2.437885, 1.94) (0.0, 0.0) gives 0.4663
	- Degenerate Isoceles: (0.0, 0.0) (0.0, 0.0) (426.9, 823.0) gives 0.0
	- Degenerate Equilateral (5.0, 5.0) (5.0, 5.0) (5.0, 5.0) gives 0.0

	credits: Ivan Wei for excellent test cases
	*/
}
