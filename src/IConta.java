// Uma interface - N�o � necess�ria pode se usar outros metodos
public interface IConta {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, IConta contaDestino); // Polimorfismo
	
	void imprimirExtrato();
}
