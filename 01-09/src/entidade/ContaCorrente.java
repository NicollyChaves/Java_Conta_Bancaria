package entidade;

public class ContaCorrente extends Conta {

	public ContaCorrente(double saldo, String nome, String cpf, String numeroConta) {
		super(saldo, nome, cpf, numeroConta);
	}

	private double tarifaMensal = 25;

	public double getTarifaMensal() {
		return tarifaMensal;
	}

	public void setTarifaMensal(double tarifaMensal) {
		this.tarifaMensal = tarifaMensal;
	}
	
	@Override
	public void informarConta() {
		System.out.println("NumeroConta: " + getNumeroConta());
		System.out.println("CPF: " + getCpf());
		System.out.println("Nome: " + getNome());
		System.out.println("Saldo: " + getSaldo());		
	}
	
	public Double tarifaMensal() {
		super.setSaldo(getSaldo() - tarifaMensal);
		return getSaldo();
	}
	
}
