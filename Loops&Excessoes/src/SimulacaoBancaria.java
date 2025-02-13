import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			double saldo = 0; 
    
			while (true) { 

			    int opcao = scanner.nextInt(); 
			
			    switch(opcao){
			      
			      case 1:
			        double deposito = scanner.nextDouble();
			        saldo += deposito;
			        System.out.println("Saldo atual:  "+saldo);
			        break;
			        
			      case 2:
			        double valorSaque = scanner.nextDouble();
			        if(valorSaque > saldo){
			        System.out.println("Que pena, saldo insuficiente.");
			        }
			        else {
			          saldo -= valorSaque;
			          System.out.println("Saldo atual: "+saldo);
			        }
			        break;
			      
			      case 3:
			        System.out.println("Saldo atual:  "+saldo);
			    
			        break;
			      
			      case 0:
			        System.out.println("Programa encerrado.");
			        return;
			      
			      default:
			        System.out.println("Opção inválida. Tente novamente."); 
			        break;
			    }
			    
			    }
		}
            
        }
    }