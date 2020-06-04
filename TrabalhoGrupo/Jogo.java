package TrabalhoGrupo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <H1>Classe do Jogo</H1>
 * <H2>Objetivos:</H2>
 * <ul style="list-style-type:square">
 * <li>Criar jogos.</li>
 * <li>Mostrar todas as informacoes de um jogo.</li>
 * <li>Dado um número de cartão de cidadão, eliminar um árbitro do jogo.</li>
 * <li>Dado um número de cartão de cidadão, alterar um árbitro do jogo.</li>
 * <li>Dado o código identificador da equipa, adicionar/remover golo.</li>
 * 
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

public class Jogo {

	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================

	/**
	 *O atributo "equipaVisitada" vai buscar à Classe "Equipa" o nome da equipavisitada 
	 *O atributo "equipaVisitante" vai buscar à Classe "Equipa" o nome da equipa visitante 
	 *O atributo "golosVisitada" recebe o numero de golos que a equipa visitada marca 
	 *O atributo "golosVisitante" recebe o numero de golos que a equipa visitante marca 
	 * O atributo "data" recebe a data do jogo 
	 * O atributo "jornada" recebe a jornada em que vai ocorrer o jogo 
	 * A lista "Arbitro" recebe a lista de arbitros do jogo 
	 * O atributo "CodIdent" recebe o codigo de identificação do jogo
	 */
	private Equipa equipaVisitada;
	private Equipa equipaVisitante;
	private int golosVisitada;
	private int golosVisitante;
	private Date data;
	private int jornada;
	private List<Arbitro> arbitro = new ArrayList<Arbitro>();
	private int codIdent;

	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================

	/**
	 * 
	 * Acessores e modificadores da classe jogo
	 * 
	 */

	public Equipa getEquipaVisitada() {
		return equipaVisitada;
	}

	public void setEquipaVisitada(Equipa equipaVisitada) {
		this.equipaVisitada = equipaVisitada;
	}

	public int getCodIdent() {
		return codIdent;
	}

	public void setCodIdent(int codIdent) {
		this.codIdent = codIdent;
	}

	public Equipa getEquipaVisitante() {
		return equipaVisitante;
	}

	public void setEquipaVisitante(Equipa equipaVisitante) {
		this.equipaVisitante = equipaVisitante;
	}

	public int getGolosVisitada() {
		return golosVisitada;
	}

	public void setGolosVisitada(int golosVisitada) {
		this.golosVisitada = golosVisitada;
	}

	public int getGolosVisitante() {
		return golosVisitante;
	}

