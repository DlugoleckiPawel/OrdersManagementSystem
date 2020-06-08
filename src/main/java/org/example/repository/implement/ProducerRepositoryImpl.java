package org.example.repository.implement;

import org.example.exception.MyException;
import org.example.generic.AbstractGenericRepository;
import org.example.model.entities.Producer;
import org.example.repository.interfaces.ProducerRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.Optional;

public class ProducerRepositoryImpl extends AbstractGenericRepository<Producer>
        implements ProducerRepository {

    @Override
    public Optional<Producer> findGivenProducer(String name, String countryName, String tradeName) {

        Optional<Producer> producerOp = Optional.empty();

        EntityManager entityManager = null;
        EntityTransaction tx = null;
        try {
            entityManager = getEntityManagerFactory().createEntityManager();
            tx = entityManager.getTransaction();
            tx.begin();
            producerOp = entityManager.createQuery("select c from Producer c where c.name = :name and c.country.name = :country and c.trade.name = :trade", Producer.class)
                    .setParameter("name", name)
                    .setParameter("country", countryName)
                    .setParameter("trade", tradeName)
                    .getResultList().stream().findFirst();
            tx.commit();
        } catch (MyException e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
        return producerOp;
    }
}
