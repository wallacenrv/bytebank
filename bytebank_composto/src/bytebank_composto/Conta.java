package bytebank_composto;


public class Conta {


		private double saldo = 100;
		 int agencia;
		 int numero;
		 Cliente titular; 
		
	
		public void deposita( double valor) {
			this.saldo = (this.saldo + valor );
		
		}
		
		public boolean saca (double valor) {
			if (saldo >= valor) {
				this.saldo = (this.saldo - valor);
				//this.saldo -= valor;
				
				return true;
			} else
				System.out.println("Saldo Insuficente");
				return false;
			
		}
		
		public boolean transfere(double valor, Conta destino) {
			if (this.saldo >= valor) {
				this.saldo -= valor;
				destino.deposita((valor));
				return true;
			}else {
				return false;
			}
		}
		
		public double getSaldo() {
		return this.saldo; }
		
	
		
		
			
		}
		





  