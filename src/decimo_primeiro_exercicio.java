import java.util.Scanner;

public class decimo_primeiro_exercicio {

	public static void main(String[] args) {
		
		System.out.print("Digite um valor: ");
		
		Scanner sc=new Scanner(System.in);
		int numero=sc.nextInt();
	
		for(int i=0;i<=numero;i++) {
			if (i%2!=0) {
				System.out.println(i);
			}
		}
		
		sc.close();
		
		
	}
}
