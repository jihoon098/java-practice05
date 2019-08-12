package prob6;

public class RectTriangle extends Shape{
	
	private double width;
	private double height;
	
	
	public RectTriangle(double w, double h) {
		this.width = w;
		this.height = h;
	}
	
	
	
	@Override
	public double getArea() {
		double answer = this.width * this.height * 0.5;
		return answer;
	}
	@Override
	public double getPerimeter() { 
		//둘레 길이 
		double answer = this.width + this.height + Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2));
		return answer;
	}
	
	
	
	
	
	

}
