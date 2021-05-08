package facens.order.debug;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import facens.order.entities.Address;
import facens.order.entities.Customer;
import facens.order.entities.Order;
import facens.order.entities.Seller;
import facens.order.repositories.CustomerRepository;
import facens.order.repositories.OrderRepository;
import facens.order.repositories.SellerRepository;

@Service
public class Runner implements CommandLineRunner{

    @Autowired
    private CustomerRepository customerRepository; 
    
    @Autowired
    private SellerRepository sellerRepository;
    
    @Autowired
    private OrderRepository orderRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        System.out.println("***************************** INÍCIO DO RUNNER *****************************");
        
        createCustomers();
        createSellers();
        
        createOrders();

        System.out.println("***************************** FIM DO RUNNER ********************************");
    }

    private void createOrders() {

        // Criar um Pedido para Amanda com o vendedor Marcos
        Order o1 = new Order();
        o1.setDate(Instant.now());
        o1.setNumber(1L);

        // Recupera somente o Customer, NÃO recupera as coleções. Ou seja, não recupera os Addresses
        // O carregamento é tardio (lazy)
        Customer c1 = customerRepository.findById(1L).get();
        Seller s1 = sellerRepository.findById(3L).get();

        o1.setCustomer(c1);
        o1.setSeller(s1);

        // Não precisa pesquisar o endereço, pois ele já está associado ao Customer
        // É necessário fazer o carregamento imediato do Address para funcionar OU usar a anotação @Transactional do spring
        o1.setDeliveredAddress(c1.getAddresses().get(0));


        // Salva o pedido
        orderRepository.save(o1);
    }

    private void createSellers() {

        Seller s1 = new Seller();
        s1.setDepartment("Eletrônicos");
        s1.setName("Marcos");

        Seller s2 = new Seller();
        s2.setDepartment("Geladeiras");
        s2.setName("Fernanda");

        sellerRepository.save(s1);
        sellerRepository.save(s2);
        
    }

    private void createCustomers() {

        Customer c1 = new Customer();
        c1.setEmail("amanda@gmail.com");
        c1.setName("Amanda");

        Customer c2 = new Customer();
        c2.setEmail("jose@gmail.com");
        c2.setName("José");


        Address adr1 = new Address();
        adr1.setCity("Sorocaba");
        adr1.setStreet("Av 9 de Julho, 100");

        Address adr2 = new Address();
        adr2.setCity("Salto");
        adr2.setStreet("Av 25 de Março, 200");

        Address adr3 = new Address();
        adr3.setCity("Itu");
        adr3.setStreet("Av 11 de Setembro, 300");
        
        // Estabelece a relação entre Customer e Address
        c1.addAddress(adr1);
        c1.addAddress(adr2);

        c2.addAddress(adr3);
        

        //addressRepository.save(adr1);  -> removido pois utilizado o cascade
        customerRepository.save(c1);
        customerRepository.save(c2);
        
        
    }
    
}
