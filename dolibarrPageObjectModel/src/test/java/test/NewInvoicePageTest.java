package test;

import org.testng.annotations.Test;

public class NewInvoicePageTest extends BaseTest {
	@Test
	public void testNewInvoicePage() {
		getNewInvoicePage();
		np.clickOnNewInvoice();
		
	}

}
