package entidade;

public class Conta {
	
	private double saldo;
	private String nome;
	private String cpf;
	private String numeroConta;
	
	
	
	public Conta(double saldo, String nome, String cpf, String numeroConta) {
		this.saldo = saldo;
		this.nome = nome;
		this.cpf = cpf;
		this.numeroConta = numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
		
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
		
	}
	public String getNome() {
		return nome;
		
	}
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	public String getCpf() {
		return cpf;
		
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
		
	}
	public String getNumeroConta() {
		return numeroConta;
		
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
		
	}
	
	public double depositar(double quantia) {
		saldo = saldo + quantia;
		return saldo;
	}
	
	public double Saque(double quantia) {
		if(quantia <= saldo) {
			saldo = saldo - quantia;
			return saldo;
		}else {
			System.out.println("Vc tem que fazer um saque menor que o seu saldo ");		
		}
			return saldo;
		}
	
	public void informarConta() {
		System.out.println("NumeroConta: " + getNumeroConta());
		System.out.println("CPF: " + getCpf());
		System.out.println("Nome: " + getNome());
		System.out.println("Saldo: " + getSaldo());		
	}

	
	
	
	
}
