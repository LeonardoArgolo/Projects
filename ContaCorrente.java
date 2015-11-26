package entidades;

public class ContaCorrente extends Conta {
	
	public void atualizar(double percentual) {
		super.atualizar(percentual * 2);
	}
	
	public void depositar(double valor) {
		valor -= 0.1;
		super.depositar(valor);
	}
	public void sacar(double valor){
		valor-=valor-10.0	
	}
	
	
}
