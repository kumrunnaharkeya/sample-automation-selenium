package runway.moda.automation.repo.interfaces;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import runway.moda.automation.models.Login;

public interface DesignerLoginRepo {
//public void excelInput(XSSFSheet sheet,XSSFRow row) throws IOException;
public Login get(Integer rowId) throws IOException;
}
