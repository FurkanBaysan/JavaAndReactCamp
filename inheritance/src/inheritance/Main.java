package inheritance;

public class Main {

	public static void main(String[] args) {

		System.out.println("\t" + "Inheritance");

		IndividualCustomer individualCustomer = new IndividualCustomer();
		CorporateCustomer corporateCustomer = new CorporateCustomer();

		individualCustomer.id = 1;
		individualCustomer.customerNumber = "1234";

		corporateCustomer.id = 2;
		corporateCustomer.customerNumber = "5678";

		individualCustomer.nationalIdentity = "123456789";
		individualCustomer.firstName = "Furkan";
		individualCustomer.lastName = "Baysan";
		individualCustomer.birthDate = 1997;

		corporateCustomer.companyName = "hepsiburada";
		corporateCustomer.taxNumber = 978671;

		System.out.println(individualCustomer.id + " " + individualCustomer.customerNumber);
		System.out.println(corporateCustomer.id + " " + corporateCustomer.customerNumber);

		System.out.println(individualCustomer.firstName + " " + individualCustomer.lastName);
		System.out.println(corporateCustomer.companyName);

		System.out.println("\t" + "Polymorphism");

		CustomerManager customerManager = new CustomerManager();
		customerManager.add(individualCustomer);
		customerManager.add(corporateCustomer);

		// Open-Closed Principle of SOLID

		SendikaCustomer sendikaCustomer = new SendikaCustomer();
		sendikaCustomer.customerNumber = "9999";
		customerManager.add(sendikaCustomer);
		
		System.out.println();

		Customer[] customers = { individualCustomer, corporateCustomer, sendikaCustomer };
		customerManager.addMultiple(customers);
		
		

	}

}
