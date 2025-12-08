import java.util.Scanner;
public class PizzaWahala {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
	
		System.out.println(" 1 - sapaSize");
		System.out.println(" 2 - smallMoney");
		System.out.println(" 3 - bigBoys");
		System.out.println(" 4 - odowgu");
		
		System.out.print("what pizza type do you want, select from above: ");
		int pizzaType = input.nextInt();


System.out.print("how many pizza you wan chop/buy: ");
		int pizzaNumber = input.nextInt();
		

		
		System.out.print(scambiraPizza(pizzaNumber,pizzaType));


	}

	public static String scambiraPizza(int pizzaNumber, int type) {

		
		if(type == 1) {
			double pricePerBox = 2000;
			int slicePerPack = 4;
			int numberOfBoxes = pizzaNumber / slicePerPack;
			int peopleSlices = pizzaNumber * 4;
			int topUp = pizzaNumber % slicePerPack;
			int leftover = slicePerPack - topUp;
			double price = numberOfBoxes * pricePerBox;
			return  "your leftover is" +    leftover   +   "and" +   "price is"+   price;


		}


		else if(type == 2) {
			double pricePerBox = 2400;
			int slicePerPack = 6;
			int numberOfBoxes = pizzaNumber / slicePerPack;
			int peopleSlices = pizzaNumber * 6;
			int topUp = pizzaNumber % slicePerPack;
			int leftover = slicePerPack - topUp;
			double price = numberOfBoxes * pricePerBox;
			return  "your leftover is" +    leftover   +   "and" +   "price is"+   price;

		}
	

		else if(type == 3){
			double pricePerBox = 3000;
			int slicePerPack = 8;
			int numberOfBoxes = pizzaNumber / slicePerPack;
			int peopleSlices = pizzaNumber * 8;
			int topUp = pizzaNumber % slicePerPack;
			int leftover = slicePerPack - topUp;
			double price = numberOfBoxes * pricePerBox;
			return  "your leftover is" +    leftover   +   "and" +   "price is"+   price;

		}

		else if(type == 4) {
			double pricePerBox = 4200;
			int slicePerPack = 12;
			int numberOfBoxes = pizzaNumber / slicePerPack;
			int peopleSlices = pizzaNumber * 12;
			int topUp = pizzaNumber % slicePerPack;
			int leftover = slicePerPack - topUp;
			double price = numberOfBoxes * pricePerBox;
			return  "your leftover is" +    leftover   +   "and" +   "price is"+   price;
		}

	return "invalid input";
  }
		
}

