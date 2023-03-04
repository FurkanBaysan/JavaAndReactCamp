package inheritancePart2;

public class CorporateCustomer extends Customer {
	public String companyName;
	public int taxNumber;

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getTaxNumber() {
		return this.taxNumber;
	}

	public void setTaxNumber(int taxNumber) {
		this.taxNumber = taxNumber;
	}
}
