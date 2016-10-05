package runway.moda.automation.repo.impl;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;

import runway.moda.automation.lib.ExcelPathResource;
import runway.moda.automation.lib.ExcelUtils;
import runway.moda.automation.models.CustomerProfile;
import runway.moda.automation.repo.interfaces.CustomerProfileRepo;

public class CustomerProfileRepoImpl implements CustomerProfileRepo {

	public CustomerProfile get(int rowId) throws Exception {
		// TODO Auto-generated method stub
		XSSFRow row=ExcelUtils.getExcellSheet(ExcelPathResource.Customer_profile.Location, ExcelPathResource.Customer_profile.Sheetname).getRow(rowId);
		CustomerProfile customerProfile =new CustomerProfile();
		customerProfile.setFirstName(row.getCell(0).toString());
		customerProfile.setMiddleName(row.getCell(1).toString());
		customerProfile.setLastName(row.getCell(2).toString());
		customerProfile.setMobileNumber(row.getCell(1).toString());
		return customerProfile;
	}

}
