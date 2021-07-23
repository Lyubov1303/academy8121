package by.academy.lesson7.oop.override;

public class Rectangle extends Figure {
	public Rectangle(double dim1, double dim2) {
		super(dim1, dim2);
	}

	@Override
	public double area() {
		System.out.println("B области четырехугольника.");
		return dim1 * dim2;
	}
}