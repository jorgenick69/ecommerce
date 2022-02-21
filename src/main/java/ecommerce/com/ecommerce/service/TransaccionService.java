package ecommerce.com.ecommerce.service;

import ecommerce.com.ecommerce.domain.Transaccion;
import ecommerce.com.ecommerce.repository.TransaccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TransaccionService {

    @Autowired
    private TransaccionRepository txRep;

    public void nuevaTransaccion(Transaccion transaccion){txRep.save(transaccion);}

    public List<Transaccion> listTx() {return txRep.findAll();}

    public List<Transaccion> listTxNum(Long num){return txRep.findByNum(num);}

    public List<Transaccion> listTxUser(String user){return txRep.findByUser(user);}

    public Transaccion findTxId(String id) {Optional<Transaccion> response = txRep.findById(id);
        return response.orElse(null);}

    public void deleteTxId(String id) {Optional<Transaccion> response = txRep.findById(id);
        if (response.isPresent()) {txRep.delete(response.get());}}

    public List<Transaccion> findTxDate(Date fecha){return txRep.findByDate(fecha);}

    public List<Transaccion> findTxStatus(String estado){return txRep.findByStatus(estado);}

    public List<Transaccion> findByTxTimeBetween(Date date1, Date date2){
        return txRep.findByTxTimeBetween(date1,date2);
    }
}