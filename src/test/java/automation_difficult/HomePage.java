package automation_difficult;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;
	
	//Creation of Objects
	
	@FindBy(linkText = "My Account")
	private WebElement MyAccountLink;
	
	@FindBy(linkText = "Login")
	private WebElement loginOption;
	
	@FindBy(linkText = "Register")
	private WebElement registerOption;
	
	@FindBy(name = "search")
	private WebElement searchTextBox;
	
	
	@FindBy(css = "button.btn.btn-default.btn-lg")
	private WebElement searchButton;
	
	
	
	//Create the Constructor of this Page
	//Initializing the Objects
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		//PageFactory.initElements(driver, HomePage.class);
	}
	
	
	
	//Actions performed by those objects
	public void clickOnMyAccountLink() {
		MyAccountLink.click();
	}
	
	public void selectLoginOption() {
		loginOption.click();
	}
	
	public void selectRegisterOption() {
		registerOption.click();
	}
	
	
	public void enterProductNameInSearchBox(String validProductText) {
		searchTextBox.sendKeys(validProductText);
	}
	
	public void clickOnSearchButton() {
		searchButton.click();
	}
	public void addProductToCart() {
		
	}
	

}
