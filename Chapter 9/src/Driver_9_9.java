
public class Driver_9_9 {

	public static void main(String[] args) {
		RegularPolygon_9_9 poligon0 = new RegularPolygon_9_9(6,4);
		RegularPolygon_9_9 poligon1 = new RegularPolygon_9_9(10, 4, 5.6, 7.8);
		
		System.out.println("Centered polygon area is " + poligon0.getArea() + 
				", perimeter is " + poligon0.getPerimeter());
		System.out.println("Polygon with center (" + poligon1.getX() + ", " + poligon1.getY() + ") " + "area is " + poligon1.getArea() + 
				", perimeter is " + poligon1.getPerimeter());
	}

}
