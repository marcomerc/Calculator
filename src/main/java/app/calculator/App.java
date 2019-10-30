package app.calculator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Calculator Deliver." );
        
        Calculator addi = new Calculator();
		Double ans =addi.Compute("2+2+2");
		System.out.println( "Addition: 2+2++2= "+ans);
		
		Calculator subs = new Calculator();
		ans = subs.Compute("8-2-2");
		System.out.println( "Subtraction: 8-2-2= "+ans);
		
		Calculator multinum = new Calculator();
		ans=multinum.Compute("2*2*2");
		System.out.println( "multiplication: 2*2*2= "+ans);

		
		
		Calculator divnum = new Calculator();
		ans=divnum.Compute("8/2");
		System.out.println( "multiplication: 8/2= "+ans);

		Calculator modnum = new Calculator();
		ans=modnum.Compute("1%2");
		System.out.println( "multiplication: 1%2= "+ans);


    }
}
