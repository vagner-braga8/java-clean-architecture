package br.com.alura.codechella.domain.entities.usuario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UsuarioTest {


    @Test
    public void naoDeveCadastrarUsuarioComCpfNoFormatoInvalido() {
        String cpfInvalido = "123456789-01";
        String nome = "User 1";
        LocalDate nascimento = LocalDate.parse("1981-09-08");
        String email = "email@email.com";

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Usuario(cpfInvalido, nome, nascimento, email));
    }

    @Test
    public void deveCadastrarUsuarioComCpfNoFormatoValido() {
        String cpfValido = "123.456.789-09";
        String nome = "User 2";
        LocalDate nascimento = LocalDate.parse("1981-09-08");
        String email = "email2@email.com";

        Usuario usuario = new Usuario(cpfValido, nome, nascimento, email);

        Assertions.assertEquals(cpfValido, usuario.getCpf());
        Assertions.assertEquals(nome, usuario.getNome());
        Assertions.assertEquals(nascimento, usuario.getNascimento());
        Assertions.assertEquals(email, usuario.getEmail());
    }

}