import java.util.Locale;
import java.util.Scanner;

public class quarto_exercicio {

	public static void main(String[] args) {
		//e calcula o sal�rio desse funcion�rio (com duas casas decimais)
		int numero, horas;
		double valorhora;
		Locale.setDefault(Locale.US);
		
		Scanner sc=new Scanner(System.in);	
		System.out.print("Seu n�mero de identifica��o na empresa: ");
		numero=sc.nextInt();
		
		System.out.print("Seu n�mero de horas trabalhadas: ");
		horas=sc.nextInt();
		
		System.out.print("O valor que voc� recebe por hora: ");
		valorhora=sc.nextDouble();
		
		sc.close();
		
		double salario=horas*valorhora;
		System.out.printf("O seu sal�rio esse m�s ser� %.2f%n", salario);
		
	}

}
