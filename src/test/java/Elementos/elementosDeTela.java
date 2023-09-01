package Elementos;

import org.openqa.selenium.By;

public class elementosDeTela {

	

	
	private By btnMudarVersao = By.xpath("//*[@id=\"switch-version-select\"]/option[4]");
	private By btnAddRecord = By.xpath("//*[@id=\"gcrud-search-form\"]/div[1]/div[1]/a");
	private By btncustomeName = By.id("field-customerName");
	private By btnContactLastName = By.id("field-contactLastName");
	private By ContactFirstName = By.id("field-contactFirstName");
	private By Phone = By.id("field-phone");
	private By AddressLine1 = By.id("field-addressLine1");
    private By AddressLine2 = By.id("field-addressLine2");
	private By City = By.id("field-city");
	private By State = By.id("field-state");
	private By PostalCode = By.id("field-postalCode");
	private By Country = By.id("field-country");
	private By SalesRepEmployeeNumber = By.id("field-salesRepEmployeeNumber");
	private By CreditLimit = By.id("field-creditLimit");
	private By Deleted = By.id("field-deleted");
	private By saveAndGoBackButton = By.id("//*[@id=\"save-and-go-back-button\"]");

	
	private By protudoSpeaker = By.id("speakersImg");
	public By getProtudoSpeaker() {
		return protudoSpeaker;

		
	}
	public By getBtnContactLastName() {
			return btnContactLastName;
		}
	
	public By getBtnMudarVersao() {
		return btnMudarVersao;
	}
	public By getBtnAddRecord() {
		return btnAddRecord;
	
	}
	public By getContactFirstName() {
		return ContactFirstName;
	}

	public By getPhone() {
		return Phone;
	}
	
	public By getAddressLine1() {
		return AddressLine1;
	}

	public By getAddressLine2() {
		return AddressLine2;
	}
	public By getCity() {
		return City;
	}
	public By getState() {
		return State;
	}
	public By getPostalCode() {
		return PostalCode;
	}
	public By getCountry() {
		return Country;
	}
	public By getSalesRepEmployeeNumber() {
		return SalesRepEmployeeNumber;
	}
	public By getCreditLimit() {
		return CreditLimit;
	}
	public By getDeleted() {
		return Deleted;
	}
	public By getSaveAndGoBackButton() {
		return saveAndGoBackButton;

	}
	public By getBtncustomeName() {
		return btncustomeName;
	}
	
	
	
	
}