
public class Rectangle_9_1 {
	
	public double width = 1.0, height = 1.0;

	public Rectangle_9_1(){
		this(1.0,1.0);
	}
	
	public Rectangle_9_1(double width, double height){
		this.height = height;
		this.width = width;
	}
	
	public double getArea(){
		return width * height;
	}
	
	public double getPerimeter(){
		return (width * 2) + (height * 2);
	}

}
