package bytebank_composto;

public class TestaBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "026.477.301.21";
		paulo.profissao = "Militar";	
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		
		
		contaDoPaulo.titular=paulo;
		
		System.out.println(contaDoPaulo.titular.nome);
	}

}
