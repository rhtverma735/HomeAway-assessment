package run;

import Page.BusinessPage;
import Validation.ValidateCases;
import base.SetupWebdriver;

public class ExecuteTest {

	public static void main(String[] args) {
		BusinessPage home = new BusinessPage();
		int total_price_expected = home.getExpectedPrice();
		int total_price_actual = home.getActualPrice();
		
		ValidateCases validate = new ValidateCases();
		validate.validate_price(total_price_expected, total_price_actual);
		
		home.setAccountDetails_submit();
		String act_fname = home.saveAccountDetails();
		validate.validate_savedata(BusinessPage.first_name ,act_fname);
		
		// Validate cart message
		String act_cart_msg = home.deleteCart();
		validate.validateCartMsg(BusinessPage.emptycart_msg, act_cart_msg);
		
		SetupWebdriver.closeBrowser();

	}

}
