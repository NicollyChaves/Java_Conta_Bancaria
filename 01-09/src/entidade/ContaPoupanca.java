package entidade;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(double saldo, String nome, String cpf, String numeroConta) {
		super(saldo, nome, cpf, numeroConta);
	}


	private double percentualRendimento = 0.1;
	
	
	public double getPercentualRendimento() {
		return percentualRendimento;
	}


	public void setPercentualRendimento(double percentualRendimento) {
		this.percentualRendimento = percentualRendimento;
	}

	
	public double AtualizarSaldo() {
		double percentual;
		percentual = getSaldo() * percentualRendimento;
		super.setSaldo(getSaldo() + percentual);
		return getSaldo();
	}
	
	@Override
	public void informarConta() {
		System.out.println("NumeroConta: " + getNumeroConta());
		System.out.println("CPF: " + getCpf());
		System.out.println("Nome: " + getNome());
		System.out.println("Saldo: " + getSaldo());		
	}
}
