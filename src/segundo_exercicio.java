import java.util.Locale;
import java.util.Scanner;

public class segundo_exercicio {

	public static void main(String[] args) {
		System.out.print("Digite o valor do raio do circulo: ");
		Locale.setDefault(Locale.US);
		double R, pi=3.14159, A;
		Scanner sc=new Scanner(System.in);
		R=sc.nextDouble();
		sc.close();
		A=(R*R)*pi;
		System.out.printf("o valor do raio foi %.2f e o valor da área foi %.4f%n", R, A);
		
	}

}
