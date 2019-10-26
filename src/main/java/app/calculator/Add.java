package app.calculator;

public class Add implements Operation {

	public double Compute(String op,double preAns) {
		double result = 0;
		
		String[] numbers = op.split("\\+",-1);
		
		for(String num: numbers) {
			result+= Double.parseDouble(num);
//			System.out.println(result);
		}
		return result;
	}

}
