package ecommerce.com.ecommerce.service;

import ecommerce.com.ecommerce.Exceptions.ServiceException;
import ecommerce.com.ecommerce.domain.Foto;
<<<<<<< HEAD
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FotoService {

    public Foto save(MultipartFile archivo) throws ServiceException;

    public Optional<Foto> get(String Id);  //Optional validar si la foto existe o no

    public Foto update(String Id, MultipartFile archivo) throws ServiceException;

    public void delete(String Id);
=======
import ecommerce.com.ecommerce.repository.FotoRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FotoService {

    @Autowired
    private FotoRepository fotoRepository;

    @Transactional
    public Foto crear(MultipartFile archivo) throws ServiceException {
        if (archivo != null) {
            try {
                Foto foto = new Foto();
                foto.setMime(archivo.getContentType());
                foto.setNombre(archivo.getName());
                foto.setContenido(archivo.getBytes());
                return fotoRepository.save(foto);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        return null;
    }

    public Optional<Foto> listar(String Id) {
        return fotoRepository.findById(Id);
    }

    @Transactional
    public Foto actualizar(String Id, MultipartFile archivo) throws ServiceException {
        if (archivo != null) {
            try {
                Foto foto = new Foto();
                if (Id != null) {
                    Optional<Foto> respuesta = fotoRepository.findById(Id);
                    if (respuesta.isPresent()) {
                        foto = respuesta.get();
                    }
                }
                foto.setMime(archivo.getContentType());
                foto.setNombre(archivo.getName());
                foto.setContenido(archivo.getBytes());
                return fotoRepository.save(foto);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        return null;
    }

    @Transactional
    public void borrar(String Id) {
        if (Id != null) {
            try {
                Optional<Foto> respuesta = fotoRepository.findById(Id);
                if (respuesta.isPresent()) {
                    fotoRepository.deleteById(Id);
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
>>>>>>> 1f9f84dad47566cf83952bcfc2a4198e7d77da98
}
