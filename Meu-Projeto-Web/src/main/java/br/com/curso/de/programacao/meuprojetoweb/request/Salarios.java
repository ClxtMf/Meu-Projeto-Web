package br.com.curso.de.programacao.meuprojetoweb.request;

import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController // Comunicação com o mundo externo, classe do tipo Rest
public class Salarios {

    private BigDecimal meuSalarioDeProgramador = new BigDecimal(10.00);


    public void contextLoads() {
        System.out.println("Começando o debug!");
        System.out.println("Meu salário de programdor é: " + meuSalarioDeProgramador);
        System.out.println("Fim do dubug!");
    }
}
