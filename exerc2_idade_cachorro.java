import java.util.Scanner;
public class Main {
	public static void main(String[] args){
	System.out.println("informe a idade do seu cachorro");
	Scanner in = new Scanner(System.in);
		
	int idadeCachorro = in.nextInt();
    idadeCachorro = idadeCachorro * 7;

	System.out.println("O seu cachorro tem"+idadeCachorro+"anos.");

	}
}
