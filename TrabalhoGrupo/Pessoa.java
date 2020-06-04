package TrabalhoGrupo;

import java.util.Date;
/** 
 * <H1>Classe das Pessoas</H1> 
 * <H2>Objetivos:</H2> 
 * <ul style="list-style-type:square">
 * <li>Servir para abstracao e partilhar os seus atributos com outras classes .</li> 
 * <li>Mostrar todas as informacoes de uma Pessoa.</li> 
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
public abstract class Pessoa implements Comparable <Pessoa> {

    // =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================
	/**
     * O atributo "codIdent" recebe o Codigo Identificador da equipa
     * O atributo "nome" recebe o nome da pessoa
     * O atributo "contacto" recebe o contacto da pessoa
     * O atributo "email" recebe o email da pessoa
     * O atributo dataNascimento recebe a data de Nascimento da pessoa
     */
	private int numeroCartaoCidadao;
	private String nome;
	private int contacto;
	private String email;
	private Date dataNascimento;

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================
  /**
   * Acessores e modificadores da classe Pessoa
   * 
   */
	public int getNumeroCartaoCidadao() {
		return numeroCartaoCidadao;
	}
	public void setNumeroCartaoCidadao(int numeroCartaoCidadao) {
		this.numeroCartaoCidadao = numeroCartaoCidadao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getContacto() {
		return contacto;
	}
	public void setContacto(int contacto) {
		this.contacto = contacto;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
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
     * Esta classe tem como funcão ordenar alfabeticamente os nomes das pessoas
     * @return Retorna o nome da pessoa em ordem
     */
	public int compareTo(Pessoa obj) {
		return obj.nome.compareTo(this.nome) * -1;
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
		return "Pessoa [numeroCartaoCidadao=" + numeroCartaoCidadao + ", nome=" + nome + ", contacto=" + contacto
				+ ", email=" + email + ", dataNascimento=" + dataNascimento + "]";
	}

    // ----> equals()
}
