package ecommerce.com.ecommerce.repository;

import ecommerce.com.ecommerce.domain.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface cartRepository extends JpaRepository<Cart, String> {
}
