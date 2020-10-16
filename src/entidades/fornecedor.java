package entidades;


 public class fornecedor extends pessoa{
		
	 
		private double valorCredito;
		private double valorDivida ;
		public fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida)
		{
			super(nome, endereco, telefone);
			this.valorCredito = valorCredito;
			this.valorDivida = valorDivida;
		}
		
		
		public double getValorCredito() {
			return valorCredito;
		}
		
		public void setValorCredito(double valorCredito) {
			this.valorCredito = valorCredito;
		}
		
		public double getValorDivida() {
			return valorDivida;
		}
		
		
		public void setValorDivida(double valorDivida) {
			this.valorDivida = valorDivida;
		}

		public void obterSaldo() {
			 
			 if(valorCredito==300 && valorDivida==150) {
				 
				 System.out.println("Você tem R$ 150,00 de Saldo");
				 
				 
				 
			 } 
		}
		
	 
		
 }
		
	