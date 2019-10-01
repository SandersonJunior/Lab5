package lab5;

import easyaccept.EasyAccept;

public class Facade {
	
	ClienteController cc = new ClienteController();
	
	public static void main(String[] args) {
		args = new String[] { "lab5.Facade", "testeAceitacao/use_case_1.txt" };
		EasyAccept.main(args);
	}
	
	public String adicionaCliente(String cpfCliente, String nomeCliente, String emailCliente, String localizacaoCliente) {
		 return cc.cadastraCliente(cpfCliente, nomeCliente, emailCliente, localizacaoCliente);
	}
}
