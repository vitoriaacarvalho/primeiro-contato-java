import java.util.Scanner;

public class terceiro_exercicio {

	public static void main(String[] args) {
		System.out.print("Digite 4 números inteiros: ");
		Scanner sc=new Scanner(System.in);
		int A, B, C, D, dif;
		A=sc.nextInt();
		B=sc.nextInt();
		C=sc.nextInt();
		D=sc.nextInt();
		sc.close();
		dif = (A * B) - (C * D);
		
		System.out.printf("%d", dif);
		
		

	}

}
