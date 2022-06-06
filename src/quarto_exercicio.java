import java.util.Locale;
import java.util.Scanner;

public class quarto_exercicio {

	public static void main(String[] args) {
		//e calcula o salário desse funcionário (com duas casas decimais)
		int numero, horas;
		double valorhora;
		Locale.setDefault(Locale.US);
		
		Scanner sc=new Scanner(System.in);	
		System.out.print("Seu número de identificação na empresa: ");
		numero=sc.nextInt();
		
		System.out.print("Seu número de horas trabalhadas: ");
		horas=sc.nextInt();
		
		System.out.print("O valor que você recebe por hora: ");
		valorhora=sc.nextDouble();
		
		sc.close();
		
		double salario=horas*valorhora;
		System.out.printf("O seu salário esse mês será %.2f%n", salario);
		
	}

}
