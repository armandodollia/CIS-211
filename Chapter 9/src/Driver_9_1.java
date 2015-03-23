
public class Driver_9_1 {

	public static void main(String[] args) {
		Rectangle_9_1 rectangle1 = new Rectangle_9_1(4, 40);
		Rectangle_9_1 rectangle2 = new Rectangle_9_1(3.5, 35.9);
		
		System.out.println("Rectangle 1 has a width of " + rectangle1.width +
				", a height of " + rectangle1.height + ", an area of " + rectangle1.getArea() +
				" square units, and a perimeter of " + rectangle1.getPerimeter());

		System.out.println("Rectangle 1 has a width of " + rectangle2.width +
				", a height of " + rectangle2.height + ", an area of " + rectangle2.getArea() +
				" square units, and a perimeter of " + rectangle2.getPerimeter());
	}

}
