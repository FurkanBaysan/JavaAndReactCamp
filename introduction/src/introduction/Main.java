package introduction;

public class Main {

	public static void main(String[] args) {
		System.out.println("I'm back in town");

		System.out.println("\t" + "Variable Need and Variables");

		String internetSubesiButonu = "Internet Subesine Giris";
		System.out.println(internetSubesiButonu);
		// Don't repeat yourself - DRY

		double dolarDun = 17.81;
		double dolarBugun = 18.14;
		int vade = 36;

		boolean isDecreased = false;

		System.out.println("\t" + "Control Flow Part 1: If Statement");

		if (dolarBugun < dolarDun) {
			isDecreased = true;
			System.out.println("Dolar Dustu, Asagi Ok ");
		} else if (dolarBugun == dolarDun) {
			System.out.println("Dolar Sabit, Yan Ok");
		} else {
			System.out.println("Dolar Yukseldi, Yukari Ok");
		}

		System.out.println("\t" + "Array Need");

		String firstKredi = "Hizli Kredi";
		String secondKredi = "Mutlu Emekli Kredisi";
		String thirdKredi = "Konut Kredisi";
		String fourthKredi = "Ihtiyac Kredisi";
		String fifthKredi = "Kamu Calisanlarina Ozel Kredi";

		System.out.println(firstKredi);
		System.out.println(secondKredi);
		System.out.println(thirdKredi);
		System.out.println(fourthKredi);
		System.out.println(fifthKredi);

		System.out.println();

		System.out.println("\t" + "Arrays");

		String[] krediler = new String[] { "Hizli Kredi", "Mutlu Emekli Kredisi", "Konut Kredisi", "Ihtiyac Kredisi",
				"Kamu Calisanlarina Ozel Kredi" };

		System.out.println("\t" + "Control Flow Part 2: Loops");

		for (int i = 0; i < krediler.length; i++) { // for loop
			System.out.println(krediler[i]);
		}
		System.out.println();

		for (String kredi : krediler) { // for-each loop
			System.out.println(kredi);
		}
		// if there is an array, there is a Loop.

		System.out.println();

		System.out.println("\t" + "Primitive Types and Reference Types");

		// Primitive Types

		int firstNumber = 10;
		int secondNumber = 20;
		firstNumber = secondNumber;
		secondNumber = 100;
		System.out.println(firstNumber);

		// Reference Types

		int[] numbers = { 1, 2, 3, 4, 5 };
		int[] otherNumbers = { 10, 20, 30, 40, 50 };
		numbers = otherNumbers;
		otherNumbers[0] = 100;
		System.out.println(numbers[0]);

		String firstCity = "Istanbul";
		String secondCity = "Paris";
		firstCity = secondCity;
		secondCity = "London";
		System.out.println(firstCity);

	}

}
