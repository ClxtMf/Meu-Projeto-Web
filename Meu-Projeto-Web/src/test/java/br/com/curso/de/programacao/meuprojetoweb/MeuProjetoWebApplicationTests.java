package br.com.curso.de.programacao.meuprojetoweb;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class MeuProjetoWebApplicationTests {

	private BigDecimal meuSalarioDeProgramador = new BigDecimal(10.00);

	@Test
	void contextLoads() {
		System.out.println("Começando o debug!");
		System.out.println("Meu salário de programdor é: " + meuSalarioDeProgramador);
		System.out.println("Fim do dubug!");
	}

}
