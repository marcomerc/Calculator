package app.calculator;

public class Calculator {
	private double preAns;
	private Add addOp;
	private Sub subOp;
	private Div  divOp;
	private Mod modOp;
	private Multi multiOp;


	public double Compute(String calculation) {
		double result = 0;
			if (calculation.contains("+")) {
			addOp = new Add();
			preAns=addOp.Compute(calculation);
			return preAns;
		}
		
			
		
		return 0;
	}
}
