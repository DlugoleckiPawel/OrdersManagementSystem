package org.example.repository.implement;

import org.example.generic.AbstractGenericRepository;
import org.example.model.entities.Customer;
import org.example.repository.interfaces.CustomerRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.Optional;

public class CustomerRepositoryImpl extends AbstractGenericRepository<Customer>
        implements CustomerRepository {

    @Override
    public Optional<Customer> findGivenCustomer(String name, String surname, String countryName) {
        Optional<Customer> op = Optional.empty();

        EntityManager entityManager = null;
        EntityTransaction tx = null;
        try {
            entityManager = getEntityManagerFactory().createEntityManager();
            tx = entityManager.getTransaction();
            tx.begin();
            op = entityManager
                    .createQuery("select c from Customer c where c.name = :name and c.surname = :surname and c.country.name = :country", Customer.class)
                    .setParameter("name", name)
                    .setParameter("surname", surname)
                    .setParameter("country", countryName)
                    .getResultList().stream().findFirst();
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
        return op;
    }
}