package java_Project;

import java.util.Scanner;

public class conta {
		
		
		
		int conta=0, valor=0, agencia=0, escolha;
		
		Scanner leia = new Scanner(System.in);
		
		
		
		//MÉTODOS
		
		
		
		public void Deposita() {
			
			System.out.println("Digite a agência e conta para o qual deseja transferir");
			System.out.print("Agência : ");
			agencia = leia.nextInt();
			System.out.print("Conta : ");
			conta = leia.nextInt();
			System.out.println("");
			System.out.println("Qual valor deseja transferir?");
			System.out.println("Valor : R$");
			valor = leia.nextInt();
			System.out.println("A QUANTIA DE R$"+this.valor+" Foi transferida com sucesso!");
			
		}
		
		public void Saca() {
			System.out.println("Saca");
		}
		
		public void Transferi() {
			System.out.println("Transferi");
		}
		
		
}



