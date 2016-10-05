package runway.moda.automation.repo.interfaces;

import runway.moda.automation.models.Login;

public interface CustomerLoginRepo {
	public Login get(int rowId,String sheetName) throws Exception;

}
