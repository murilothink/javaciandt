
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int num;
	    System.out.println("Digite algo aqui");
	    
	    Scanner in = new Scanner(System.in);
	    
	    num = in.nextInt();
	    
	    if(num == 10){
	        System.out.println("Hello World");
	    }else{
	        System.out.println("tente novamente");
	    }
	}
}
