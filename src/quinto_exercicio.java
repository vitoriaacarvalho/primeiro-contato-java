import java.util.Locale;
import java.util.Scanner;

public class quinto_exercicio {

	public static void main(String[] args) {
		int codigo1, quant1, codigo2, quant2;
		double valorunidade1, valorunidade2; 
		
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Código da peça 1: ");
		codigo1=sc.nextInt();
		
		System.out.print("quantidade da peça 1: ");
		quant1=sc.nextInt();
		
		System.out.print("Preço da peça 1: ");
		valorunidade1=sc.nextDouble();
		
		System.out.print("Código da peça 2: ");
		codigo2=sc.nextInt();
		
		System.out.print("quantidade da peça 2: ");
		quant2=sc.nextInt();
		
		System.out.print("Preço da peça 2: ");
		valorunidade2=sc.nextDouble();
		
		sc.close();
		
		double valorfinal=(quant1*valorunidade1)+(quant2*valorunidade2);
		System.out.print(valorfinal);
		
	}

}
