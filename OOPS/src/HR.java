
public class HR {

  public Employee recruit(char empType)
  {
	  Employee employee=null;
	  if(empType=='I'){
		  employee = new Interns();
	  }
	  else if(empType=='P'){
		  employee=new Confirmed();
	  }else if(empType=='C'){
		  employee=new ContractEmployee();
	  }
	  return employee;
  }
}
