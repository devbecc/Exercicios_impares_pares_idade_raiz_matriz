package Aplicacao;

import entidades.administrador;
import entidades.fornecedor;
import entidades.pessoa;

public class SistemaCadastro {

public SistemaCadastro() {
		 
	}

	public static void main(String[] args) {
	  
		System.out.println("=======Cadastro======");
		
	pessoa pessoa1 = new pessoa("Rebecca","Rua Goias","119587611**")	;
	fornecedor fornecedor1= new fornecedor("Fornecedor: Perseu", "Localizado: Sezefredo Fagundes", "tel:115846545", 300, 150);
	administrador administrador1= new administrador("Vendedor: Sandrão","Localizado: Tucuruvi","tel: 56895464",1000);
	
	 
	System.out.println(pessoa1.getNome());
	System.out.println(pessoa1.getEndereco());
	System.out.println(pessoa1.getTelefone());

	 
	System.out.println(fornecedor1.getNome());
	System.out.println(fornecedor1.getEndereco());
	System.out.println(fornecedor1.getTelefone());
	

	System.out.println(administrador1.getNome());
	System.out.println(administrador1.getEndereco());
	System.out.println(administrador1.getTelefone());
	System.out.println(administrador1.getAjudaDeCusto());
 
	
   fornecedor1.obterSaldo();
	
	}

}
