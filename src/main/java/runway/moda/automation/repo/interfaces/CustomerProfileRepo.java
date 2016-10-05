package runway.moda.automation.repo.interfaces;

import runway.moda.automation.models.CustomerProfile;

public interface CustomerProfileRepo {
	public CustomerProfile get(int rowId) throws Exception;
}
