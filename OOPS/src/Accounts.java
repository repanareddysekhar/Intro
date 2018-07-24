
public class Accounts {

	  public void processSalary(Employee employee){
		 if(employee!=null)
		 {
			 if(employee instanceof Confirmed){
				Confirmed confirmed=  (Confirmed)employee;
				confirmed.transportFacility();
			 }
			 employee.netSalary();
		 }
		 
		  
	  }
}
