import java.util.Scanner;
    public class Main {
        public static void main(String joel[]){
            System.out.println("Bruno vai ser efetivado?");
            Scanner ans = new Scanner(System.in);
            String response = ans.nextLine();
            while (true) {
                if (response.equalsIgnoreCase("Sim")){
                    System.out.println("Parabéns");
                    break;
                }else if(response.equalsIgnoreCase("Não")){
                    System.out.println("Dê parabéns para Bruno por completar 6 anos de estagio");
                    break;
                }else{  
                    System.out.println("Tente Novamente! Bruno vai ser efetivado?");
                }    response = ans.nextLine();
            }
        }
    }    
