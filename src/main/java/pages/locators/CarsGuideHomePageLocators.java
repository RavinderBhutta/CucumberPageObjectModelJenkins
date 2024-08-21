package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarsGuideHomePageLocators {

	@FindBy(xpath = "//a[text()='buy + sell']")
	private WebElement carBuySellLink;

	public WebElement carBuySellLink() {
		return carBuySellLink;
	}

	@FindBy(xpath = "//a[text()='New']")
	private WebElement buyNewCarLink;

	public WebElement buyNewCarLink() {
		return buyNewCarLink;
	}
	
	@FindBy(xpath = "	@FindBy(xpath = \"//a[text()='New']\")\r\n"
			+ "	private WebElement buyNewCarLink;\r\n"
			+ "\r\n"
			+ "	public WebElement buyNewCarLink() {\r\n"
			+ "		return buyNewCarLink;\r\n"
			+ "	}")
	private WebElement buyNewCarLinkMenu;

	public WebElement buyNewCarLinkMenu() {
		return buyNewCarLinkMenu;
	}

}
