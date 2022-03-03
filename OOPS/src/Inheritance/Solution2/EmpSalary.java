package Inheritance.Solution2;

public class EmpSalary extends Person {

		private double annualSalary;
		private int yearOfStart;
		private String nationalInsuranceNo;
		
		EmpSalary(String name, double annualSalary, int yearOfStart, String nationalInsuranceNo) {
			super(name);
			this.annualSalary = annualSalary;
			this.yearOfStart = yearOfStart;
			this.nationalInsuranceNo = nationalInsuranceNo;
		}

		public double getAnnualSalary() {
			return annualSalary;
		}

		public int getYearOfStart() {
			return yearOfStart;
		}

		public String getNationalInsuranceNo() {
			return nationalInsuranceNo;
		}


}