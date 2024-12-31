package br.com.alura.codechella;

import br.com.alura.codechella.domain.entities.usuario.Usuario;
import br.com.alura.codechella.infra.gateways.RepositorioDeUsuarioEmMemoria;

import java.time.LocalDate;

public class UtilizaUsuariosEmMemoria {

    public static void main(String[] args) {
        RepositorioDeUsuarioEmMemoria repositorioDeUsuarioEmMemoria= new RepositorioDeUsuarioEmMemoria();

        repositorioDeUsuarioEmMemoria.cadastrarUsuario(
                new Usuario("123.555.666-78", "João T.", LocalDate.parse("1979-10-15"), "joao@teste.com"));

        repositorioDeUsuarioEmMemoria.cadastrarUsuario(
                new Usuario("468.555.831-87", "Maria T.", LocalDate.parse("1983-10-21"), "maria@teste.com"));

        repositorioDeUsuarioEmMemoria.cadastrarUsuario(
                new Usuario("888.555.831-87", "Pedro T.", LocalDate.parse("1985-10-21"), "pedro@teste.com"));

        System.out.println(repositorioDeUsuarioEmMemoria.listarTodos());
        repositorioDeUsuarioEmMemoria.gravarEmArquivo("usuarios.txt");
    }

}
