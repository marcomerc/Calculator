package app.calculator;

public class Add implements Operation {

	public double Compute(String op,double preAns) {
		double result = 0;
		
		String[] numbers = op.split("\\+",-1);
		
		for(String num: numbers) {
			System.out.println(num);

			System.out.println(num.contains("ans"));

			if(num.contains("ans")) {
				System.out.println(num);

				num= Double.toString(preAns);
				System.out.println(num);
			}
			result+= Double.parseDouble(num);
			System.out.println(result);
		}
		return result;
	}

}
