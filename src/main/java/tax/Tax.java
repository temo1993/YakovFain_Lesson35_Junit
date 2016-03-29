package main.java.tax;
public class Tax implements Taxable {
	
	private final static double STUDENT_DEDUCTION = 300.00;
    
	public double calcTax(double grossIncome, int dependents) 
	                throws IllegalArgumentException{
		
    	    if (grossIncome < 0 ){
    	    	  throw new IllegalArgumentException("Gross income can't be negative");
    	    }
		return (grossIncome * 0.33 - dependents * 100);
    }
    
	public double applyStudentDeduction(double taxAmount, int numOfStudents){
    	     return taxAmount - STUDENT_DEDUCTION * numOfStudents;
    }	
}
