package TrabalhoGrupo;

import java.util.Date;
/** 
 * <H1>Classe dos Treinadores</H1> 
 * <H2>Objetivos:</H2> 
 * <ul style="list-style-type:square">
 * <li>Criar treinadores</li> 
 * <li>Mostrar todas as informacoes de um treinador</li> 
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
public class Treinador extends Pessoa{


	 
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
	/** Comportamento que permite mostrar todas as informacoes do Treinador
	 * @return Retorna todas as informacoes da equipa atraves do getNome, getNome, getEmail, getNumeroCartaoCidadao, getDataNascimento
	 */
	public String mostrarTudo() {
		String mostrar = "";
		mostrar += "======TREINADOR======" + "\n";

		mostrar += "Nome: " + this.getNome() + "\n";
		mostrar += "Contato: " + this.getContacto() + "\n";
		mostrar += "Email: " + this.getEmail() + "\n";
		mostrar += "Cartão de cidadão: " + this.getNumeroCartaoCidadao() + "\n";
		mostrar += "Data Nascimento: " + this.getDataNascimento() + "\n";

		return mostrar;
	}


    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()



    // ----> equals()
}