	public void setGolosVisitante(int golosVisitante) {
		this.golosVisitante = golosVisitante;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getJornada() {
		return jornada;
	}

	public void setJornada(int jornada) {
		this.jornada = jornada;
	}

	public List<Arbitro> getArbitros() {
		return arbitro;
	}

	public void setArbitros(List<Arbitro> arbitros) {
		this.arbitro = arbitros;
	}

	public void addArbitros(Arbitro arbitro) {
		this.arbitro.add(arbitro);

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
	 * 
	 * Esta função serve para mostrar todas as informações da classe "Jogo"
	 * @return Retorna todas as informacoes numa string chamada mostrar num loop atravez do getJornada, getCodIdent, getData, getArbitros, getEquipaVisitada, getEquipaVisitante, getGolosVisitada, getGolosVisitante
	 */

	public String mostrarTudo() {
		String mostrar = "";

		mostrar += "======JOGO======" + "\n";

		mostrar += "Jornada: " + this.getJornada() + "\n";
		mostrar += "Codigo: " + this.getCodIdent() + "\n";
		mostrar += "Data: " + this.getData() + "\n";
		mostrar += "Arbitros: " + this.getArbitros().size() + "\n";
		mostrar += "\n";
		mostrar += "======EQUIPA VISITADA======";
		mostrar += this.getEquipaVisitada() + "\n";
		mostrar += "======EQUIPA VISITANTE======";
		mostrar += this.getEquipaVisitante() + "\n";
		mostrar += "======GOLOS======" + "\n";
		mostrar += "Golos Equipa Visitada: " + this.getGolosVisitada() + "\n";
		mostrar += "Golos Equipa Visitante: " + this.getGolosVisitante() + "\n";

		return mostrar;
	}

	/**
	 * 
	 * Esta função serve para remover arbitros da classe "Jogo" através do número de
	 * cartão de cidadão
	 * 
	 * @param numeroCartaoCidadao
	 */

	public boolean removerArbitro(int numeroCartaoCidadao) {
		int procurar = cidadaoArbitro(numeroCartaoCidadao);
		if (procurar == -1)
			return false;
		this.arbitro.remove(procurar);
		return true;
	}

	/**
	 * 
	 * Esta função serve para editar arbitros da classe "Jogo" através do número de
	 * cartão de cidadão
	 * 
	 * @param numeroCartaoCidadao, arbitro
	 */

	public boolean editarArbitro(int numeroCartaoCidadao, Arbitro arbitro) {
		int procurar = cidadaoArbitro(numeroCartaoCidadao);
		if (procurar == -1)
			return false;
		this.arbitro.set(procurar, arbitro);
		return true;
	}

	/**
	 * A função desta classe serve para validar através de um loop todos os numeros
	 * de cartao de cidadão dos arbitros
	 * 
	 * @param numeroCartaoCidadao
	 */

	private int cidadaoArbitro(int numeroCartaoCidadao) {
		for (int i = 0; i < arbitro.size(); i++) {
			if (arbitro.get(i).getNumeroCartaoCidadao() == numeroCartaoCidadao)
				return i;
		}
		return -1;
	}

	/**
	 * 
	 * Esta função serve para adicionar os golos da a equipa visitada através do
	 * codigo de identificação da equipa
	 * 
	 * @param codIdent
	 */

	public void addGoloVisitada(int codIdent) {
		if (codIdent == this.equipaVisitada.getCodIdent()) {
			if (this.getEquipaVisitada().getCodIdent() == codIdent)
				this.golosVisitada += 1;
		}
	}

	/**
	 * 
	 * Esta função serve para remover os golos da a equipa visitada através do
	 * codigo de identificação da equipa
	 * 
	 * @param codIdent
	 */

	public void removerGoloVisitada(int codIdent) {
		if (codIdent == this.equipaVisitada.getCodIdent()) {
			if (this.getEquipaVisitada().getCodIdent() == codIdent)
				this.golosVisitada -= 1;
		}
	}

	/**
	 * 
	 * Esta função serve para adicionar os golos da a equipa visitante através do
	 * codigo de identificação da equipa
	 * 
	 * @param codIdent
	 */

	public void addGoloVisitante(int codIdent) {
		if (codIdent == this.equipaVisitante.getCodIdent()) {
			if (this.getEquipaVisitante().getCodIdent() == codIdent)
				this.golosVisitante += 1;
		}
	}

	/**
	 * 
	 * Esta função serve para remover os golos da a equipa visitante através do
	 * codigo de identificação da equipa
	 * 
	 * @param codIdent
	 */

	public void removerGoloVisitante(int codIdent) {
		if (codIdent == this.equipaVisitante.getCodIdent()) {
			if (this.getEquipaVisitante().getCodIdent() == codIdent)
				this.golosVisitante -= 1;
		}
	}

//	public boolean codIdentVisitada(int codIdent) {
//		boolean procurar = false;
//		if (codIdent == this.equipaVisitada.getCodIdent()) {
//			procurar = true;
//		} else {
//			if (codIdent == this.equipaVisitada.getCodIdent()) {
//				procurar = true;
//			}
//		}
//		return procurar;
//	}
//
//	public boolean codIdentVisitante(int codIdent) {
//		boolean procurar = false;
//		if (codIdent == this.equipaVisitante.getCodIdent()) {
//			procurar = true;
//		} else {
//			if (codIdent == this.equipaVisitante.getCodIdent()) {
//				procurar = true;
//			}
//		}
//		return procurar;
//	}

	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
	// =======================================================

	// ----> toString()
	/**
	 * Este metodo serve para visualizar os valores dos atributos na class "main"
	 */
	@Override
	public String toString() {
		return "Jogo [equipaVisitada=" + equipaVisitada + ", equipaVisitante=" + equipaVisitante + ", golosVisitada="
				+ golosVisitada + ", golosVisitante=" + golosVisitante + ", data=" + data + ", jornada=" + jornada
				+ ", arbitros=" + arbitro + "]";
	}

	// ----> equals()
}
