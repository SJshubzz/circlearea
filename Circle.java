package CircleArea;

public class Circle {
	public static void main(String[] args) {
		double d=5;
		double result=findArea(d);
		System.out.println("Area of diameter"+" "+d+" "+"Result is"+" "+result);	
	}public static double findArea(double d) {
		double r=d/2;
		double area=Math.PI*r*r;
		return area;
	}
}
