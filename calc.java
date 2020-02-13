import java.util.Scanner;

public class Main {
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	double num1, num2, soma, subtracao, multi;
	
	System.out.println("Insira um numero");
	num1 = in.nextDouble();
	
	System.out.println("Insira um numero");
	num2 = in.nextDouble();
	
	soma = num1 + num2;
	System.out.println("Sua soma é" + soma);

	subtracao = num1 / num2;
	System.out.println("Sua subtracao é" + subtracao );

	multi = num1 * num2;
	System.out.println("Sua multiplicação é" + multi);


	

	}
}
