package java_Project;

import java.util.Scanner;

public class criaContas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner leia = new Scanner(System.in);
		
		conta conta01 = new conta();
		
		int escolha;
		
		System.out.println("Seja Bem-Vindo ao ByteBank");
		System.out.println("Operações disponiveis:");
		System.out.println("1 - Deposito");
		System.out.println("2 - Saque");
		System.out.println("3 - Transferencia");
		System.out.print("Digite a opção desejada : ");
		escolha = leia.nextInt();
		
		switch(escolha) {
			case 1:
				conta01.Deposita();
			break;
			
			case 2:
				conta01.Saca();
			break;
			
			case 3:
				conta01.Transferi();
			break;
		}
		
		
		
	}

}
