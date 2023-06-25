package proyectobyteBank;

public class TestReferencia {
	
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 200;
		
		Cuenta segundaCuenta = primeraCuenta;
		segundaCuenta.saldo = 100;
		
		System.out.println("Saldo primera "
				+ " Cuenta: "+ primeraCuenta.saldo);
		
		System.out.println("Saldo ssegundo "
				+ " Cuenta: "+ segundaCuenta.saldo);
		
		segundaCuenta.saldo += 400;
		System.out.println("saldo primera "
				+ " Cuenta: "+ primeraCuenta.saldo);
		
		//System.out.println(primeraCuenta);
		//System.out.println(segundaCuenta);
		
		
	}

}
