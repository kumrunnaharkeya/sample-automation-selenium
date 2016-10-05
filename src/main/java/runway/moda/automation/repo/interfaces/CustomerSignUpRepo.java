package runway.moda.automation.repo.interfaces;

import java.io.IOException;

import runway.moda.automation.models.Login;

public interface CustomerSignUpRepo {
	public Login get(Integer rowId) throws IOException;
}
