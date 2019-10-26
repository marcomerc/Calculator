package app.calculator;

public class Mod implements Operation {

	public double Compute(String op,double preAns) {
		double result = 0;
		String[] numbers = op.split("\\%",2);
		int index =0;
		for(String num: numbers) {
			if(index == 0) {
				result	=  Double.parseDouble(num);
				index++;
			}else {
				result =result% Double.parseDouble(num);

			}
//			System.out.println(result);
		}
		return result;
	}

}
