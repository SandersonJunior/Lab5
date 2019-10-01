package lab5;

/**
 * O Cliente é responsável por representar um cliente que será identificado
 * unicamente através de seu CPF. Além do CPF, o clitente terá um nome, email, e
 * localização dentro da universidade.
 * 
 * @author Sanderson Cezar Agusto Junior
 *
 */
public class Cliente {
	/**
	 * CPF do Cliente. Utilizado como forma principal de identificação do Cliente.
	 */
	private String cpfCliente;
	/**
	 * Nome do Cliente.
	 */
	private String nomeCliente;
	/**
	 * Email do Cliente.
	 */
	private String emailCliente;
	/**
	 * Localização do Cliente. Referente ao nome do local onde trabalham, exemplo:
	 * LSD, LSI, SPLab, etc.
	 */
	private String localizacaoCliente;

	/**
	 * Constroi um Cliente a pastir de seu CPF, nome, email e localização.
	 * 
	 * @param cpfCliente         CPF do Cliente.
	 * @param nomeCliente        Nome do Cliente.
	 * @param emailCliente       Email do Cliente.
	 * @param localizacaoCliente Localização do Cliente dentro da Universidade.
	 */
	public Cliente(String cpfCliente, String nomeCliente, String emailCliente, String localizacaoCliente) {
		this.cpfCliente = cpfCliente;
		this.nomeCliente = nomeCliente;
		this.emailCliente = emailCliente;
		this.localizacaoCliente = localizacaoCliente;
	}

	/**
	 * Pega o nome do Cliente.
	 * 
	 * @return nomeCliente. O nome do Cliente.
	 */
	public String getNomeCliente() {
		return nomeCliente;
	}

	/**
	 * Pega o email do Cliente.
	 * 
	 * @return emailCliente. O email do Cliente
	 */
	public String getEmailCliente() {
		return emailCliente;
	}

	/**
	 * Pega a localização do Cliente.
	 * 
	 * @return localizaçãoCliente. A Localização do Cliente
	 */

	public String getLocalizacaoCliente() {
		return localizacaoCliente;
	}

	/**
	 * void setNomeCliente(String nomeCliente) { this.nomeCliente = nomeCliente; }
	 * 
	 * public void setEmailCliente(String emailCliente) { this.emailCliente =
	 * emailCliente; }
	 * 
	 * public void setLocalizacaoCliente(String localizacaoCliente) {
	 * this.localizacaoCliente = localizacaoCliente; }
	 */
	
	@Override
	public String toString() {
		return getNomeCliente() + " - " + getLocalizacaoCliente() + " - " + getEmailCliente();
	}
}
