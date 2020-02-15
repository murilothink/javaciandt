import java.util.Scanner;
    public class Main {
        public static void main(String[] args){
        
            Scanner in = new Scanner(System.in);
            double num1, num2, soma, subtracao;
        
        
            System.out.println("Digite o numero");
            num1 = in.nextDouble();
        
            System.out.println("Digite o numero");
            num2 = in.nextDouble();
        
            soma = num1 + num2;
            System.out.println("O resutado da soma é" + soma);
        
            subtracao = (soma/2);
            System.out.println("O resutado da subtracao é" + subtracao);
        
            if (subtracao < 6){
                System.out.print("Reprovado");
            }else{
                System.out.print("Parabéns aprovado");
                
            }    
        }    
    }    
