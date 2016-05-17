package Validation;

public class ValidateCases {
	
	public void validate_price(int expected , int actual){
		
		int expected_price = expected;
		int actual_price = actual-12;
		
		System.out.println("expected price :" + expected_price);
		System.out.println("actual_price :" + actual_price);
		
		if (expected_price == actual_price){
			
		
			System.out.println("Total price given is correct");
			
		}
		
		else{
			
			System.out.println("Total price given is NOT correct");
		}
		
	}
	
	
	
	/* In order to validate saved data - I've just validated the value for first name,
	 * and assumption has been made if the first name is saved and value related to other fields would be 
	 * saved , However real world scenario would be different and it requires the validation of all the fields
	 * and not just one field
	 */
	
	public void validate_savedata(String expected_fname , String actual_fname){
		
		System.out.println("expected fname:"+ expected_fname);
		System.out.println("actual fname:"+ actual_fname);
		
		if (expected_fname.equalsIgnoreCase(actual_fname)){
			
			System.out.println("Data is saved");
		}
		
		else{
			
			System.out.println("Data is not saved ");
		}
}
	
	public void validateCartMsg(String exp_msg , String act_msg){
		
		
		if (exp_msg.equalsIgnoreCase(act_msg)){
			System.out.println("item successfully deleted");
		}
		
		else {
			System.out.println("error in item deletion functionality");
		}
		
	}

}
