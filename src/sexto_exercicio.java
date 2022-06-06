import java.util.Locale;
import java.util.Scanner;

public class sexto_exercicio {

	public static void main(String[] args) {
		
		double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo, pi = 3.14159;
		
		//triangulo -> a=base, c=altura
		//circulo -> c=raio
		//a �rea do trap�zio que tem A e B por bases e C por altura
		//a �rea do quadrado que tem lado B
		//a �rea do ret�ngulo que tem lados A e B
		
		Locale.setDefault(Locale.US);
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Primeiro n�mero: ");
		a=sc.nextDouble();
		
		System.out.println("Segundo n�mero: ");
		b=sc.nextDouble();
		
		System.out.println("Terceiro n�mero: ");
		c=sc.nextDouble();
		
	
	
		
		sc.close();
		
		//calculos:
		triangulo=(a*c)/2;
		circulo=pi*c*c;
		trapezio=((a+b)*c)/2;
		quadrado=b*b;
		retangulo=b*a;
		
		//resultados:
		System.out.printf("�rea do triagulo: %.3f%n", triangulo);
		System.out.printf("�rea do circulo: %.3f%n", circulo);
		System.out.printf("�rea do trap�zio: %.3f%n", trapezio);
		System.out.printf("�rea do quadrado: %.3f%n", quadrado);
		System.out.printf("�rea do ret�ngulo: %.3f%n",retangulo);
		
	}

}
