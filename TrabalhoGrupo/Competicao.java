package TrabalhoGrupo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/** 
 * <H1>Classe da Competição</H1> 
 * <H2>Objetivos:</H2> 
 * <ul style="list-style-type:square">
 * <li>Criar competições</li> 
 * <li>Adicionar equipas a uma competição (individualmente)</li> 
 * <li>Dado um código identificador, eliminar uma equipa da competição</li> 
 * <li>Dado um código identificador, alterar uma equipa da competição</li> 
 * <li>Adicionar jogos a uma competição (individualmente)</li> 
 * <li>Dado um código identificador, eliminar um jogo da competição</li> 
 * <li>Mostrar todas as equipas da competição</li> 
 * <li>Dada uma jornada, mostrar todos os jogos dessa jornada</li> 

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


public class Competicao {
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================

	/**
     * O atributo "codIdent" recebe o Codigo Identificador
     * O atributo "nome" recebe o nome da competição
     * O atributo "dataInicio" recebe a data do inicio da competicão
     * O atributo "dataFim" recebe o final da competição
     * O atributo "escalao" recebe o escalao da competição
     * O atributo "participantes" recebe os participantes da competição

     * A lista "Equipa" recebe a lista de Equipas da competição
     * A lista "Jogo" recebe a lista de jogos da competição
     */
	
	private int codIdent;
	private String nome;
	private Date dataInicio;
	private Date dataFim;
	private String escalao;
	private int participantes;
	private List<Equipa> equipa = new ArrayList<Equipa>();
	private List<Jogo> jogo = new ArrayList<Jogo>();

	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================

	/**
	 * Acessores e modificadores da classe Competicao
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

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public String getEscalao() {
		return escalao;
	}

	public void setEscalao(String escalao) {
		this.escalao = escalao;
	}

	public int getParticipantes() {
		return participantes;
	}

	public void setParticipantes(int participantes) {
		this.participantes = participantes;
	}

	public List<Jogo> getJogos() {
		return jogo;
	}

	public void setJogos(List<Jogo> jogos) {
		this.jogo = jogos;
	
	}

	public void addJogos(Jogo jogos) {
		
	
		this.jogo.add(jogos);
	}

	public List<Equipa> getEquipa() {
		return equipa;
	}

	public void setEquipa(List<Equipa> equipa) {
		this.equipa = equipa;
	}

	public void addEquipas(Equipa equipa) {

		if (codIdentEquipa(equipa.getCodIdent()) >= 0) {
			throw new IllegalArgumentException("A equipa com o código:" + equipa.getCodIdent() + " já existe");

		}

		this.equipa.add(equipa);
	}


	
	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================

	// CONSTRUTOR DEFAULT

	// CONSTRUTOR COM PARÂMETROS

	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================
	
	/**
	 * Esta classe é utilizada para mostrar toda a informação da competição em forma de string
	 * 
	* @return Retorna todas as informacoes numa string chamada mostrar atraves do getNome, getCodIdent, getEscalao, getJogador, getTreinador
	 */
	public String mostrarTudo() {
		
		String mostrar = "";
		mostrar += "======COMPETICAO======" + "\n";

		mostrar += "Codigo: " + this.getCodIdent() + "\n";
		mostrar += "Nome: " + this.getNome() + "\n";
		mostrar += "Escalao: " + this.getEscalao() + "\n";
		mostrar += "Data Inicio: " + this.getDataInicio() + "\n";
		mostrar += "Data Fim: " + this.getDataFim() + "\n";
		mostrar += "Participantes: " + this.getParticipantes() + "\n";
		mostrar += "\n";
		mostrar += this.mostrarEquipas() + "\n";

		return mostrar;

	}
	/**
	 * Esta classe é utilizada para mostrar toda a informação das equipas em forma de string, utilizando um loop
	 * 
	 * @return Retorna todas as informacoes numa string chamada mostrar num loop atravez do mostrarTudo
	 */
	public String mostrarEquipas() {
		String mostrar = "";
		
		for (Equipa equipa : equipa) {
		

			mostrar += equipa.mostrarTudo()+"\n";
		}
		return mostrar;
	}

	/**
	 * Esta classe é utilizada para mostrar toda a informação dos jogos em forma de string, utilizando um loop
	 * 
	 * @return Retorna todas as informacoes numa string chamada mostrar num loop atravez do mostrarTudo
	 * @param jornada
	 */
	
	public String mostrarJogosJornada (int jornada) {
		String mostrar = "";
		
		for (Jogo jogo: jogo) {
			if (jogo.getJornada() == jornada)
				mostrar += jogo.mostrarTudo()+"\n";
		}
		return mostrar;
	}
	
	/**
	 * A função desta classe serve para remover uma equipa dado um código de identificação
	 * @param codIdent
	 */
	
	public boolean removeEquipas(int codIdent) {
		int procurar = codIdentEquipa(codIdent);
		if (procurar == -1)
			return false;
		equipa.remove(procurar);
		return true;
	}

	/**
	 * A função desta classe serve para remover um jogo dado um código de identificação
	 * @param codIdent
	 */
	public boolean removeJogos(int codIdent) {
		int procurar = codIdentEquipa(codIdent);
		if (procurar == -1)
			return false;
		equipa.remove(procurar);
		return true;
	}
	
	/**
	 * A função desta classe serve para editar uma equipa dado um código de identificação
	 * @param codIdent, equipa
	 */
	
	public boolean editarEquipa(int codIdent, Equipa equipa) {
		int procurar = codIdentEquipa(codIdent);
		if (procurar == -1)
			return false;
		this.equipa.set(procurar, equipa);
		return true;
	}
	
	/**
	 * A função desta classe serve para editar um jogo dado um código de identificação
	 * @param codIdent, jogo
	 */
	
	public boolean editarJogo(int codIdent, Jogo jogo) {
		int procurar = codIdentJogo(codIdent);
		if (procurar == -1)
			return false;
		this.jogo.set(procurar, jogo);
		return true;
	}
	
	/**
	 * A função desta classe serve para validar atravez de um loop todos os codigos de identificação na equipa
	 * @param codIdent
	 */
	public int codIdentEquipa(int codIdent) {
		for (int i = 0; i < equipa.size(); i++) {
			if (equipa.get(i).getCodIdent() == codIdent)
				return i;
		}
		return -1;
	}
	
	/**
	 * A função desta classe serve para validar atravez de um loop todos os codigos de identificação no jogo
	 * @param codIdent
	 */ 
	
	public int codIdentJogo(int codIdent) {
		for (int i = 0; i < jogo.size(); i++) {
			if (jogo.get(i).getCodIdent() == codIdent)
				return i;
		}
		return -1;
	}

	/**
	 * Atravez de um loop, vai validar todas as jornadas que existem no jogo
	 * @param Jogo jogo1
	 */
	
	public boolean jornadaJogo (Jogo jogo1) {
		for (Jogo jogo : jogo) {
			if (jogo.getJornada() == jogo.getJornada()) {
				if (jogo.getEquipaVisitada().getCodIdent() == jogo.getEquipaVisitada().getCodIdent())
					return true;
				if (jogo.getEquipaVisitante().getCodIdent() == jogo.getEquipaVisitante().getCodIdent());
					return true;
				
			}
		}
		return false;
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
		return "Competicao [codIdent=" + codIdent + ", nome=" + nome + ", dataInicio=" + dataInicio + ", dataFim="
				+ dataFim + ", escalao=" + escalao + ", participantes=" + participantes + "equipa=" + equipa
				+ ", jogos=" + jogo + "]";
	}

	// ----> equals()

}
