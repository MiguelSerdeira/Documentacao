package TrabalhoGrupo;

import java.util.Date;

/** 
 * <H1>Classe dos Jogadores</H1> 
 * <H2>Objetivos:</H2> 
 * <ul style="list-style-type:square">
 * <li>Criar jogadores</li> 
 * <li>Mostrar todas as informações de um jogador</li> 
 * </ul> 
 * <br> 
 *Esta classe herda atributos e funcoes da classe: Pessoa 
 *
 * @author Hugo, Manuel e Miguel 
 *
 * 
 */
public class Jogador extends Pessoa{


	 // =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================
	/**
     * O atributo "posicao" recebe a posição do jogador
     * O atributo "pe" recebe o pe do jogador
     */
	
	private String posicao;
	private String pe;

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public String getPe() {
		return pe;
	}
	public void setPe(String pe) {
		this.pe = pe;
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
	 * Esta funcao serve para escrever as informacoes dos jogadores
	 * 
	 * @return Retorna uma string com todas as informacoes dos treinadores
	 */
	
	public String mostrarTudo() {
		String mostrar = "";
		mostrar +=  "======JOGADOR======" + "\n";

		mostrar += "Nome: " + this.getNome() + "\n";
		mostrar += "Contato: " + this.getContacto() + "\n";
		mostrar += "Email: " + this.getEmail() + "\n";
		mostrar += "Cartão de cidadão: " + this.getNumeroCartaoCidadao() + "\n";
		mostrar += "Pé preferido: " + this.getPe() + "\n";
		mostrar += "Posição: " + this.getPosicao() + "\n" ;
		mostrar += "\n" ;

		return mostrar;
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
		return "Jogador [posicao=" + posicao + ", pe=" + pe + "]";
	}

    // ----> equals()
}
