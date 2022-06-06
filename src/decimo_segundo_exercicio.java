import java.util.Scanner;

public class decimo_segundo_exercicio {

	public static void main(String[] args) {
		System.out.print("valor de N: ");
		
		Scanner sc=new Scanner(System.in);
		int quant=sc.nextInt(); //essa é a quantidade
		
		int in=0, out=0;
		
		
		for(int i=0;i<=quant;i++) {
			System.out.print("Número "+(i+1)+":");
			int valor= sc.nextInt(); //esse vai ser o valor 
			if(valor>=10 && valor<=20) {
				in+=1;
			}
			else {
				out+=1;
			}
		}
		
		System.out.println(in+" in");
		System.out.println(out+ " out");
		
		
		sc.close();

	}

}
