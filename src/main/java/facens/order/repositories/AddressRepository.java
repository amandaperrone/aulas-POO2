package facens.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import facens.order.entities.Address;

public interface AddressRepository extends JpaRepository <Address, Long> {
    
}
