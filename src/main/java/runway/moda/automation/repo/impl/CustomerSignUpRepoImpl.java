package runway.moda.automation.repo.impl;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;

import runway.moda.automation.lib.ExcelPathResource;
import runway.moda.automation.lib.ExcelUtils;
import runway.moda.automation.models.Login;
import runway.moda.automation.repo.interfaces.CustomerSignUpRepo;

public class CustomerSignUpRepoImpl implements CustomerSignUpRepo{

	public Login get(Integer rowId) throws IOException {
		// TODO Auto-generated method stub
		XSSFRow row=ExcelUtils.getExcellSheet(ExcelPathResource.Customer_signup.Location, ExcelPathResource.Customer_signup.Sheetname).getRow(rowId);
		Login login=new Login();
		login.setUserName(row.getCell(0).toString());
		login.setPassword(row.getCell(1).toString());
		return login;
	}

}
