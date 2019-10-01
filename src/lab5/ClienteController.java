package lab5;

import java.util.*;

/**
 * O SAGA (Sistema para Auto-Gestão de comércio de Alimentos) foi desenvolvido
 * gerenciar a comercialização de lanches que acontece em alguns laboratórios de
 * graduação de uma universidade, para isso o SAGA precisa efetuar o que
 * chamamos de "CRUD" (Create, Read, Update e Delete) de cada objeto criado no
 * programa, tais como cradastrar, ler, editar e excluir: Clientes, Fonecedores
 * e Produtos de Fornecedores.
 * 
 * @author Sanderson Cezar Agusto Junior
 *
 */
public class ClienteController {
	/**
	 * Um mapa de clientes, onde cada Cliente será identificado unicamente através
	 * de seu CPF.
	 */
	private HashMap<String, Cliente> clientes = new HashMap<>();

	/**
	 * Retorna a NÃO existencia de um Cliente no mapa de clientes utilizando seu cpf
	 * como chave de busca.
	 * 
	 * @param cpfCliente O CPF do cliente. Utilizado para verificar se ele está no
	 *                   mapa de clientes.
	 * @return True, se o Cliente não estiver cadastrado no mapa de clientes. False,
	 *         se o Cliente estiver cadastrado no mapa de clientes.
	 */
	public boolean naoContemCliente(String cpfCliente) {
		boolean retorno = false;
		if (!this.clientes.containsKey(cpfCliente)) {
			retorno = true;
		}
		return retorno;
	}

	/**
	 * Aqui é realizado o cadastro de cada cliente, que será colocado no mapa de
	 * clientes, onde o Cliente será identificado unicamente através de seu CPF.
	 * 
	 * @param cpfCliente         CPF do Cliente.
	 * @param nomeCliente        Nome do Cliente.
	 * @param emailCliente       Email do Cliente.
	 * @param localizacaoCliente Localização do Cliente dentro da Universidade.
	 * 
	 * @return CPF do cliente, caso o cliente seja cadastrado com sucesso, ou a
	 *         mensagem "Cliente Não Cadastrado", caso o cliente nao seja cadastrado
	 *         com sucesso.
	 *         
	 * @throws IllegalAccessException 
	 */
	public String cadastraCliente(String cpfCliente, String nomeCliente, String emailCliente,
			String localizacaoCliente) throws IllegalAccessException {
		String saida = "";
		
		if (cpfCliente != null || cpfCliente.trim().equals("")) {
			throw new IllegalAccessException("");
			
		} else if (naoContemCliente(cpfCliente)) {
			this.clientes.put(cpfCliente, new Cliente(cpfCliente, nomeCliente, emailCliente, localizacaoCliente));
			saida = cpfCliente;
		} else {
			saida = "Cliente Não Cadastrado";
		}

		return saida;
	}

	/**
	 * Aqui é realizado a listagem de todos os clientes utilizando o toString de
	 * Cliente.
	 * 
	 * @return O to String de todos os Cliente existentes no mapa de clientes. Como
	 *         temos que ter um separador " | " depois de cada cliente listado,
	 *         obviamente o ultimo cliente listado terá esse separador, e não
	 *         queremos que iss aconteça, então utilizamos uma forma de retirar os 3
	 *         ultimos caracteres referentes ao separador do ultimo Cliente.
	 */
	public String listarClientes() {
		String saida = "";

		for (Cliente cliente : clientes.values()) {
			saida += cliente.toString() + " | ";

		}

		saida = saida.substring(0, saida.length() - 3);

		return saida;
	}

}
