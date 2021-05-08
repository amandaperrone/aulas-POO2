package facens.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import facens.order.entities.Customer;

public interface CustomerRepository extends JpaRepository <Customer, Long> {
    
}
