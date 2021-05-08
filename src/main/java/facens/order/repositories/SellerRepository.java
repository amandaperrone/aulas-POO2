package facens.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import facens.order.entities.Seller;

public interface SellerRepository extends JpaRepository <Seller, Long> {
    
}
