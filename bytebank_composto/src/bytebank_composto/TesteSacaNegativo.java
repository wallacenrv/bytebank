package bytebank_composto;

public class TesteSacaNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta conta = new Conta ();
		conta.deposita(100);
		conta.saca(300);
		System.out.println(conta.getSaldo());
		
	}

}
