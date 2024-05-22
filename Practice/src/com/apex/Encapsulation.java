package com.apex;

public class Encapsulation  {

	private String empname;
	private String empid;
	private String empsalary;
		public void setempname(String employeename) {
	
			this.empname =employeename;
			
	}
		public void setempid(String employeeid) {
			
			this.empid =employeeid;
			
	}
		public void setempsalary(String employeesalary) {
			
			this.empsalary =employeesalary;
			
	}
		public void getempname() {
			System.out.println(empname);
		}
	
		public void getempid() {
			System.out.println(empid);
		}
		public void getempsalary() {
			System.out.println(empsalary);
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation e =new Encapsulation();
		e.setempid("100");
		e.setempname("Ravi");
		e.setempsalary("25000");
		e.getempname();
		e.getempsalary();
		e.getempid();
		Interface.inter1();
	}

}
