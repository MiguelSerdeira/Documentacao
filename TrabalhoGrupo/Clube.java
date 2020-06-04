package TrabalhoGrupo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/** 
 * <H1>Classe dos Clubes</H1> 
 * <H2>Objetivos:</H2> 
 * <ul style="list-style-type:square">
 * <li>Criar clubes</li> 
 * <li>Dado um código identificador, eliminar uma equipa do clube</li> 
 * <li>Dado um código identificador, alterar uma equipa do clube</li> 
 * <li>Saber quantos jogadores o clube tem no total</li> 
 * <li>Saber quantos treinadores o clube tem no total</li> 
 * </ul> 
 * <br> 
 *  
 *
 * @author Hugo, Manuel e Miguel 
 *
 * 
 */
public class Clube {
	  // =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================
	/**
     * O atributo "codIdent" recebe o código Identificador 
     * O atributo "nome" recebe o nome do clube
     * O atributo "dataFundacao" recebe a data de fundacao do clube
     * O atributo "corEquipamente" recebe a cor do equipamento do clube
     * A lista "Equipa" recebe a lista de equipas do clube
     * O atributo "email" recebe o email do clube
     * O atributo "contacto" recebe o contacto do clube
     * O atributo "morada" recebe o contacto do clube
     */

	private int codIdent;
	private String nome;
	private Date dataFundacao; 
	private String corEquipamento;
	private int contato;
	private String email;
	private String morada;
	private List<Equipa> equipa = new ArrayList<Equipa>();


    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================
	/**
	 *Acessores e modificadores da classe Clube 
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
	public Date getDataFundacao() {
		return dataFundacao;
	}
	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	public String getCorEquipamento() {
		return corEquipamento;
	}
	public void setCorEquipamento(String corEquipamento) {
		this.corEquipamento = corEquipamento;
	}
	public int getContato() {
		return contato;
	}
	public void setContato(int i) {
		this.contato = i;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMorada() {
		return morada;
	}
	public void setMorada(String morada) {
		this.morada = morada;
	}
	public List<Equipa> getEquipa() {
		return equipa;
	}
	public void setEquipa(List<Equipa> equipa) {
		this.equipa = equipa;
	}
	
	
	
	/**
	 * função para adicionar equipas atraves do código identificador e caso haja um código repetido 
	 * somos avisados que existe uma equipa com esse código
	 * @param equipa
	 */
	
	public void addEquipas(Equipa equipa) {

		if (codIdentEquipa(equipa.getCodIdent()) >= 0) {
			throw new IllegalArgumentException("A equipa com o código: " + equipa.getCodIdent() + " já existe");
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
	 * Esta função serve para mostrar todas as informações do clube
	 * 
	 * @return Retorna todas as informacoes sobre o o clube para uma string chamada mostrar atraves do getNome, getCodIdent, getEquipa, getEmail, getMorada, getContato, getCorEquipamento, getDataFundacao
	 */
	public String mostrarTudo() {
		String mostrar = "";
		mostrar += "======CLUBE======"+ "\n";
		mostrar += "Clube: " + this.getNome() + "\n"; 
		mostrar += "código: " + this.getCodIdent() + "\n";
		mostrar += "Equipas : " + this.getEquipa() + "\n";
		mostrar += "Email: " + this.getEmail() + "\n";
		mostrar += "Morada: " + this.getMorada() + "\n";
		mostrar += "Contacto: " + this.getContato() + "\n";
		mostrar += "Cor do Equipamento: " + this.getCorEquipamento() + "\n";
		mostrar += "Data de Fundação: " + this.getDataFundacao() + "\n";

		return mostrar;

	}
	/**
	 * Esta função serve para saber o numero total de jogadores
	 * @return Retorna o numero total de jogadores
	 */
	public int nTotalJogadores () {
       
		int nmrJogadores = 0;
        for (Equipa equipa : this.equipa) {
            nmrJogadores += equipa.getJogador().size();
        }
        return nmrJogadores;
    }
	/**
	 * Esta função serve para saber o numero total de treinadores
	 * @return Retorna o numero total de treinadores
	 */
	public int nTotalTreinadores () {
        int nmrTreinadores = 0;
        for (Equipa equipa : this.equipa) {
        	nmrTreinadores += equipa.getTreinador().size();
        }
        return nmrTreinadores;
    }
	/**
	 * Esta função serve para remover Equipas atraves do seu código identificador
	 * 
     * @param codIdent 
	 */
	public boolean removeEquipa(int codIdent) {
		int procurar = codIdentEquipa(codIdent);
		if (procurar == -1)
			return false;
		this.equipa.remove(procurar);
		return true;
	}
	/**
	 * Esta função serve para editar Equipas atraves do seu código identificador
	 * @param codIdent, equipa
	 * 
	 */
	public boolean editarEquipa(int codIdent, Equipa equipa) {
		int procurar = codIdentEquipa(codIdent);
		if (procurar == -1)
			return false;
		this.equipa.set(procurar, equipa);
		return true;
	}

	
	/**
	 * A função desta classe serve para validar atravez de um loop todos os códigos de identificação no clube
	 * @param codIdent
	 * 
	 */
	public int codIdentEquipa(int codIdent) {
		for (int i = 0; i < equipa.size(); i++) {
			if (equipa.get(i).getCodIdent() == codIdent)
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
		return "Clube [codIdent=" + codIdent + ", nome=" + nome + ", dataFundacao=" + dataFundacao + ", corEquipamento="
				+ corEquipamento + ", contato=" + contato + ", email=" + email + ", morada=" + morada + ", equipa="
				+ equipa + "";
	}

    // ----> equals()

}
