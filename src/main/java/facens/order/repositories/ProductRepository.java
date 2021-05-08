package facens.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import facens.order.entities.Product;

public interface ProductRepository extends JpaRepository <Product, Long> {
    
}
