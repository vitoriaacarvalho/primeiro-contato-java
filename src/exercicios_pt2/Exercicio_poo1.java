package exercicios_pt2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_poo1 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		Product product1= new Product();
		
		System.out.println("enter product data: ");
		
		System.out.println("name: ");
		product1.name=sc.nextLine();
		
		System.out.println("Price: ");
		product1.price=sc.nextDouble();
		
		System.out.println("Quantity in stock: ");
		product1.quantity=sc.nextInt();
		
		System.out.println(product1);
		
		sc.close();
	}

}
