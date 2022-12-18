
public class Factorial {
	
	private int factorial = 1;
	private String formula = "";
	
	public void setNum(int n) {
		int factorialTotal = 1;
		String formulaInWritten = "";
		for (int i = n; i > 1; i--) {
			factorialTotal *= i;
			formulaInWritten += i + " x ";
		}
		formulaInWritten += "1 = ";
		
		formula = formulaInWritten + Integer.toString(factorialTotal);
	}
	
	public int getFactorial() {
		return factorial;
	}
	
	public String getFormula() {
		return formula;
	}
	

}
