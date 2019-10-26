package app.calculator;

public class Multi implements Operation {

	public double Compute(String op,double preAns) {
		double result = 0;
		String[] numbers = op.split("\\*",2);
		int index =0;
		for(String num: numbers) {
			if(num.contains("ans")) {
				num= Double.toString(preAns);
			}
			if(index == 0) {
				result	=  Double.parseDouble(num);
				index++;
			}else {
				result*= Double.parseDouble(num);
			}
		}
		return result;
	
	}
}


