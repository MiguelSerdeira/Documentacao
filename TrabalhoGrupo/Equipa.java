package TrabalhoGrupo;

import java.util.ArrayList;
import java.util.List;

/** 
 * <H1>Classe das Equipas</H1> 
 * <H2>Objetivos:</H2> 
 * <ul style="list-style-type:square">
 * <li>Criar equipas.</li> 
 * <li>Mostrar todas as informacoes de uma equipa.</li> 
 * <li>Dado um número de cartão de cidadão, eliminar um jogador/treinador da equipa</li>
 * <li>Dado um número de cartão de cidadão, alterar um jogador/treinador da equipa.</li>
 * <li>Mostrar a lista de jogadores ordenada alfabeticamente pelo nome. </li>
 * </ul> 
 * <br> 
 * 
 *
 *
 * @author Hugo, Manuel e Miguel 
 *
 * 
 * 
 */
public class Equipa {

	
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================

	
	/**
	 * O atributo "codIdent" recebe o Codigo Identificador
	 * O atributo "nome" recebe o nome da equipa
	 * O atributo "escalao" recebe o escalao da equipa
	 * A lista "Jogador" recebe a lista de jogadores da equipa
	 * A lista "Treinador" recebe a lista de treinador da equipa
	 */

	private int codIdent;
	private String nome;
	private String escalao;
	private List<Jogador> jogador = new ArrayList<Jogador>();
	private List<Treinador> treinador = new ArrayList<Treinador>();

	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================
	/**
	 * Acessores e modificadores da classe Equipa
	 * 
	 */
	public int getCodIdent() {
		return codIdent;
	}

	public void setCodIdent(int codIdent) {
		this.codIdent = codIdent;
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEscalao() {
		return escalao;
	}

	public void setEscalao(String escalao) {
		this.escalao = escalao;
	}

	public List<Jogador> getJogador() {
		return jogador;
	}

	public void setJogador(List<Jogador> jogador) {
		this.jogador = jogador;
	}

	public void addJogador(Jogador jogador) {
		this.jogador.add(jogador);

	}

	public List<Treinador> getTreinador() {
		return treinador;
	}

	public void setTreinador(List<Treinador> treinador) {
		this.treinador = treinador;
	}

	public void addTreinador(Treinador treinador) {
		this.treinador.add(treinador);
	}
	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================

	// CONSTRUTOR DEFAULT

	// CONSTRUTOR COM PARÂMETROS

	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================
	
	/** Comportamento que permite mostrar todas as informacoes da equipa
	 * @return Retorna todas as informacoes da equipa atraves do getNome, getCodIdent, getEscalao, getJogador, getTreinador
	 */
	public String mostrarTudo() {
		String mostrar = "";
		mostrar += "======EQUIPA======" + "\n";

		mostrar += "Equipa: " + this.getNome() + "\n";
		mostrar += "Codigo: " + this.getCodIdent() + "\n";
		mostrar += "Escalao: " + this.getEscalao() + "\n";
		mostrar += "Jogadores: " + this.getJogador().size() + "\n";
		mostrar += "Treinadores: " + this.getTreinador().size() + "\n";
		return mostrar;
	}

	
	
	/**
	 * Esta funcao serve para mostrar os Jogadores de uma equipa
	 * 
	 * @return Faz return de "Mostrar" que e uma variavel onde ficam guardados todos os Jogadores em forma de string
	 */
	public String mostrarJogadores() {
		String mostrar = "";

		this.jogador.sort(null);
		for (Jogador jogador : jogador) {
			mostrar += jogador.mostrarTudo();
		}
		return mostrar;
	}

	
	
	
	/** 
	 * Esta funcao serve para mostrar os Treinadores de uma equipa
	 * @return Faz return da variavel mostrar onde estao guardados todos os Treinadores em forma de string
	 */
	public String mostrarTreinadores() {
		String mostrar = "";

		this.jogador.sort(null);
		for (Treinador treinador : treinador) {
			mostrar += treinador.mostrarTudo();
		}
		return mostrar;
	}

	
	
	/**
	 * Esta funcao serve para remover Jogadores atraves do seu cartao de cidadao
	 * @param numeroCartaoCidadao 
	 * 
	 */
	public boolean removeJogador(int numeroCartaoCidadao) {
		int procurar = cidadaoJogador(numeroCartaoCidadao);
		if (procurar == -1)
			return false;
		this.jogador.remove(procurar);
		return true;
	}
	/**
	 * Esta funcao serve para remover Treinadores atraves do seu cartao de cidadao
	 * @param numeroCartaoCidadao 
	 * 
	 */
	public boolean removeTreinador(int numeroCartaoCidadao) {
		int procurar = cidadaoTreinador(numeroCartaoCidadao);
		if (procurar == -1)
			return false;
		this.treinador.remove(procurar);
		return true;
	}
	/**
	 * Esta funcao serve para editar Jogadores atraves do seu cartao de cidadao
	 * @param numeroCartaoCidadao, jogador 
	 * 
	 */
	public boolean editarJogador(int numeroCartaoCidadao, Jogador jogador) {
		int procurar = cidadaoJogador(numeroCartaoCidadao);
		if (procurar == -1)
			return false;
		this.jogador.set(procurar, jogador);
		return true;
	}
	/**
	 * Esta funcao serve para editar Treinadores atraves do seu cartao de cidadao
	 * @param numeroCartaoCidadao, Treinadores
	 * 
	 */
	public boolean editarTreinador(int numeroCartaoCidadao, Treinador treinador) {
		int procurar = cidadaoTreinador(numeroCartaoCidadao);
		if (procurar == -1)
			return false;
		this.treinador.set(procurar, treinador);
		return true;
	}

	
	
	
	
	/**
	 * Um loop de uma lista para validar os cartoes de cidadao dos Jogadores
	 * @param numeroCartaoCidadao
	 * @return Retorna "-1" se o cartao nao for valido
	 */
	
	public int cidadaoJogador(int numeroCartaoCidadao) {
		for (int i = 0; i < jogador.size(); i++) {
			if (jogador.get(i).getNumeroCartaoCidadao() == numeroCartaoCidadao)
				return i;
		}
		return -1;
	}

	
	
	
	
	
	
	/**
	 * Um loop de uma lista para validar os cartoes de cidadao dos treinadores
	 * @param numeroCartaoCidadao
	 * @return Retorna "-1" se o cartao nao for valido
	 */
	public int cidadaoTreinador(int numeroCartaoCidadao) {
		for (int i = 0; i < treinador.size(); i++) {
			if (treinador.get(i).getNumeroCartaoCidadao() == numeroCartaoCidadao)
				return i;
		}
		return -1;
	}

	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
	// =======================================================

	// ----> toString()
	/**
	 * Este metodo serve para visualizar os valores dos atributos na class "main"
	 */
	@Override
	public String toString() {
		String mostrar = "";

		mostrar += "\n";
		mostrar += "Equipa: " + this.getNome() + "\n";
		mostrar += "Codigo: " + this.getCodIdent() + "\n";
		mostrar += "Escalao: " + this.getEscalao() + "\n";
		mostrar += "Jogadores: " + this.getJogador().size() + "\n";
		mostrar += "Treinadores: " + this.getTreinador().size() + "\n";
		return mostrar;
	}

	// ----> equals()
}
