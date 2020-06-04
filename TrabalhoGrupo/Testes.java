package TrabalhoGrupo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Testes {

	@Test
	void addEquipas() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Competicao competicao = new Competicao();
			competicao.setEscalao("Veterano");
			
			Equipa equipa1 = new Equipa();
			equipa1.setEscalao("Juvenil");
			equipa1.setCodIdent(1);
			
			competicao.addEquipas(equipa1);
			competicao.addEquipas(equipa1);
			
		});

	}
	


	
}
