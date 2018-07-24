
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Confirmed employee=new Confirmed();
       Accounts accounts=new Accounts();
       accounts.processSalary(employee);
       
       Interns interns=new Interns();
       accounts.processSalary(interns);

       ContractEmployee contractEmployee = new ContractEmployee();
       accounts.processSalary(contractEmployee);
	}

}
