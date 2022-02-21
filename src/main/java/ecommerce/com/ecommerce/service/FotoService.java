package ecommerce.com.ecommerce.service;

import ecommerce.com.ecommerce.Exceptions.ServiceException;
import ecommerce.com.ecommerce.domain.Foto;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FotoService {

    public Foto save(MultipartFile archivo) throws ServiceException;

    public Optional<Foto> get(String Id);  //Optional validar si la foto existe o no

    public Foto update(String Id, MultipartFile archivo) throws ServiceException;

    public void delete(String Id);
}
