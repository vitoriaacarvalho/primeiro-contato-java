package exercicios_pt2;

public class Retangulo {
	
	double width, height;
	
	public double calculoArea() {
		double area=width*height;
		return area;
	}
	
	public double calculoPerimetro() {
		double perimetro=(width*2)+(height*2);
		return perimetro;
	}
	
	public double calculoDiagonal() {
		double diagonal=Math.sqrt(width * width + height * height);
		return diagonal;
	}

}
