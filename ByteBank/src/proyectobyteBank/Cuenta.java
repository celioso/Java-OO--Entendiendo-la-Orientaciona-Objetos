package proyectobyteBank;

//entidad cuenta:

class Cuenta{
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	// Noretorna valor
	public void depositar(double valor){
		//Esta cuenta	Esta Cuenta	
		//this account 	this account
		//this object
		this.saldo = this.saldo + valor;
	}
	
	//retorna valor
	public boolean retirar(double valor){
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		}
		else {
			return false;
		}
	}
}

