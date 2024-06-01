package entidade;
import entidade.Conta;

public class Lucros {
	
	private double soma;

	public double getSoma() {
		return soma;
	}

	public void setSoma(double soma) {
		this.soma = soma;
	}
	
	public void registra(Conta c, ContaCorrente c2, ContaPoupanca c3) {
		
		soma = c.getSaldo() + c2.getSaldo() + c3.getSaldo() ;
		System.out.println("Sua conta total deu " + soma);
	}
	
	
	
}
