package runway.moda.automation.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import runway.moda.automation.service.impl.DesignerLoginServiceImpl;
import runway.moda.automation.service.interfaces.DesignerLoginService;

public class DesignerLogin {

	
	private BaseConfiguration baseConfig=new BaseConfiguration();
	DesignerLoginService designerLogin=new DesignerLoginServiceImpl();
	private WebDriver driver=null;
	@BeforeSuite
	public void initEnvironment(){
		baseConfig.initEnvironment();
	}
	@Test(priority=1,enabled=false)
	public void successfulDesignerLogin(){
		driver=baseConfig.loadDriver("https://development.runway.moda/#/signin");	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		designerLogin.validDesignerLogin(driver);
	}
	@Test(priority=2,enabled=true)
	public void designerLoginCombination() throws Exception{
		driver=baseConfig.loadDriver("https://development.runway.moda/#/signin");	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		designerLogin.setValuesFromExcel(driver);
		designerLogin.designerLogout(driver);
		
	}
	@AfterMethod
	public void closeBrowser(){
		driver.quit();
	}
	
	}

