package app.calculator;

public class Div implements Operation {

	public double Compute(String op,double preAns) {
		double result = 0;
		String[] numbers = op.split("/",-1);
		int index =0;
		for(String num: numbers) {
			if(num.contains("ans")) {
				num= Double.toString(preAns);
			}
			if(index == 0) {
				result	=  Double.parseDouble(num);
				index++;
			}else {
				result=result/ Double.parseDouble(num);

			}
		}
		return result;
	}
}