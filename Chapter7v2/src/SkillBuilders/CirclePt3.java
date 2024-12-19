
package SkillBuilders; 

public class CirclePt3 {
	
	private double radius;
	
	private static final double PI = 3.14;
	
		public CirclePt3() {
			radius = 1;
	
		}
		public CirclePt3(double r) {
			radius = r;
		
		}
		public void setRadius(double newRadius) {
			radius = newRadius;
		
		}
		
		public double area(){
			return(radius * radius * PI);
		
		}
		
		public double getRadius() {
			 return(radius);
		
		}
	
		
		public double circumference(){
			return(radius * 2 * PI);
	
		}
		
		public static void displayAreaFormula() {
			System.out.println("The formula for the area of a circle is a = Pi*r*r");
	
		
		}
}


