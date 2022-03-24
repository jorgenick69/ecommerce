package ecommerce.com.ecommerce.service;

import ecommerce.com.ecommerce.domain.Transaccion;
import ecommerce.com.ecommerce.repository.TransaccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TransaccionService {

    @Autowired
    private TransaccionRepository txRep;

    @Transactional
    public void crear(Transaccion transaccion){txRep.save(transaccion);}

    public List<Transaccion> listarTodas() {return txRep.findAll();}

    public List<Transaccion> listarPorNum(Long num){return txRep.findByNum(num);}

    public List<Transaccion> listarPorUsuario(String user){return txRep.findByUser(user);}

    public Transaccion listarPorId(String id) {
        Optional<Transaccion> response = txRep.findById(id);
        return response.orElse(null);}

    @Transactional
    public void borrar(String id) {Optional<Transaccion> response = txRep.findById(id);
        if (response.isPresent()) {txRep.delete(response.get());}}

    public List<Transaccion> listarPorEstado(String estado){return txRep.findByStatus(estado);}

    public List<Transaccion> listarPorPeriodo(Date date1, Date date2){
        return txRep.findByTxTimeBetween(date1,date2);
    }
}