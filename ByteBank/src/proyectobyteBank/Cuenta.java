package proyectobyteBank;

//entidad cuenta:

class Cuenta{
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	// No retorna valor
	public void depositar(double valor){
		//Esta cuenta	Esta Cuenta	
		//this account 	this account
		//this object
		this.saldo += valor;
	}
	
	//Retorna valor
	public boolean retirar(double valor){
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean transferir(double valor, 
							Cuenta cuenta){
		if (this.saldo >= valor){
			this.saldo = this.saldo - valor;
			cuenta.depositar(valor);
			return true;	
		}
		else {
			return false;
		}
	}
	public double obtenerSaldo(){
		return this.saldo;
	}
}

