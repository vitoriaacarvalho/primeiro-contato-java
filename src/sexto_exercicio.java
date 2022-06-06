import java.util.Locale;
import java.util.Scanner;

public class sexto_exercicio {

	public static void main(String[] args) {
		
		double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo, pi = 3.14159;
		
		//triangulo -> a=base, c=altura
		//circulo -> c=raio
		//a área do trapézio que tem A e B por bases e C por altura
		//a área do quadrado que tem lado B
		//a área do retângulo que tem lados A e B
		
		Locale.setDefault(Locale.US);
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Primeiro número: ");
		a=sc.nextDouble();
		
		System.out.println("Segundo número: ");
		b=sc.nextDouble();
		
		System.out.println("Terceiro número: ");
		c=sc.nextDouble();
		
	
	
		
		sc.close();
		
		//calculos:
		triangulo=(a*c)/2;
		circulo=pi*c*c;
		trapezio=((a+b)*c)/2;
		quadrado=b*b;
		retangulo=b*a;
		
		//resultados:
		System.out.printf("área do triagulo: %.3f%n", triangulo);
		System.out.printf("área do circulo: %.3f%n", circulo);
		System.out.printf("área do trapézio: %.3f%n", trapezio);
		System.out.printf("área do quadrado: %.3f%n", quadrado);
		System.out.printf("área do retângulo: %.3f%n",retangulo);
		
	}

}
