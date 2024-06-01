package aplicacao;

import java.util.Scanner;

import entidade.Conta;
import entidade.ContaCorrente;
import entidade.ContaPoupanca;
import entidade.Lucros;

public class programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			
			System.out.print("Digite o seu saldo: ");
			double saldo = sc.nextDouble();
			
			System.out.print("Digite o seu nome ");
			String nome = sc.next();
			
			System.out.print("Digite o seu CPF ");
			String cpf= sc.next();
			
			System.out.print("Digite o numero da sua conta: ");
			String numeroConta = sc.next();
			
			Conta cont1 = new Conta(saldo,nome ,cpf ,numeroConta);
			
			System.out.println("Voce deseja fazer um deposito? (s/n) ");
			char resposta = sc.next().charAt(0);
			
			if(resposta == 's') {
				System.out.println("Quanto vc deseja depositar? ");
				double depositar = sc.nextDouble();
				cont1.depositar(depositar);		
			}
			
			System.out.println("Voce deseja fazer um saque? (s/n) ");
			char resposta2 = sc.next().charAt(0);
			
			if(resposta2 == 's') {
				System.out.println("Quanto vc deseja sacar? ");
				double sacar = sc.nextDouble();
				cont1.Saque(sacar);		
			}
			
			cont1.informarConta();			
			
			System.out.print("Digite o seu saldo da sua contaPoupanca: ");
			double saldoPou = sc.nextDouble();
			
			System.out.print("Digite o seu nome ");
			String nomepou = sc.next();
			
			System.out.print("Digite o seu CPF ");
			String cpfpou = sc.next();
			
			System.out.print("Digite o numero da sua conta: ");
			String numeroContapou = sc.next();
			
			ContaPoupanca cont2 = new ContaPoupanca(saldoPou,nomepou ,cpfpou ,numeroContapou);
			System.out.println("Voce deseja fazer um deposito? (s/n) ");
			char respostapou = sc.next().charAt(0);
			
			if(resposta == 's') {
				System.out.println("Quanto vc deseja depositar? ");
				double depositar = sc.nextDouble();
				cont2.depositar(depositar);		
			}
			
			System.out.println("Voce deseja fazer um saque? (s/n) ");
			char respostapou2 = sc.next().charAt(0);
			
			if(resposta2 == 's') {
				System.out.println("Quanto vc deseja sacar? ");
				double sacar = sc.nextDouble();
				cont2.Saque(sacar);		
			}
			
			cont2.AtualizarSaldo();
			
			cont2.informarConta();
			
			
			
			System.out.print("Digite o seu saldo: ");
			double saldoco = sc.nextDouble();
			
			System.out.print("Digite o seu nome ");
			String nomeco = sc.next();
			
			System.out.print("Digite o seu CPF ");
			String cpfco = sc.next();
			
			System.out.print("Digite o numero da sua conta: ");
			String numeroContaco = sc.next();
			
			ContaCorrente cont3 = new ContaCorrente(saldo,nome ,cpf ,numeroConta);
			System.out.println("Voce deseja fazer um deposito? (s/n) ");
			char respostaco = sc.next().charAt(0);
			
			if(resposta == 's') {
				System.out.println("Quanto vc deseja depositar? ");
				double depositar = sc.nextDouble();
				cont3.depositar(depositar);		
			}
			
			System.out.println("Voce deseja fazer um saque? (s/n) ");
			char respostaco2 = sc.next().charAt(0);
			
			if(resposta2 == 's') {
				System.out.println("Quanto vc deseja sacar? ");
				double sacar = sc.nextDouble();
				cont3.Saque(sacar);		
			}
			
			cont3.tarifaMensal();
			
			cont3.informarConta();
			
			 Lucros lucros = new Lucros();
			 lucros.registra(cont1, cont3, cont2);
			
			
			
			
			
		}
		
			
		
		
		
	}


