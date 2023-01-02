package test;

import org.testng.annotations.Test;

public class BillingPageTest extends BaseTest {
	@Test
	public void testBillingPage() {
		getBillingPage();
		bp.clickOnBillingManu();
		
	}

}
