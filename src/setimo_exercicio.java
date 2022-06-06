import java.util.Scanner;

public class setimo_exercicio {

	public static void main(String[] args) {
		
		int minutos;
		
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Quantos minutos você consumiu?");
		minutos=sc.nextInt();
		sc.close();
		
		
if (minutos>100) {
			int extra=minutos-100;
			double valor=extra*2+50;
			System.out.printf("O valor a ser pago é R$%.2f", valor);	
		}
		else {
			double valor=50;
			System.out.printf("O valor a ser pago é R$%.2f", valor);
		}
		
	}

}
