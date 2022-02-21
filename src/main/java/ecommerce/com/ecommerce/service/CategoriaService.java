package ecommerce.com.ecommerce.service;


import ecommerce.com.ecommerce.domain.Categoria;
import ecommerce.com.ecommerce.domain.Transaccion;
import ecommerce.com.ecommerce.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository catRep;

    public List<Categoria>findByNombre(String titulo){return catRep.findByNombre(titulo);}

    public void createCategoria(Categoria categoria){catRep.save(categoria);}

    public void deleteTxId(String id) {Optional<Categoria> response = catRep.findById(id);
        if (response.isPresent()) {catRep.delete(response.get());}}
}
