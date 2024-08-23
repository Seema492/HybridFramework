package pom;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;

public class ClaimPom {

	@FindBy(xpath="//span[text()=\"Configuration \"]")
	WebElement Configration;
	
	@FindBy(xpath = "//a[text()=\"Events\"]")
	WebElement Event;
	
	@FindBy(xpath = "//a[text()=\"Expense Types\"]")
	WebElement ExpenseTypes;
	
	@FindBy(xpath = "//a[text()=\"Submit Claim\"]")
	WebElement submitClaim;
	
	@FindBy(xpath = "//a[text()=\"My Claims\"]")
	WebElement Myclaims;
	
	@FindBy(xpath = "//a[text()=\"Employee Claims\"]")
	WebElement EmployeeClaim;
	
	@FindBy(xpath = "//a[text()=\"Assign Claim\"]")
	WebElement AssignClaim;
	
	@FindBy(xpath = "(//input[@placeholder=\"Type for hints...\"])[1]")
	WebElement Employename;
	
	@FindBy(xpath = "(//input[@placeholder=\"Type for hints...\"])[2]")
	WebElement ReferanceId;
	
	@FindBy(xpath = "(//div[@class=\"oxd-select-text-input\"])[1]")
	WebElement Eventname;
		
	@FindBy(xpath = "//div[text()=\"Accommodation\"]")
	WebElement Accommodation;
		
	@FindBy(xpath = "//div[text()=\"Medical Reimbursement\"]")
	WebElement medicalReimbursement;
		
	@FindBy(xpath = "//div[text()=\"Travel Allowance\"]")
	WebElement travelAllownce;
		
		
	@FindBy(xpath = "(//div[@class=\"oxd-select-text-input\"])[2]")
	WebElement status;
		 
	@FindBy(xpath = "(//div[text()=\"Initiated\"])[1]") 
	WebElement initiated;
			
	@FindBy(xpath = "(//div[text()=\"Submitted\"])[1]")	
	WebElement submitted;
			
	@FindBy(xpath = "(//div[text()=\"Approved\"])[1]")	
	WebElement Aproved;
			
	@FindBy(xpath = "(//div[text()=\"Rejected\"])[1]")	
	WebElement rejected;
			
     @FindBy(xpath = "(//div[text()=\"Cancelled\"])[1]")
	 WebElement canceled;
			
	@FindBy(xpath = "(//input[@placeholder='yyyy-dd-mm'])[1]")
	WebElement fromDate1;
			
	@FindBy(xpath = "(//input[@placeholder='yyyy-dd-mm'])[2]")	
	WebElement todate2;	
			
	@FindBy(xpath = "//div[text()=\"Current Employees Only\"]")
	WebElement currentEmployee;
			
	@FindBy(xpath = "//div[text()=\"Past Employees Only\"]")
	WebElement pastemployee;
			
	@FindBy(xpath = "//button[text()=\" Reset \"]")
	WebElement Reset;
			
	@FindBy(xpath = "//button[text()=\" Search \"]")	
	WebElement Search;
			
	@FindBy(xpath = "//button[text()=\" Assign Claim \"]")
	WebElement Assignclaim;
			
			

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}
