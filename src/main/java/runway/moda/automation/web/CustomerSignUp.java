package runway.moda.automation.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import runway.moda.automation.lib.Constans;
import runway.moda.automation.lib.ExcelPathResource;
import runway.moda.automation.service.impl.CustomerLoginServiceImpl;
import runway.moda.automation.service.impl.CustomerProfileServiceImpl;
import runway.moda.automation.service.impl.CustomerSignUpServiceImpl;
import runway.moda.automation.service.interfaces.CustomerLoginService;
import runway.moda.automation.service.interfaces.CustomerProfileService;
import runway.moda.automation.service.interfaces.CustomerSignUpService;

public class CustomerSignUp {
	private BaseConfiguration baseConfig=new BaseConfiguration();
	CustomerSignUpService customerSignup = new CustomerSignUpServiceImpl();
	CustomerLoginService customerLogin = new CustomerLoginServiceImpl();
	CustomerProfileService customerProfile = new CustomerProfileServiceImpl();
	private WebDriver driver=null;
	
	@BeforeSuite
	public void initEnvironment(){
		baseConfig.initEnvironment();
	}
	@Test
	public void customerSignUp(){
		driver=baseConfig.loadDriver("https://development.runway.moda/#/signin");	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    customerSignup.customerSignup(driver);
		customerLogin.setUserNamePassword(driver,1,ExcelPathResource.Customer_signup.Sheetname);
		//customerProfile.setCustomerProfileData(driver);
		
	}
	
	/*@AfterTest
	public void closeBrowser(){
		driver.quit();
	}*/
	
}
