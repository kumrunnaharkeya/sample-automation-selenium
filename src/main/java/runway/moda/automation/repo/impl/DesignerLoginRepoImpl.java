package runway.moda.automation.repo.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import runway.moda.automation.lib.ExcelPathResource;
import runway.moda.automation.lib.ExcelUtils;
import runway.moda.automation.models.Login;
import runway.moda.automation.repo.interfaces.DesignerLoginRepo;

public class DesignerLoginRepoImpl implements DesignerLoginRepo {
	
	public Login get(Integer rowId) throws IOException {
		XSSFRow row=ExcelUtils.getExcellSheet(ExcelPathResource.Designer_UserName.Location, ExcelPathResource.Designer_UserName.SheetName).getRow(rowId);
		Login login=new Login();
		login.setUserName(row.getCell(0).toString());
		login.setPassword(row.getCell(1).toString());
		return login;
	}
}
