package app.calculator;

public class Calculator {
	private double preAns;
	private Operation addOp;
	private Operation subOp;
	private Operation divOp;
	private Operation modOp;
	private Operation multiOp;


	public double Compute(String calculation) {
		double result = 0;
	
		if (calculation.contains("+")) {
			addOp = new Add();
			preAns=addOp.Compute(calculation);
			
			return preAns;
		}else  if (calculation.contains("-")) {
			subOp = new Sub();
			preAns=subOp.Compute(calculation);
			return preAns;
		}else  if (calculation.contains("/")) {
			divOp = new Div();
			preAns=divOp.Compute(calculation);
			return preAns;
		} else  if (calculation.contains("*")) {
			multiOp = new Multi();
			preAns=multiOp.Compute(calculation);
			System.out.println(preAns);
			return preAns;
		}else  if (calculation.contains("%")) {
			modOp = new Mod();
			preAns=modOp.Compute(calculation);
			System.out.println(preAns);
			return preAns;
		} 
			
		
		return -1;
	
	}
}
