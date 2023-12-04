package triagolnik7;

import java.util.Scanner;

public class Triagolnik {

	public static void main(String[] args) {
	double a,b,c;
	Scanner tastatura = new Scanner(System.in);
	System.out.println("Vnesi ja prvata strana");
	a = tastatura.nextDouble();
	System.out.println("Vnesi ja vtorata strana");
	b = tastatura.nextDouble();
	System.out.println("Vnesi ja tretata strana");
	c = tastatura.nextDouble();
	if(a+c>b && a+b>c && b+c>a) {
		System.out.println("Se formira triagolnik");}
	    else {
	    	   System.out.println("Ne se formira triagolnik");
	    	   System.exit(0);
	if(c*c==a*a+b*b | b*b==a*a+c*c | a*a==b*b+c*c)
		   System.out.println("Triagolnikot e pravoagolen");
	else if (c*c>a*a+b*b | a*a>c*c+b*b | b*b>a*a+c*c)
		   System.out.println("Triagolnikot e ostroagolen");
	else
		 System.out.println("Triagolnikot e tapoagolen");
	    }
	}
}
	
	
	
	
	