package facens.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import facens.order.entities.Order;

public interface OrderRepository extends JpaRepository <Order, Long> {
    
}
