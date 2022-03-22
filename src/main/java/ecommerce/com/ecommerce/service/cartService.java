package ecommerce.com.ecommerce.service;

import ecommerce.com.ecommerce.Exceptions.ServiceException;
import ecommerce.com.ecommerce.domain.Cart;
import ecommerce.com.ecommerce.repository.cartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class cartService {

    /*@Autowired
    private cartRepository cartRepository;

    @Transactional
    public void crearCarrito() throws ServiceException{
        Cart cart = new Cart();
        cartRepository.save(cart);
    }*/


}
