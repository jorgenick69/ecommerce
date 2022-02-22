package ecommerce.com.ecommerce.service;

import ecommerce.com.ecommerce.domain.Categoria;
import ecommerce.com.ecommerce.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository catRep;

    public List<Categoria>buscar(String titulo){return catRep.findByNombre(titulo);}

    public List<Categoria>listar(){return catRep.findAll();}

    @Transactional
    public void crear(Categoria categoria){catRep.save(categoria);}

    @Transactional
    public void borrar(String id) {Optional<Categoria> response = catRep.findById(id);
        if (response.isPresent()) {catRep.delete(response.get());}}
}
