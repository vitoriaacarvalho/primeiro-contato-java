package exercicios_pt2;

public class Product {
	
		String name;
		double price;
		int quantity;
		
		public double totalValueInStock() {
			double total=price*quantity;
			return total;
		}
		
		void addProducts(int quantity) {
			this.quantity+=quantity;
		}

		void removeProducts(int quantity) {
			this.quantity-=quantity;
		}
		
		public String toString() {
			return name+
					", $"+
					price+
					", "+
					quantity+
					" units, total: "+
					totalValueInStock();
		}
}


