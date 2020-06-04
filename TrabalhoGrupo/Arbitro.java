package TrabalhoGrupo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <H1>Classe dos Arbitros</H1>
 * <H2>Objetivos:</H2>
 * <ul style="list-style-type:square">
 * <li>Criar arbitros.</li>
 * <li>Mostrar todas as informacoes de um arbitro.</li>
 * </ul>
 * <br>
 * Esta classe herda atributos e funcoes da classe: Pessoa
 * 
 * 
 * @author Hugo, Manuel e Miguel
 * 
 * 
 * 
 */
public class Arbitro extends Pessoa {

	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================

	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================

	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================

	// CONSTRUTOR DEFAULT

	// CONSTRUTOR COM PARÂMETROS

	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================
	/**
	 * Esta funcao serve para escrever as informacoes dos arbitros
	 * 
	 * @return Retorna todas as informacoes sobre o arbitro para uma string chamada mostrar atraves do getNome, getContacto, getEmail, getNumeroCartaoCidadao, getDataNascimento
	 */
	public String mostrarTudo() {
		String mostrar = "";
		mostrar += "======ARBITRO======" + "\n";

		mostrar += "Nome: " + this.getNome() + "\n";
		mostrar += "Contato: " + this.getContacto() + "\n";
		mostrar += "Email: " + this.getEmail() + "\n";
		mostrar += "Cartão de cidadão: " + this.getNumeroCartaoCidadao() + "\n";
		mostrar += "Data de Nascimento: " + this.getDataNascimento() + "\n";

		return mostrar;
	}

	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
	// =======================================================

	// ----> toString()

	// ----> equals()
}
