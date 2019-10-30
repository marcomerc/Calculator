package app.calculator;

public class Add implements Operation {

	public double Compute(String op,double preAns) {
		double result = 0;
		
		String[] numbers = op.split("\\+",-1);
		
		for(String num: numbers) {
			if(num.contains("ans")) {
				num= Double.toString(preAns);
			}
			result+= Double.parseDouble(num);
		}
		return result;
	}

}
