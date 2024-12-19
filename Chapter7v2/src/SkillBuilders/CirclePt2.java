package SkillBuilders;


public class CirclePt2 {
	
	
	private double radius;
	
	private static final double PI = 3.14;
	
		public CirclePt2() {
			radius = 1;
		
		}
		public CirclePt2(double r) {
		
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
}
