package runway.moda.automation.repo.impl;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;

import runway.moda.automation.lib.ExcelPathResource;
import runway.moda.automation.lib.ExcelUtils;
import runway.moda.automation.models.Login;
import runway.moda.automation.repo.interfaces.CustomerLoginRepo;

public class CustomerLoginRepoImpl implements CustomerLoginRepo {

	public Login get(int rowId,String sheetName) throws Exception {
		// TODO Auto-generated method stub
		
		XSSFRow row=ExcelUtils.getExcellSheet(ExcelPathResource.Customer_UserName.Location, sheetName).getRow(rowId);
		Login login=new Login();
		login.setUserName(row.getCell(0).toString());
		login.setPassword(row.getCell(1).toString());
		return login;
	}

}
