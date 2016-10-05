package runway.moda.automation.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import runway.moda.automation.service.impl.CustomerProfileServiceImpl;
import runway.moda.automation.service.interfaces.CustomerProfileService;

public class CustomerProfile {
	private BaseConfiguration baseConfig=new BaseConfiguration();
	CustomerProfileService customerProfileService = new CustomerProfileServiceImpl();
	private WebDriver driver=null;
	
		
	@BeforeTest
	public void initEnvironment(){
		baseConfig.initEnvironment();
	}
	@Test
	public void customerProfileSetup(){
		driver=baseConfig.loadDriver("https://development.runway.moda/#/signin");	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		customerProfileService.setCustomerProfileData(driver);
}
}