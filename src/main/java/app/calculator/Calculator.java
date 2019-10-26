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
			return addition(calculation);
		}else  if (calculation.contains("-")) {
			return subtraction(calculation);
		}else  if (calculation.contains("/")) {
			return division(calculation);
		} else  if (calculation.contains("*")) {
			return mulitplication(calculation);
		}else  if (calculation.contains("%")) {
			return modulus(calculation);
		} 
			
		
		return -1;
	
	}


	private double modulus(String calculation) {
		modOp = new Mod();
		preAns=modOp.Compute(calculation,preAns);
		return preAns;
	}


	private double mulitplication(String calculation) {
		multiOp = new Multi();
		preAns=multiOp.Compute(calculation,preAns);
		return preAns;
	}


	private double division(String calculation) {
		divOp = new Div();
		preAns=divOp.Compute(calculation,preAns);
		return preAns;
	}


	private double subtraction(String calculation) {
		subOp = new Sub();
		preAns=subOp.Compute(calculation,preAns);
		return preAns;
	}

	
	private double addition(String calculation) {
		addOp = new Add();
		preAns=addOp.Compute(calculation,preAns);
		return preAns;
	}
}
