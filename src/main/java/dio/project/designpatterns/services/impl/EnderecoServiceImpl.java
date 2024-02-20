package dio.project.designpatterns.services.impl;

import dio.project.designpatterns.entities.models.Endereco;
import dio.project.designpatterns.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoServiceImpl {
    @Autowired
    private EnderecoRepository enderecoRepository;
    public Iterable<Endereco> buscarTodos(){
        return enderecoRepository.findAll();
    }
}
