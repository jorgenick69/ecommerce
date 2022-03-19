package ecommerce.com.ecommerce.repository;

import ecommerce.com.ecommerce.domain.Foto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FotoRepository extends JpaRepository<Foto, String> {

}
