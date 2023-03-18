package hanu.edu.infrastructure.customer.repository;

import hanu.edu.domain.customer.model.Customer;
import hanu.edu.domain.customer.repository.CustomerRepository;
import hanu.edu.infrastructure.customer.entity.CustomerEntity;
import hanu.edu.infrastructure.user.entity.UserEntity;
import hanu.edu.infrastructure.user.repository.UserJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    @Autowired
    private CustomerJPARepository customerJPARepository;

    public void save(CustomerEntity customerEntity) {
        customerJPARepository.save(customerEntity);
    }
}
