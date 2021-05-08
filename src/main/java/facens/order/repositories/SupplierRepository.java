package facens.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import facens.order.entities.Supplier;

public interface SupplierRepository extends JpaRepository <Supplier, Long> {
    
}
