package exercicios_pt2;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_poo2 {

	public static void main(String[] args) {
		
		Retangulo ret1= new Retangulo();
		
		Locale.setDefault(Locale.US);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("digite a largura do retângulo: ");
		ret1.width=sc.nextDouble();
		
		System.out.println("digite a altura do retângulo: ");
		ret1.height=sc.nextDouble();
		sc.close();
	
		System.out.printf("AREA= %.2f%n", ret1.calculoArea());
		System.out.printf("PERIMETER = %.2f%n", ret1.calculoPerimetro());
		System.out.printf("DIAGONAL = %.2f%n", ret1.calculoDiagonal());
		
	}

}
