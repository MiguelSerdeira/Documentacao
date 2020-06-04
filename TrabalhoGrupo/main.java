package TrabalhoGrupo;

import java.util.Date;
import com.projetofinal.caracteristicas.*;
public class main {	
	
	public static void main(String[] args) {
		
		// inf = infantil | ini = iniciado | juv = juvenil
		String infantil = CaracteristicasAPI.escalao("inf");
		String iniciado = CaracteristicasAPI.escalao("ini");
		String juvenil = CaracteristicasAPI.escalao("juv");
					
		// g = guarda redes | d = defesa | m = medio | a = avancado
		String guardaRedes = CaracteristicasAPI.posicao("g");
		String defesa = CaracteristicasAPI.posicao("d");
		String medio = CaracteristicasAPI.posicao("m");
		String avancado = CaracteristicasAPI.posicao("a");
							
		// d = direito | e = esquerdo
		String peDireito = CaracteristicasAPI.pePreferido("d");
		String peEsquerdo = CaracteristicasAPI.pePreferido("e");
			
		
		
		Competicao competicao = new Competicao();
		competicao.setCodIdent(123);
		competicao.setDataInicio(new Date("12/10/2020  12:00:00"));
		competicao.setDataFim(new Date("12/10/2020  12:00:00"));
		competicao.setEscalao(juvenil);
		competicao.setNome("teste");
		competicao.setParticipantes(24);

		Jogo jogos1 = new Jogo();
		Arbitro arbitro1 = new Arbitro();
		jogos1.addArbitros(arbitro1);
		competicao.addJogos(jogos1);

		arbitro1.setContacto(911111111);
		arbitro1.setDataNascimento(new Date("12/10/2020  12:00:00"));
		arbitro1.setNumeroCartaoCidadao(12345);
		arbitro1.setEmail("teste@gmail.com");
		arbitro1.setNome("Manel");

		Equipa equipa1 = new Equipa();
		competicao.addEquipas(equipa1);
		equipa1.setCodIdent(12345);
		equipa1.setEscalao(infantil);
		equipa1.setNome("Barcelona");

		Equipa equipa2 = new Equipa();
		competicao.addEquipas(equipa2);
		equipa2.setCodIdent(1234);
		equipa2.setEscalao(iniciado);
		equipa2.setNome("Real Madrid");
		
		jogos1.setData(new Date("12/10/2020  12:00:00"));
		jogos1.setEquipaVisitada(equipa1);
		jogos1.setEquipaVisitante(equipa2);
		jogos1.addGoloVisitada(12345);
		jogos1.addGoloVisitante(1234);
		jogos1.addGoloVisitada(12345);
		jogos1.removerGoloVisitada(12345);
		jogos1.setJornada(3);

		Treinador treinador1 = new Treinador();
		equipa1.addTreinador(treinador1);

		treinador1.setContacto(930000000);
		treinador1.setDataNascimento(new Date("12/10/2020  12:00:00"));
		treinador1.setNumeroCartaoCidadao(1234);
		treinador1.setEmail("teste@gmail.com");
		treinador1.setNome("Frederico");

		Jogador jogador1 = new Jogador();
		equipa1.addJogador(jogador1);

		jogador1.setContacto(964342572);
		jogador1.setDataNascimento(new Date("12/10/2020  12:00:00"));
		jogador1.setEmail("teste@gmail.com");
		jogador1.setNome("Miguel");
		jogador1.setNumeroCartaoCidadao(321);
		jogador1.setPe(peDireito);
		jogador1.setPosicao(medio);
		
		Jogador jogador2 = new Jogador();
		equipa1.addJogador(jogador2);

		jogador2.setContacto(964342572);
		jogador2.setDataNascimento(new Date("12/10/2020  12:00:00"));
		jogador2.setEmail("teste@gmail.com");
		jogador2.setNome("Daniel");
		jogador2.setNumeroCartaoCidadao(321);
		jogador2.setPe(peEsquerdo);
		jogador2.setPosicao(avancado);
		
		
		Jogador jogador3 = new Jogador();
		equipa1.addJogador(jogador3);

		jogador3.setContacto(964342572);
		jogador3.setDataNascimento(new Date("12/10/2020  12:00:00"));
		jogador3.setEmail("teste@gmail.com");
		jogador3.setNome("X");
		jogador3.setNumeroCartaoCidadao(321);
		jogador3.setPe(peDireito);
		jogador3.setPosicao(guardaRedes);
		
		Clube clube1 = new Clube();

		clube1.setCodIdent(123);
		clube1.setContato(932222222);
		clube1.setCorEquipamento("Verde");
		clube1.setDataFundacao(new Date("12/10/2020  12:00:00"));
		clube1.setEmail("teste@gmail.com");
		clube1.addEquipas(equipa1);
		clube1.setMorada("teste");
		clube1.setNome("Barcelona");
					
		System.out.println(competicao.mostrarJogosJornada(3));
		
	}

}