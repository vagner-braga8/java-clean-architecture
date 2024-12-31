package br.com.alura.codechella.config;

import br.com.alura.codechella.application.gateways.RepositorioDeUsuario;
import br.com.alura.codechella.application.usecases.CriarUsuario;
import br.com.alura.codechella.application.usecases.ListarUsuario;
import br.com.alura.codechella.infra.gateways.RepositorioUsuarioJpa;
import br.com.alura.codechella.infra.gateways.UsuarioEntityMapper;
import br.com.alura.codechella.infra.persistence.UsuarioRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsuarioConfig {

    @Bean
    CriarUsuario criarUsuario (RepositorioDeUsuario repositorioDeUsuario){
        return new CriarUsuario(repositorioDeUsuario);
    }

    @Bean
    ListarUsuario listarUsuario(RepositorioDeUsuario repositorioDeUsuario){
        return new ListarUsuario(repositorioDeUsuario);
    }

    @Bean
    RepositorioUsuarioJpa criarRepositorioUsuarioJpa(UsuarioRepository repository, UsuarioEntityMapper mapper){
        return new RepositorioUsuarioJpa(repository, mapper);
    }

    @Bean
    UsuarioEntityMapper criarUsuarioEntityMapper(){
        return new UsuarioEntityMapper();
    }
}
